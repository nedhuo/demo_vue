package com.ned.vue.service;

import com.ned.vue.domain.School;


import java.util.List;

/**
 * 业务层接口
 */
public interface ISchoolService {


    List<School> findAll();

    School findById(long sid);


}
