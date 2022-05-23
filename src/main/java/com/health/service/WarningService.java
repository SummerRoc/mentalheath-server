package com.health.service;

import com.health.vo.WarningVo;

import java.util.List;


public interface WarningService {



    List<Integer> getSumQgradeByCid(Integer s_id, Integer e_id);


    WarningVo getWarningByid(Integer s_id, Integer e_id, Integer q_grade, Integer c_id);
}
