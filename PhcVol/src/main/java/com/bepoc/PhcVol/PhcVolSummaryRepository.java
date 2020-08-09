package com.bepoc.PhcVol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface PhcVolSummaryRepository extends JpaRepository<PhcVolSummary, String> {


    public List<PhcVolSummary> findByDmOrderByAccountName(String dm);
    public List<PhcVolSummary> findByAccountNameAndDm(String accountName, String dm);

    @Modifying
    @Query(value = "update Phc_Vol_Summary A, (select account_Name, Sum(phc_Target) Spt, Sum(vol_Target) Svt, Sum(phcAOD) Spd, sum(volAOD) Svd, sum(phcAOL) Spl, sum(volAOL) Svl from Phc_Vol where account_Name=:account_Name and dm=:dm group by account_Name) B set A.phc_target=B.Spt, A.vol_target=B.Svt,  A.phcaod=B.Spd, A.volaod=B.Svd, A.phcaol=B.Spl, A.volaol=B.Svl where A.account_Name=:account_Name and A.dm=:dm",nativeQuery = true)
    public void updatePhcVolSummaryDB(@Param("account_Name") String account_Name, @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol_Summary c, (select concat('SOA :', a.remarks, ' API :', b.remarks) rmks from Phc_Vol a, Phc_Vol b where a.account_name=b.account_name and a.account_name in (:account_Name) and a.account_track='EAISSOA' and b.account_track='EAISAPI' and a.dm=b.dm) d set c.remarks=d.rmks where c.account_name in (:account_Name) and c.dm=:dm", nativeQuery = true)
    public void updateRemarksPhcVolSummaryDB(@Param("account_Name") String account_Name, @Param("dm") String dm);


    @Modifying
    @Query(value = "update Phc_Vol_Summary c, (select remarks from Phc_Vol where account_name=:account_Name and account_track='EAISSOA' and dm=:dm) b set c.remarks=b.remarks where c.account_name in (:account_Name) and c.dm=:dm",nativeQuery = true)
    public void updateRemarksSOAPhcVolSummaryDB(@Param("account_Name") String account_Name, @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol_Summary c, (select remarks from Phc_Vol where account_name=:account_Name and account_track='EAISAPI' and dm=:dm) b set c.remarks=b.remarks where c.account_name in (:account_Name) and c.dm=:dm",nativeQuery = true)
    public void updateRemarksAPIPhcVolSummaryDB(@Param("account_Name") String account_Name, @Param("dm") String dm);

    @Modifying
    @Query(value = "insert into Phc_Vol_Summary (account_name, dm, phc_Target, vol_Target, phcAOD, volAOD, phcAOL, volAOL)  select account_Name, dm, Sum(phc_Target), Sum(vol_Target), Sum(phcAOD), sum(volAOD), sum(phcAOL), sum(volAOL) from Phc_Vol where dm in (:dm) and account_Name=:accountName group by account_Name,dm",nativeQuery = true)
    public void insertPhcVolSummaryDB(@Param("accountName") String accountName, @Param("dm") String dm);

    @Modifying
    @Query(value = "update Phc_Vol_Summary A set A.dm=:dm where A.account_Name=:accountName",nativeQuery = true)
    public void updatePhcVolSummaryDBDM(@Param("accountName") String accountName, @Param("dm") String dm);

    @Query(value="SELECT distinct(account_Name) from Phc_Vol_Summary where dm=:dm", nativeQuery = true)
    List<String> findAllAccountsPhcVolSummary(@Param("dm") String dm);


    @Query(value="select distinct concat(dm, account_name), account_name, dm from Phc_vol_Summary where dm in (:dm)", nativeQuery = true)
    public List<Object[]> findAllAccountsAndDMSPVS(@Param("dm") String dm);

}
