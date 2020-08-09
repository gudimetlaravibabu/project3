package com.bepoc.BestEstimate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DHRTBRRepository extends JpaRepository<DHRTBR, Integer> {
    //public List<DHRTBR> findByAccountNameAccountTrack(String AccountName, String AccountTrack);

    @Modifying
    @Query(value = "update DHRTBR A set A.dhBE=:dhBE, A.rtbr=:rtbr where A.account_Name= :accountName and A.account_Track= :accountTrack",nativeQuery = true)
    public void updateDHRTBRDB(@Param("dhBE") double dhBE, @Param("rtbr") double rtbr, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack);

    @Modifying
    @Query(value = "insert into DHRTBR (account_name, account_track, dhBE, rtbr) values (:dhBE, :rtbr, :accountName, :accountTrack)",nativeQuery = true)
    public void insertDHRTBRDB(@Param("dhBE") double dhBE, @Param("rtbr") double rtbr, @Param("accountName") String accountName, @Param("accountTrack") String accountTrack);

    @Modifying
    @Query(value = "update DHRTBR A set A.dhBE=0, A.rtbr=0",nativeQuery = true)
    public void updateDHRTBRDBZero();



}
