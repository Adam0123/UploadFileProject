package com.example.demo.dao;

/**
 * @author zdz
 * @create 2018-06-07-14:39
 */

import com.example.demo.entity.MetaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface MetaDataDAO extends JpaRepository<MetaData,Integer>{
    //current_timestamp()
    //@Query("SELECT distinct m FROM MetaData m WHERE DATEDIFF(curdate(),m.time)<60 ")
    List<MetaData> getrecent ();
    @Query("SELECT distinct m.id FROM MetaData m WHERE m.name like %:name%")
    Integer findIdByName(@Param("name") String name);


}