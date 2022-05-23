package com.health.service;

import com.health.po.Admin;
import com.health.po.Student;
import com.health.po.Teacher;


public interface LoginService {

    Admin adminLogin(Integer uid, String password);

    Teacher teacherLogin(Integer uid, String password);

    Student studentLogin(Integer uid, String password);
}
