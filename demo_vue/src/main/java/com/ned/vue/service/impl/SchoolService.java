package com.ned.vue.service.impl;

import com.ned.vue.dao.ISchoolDao;
import com.ned.vue.domain.School;
import com.ned.vue.service.ISchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService implements ISchoolService {
    @Autowired
    private ISchoolDao schoolDao;

    @Override
    public List<School> findAll() {
        return schoolDao.findAll();
    }

    @Override
    public School findById(long sid) {
        return schoolDao.findById(sid);
    }


}
