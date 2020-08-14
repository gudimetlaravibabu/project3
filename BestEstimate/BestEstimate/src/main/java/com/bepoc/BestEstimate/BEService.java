package com.bepoc.BestEstimate;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


@Service
public class BEService {

    @Autowired
    private AccountBERepository accountBERepository;

    @Autowired
    private AccountSummaryRepository accountSummaryRepository;

    @Autowired
    private DHRTBRRepository dHRTBRRepository;

    @Autowired
    private NativCurrToUSDRepository nativCurrToUSDRepository;



    private List<AccountBE> accountBEList;
    private List<DHRTBR> dhRTBRList;


    private double totalDHBE;
    private double totalNPBE;
    private double totalPMBE;
    private double totalRTBR;
    private double totalPMBERTBRGap;
    private double totalPMBENPBEGap;
    private double totalNPBERTBRGap;
    private List<AccountBE> accountBEList1;
    private List<AccountSummary> accountSummaryList;
    private int insertFlag=0;
    //private double npBE;
    private List<String> accounts;
    private AccountBE asSOA;
    private AccountBE asAPI;

    private double totalphcTarget;
    private double totalvolTarget;
    private double totalphcAOD;
    private double totalvolAOD;
    private double totalphcAOL;
    private double totalvolAOL;
    private double totalphcTargetAOLGap;
    private double totalvolTargetAOLGap;

    @Value("${bl.dhrtbrfile}")
    private String dhrtbrfile;

    @Value("${dm.all}")
    private List<String> allDMAccounts;


    public List<AccountBE> getBESummary(String dm)  {

       return accountBERepository.findByDmOrderByAccountName(dm);


    }



    public List<DHRTBR> getDHRTBR() throws IOException {
        dhRTBRList = new ArrayList<DHRTBR>();
        FileInputStream excelFile = new FileInputStream(new File(dhrtbrfile));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet worksheet = workbook.getSheetAt(0);

        dHRTBRRepository.updateDHRTBRDBZero();

        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
            DHRTBR dhRTBR = new DHRTBR();
            XSSFRow row = worksheet.getRow(i);

            if(row.getCell(2)!=null) {

                if(row.getCell(0)!=null)
                    dhRTBR.setAccountTrack(row.getCell(0).getStringCellValue());
                if(row.getCell(1)!=null)
                        dhRTBR.setAccountName(row.getCell(1).getStringCellValue());
                if(row.getCell(2)!=null)
                    dhRTBR.setDm(row.getCell(2).getStringCellValue());
                if(row.getCell(3)!=null)
                    dhRTBR.setAccountDu(row.getCell(3).getStringCellValue());
                if(row.getCell(4)!=null)
                    dhRTBR.setDa(row.getCell(4).getStringCellValue());
                if(row.getCell(9, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL)!=null)
                    dhRTBR.setdHBE((double)row.getCell(9).getNumericCellValue());
                if(row.getCell(17, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL)!=null)
                        dhRTBR.setrTBR((double)row.getCell(17).getNumericCellValue());
                if(row.getCell(10,Row.MissingCellPolicy.RETURN_BLANK_AS_NULL)!=null)
                    dhRTBR.setM1rtbr((double)row.getCell(10).getNumericCellValue());
                if(row.getCell(15,Row.MissingCellPolicy.RETURN_BLANK_AS_NULL)!=null)
                    dhRTBR.setM2rtbr((double)row.getCell(15).getNumericCellValue());
                if(row.getCell(16,Row.MissingCellPolicy.RETURN_BLANK_AS_NULL)!=null)
                    dhRTBR.setM3rtbr((double)row.getCell(16).getNumericCellValue());


                    dhRTBRList.add(dhRTBR);
                }




        }

        dhRTBRList.stream().forEach(p->{
            AccountBE be = accountBERepository.findAccountNameAccountTrackAccountDU(p.getAccountName(),p.getAccountTrack(), p.getAccountDu(), p.getDm());
            if(be != null)
            {
                accountBERepository.updateAcntBEDHRTBR(p.getM1rtbr(), p.getM2rtbr(), p.getM3rtbr(), p.getdHBE(), p.getrTBR(), p.getAccountName(), p.getAccountTrack(), p.getAccountDu(), p.getDm());
            }
            else{

                accountBERepository.insertAcntBEDHRTBR(p.getM1rtbr(), p.getM2rtbr(), p.getM3rtbr(), p.getdHBE(), p.getrTBR(), p.getAccountName(), p.getAccountTrack(),p.getAccountDu(), p.getDa(), p.getDm());
            }
        });

