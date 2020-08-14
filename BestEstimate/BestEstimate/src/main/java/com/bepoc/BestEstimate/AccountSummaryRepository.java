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
public interface AccountSummaryRepository extends JpaRepository<AccountSummary, String> {

    public List<AccountSummary> findByAccountName(String accountName);

    public List<AccountSummary> findByDmOrderByAccountName(String dm);

    @Modifying
    @Query(value = "insert into account_Summary (account_name, dm, pmbe, rtb, dhbe, remarks, currmnthdhbe, currmnthbe, currmnthrtbr)  select account_Name, dm,  Sum(pmbe), Sum(rtb), sum(dhbe), group_concat(distinct remarks order by remarks desc separator '\n'), sum(currmnthdhbe), sum(currmnthbe), sum(currmnthrtbr) from accountbe where dm in (:dm) and account_Name=:accountName group by account_Name,dm",nativeQuery = true)
    public void insertAccountBESummaryDB(@Param("accountName") String accountName, @Param("dm") String dm);

    @Modifying
    @Query(value = "update account_summary A, (select account_Name, group_concat(distinct remarks order by remarks desc separator '\n') rmks, Sum(pmbe) Svt, Sum(rtb) Spd, sum(dhbe) Svd, sum(currmnthdhbe) cmdhbe, sum(currmnthbe) cmbe, sum(currmnthrtbr) cmrtbr from accountbe where account_Name=:account_Name and dm=:dm group by account_Name) B set A.pmbe=B.Svt,  A.rtb=B.Spd, A.dhbe=B.Svd, A.remarks=B.rmks, A.currmnthdhbe=B.cmdhbe, A.currmnthbe=B.cmbe, A.currmnthrtbr=B.cmrtbr where A.account_Name=:account_Name and A.dm=:dm",nativeQuery = true)
    public void updateAccountBESummaryDB(@Param("account_Name") String account_Name, @Param("dm") String dm);


    @Query(value="select distinct concat(dm, account_name), account_name, dm from account_Summary where dm in (:dm)", nativeQuery = true)
    public List<Object[]> findAllAccountsAndDMSBES(@Param("dm") String dm);

    @Query("select a.accountName, Sum(a.dhBE), Sum(a.pmBE), sum(a.rtb) from AccountBE a group by a.accountName")
    List<Object> getTotalsSummary();

    @Modifying
    @Query(value = "update Account_Summary A, (select account_Name, Sum(dhBE) Sdh, Sum(pmBE) Spm, sum(rtb) Srt from AccountBE where account_Name=:account_Name group by account_Name) B set A.dhBE=B.Sdh, A.pmBE=B.Spm, A.rtb=B.Srt where A.account_Name=:account_Name",nativeQuery = true)
    public void updateAcntSummaryDB(@Param("account_Name") String account_Name);


    @Modifying
    @Query(value = "update account_summary c, (select concat('SOA :', a.remarks, ' API :', b.remarks) rmks from accountbe a, accountbe b where a.account_name=b.account_name and a.account_name in (:account_Name) and a.account_track='EAISSOA' and b.account_track='EAISAPI') d set c.remarks=d.rmks where c.account_name in (:account_Name)",nativeQuery = true)
    public void updateRemarksAcntSummaryDB(@Param("account_Name") String account_Name);


    @Modifying
    @Query(value = "update account_summary c, (select remarks from accountbe where account_name=:account_Name and account_track='EAISSOA') b set c.remarks=b.remarks where c.account_name in (:account_Name)",nativeQuery = true)
    public void updateRemarksSOAAcntSummaryDB(@Param("account_Name") String account_Name);

    @Modifying
    @Query(value = "update account_summary c, (select remarks from accountbe where account_name=:account_Name and account_track='EAISAPI') b set c.remarks=b.remarks where c.account_name in (:account_Name)",nativeQuery = true)
    public void updateRemarksAPIAcntSummaryDB(@Param("account_Name") String account_Name);

    @Modifying
    @Query(value = "insert into Account_Summary (account_name, dhBE, npBE, pmBE, rtb) select account_Name, Sum(dhBE), Sum(npBE), Sum(pmBE), sum(rtb) from AccountBE where account_Name=:accountName group by account_Name",nativeQuery = true)
    public void insertAcntSummaryDB(@Param("accountName") String accountName);

    @Query(value="SELECT account_Name from Account_Summary", nativeQuery = true)
    List<String> findAllAccountsSummary();
}
