package com.health.mapper;

import com.health.vo.WarningVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface WarningMapper {



    List<Integer> getSumQgradeByCid(@Param("s_id") Integer s_id,@Param("e_id") Integer e_id);

    WarningVo getWarningByid(@Param("s_id") Integer s_id,@Param("e_id") Integer e_id,@Param("q_grade") Integer q_grade,@Param("c_id") Integer c_id);
}
