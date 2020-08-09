package com.bepoc.PhcVol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Transactional
public interface PHCRepository extends JpaRepository<PHC, Integer> {


    @Query(value = "select * from PHC where proj_type='Production' and alloc_end_date < last_day(CURDATE()) and fut_exits='Yes' order by next_alloc_date asc",nativeQuery = true)
    public List<PHC> findProdFut();


    @Query(value = "select * from PHC where proj_type!='Production' and alloc_end_date < last_day(CURDATE()) and fut_exits='Yes' order by next_alloc_date asc",nativeQuery = true)
    public List<PHC> findNonProdFut();

}
