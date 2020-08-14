package com.bepoc.PhcVol;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


@Service
public class BEService {

    @Autowired
    private PhcVolRepository phcVolRepository;

    @Autowired
    private PhcVolSummaryRepository phcVolSummaryRepository;

    @Autowired
    private PHCRepository phcRepository;

    @Autowired
    private PhcVolTotalRepository phcVolTotalRepository;

    @Autowired
    private DMAccounts accounts;

    @Autowired
    private BusinessLogic bl;

    private List<PhcVol> phcVolList;
    private List<PhcVolTotal> phcVolTotalList;
    private List<PhcVol> pvolList;


    private List<PhcVolSummary> phcVolSummaryList;
    private List<PHC> phcList;
    private List<Double> totalPhcVolDm;


    private int insertFlag=0;


    private List<PhcVol> pvSOA;
    private List<PhcVol> pvAPI;
    private List<PhcVolSummary> pvs;
    private double totalphcTarget;
    private double totalvolTarget;
    private double totalphcAOD;
    private double totalvolAOD;
    private double totalphcAOL;
    private double totalvolAOL;
    private double totalphcGap;
    private double totalvolGap;
    private double totalphcTargetAOLGap;
    private double totalvolTargetAOLGap;
    private double totalnxtMnthOffshoreVol;
    private double totalnxtMnthOnsiteVol;
    private double totalnxtMnthTotalVol;
    private double totalnxtMnthPHC;
    private double totalphccrrntvsnextmnthGap;
    private double totalvolcrrntvsnextmnthGap;


    @Value("${dm.all}")
    private List<String> allDMAccounts;

    @Value("${dms}")
    private List<String> allDMs;



    public List<PhcVol> getPhcVolTarget() throws IOException {



        phcVolList = new ArrayList<PhcVol>();
        FileInputStream excelFile = new FileInputStream(new File(bl.getPvtfile()));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet worksheet = workbook.getSheetAt(0);

        phcVolRepository.updatePhcVolDBTargetZero();
        phcVolRepository.updatePhcVolDBVolZero();
        phcVolRepository.updatePhcVolDBPhcZero();

        for(int i=1;i<worksheet.getPhysicalNumberOfRows();i++) {
            PhcVol phcVol = new PhcVol();
            XSSFRow row = worksheet.getRow(i);

            if((row.getCell(4)!=null) && (row.getCell(5) != null)) {
                if (row.getCell(0) != null)
                    phcVol.setAccountTrack(row.getCell(0).getStringCellValue());
                if (row.getCell(1) != null)
                    phcVol.setAccountName(row.getCell(1).getStringCellValue());
                if (row.getCell(2) != null)
                    phcVol.setDm(row.getCell(2).getStringCellValue());
                if (row.getCell(3) != null)
                    phcVol.setAccountDu(row.getCell(3).getStringCellValue());
                if (row.getCell(4) != null) ;
                    phcVol.setPhcTarget((double) row.getCell(4).getNumericCellValue());
                if (row.getCell(5) != null) ;
                    phcVol.setVolTarget((double) row.getCell(5).getNumericCellValue());



                phcVolList.add(phcVol);
            }


        }


            phcVolList.stream().forEach(p->{
                PhcVol pv = phcVolRepository.findAccountNameAccountTrackAccountDU(p.getAccountName(),p.getAccountTrack(), p.getAccountDu(), p.getDm());
                if(pv != null)
                {
                    phcVolRepository.updatePhcVolDBTarget(p.getPhcTarget(), p.getVolTarget(), p.getAccountName(), p.getAccountTrack(), p.getAccountDu(), p.getDm());
                }
                else {
                    phcVolRepository.insertPhcVolDBTarget(p.getPhcTarget(), p.getVolTarget(), p.getAccountName(), p.getAccountTrack(), p.getAccountDu(), p.getDm());
                }



                // System.out.print("AccountTrack inside phcVolList loop ->"+p.getAccountTrack());
                //phcVolRepository.insertPhcVolDB(p.getVolAOD(), p.getAccountName(), p.getAccountTrack());

            });


      allDMs.stream().forEach(q->
        {

              phcVolTotalRepository.updatePhcVolTargetsTotalDM(q);

        });


        return phcVolList;
    }