        return dhRTBRList;
    }




    public List<AccountBE> getSummaryByAccount(String account) {

     return accountBERepository.findByAccountName(account);

    }

    public List<AccountBE> getSummaryBypM(String pm)  {

        return accountBERepository.findByPmOrderByAccountName(pm);

    }

    public List<AccountBE> getSummaryByDa(String dm, String da)  {

        return accountBERepository.findByDmAndDaOrderByAccountName(dm,da);

    }


    public List<Object> getTotalsSummary()  {
        //return List.class.cast(accountBERepository.getTotalsSummary());
      /*  List<Object> obj1 = accountSummaryRepository.getTotalsSummary();
        obj1.stream().forEach(p->{
            p.toString().split(",");
        });*/
      return accountSummaryRepository.getTotalsSummary();
    }




    public void postSummary(List<AccountBE> accountBE) {
        accountBERepository.saveAll(accountBE);

    }

    public void putSummary(AccountBE accountBE, int id) {
        accountBERepository.save(accountBE);
    }

    public List<Number> getTotalBESummary(String dm) {
        totalDHBE=0;
        totalNPBE=0;
        totalPMBE=0;
        totalRTBR=0;
        totalPMBERTBRGap=0;
        totalPMBENPBEGap=0;
        totalNPBERTBRGap=0;
        accountBEList = accountBERepository.findByDmOrderByAccountName(dm);
        accountBEList.forEach((p)->{
            totalDHBE = totalDHBE + p.getDhBE();
           // totalNPBE = totalNPBE + p.getNpBE();
            totalPMBE = totalPMBE + p.getPmBE();
            totalRTBR = totalRTBR + p.getRtb();
            totalPMBERTBRGap = totalPMBERTBRGap + (p.getPmBE()-p.getRtb());
            totalPMBENPBEGap = totalPMBENPBEGap + (p.getPmBE()-p.getDhBE());
            totalNPBERTBRGap = totalNPBERTBRGap + (p.getRtb()-p.getDhBE());
         });

        return Arrays.asList(totalDHBE, totalNPBE,totalPMBE,totalRTBR,totalPMBERTBRGap,totalPMBENPBEGap, totalNPBERTBRGap);
    }

    public List<Number> getTotalSummary(String dm) {
        totalDHBE=0;
        totalNPBE=0;
        totalPMBE=0;
        totalRTBR=0;
        totalPMBERTBRGap=0;
        totalPMBENPBEGap=0;
        totalNPBERTBRGap=0;
        accountSummaryList = accountSummaryRepository.findByDmOrderByAccountName(dm);
        accountSummaryList.forEach((p)->{
            totalDHBE = totalDHBE + p.getDhBE();
          //  totalNPBE = totalNPBE + p.getNpBE();
            totalPMBE = totalPMBE + p.getPmBE();
            totalRTBR = totalRTBR + p.getRtb();
            totalPMBERTBRGap = totalPMBERTBRGap + (p.getPmBE()-p.getRtb());
            totalPMBENPBEGap = totalPMBENPBEGap + (p.getPmBE()-p.getDhBE());
            totalNPBERTBRGap = totalNPBERTBRGap + (p.getRtb()-p.getDhBE());
        });

        return Arrays.asList(totalDHBE,totalNPBE,totalPMBE,totalRTBR,totalPMBERTBRGap,totalPMBENPBEGap,totalNPBERTBRGap);
    }


    public List<Number> getTotalSummaryByPm(String pm) {
        totalDHBE=0;
        totalNPBE=0;
        totalPMBE=0;
        totalRTBR=0;
        totalPMBERTBRGap=0;
        totalPMBENPBEGap=0;
        totalNPBERTBRGap=0;
        accountBEList = getSummaryBypM(pm);
        accountBEList.forEach((p)->{
            totalDHBE = totalDHBE + p.getDhBE();
          //  totalNPBE = totalNPBE + p.getNpBE();
            totalPMBE = totalPMBE + p.getPmBE();
            totalRTBR = totalRTBR + p.getRtb();
            totalPMBERTBRGap = totalPMBERTBRGap + (p.getPmBE()-p.getRtb());
            totalPMBENPBEGap = totalPMBENPBEGap + (p.getPmBE()-p.getDhBE());
            totalNPBERTBRGap = totalNPBERTBRGap + (p.getRtb()-p.getDhBE());
        });

        return Arrays.asList(totalDHBE,totalNPBE,totalPMBE,totalRTBR,totalPMBERTBRGap,totalPMBENPBEGap,totalNPBERTBRGap);
    }


    public List<Number> getTotalSummaryByDa(String dm, String da) {
        totalDHBE=0;
        totalNPBE=0;
        totalPMBE=0;
        totalRTBR=0;
        totalPMBERTBRGap=0;
        totalPMBENPBEGap=0;
        totalNPBERTBRGap=0;
        accountBEList = accountBERepository.findByDmAndDaOrderByAccountName(dm, da);
        accountBEList.forEach((p)->{
            totalDHBE = totalDHBE + p.getDhBE();
          //  totalNPBE = totalNPBE + p.getNpBE();
            totalPMBE = totalPMBE + p.getPmBE();
            totalRTBR = totalRTBR + p.getRtb();
            totalPMBERTBRGap = totalPMBERTBRGap + (p.getPmBE()-p.getRtb());
            totalPMBENPBEGap = totalPMBENPBEGap + (p.getPmBE()-p.getDhBE());
            totalNPBERTBRGap = totalNPBERTBRGap + (p.getRtb()-p.getDhBE());
        });

        return Arrays.asList(totalDHBE,totalNPBE,totalPMBE,totalRTBR,totalPMBERTBRGap,totalPMBENPBEGap,totalNPBERTBRGap);
    }


    public List<AccountSummary> allAccounts(String dm) {

        List<Object[]> allDMBE = accountBERepository.findAllAccountsAndDMSBE(dm);
        List<Object[]> allDMBES = accountSummaryRepository.findAllAccountsAndDMSBES(dm);
        Map<String, String> mappedDMBE = new HashMap<>();
        Map<String, String> mappedDMBES = new HashMap<>();

        for (Object[] obj : allDMBE ) {
            String dmName = (String)obj[0];
            String dmAccount = (String)obj[1];
            mappedDMBE.put(dmName, dmAccount);
        }

        for (Object[] obj : allDMBES ) {
            String dmName = (String)obj[0];
            String dmAccount = (String)obj[1];
            mappedDMBES.put(dmName, dmAccount);
        }

        if (mappedDMBES.isEmpty()) {
            mappedDMBE.forEach((i,j) -> {
                accountSummaryRepository.insertAccountBESummaryDB(j, dm);
            });
        }
        else
        {
            mappedDMBE.forEach((i, j) -> {
                mappedDMBES.forEach((k, v) ->
                {
                    if (i.equals(k) && j.equals(v) && i.contains(dm)) {
                        accountSummaryRepository.updateAccountBESummaryDB(v, dm);
                    }
                });
            });
        }


        return accountSummaryRepository.findByDmOrderByAccountName(dm);


    }

    public List<String> findAllAccountsSummary() {
        return accountSummaryRepository.findAllAccountsSummary();
    }

    public List<String> findAllAccountsBE() {
        return accountBERepository.findAllAccountsBE();
    }

    /*public AccountSummary queryAcntBEDB(String p) {
       return accountSummaryRepository.queryAcntBEDB(p);
    }*/


    public AccountBE test(String a, String b)
    {


        asSOA = accountBERepository.findAccountNameAccountTrack(a,b);
        System.out.print("Inside Test" + asSOA.getAccountName());
        return asSOA;
        //asAPI = accountBERepository.findByAccountNameAndAccountTrack(a,b)

    }


    public List<AccountBE> updateCurrConv(String month) {

        accountBERepository.findAll().stream().forEach(p->
            {
                if(p.getNativecurrency()!=null)
                {
                    if(month.equals("m1"))
                    {
                        nativCurrToUSDRepository.findAll().stream().forEach(q->{

                            if(p.getNativecurrency().equals(q.getNativecurr()))
                            {
                                accountBERepository.updatem1curr(q.getM1usdcurr(), q.getNativecurr());
                            }

                        });
                    }
                    if(month.equals("m2"))
                    {
                        nativCurrToUSDRepository.findAll().stream().forEach(q->{

                            if(p.getNativecurrency().equals(q.getNativecurr()))
                            {
                                accountBERepository.updatem2curr(q.getM1usdcurr(), q.getNativecurr());
                            }

                        });

                    }
                    if(month.equals("m3"))
                    {
                        nativCurrToUSDRepository.findAll().stream().forEach(q->{

                            if(p.getNativecurrency().equals(q.getNativecurr()))
                            {
                                accountBERepository.updatem3curr(q.getM1usdcurr(), q.getNativecurr());
                            }

                        });

                    }
                }
            }
        );


        return accountBERepository.findAll();

    }



}


