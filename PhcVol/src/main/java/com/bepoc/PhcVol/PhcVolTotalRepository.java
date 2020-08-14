package com.bepoc.PhcVol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PhcVolTotalRepository extends JpaRepository<PhcVolTotal, Integer> {

    @Modifying
    @Query(value = "update Phc_Vol_Total A set A.phcaod=:phcaod, A.volaod=:volaod, A.phcaol=:phcaol, A.phc_gap=:phcgap, A.vol_gap=:volgap where A.dm=:dm",nativeQuery = true)
    public void updatePhcVolTotalDM(@Param("phcaod") double phcaod, @Param("volaod") double volaod, @Param("phcaol") double phcaol, @Param("phcgap") double phcgap, @Param("volgap") double volgap, @Param("dm") String dm);

  /*  @Modifying
    @Query(value = "update Phc_Vol_Total A set A.phc_target=:phc_target, A.vol_target=:vol_target, A.vol_gap=0, A.phc_gap=0, A.remarks='' where A.dm=:dm",nativeQuery = true)
    public void updatePhcVolTargetsTotalDM(@Param("phc_target") double phc_target, @Param("vol_target") double vol_target, @Param("dm") String dm);
*/
    @Modifying
    @Query(value = "update Phc_Vol_Total A, (select Sum(phc_Target) Spt, Sum(vol_Target) Svt from Phc_Vol where dm=:dm) B set A.phc_target=B.Spt, A.vol_target=B.Svt,  A.phc_gap=0, A.vol_gap=0, A.remarks='' where A.dm=:dm",nativeQuery = true)
    public void updatePhcVolTargetsTotalDM(@Param("dm") String dm);


    @Query(value = "select Sum(phc_Target) Spt, Sum(vol_Target) Svt, sum(phcaol) Spl, sum(volaod) Svd, sum(phc_gap) Spg, sum(vol_gap) Svg from Phc_Vol_Total",nativeQuery = true)
    public Object findTotalDMPhcVolTargets();

}
