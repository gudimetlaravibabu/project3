package com.bepoc.PhcVol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PhcVolTotalRepository extends JpaRepository<PhcVolTotal, String> {

    @Modifying
    @Query(value = "update Phc_Vol_Total A set A.phcaod=:phcaod, A.volaod=:volaod, A.phcaol=:phcaol, A.phc_gap=:phcgap, A.vol_gap=:volgap where A.dm=:dm",nativeQuery = true)
    public void updatePhcVolTotalDM(@Param("phcaod") double phcaod, @Param("volaod") double volaod, @Param("phcaol") double phcaol, @Param("phcgap") double phcgap, @Param("volgap") double volgap, @Param("dm") String dm);

}
