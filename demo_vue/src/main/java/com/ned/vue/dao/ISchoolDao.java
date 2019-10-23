package com.ned.vue.dao;

import com.ned.vue.domain.School;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层
 */
@Repository
public interface ISchoolDao {

    @Select("select * from school_introduction")
    List<School> findAll();
    @Select("select * from school_introduction where sid=#{sid}")
    School findById(long sid);

    //与User属性对应
//    @Update("update crawler set username=#{username},password=#{password},age=#{age}")
//    void update(School user);
}
