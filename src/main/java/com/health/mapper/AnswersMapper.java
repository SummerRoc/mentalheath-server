package com.health.mapper;

import com.health.po.Answers;
import com.health.vo.AnswersVo;

import java.util.List;


public interface AnswersMapper {
    List<AnswersVo> findAnswers(Integer e_id);

    int insertAnswers(Answers answers);
}
