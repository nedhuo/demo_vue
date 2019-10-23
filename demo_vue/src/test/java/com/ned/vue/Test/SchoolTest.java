package com.ned.vue.Test;

import java.util.List;


import com.ned.vue.domain.School;
import com.ned.vue.service.ISchoolService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SchoolTest {
    @Autowired
    private ISchoolService schoolService;

    @Test
    public void testFindAll() {
        List<School> schools = schoolService.findAll();
        System.out.println(schools.get(2).getSchool());
    }

    @Test
    public void testFindById() {
        long id = 2;
        School school = schoolService.findById(id);
        System.out.println(school.getSchool());
    }

    @Test
    public void testUpdate() {
//        User user = null;
//        long id = 2;
//        user = userService.findById(id);
//        userService.update(user);
    }
}