    public List<PhcVol> getPhcVolAoD() throws IOException {
        phcVolList = new ArrayList<PhcVol>();
        FileInputStream excelFile = new FileInputStream(new File(bl.getPvfile()));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet worksheet = workbook.getSheetAt(0);

        phcVolRepository.updatePhcVolDBVolZero();

        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
            PhcVol phcVol = new PhcVol();
            XSSFRow row = worksheet.getRow(i);

            if(row.getCell(5)!=null) {
                    if (row.getCell(0) != null)
                        phcVol.setAccountTrack(row.getCell(0).getStringCellValue());
                    if (row.getCell(1) != null)
                        phcVol.setAccountName(row.getCell(1).getStringCellValue());
                    if (row.getCell(2) != null)
                        phcVol.setDm(row.getCell(2).getStringCellValue());
                    if (row.getCell(3) != null)
                        phcVol.setAccountDu(row.getCell(3).getStringCellValue());
                    if (row.getCell(4) != null)
                         phcVol.setDa(row.getCell(4).getStringCellValue());
                  //  if (row.getCell(7) != null) ;
                    //    phcVol.setVolTarget((double) row.getCell(7).getNumericCellValue());
                    if (row.getCell(5) != null) ;
                        phcVol.setVolAOD((double) row.getCell(5).getNumericCellValue());

                    phcVolList.add(phcVol);
             }

        }

              phcVolList.stream().forEach(p->{
                  PhcVol pv = phcVolRepository.findAccountNameAccountTrackAccountDU(p.getAccountName(),p.getAccountTrack(), p.getAccountDu(), p.getDm());
                  if(pv != null)
                  {
                     System.out.println("======================> update value :" + pv.getAccountName() + pv.getAccountTrack() + pv.getDm());
                     phcVolRepository.updatePhcVolDBVolAOD(p.getVolAOD(), p.getAccountName(), p.getAccountTrack(), p.getAccountDu(), p.getDm());
                 }
                  else{
                     System.out.println("======================> insert value :" + p.getAccountName() + p.getAccountTrack() + p.getDm());
                      phcVolRepository.insertPhcVolDBVolAOD(0, p.getVolAOD(), p.getAccountName(), p.getAccountTrack(),p.getAccountDu(), p.getDa(), p.getDm());
                  }
            });

