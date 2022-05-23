package com.health.service;

import com.health.po.Teacher;

import java.util.List;


public interface TeacherService {
    List<Teacher> findTeacherList();

    int updataTeacherByid(Teacher teacher);

    int deleteTeacherById(Integer t_id);

    int addTeacher(Teacher teacher);
}
