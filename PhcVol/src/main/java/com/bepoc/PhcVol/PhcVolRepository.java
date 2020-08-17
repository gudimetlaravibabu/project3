package com.bepoc.PhcVol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public interface PhcVolRepository extends JpaRepository<PhcVol, Integer> {

    public List<PhcVol> findByOrderByAccountName();

    public List<PhcVol> findByAccountName(String accountname);

    public List<PhcVol> findByOrderByRemarks();

    public List<PhcVol> findByDmOrderByAccountName(String dm);

    public List<PhcVol> findByDmAndDaOrderByAccountName(String dm, String da);


    @Query(value="select * from Phc_vol where remarks !='NA'", nativeQuery = true)
    public List<PhcVol> findRemarksNotNA();

    @Query(value=" select * from phc_vol where remarks !='' and dm=:dm", nativeQuery = true)
    public List<PhcVol> findRemarksForGaps(@Param("dm") String dm);

    @Query(value="select distinct(dm) from Phc_vol where dm is not null", nativeQuery = true)
    public List<String> findAllDMS();

    @Query(value="select distinct concat(dm, account_name), account_name, dm from Phc_vol where dm in (:dm)", nativeQuery = true)
    public List<Object[]> findAllAccountsAndDMSPV(@Param("dm") String dm);

    @Query(value="SELECT distinct(trim(account_Name)) from Phc_vol where dm=:dm and dm is not null", nativeQuery = true)
    public List<String> findAllAccountsPhcVol(@Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol A set A.phc_target=0, A.vol_target=0",nativeQuery = true)
    public void updatePhcVolDBTargetZero();

    @Modifying
    @Query(value = "update Phc_Vol A set A.volAOD=0, A.volAOL=0",nativeQuery = true)
    public void updatePhcVolDBVolZero();

    @Modifying
    @Query(value = "update Phc_Vol A set A.phcAOD=0, A.phcAOL=0",nativeQuery = true)
    public void updatePhcVolDBPhcZero();

    @Query(value="select * from Phc_vol where account_Name = :account_Name and account_Track= :account_Track and dm=:dm", nativeQuery = true)
    public List<PhcVol> findAccountNameAccountTrack(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track, @Param("dm") String dm);


    @Query(value="select * from Phc_vol where account_Name = :account_Name and account_Track= :account_Track and account_Du=:account_Du and dm=:dm", nativeQuery = true)
    public PhcVol findAccountNameAccountTrackAccountDU(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track, @Param("account_Du") String account_Du,  @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol A set A.phc_target=:phcTarget, A.vol_target=:volTarget where A.account_Name= :accountName and A.account_Track= :accountTrack  and A.account_Du=:accountDu and A.dm= :dm",nativeQuery = true)
    public void updatePhcVolDBTarget(@Param("phcTarget") double phcTarget, @Param("volTarget") double volTarget, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack, @Param("accountDu") String accountDu, @Param("dm") String dm);

    @Modifying
    @Query(value = "insert into Phc_Vol (phc_Target,vol_target,account_Name,account_Track, account_Du, dm) values (:phcTarget,:volTarget,:accountName,:accountTrack, :accountDu,:dm)",nativeQuery = true)
    public void insertPhcVolDBTarget(@Param("phcTarget") double phcTarget, @Param("volTarget") double volTarget, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack, @Param("accountDu") String accountDu, @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol A set A.volAOD=:volAOD where A.account_Name= :accountName and A.account_Track= :accountTrack and A.account_Du=:accountDu and A.dm= :dm",nativeQuery = true)
    public void updatePhcVolDBVolAOD(@Param("volAOD") double volAOD, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack, @Param("accountDu") String accountDu, @Param("dm") String dm);

    @Modifying
    @Query(value = "insert into Phc_Vol (vol_target,volAod,account_name,account_track,account_du,da,dm,show_textbox, show_updatebutton) values (:volTarget,:volAOD,:accountName,:accountTrack,:accountDu, :da,:dm,0,0)",nativeQuery = true)
    public void insertPhcVolDBVolAOD(@Param("volTarget") double volTarget, @Param("volAOD") double volAOD, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack, @Param("accountDu") String accountDu, @Param("da") String da, @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol A, (select count(emp_name) cen from PHC where account_name=:account_Name and account_Track=:account_Track and proj_type='Production' and alloc_end_date >= CURDATE() and account_Du=:account_Du and dm=:dm) B set A.phcaod = B.cen where A.account_Name=:account_Name and A.account_track=:account_Track and A.account_Du=:account_Du and A.dm=:dm",nativeQuery = true)
    public void updatePhcVolDBPhcAOD(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track, @Param("account_Du") String account_Du, @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol A, (select count(emp_name) cen from PHC where account_name=:account_Name and account_Track=:account_Track and proj_type='Production' and alloc_end_date >= last_day(CURDATE()) and account_Du=:account_Du and dm=:dm) B set A.phcaol = B.cen where A.account_Name=:account_Name and A.account_track=:account_Track and A.account_Du=:account_Du and A.dm=:dm",nativeQuery = true)
    public void updatePhcVolDBPhcAOL(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track, @Param("account_Du") String account_Du, @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol A, (select count(emp_name) cen from PHC where account_name =:account_Name and account_Track=:account_Track and proj_type='Production' and alloc_end_date < last_day(CURDATE()) and fut_exits='Yes' and account_Du=:account_Du and dm=:dm) B set A.phcaol =  (A.phcaol + B.cen) where A.account_Name=:account_Name and A.account_track=:account_Track and A.account_Du=:account_Du and A.dm=:dm",nativeQuery = true)
    public void updatePhcVolDBPhcAOLFutExistsAcnt(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track, @Param("account_Du") String account_Du, @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol A, (select count(emp_name) cen from PHC where trim(lastmcc) =:account_Name and account_Track=:account_Track and proj_type!='Production' and alloc_end_date < last_day(CURDATE()) and fut_exits='Yes' and account_Du=:account_Du and dm=:dm) B set A.phcaol =  (A.phcaol + B.cen) where A.account_Name=:account_Name and A.account_track=:account_Track and A.account_Du=:account_Du and A.dm=:dm",nativeQuery = true)
    public void updatePhcVolDBPhcAOLFutExistsLmcc(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track, @Param("account_Du") String account_Du, @Param("dm") String dm);



    //@Modifying
    //@Query(value = "update Phc_Vol A, (select count(emp_name) cen from PHC where account_name=:account_Name and trim(lastmcc) != :account_Name and account_Track=:account_Track and alloc_end_date < last_day(CURDATE()) and fut_exits='Yes') B set A.phcaol =  (A.phcaol + B.cen) where A.account_Name=:account_Name and A.account_track=:account_Track",nativeQuery = true)
    //public void updatePhcVolDBPhcAOLFutExistsLmcc(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track);






    //@Modifying
    //@Query(value = "insert into Phc_Vol (account_name, account_track, volAOD) values (:accountName, :accountTrack, :volAOD)",nativeQuery = true)
    //public void insertPhcVolDB(@Param("volAOD") double volAOD, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack);

}