        return phcVolList;
    }

    public List<PHC> getPHC() throws IOException {

        phcList = new ArrayList<PHC>();
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
        FileInputStream excelFile = new FileInputStream(new File(bl.getPhcfile()));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet worksheet = workbook.getSheetAt(0);

        phcRepository.deleteAll();

        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
            PHC phc = new PHC();
            XSSFRow row = worksheet.getRow(i);

            allDMAccounts.stream().forEach(q-> {



               if ( row.getCell(16)!=null && q.equals(row.getCell(16).getStringCellValue())) {

                   System.out.println("q value ======> " + q);


                    if(row.getCell(0)!=null)
                        phc.setAccountTrack(row.getCell(0).getStringCellValue());
                    if(row.getCell(1)!=null)
                       phc.setAccountDu(row.getCell(1).getStringCellValue());
                    if(row.getCell(3)!=null)
                        phc.setEmpName(row.getCell(3).getStringCellValue());
                    if(row.getCell(9)!=null)
                        phc.setProjType(row.getCell(9).getStringCellValue());
                    if(row.getCell(16)!=null)
                        phc.setAccountName(row.getCell(16).getStringCellValue());
                    if(row.getCell(19)!=null)
                        phc.setLastMCC(row.getCell(19).getStringCellValue());
                    if(row.getCell(20)!=null)
                       phc.setNextAllocDate(row.getCell(20).getDateCellValue());
                    if(row.getCell(22)!=null)
                       phc.setAllocEndDate(row.getCell(22).getDateCellValue());
                    if(row.getCell(52)!=null)
                        phc.setFutExits(row.getCell(52).getStringCellValue());
                    if(row.getCell(72)!=null)
                        phc.setAccountMCC(row.getCell(72).getStringCellValue());
                   if(row.getCell(82)!=null)
                       phc.setDm(row.getCell(82).getStringCellValue());


                    phcList.add(phc);

                }

            });


            allDMAccounts.stream().forEach(q-> {



                if (row.getCell(16)!=null && row.getCell(19)!=null && (!q.equals(row.getCell(16).getStringCellValue())) && row.getCell(52).getStringCellValue().equals("Yes") && (q.equals(row.getCell(19).getStringCellValue().trim()))) {

                    if(row.getCell(0)!=null)
                        phc.setAccountTrack(row.getCell(0).getStringCellValue());
                    if(row.getCell(1)!=null)
                        phc.setAccountDu(row.getCell(1).getStringCellValue());
                    if(row.getCell(3)!=null)
                        phc.setEmpName(row.getCell(3).getStringCellValue());

                    if(row.getCell(9)!=null)
                        phc.setProjType(row.getCell(9).getStringCellValue());
                    if(row.getCell(16)!=null)
                        phc.setAccountName(row.getCell(16).getStringCellValue());
                    if( row.getCell(16).getStringCellValue()=="")
                        phc.setAccountName(row.getCell(19).getStringCellValue().trim());
                    if(row.getCell(19)!=null)
                        phc.setLastMCC(row.getCell(19).getStringCellValue().trim());
                    if(row.getCell(20)!=null)
                        phc.setNextAllocDate(row.getCell(20).getDateCellValue());
                    if(row.getCell(22)!=null)
                        phc.setAllocEndDate(row.getCell(22).getDateCellValue());
                    if(row.getCell(52)!=null)
                        phc.setFutExits(row.getCell(52).getStringCellValue());
                    if(row.getCell(72)!=null)
                        phc.setAccountMCC(row.getCell(72).getStringCellValue());
                    if(row.getCell(82)!=null)
                        phc.setDm(row.getCell(82).getStringCellValue());


                    phcList.add(phc);

                }

            });


        }


        phcRepository.saveAll(phcList);
        phcVolRepository.updatePhcVolDBPhcZero();

        phcList.stream().forEach(p->{

        PhcVol pv = phcVolRepository.findAccountNameAccountTrackAccountDU(p.getAccountName(),p.getAccountTrack(), p.getAccountDu(), p.getDm());

            if(pv == null)
            {

                phcVolRepository.insertPhcVolDBVolAOD(0, 0, p.getAccountName(), p.getAccountTrack(),p.getAccountDu(), "", p.getDm());
            }

        phcVolRepository.updatePhcVolDBPhcAOD(p.getAccountName(), p.getAccountTrack(), p.getAccountDu(),p.getDm());
        phcVolRepository.updatePhcVolDBPhcAOL(p.getAccountName(), p.getAccountTrack(), p.getAccountDu(), p.getDm());
        phcVolRepository.updatePhcVolDBPhcAOLFutExistsAcnt(p.getAccountName(), p.getAccountTrack(), p.getAccountDu(), p.getDm());


        phcVolRepository.updatePhcVolDBPhcAOLFutExistsLmcc(p.getAccountName(), p.getAccountTrack(), p.getAccountDu(), p.getDm());



        });



        return phcList;

    }


    public List<PhcVol> getPhcVol(String dm, String da) throws IOException {
        return phcVolRepository.findByDmAndDaOrderByAccountName(dm, da);
    }


    public List<PhcVol> getPhcVol(String dm) throws IOException {
        return phcVolRepository.findByDmOrderByAccountName(dm);
    }


    public List<PhcVolTotal> getPhcVolTotals()
    {

        allDMs.stream().forEach(q->
        {
            totalPhcVolDm = new ArrayList<Double>();
            totalPhcVolDm = getTotalPhcVolSummary(q);

             phcVolTotalRepository.updatePhcVolTotalDM(totalPhcVolDm.get(2), totalPhcVolDm.get(3), totalPhcVolDm.get(4), totalPhcVolDm.get(6), totalPhcVolDm.get(7), q);

        });

        return phcVolTotalRepository.findAll();

    }


 /*   public Object getTotalPhcVolTotals()
    {

        return phcVolTotalRepository.findTotalDMPhcVolTargets();

    } */

    public List<Double> getTotalPhcVolTotals() {
        totalphcTarget=0;
        totalvolTarget=0;
        totalphcAOD=0;
        totalvolAOD=0;
        totalphcAOL=0;
        totalphcGap=0;
        totalvolGap=0;
        phcVolTotalList = phcVolTotalRepository.findAll();
        phcVolTotalList.forEach((p)->{
            totalphcTarget = totalphcTarget + p.getPhcTarget();
            totalvolTarget = totalvolTarget + p.getVolTarget();
            totalphcAOD = totalphcAOD + p.getPhcAOD();
            totalvolAOD = totalvolAOD + p.getVolAOD();
            totalphcAOL = totalphcAOL + p.getPhcAOL();
            totalphcGap = totalphcGap + (p.getPhcAOL() - p.getPhcTarget());
            totalvolGap = totalvolGap + (p.getVolAOD() - p.getVolTarget());


        });


        return Arrays.asList(totalphcTarget,totalvolTarget,totalphcAOD,totalvolAOD,totalphcAOL,totalphcGap,totalvolGap);
    }



    public List<PhcVolSummary> allAccountsPhcVolSummary(String dm) {

        List<Object[]> allDMPV = phcVolRepository.findAllAccountsAndDMSPV(dm);
        List<Object[]> allDMPVS = phcVolSummaryRepository.findAllAccountsAndDMSPVS(dm);
        Map<String, String> mappedDMPV = new HashMap<>();
        Map<String, String> mappedDMPVS = new HashMap<>();

        for (Object[] obj : allDMPV ) {
            String dmName = (String)obj[0];
            String dmAccount = (String)obj[1];
            mappedDMPV.put(dmName, dmAccount);
        }

        for (Object[] obj : allDMPVS ) {
            String dmName = (String)obj[0];
            String dmAccount = (String)obj[1];
            mappedDMPVS.put(dmName, dmAccount);
        }

              if (mappedDMPVS.isEmpty()) {
                        mappedDMPV.forEach((i,j) -> {
                                phcVolSummaryRepository.insertPhcVolSummaryDB(j, dm);
                        });
               }
                else
                {
                    mappedDMPV.forEach((i, j) -> {
                        mappedDMPVS.forEach((k, v) ->
                        {
                            if (i.equals(k) && j.equals(v) && i.contains(dm)) {
                                phcVolSummaryRepository.updatePhcVolSummaryDB(v, dm);
                            }
                        });
                    });
                }


        return phcVolSummaryRepository.findByDmOrderByAccountName(dm);

    }


    public List<PHC> findProdFut()  {
         return phcRepository.findProdFut();
    }

    public List<PHC> findNonProdFut() {
        return phcRepository.findNonProdFut();
    }


    public List<Double> getTotalPhcVolSummary(String dm) {
        totalphcTarget=0;
        totalvolTarget=0;
        totalphcAOD=0;
        totalvolAOD=0;
        totalphcAOL=0;
        totalvolAOL=0;
        totalphcTargetAOLGap=0;
        totalvolTargetAOLGap=0;
        totalnxtMnthOffshoreVol=0;
        totalnxtMnthOnsiteVol=0;
        totalnxtMnthTotalVol=0;
        totalnxtMnthPHC=0;
        totalphccrrntvsnextmnthGap=0;
        totalvolcrrntvsnextmnthGap=0;
        phcVolList = phcVolRepository.findByDmOrderByAccountName(dm);
        phcVolList.forEach((p)->{
            totalphcTarget = totalphcTarget + p.getPhcTarget();
            totalvolTarget = totalvolTarget + p.getVolTarget();
            totalphcAOD = totalphcAOD + p.getPhcAOD();
            totalvolAOD = totalvolAOD + p.getVolAOD();
            totalphcAOL = totalphcAOL + p.getPhcAOL();
            totalvolAOL = totalvolAOL + p.getVolAOL();
            totalnxtMnthOffshoreVol = totalnxtMnthOffshoreVol +p.getNxtMnthOffshoreVol();
            totalnxtMnthOnsiteVol = totalnxtMnthOnsiteVol +p.getNxtMnthOnsiteVol();
            totalnxtMnthTotalVol = totalnxtMnthTotalVol+p.getNxtMnthTotalVol();
            totalnxtMnthPHC = totalnxtMnthPHC+p.getNxtMnthPHC();
            totalphcTargetAOLGap = totalphcTargetAOLGap + (p.getPhcAOL()-p.getPhcTarget());
            totalvolTargetAOLGap = totalvolTargetAOLGap + (p.getVolAOD()-p.getVolTarget());
            totalphccrrntvsnextmnthGap = totalphccrrntvsnextmnthGap + (p.getNxtMnthPHC()-p.getPhcAOL());
            totalvolcrrntvsnextmnthGap = totalvolcrrntvsnextmnthGap + (p.getNxtMnthTotalVol()-p.getVolAOD());

        });


        return Arrays.asList(totalphcTarget,totalvolTarget,totalphcAOD,totalvolAOD,totalphcAOL,totalvolAOL,totalphcTargetAOLGap,totalvolTargetAOLGap,totalnxtMnthPHC, totalnxtMnthOffshoreVol,totalnxtMnthOnsiteVol,totalnxtMnthTotalVol,totalphccrrntvsnextmnthGap,totalvolcrrntvsnextmnthGap);
    }


    public List<Double> getTotalPhcVolSummary(String dm, String da) {
        totalphcTarget=0;
        totalvolTarget=0;
        totalphcAOD=0;
        totalvolAOD=0;
        totalphcAOL=0;
        totalvolAOL=0;
        totalphcTargetAOLGap=0;
        totalvolTargetAOLGap=0;
        phcVolList = phcVolRepository.findByDmAndDaOrderByAccountName(dm,da);
        phcVolList.forEach((p)->{
            totalphcTarget = totalphcTarget + p.getPhcTarget();
            totalvolTarget = totalvolTarget + p.getVolTarget();
            totalphcAOD = totalphcAOD + p.getPhcAOD();
            totalvolAOD = totalvolAOD + p.getVolAOD();
            totalphcAOL = totalphcAOL + p.getPhcAOL();
            totalvolAOL = totalvolAOL + p.getVolAOL();
            totalphcTargetAOLGap = totalphcTargetAOLGap + (p.getPhcAOL()-p.getPhcTarget());
            totalvolTargetAOLGap = totalvolTargetAOLGap + (p.getVolAOD()-p.getVolTarget());
        });

        return Arrays.asList(totalphcTarget,totalvolTarget,totalphcAOD,totalvolAOD,totalphcAOL,totalvolAOL,totalphcTargetAOLGap,totalvolTargetAOLGap);
    }


    public List<Double> getTotalPhcVolAccountSummary(String dm) {
        totalphcTarget=0;
        totalvolTarget=0;
        totalphcAOD=0;
        totalvolAOD=0;
        totalphcAOL=0;
        totalvolAOL=0;
        totalphcTargetAOLGap=0;
        totalvolTargetAOLGap=0;
        phcVolSummaryList = phcVolSummaryRepository.findByDmOrderByAccountName(dm);
        phcVolSummaryList.forEach((p)->{
            totalphcTarget = totalphcTarget + p.getPhcTarget();
            totalvolTarget = totalvolTarget + p.getVolTarget();
            totalphcAOD = totalphcAOD + p.getPhcAOD();
            totalvolAOD = totalvolAOD + p.getVolAOD();
            totalphcAOL = totalphcAOL + p.getPhcAOL();
            totalvolAOL = totalvolAOL + p.getVolAOL();
            totalphcTargetAOLGap = totalphcTargetAOLGap + (p.getPhcAOL()-p.getPhcTarget());
            totalvolTargetAOLGap = totalvolTargetAOLGap + (p.getVolAOD()-p.getVolTarget());
        });

        return Arrays.asList(totalphcTarget,totalvolTarget,totalphcAOD,totalvolAOD,totalphcAOL,totalvolAOL,totalphcTargetAOLGap,totalvolTargetAOLGap);
    }



    public void putPhcVolTarget(PhcVol phcVol, int id) {
        phcVolRepository.save(phcVol);

    }

    public void putPhcVolTotals(PhcVolTotal phcVoltotal, int id) {
        phcVolTotalRepository.save(phcVoltotal);

    }




    public List<PhcVol> getPhcVolRemarks(String dm) {
        return phcVolRepository.findRemarksForGaps(dm);
    }

    public List<Double> getTotalPhcVolRemarks(String dm) {
        totalphcTarget=0;
        totalvolTarget=0;
        totalphcAOD=0;
        totalvolAOD=0;
        totalphcAOL=0;
        totalvolAOL=0;
        totalphcTargetAOLGap=0;
        totalvolTargetAOLGap=0;
        phcVolList = phcVolRepository.findRemarksForGaps(dm);
        phcVolList.forEach((p)->{
            totalphcTarget = totalphcTarget + p.getPhcTarget();
            totalvolTarget = totalvolTarget + p.getVolTarget();
            totalphcAOD = totalphcAOD + p.getPhcAOD();
            totalvolAOD = totalvolAOD + p.getVolAOD();
            totalphcAOL = totalphcAOL + p.getPhcAOL();
            totalvolAOL = totalvolAOL + p.getVolAOL();
            totalphcTargetAOLGap = totalphcTargetAOLGap + (p.getPhcAOL()-p.getPhcTarget());
            totalvolTargetAOLGap = totalvolTargetAOLGap + (p.getVolAOD()-p.getVolTarget());
        });

        return Arrays.asList(totalphcTarget,totalvolTarget,totalphcAOD,totalvolAOD,totalphcAOL,totalvolAOL,totalphcTargetAOLGap,totalvolTargetAOLGap);
    }

    public void addPhcVolAccount(PhcVol phcVol) {
        phcVolRepository.save(phcVol);
    }
}


