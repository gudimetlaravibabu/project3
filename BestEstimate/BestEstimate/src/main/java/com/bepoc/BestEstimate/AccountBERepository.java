package com.bepoc.BestEstimate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AccountBERepository extends JpaRepository<AccountBE, Integer> {

   public List<AccountBE> findByOrderByAccountName();
   public List<AccountBE> findByAccountName(String accountName);
   public List<AccountBE> findByPmOrderByAccountName(String pm);
   public List<AccountBE> findByDmAndDaOrderByAccountName(String dm, String da);
    public List<AccountBE> findByDmOrderByAccountName(String dm);


    @Query(value="select * from AccountBE where account_Name = :account_Name and account_Track= :account_Track", nativeQuery = true)
    public AccountBE findAccountNameAccountTrack(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track);

   // select account_name, account_track, sum(dhbe), sum(pmbe), sum(rtb),group_concat(distinct remarks order by remarks desc separator '\n') from AccountBE  where account_Name = 'AUSGRID' and dm='NP' group by account_Name, account_Track;
    @Query(value="select account_name, account_track, sum(dhbe) dhbe, sum(pmbe) pmbe, sum(rtb) rtb,group_concat(distinct remarks order by remarks desc separator '\\n') remarks from AccountBE where dm = :dm group by account_Name, account_Track", nativeQuery = true)
   public List<Object[]> findByDmOrderByAccountNameGroupByAccountTrack(@Param("dm") String dm);

   @Query(value="SELECT distinct(account_Name) from AccountBE", nativeQuery = true)
   public List<String> findAllAccountsBE();

   @Query(value="select distinct concat(dm, account_name), account_name, dm from accountbe where dm in (:dm)", nativeQuery = true)
    public List<Object[]> findAllAccountsAndDMSBE(@Param("dm") String dm);

 /*   @Modifying
    @Query(value = "update AccountBE A, (select account_name, account_track, dHBE, rTBR from DHRTBR ) B set A.dhBE=B.dHBE, A.rtb=B.rTBR where A.account_Name= B.account_Name and A.account_Track= B.account_Track",nativeQuery = true)
    public void updateAcntBEDHRTBR(); */


    @Modifying
    @Query(value = "update AccountBE A set A.m1rtbr = :m1rtbr, A.m2rtbr = :m2rtbr, A.m3rtbr = :m3rtbr, A.dhBE=:dhBE, A.rtb=:rtb where A.account_Name= :accountName and A.account_Track= :accountTrack and A.account_Du=:accountDu and A.dm= :dm",nativeQuery = true)
    public void updateAcntBEDHRTBR(@Param("m1rtbr") double m1rtbr, @Param("m2rtbr") double m2rtbr, @Param("m3rtbr") double m3rtbr, @Param("dhBE") double dhBE, @Param("rtb") double rtb, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack, @Param("accountDu") String accountDu, @Param("dm") String dm);


    @Modifying
    @Query(value = "update AccountBE A set A.m1usdconversion =:m1usdcurr where A.nativecurrency = :nativecurr",nativeQuery = true)
    public void updatem1curr(@Param("m1usdcurr") double m1usdcurr, @Param("nativecurr") String nativecurr);

    @Modifying
    @Query(value = "update AccountBE A set A.m2usdconversion =:m2usdcurr where A.nativecurrency = :nativecurr",nativeQuery = true)
    public void updatem2curr(@Param("m2usdcurr") double m1usdcurr, @Param("nativecurr") String nativecurr);

    @Modifying
    @Query(value = "update AccountBE A set A.m3usdconversion =:m3usdcurr where A.nativecurrency = :nativecurr",nativeQuery = true)
    public void updatem3curr(@Param("m3usdcurr") double m1usdcurr, @Param("nativecurr") String nativecurr);

    @Modifying
    @Query(value = "insert into AccountBE (m1rtbr, m2rtbr, m3rtbr, dhBE,rtb,account_name,account_track,account_du,da,dm) values (:m1rtbr, :m2rtbr, :m3rtbr, :dhBE,:rtb,:accountName,:accountTrack,:accountDu, :da,:dm)",nativeQuery = true)
    public void insertAcntBEDHRTBR(@Param("m1rtbr") double m1rtbr, @Param("m2rtbr") double m2rtbr, @Param("m3rtbr") double m3rtbr, @Param("dhBE") double dhBE, @Param("rtb") double rtb, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack, @Param("accountDu") String accountDu, @Param("da") String da, @Param("dm") String dm);

    /* @Query(value="SELECT sum(npBE), sum(pmBE), sum(rtb), sum(pmBE)-sum(rtb), sum(npBE- from AccountBE", nativeQuery = true)
    public List<String> findAllAccountsBE();*/

    @Query(value="select * from AccountBE where account_Name = :account_Name and account_Track= :account_Track and account_Du=:account_Du and dm=:dm", nativeQuery = true)
    public AccountBE findAccountNameAccountTrackAccountDU(@Param("account_Name") String account_Name, @Param("account_Track") String account_Track, @Param("account_Du") String account_Du,  @Param("dm") String dm);

}
