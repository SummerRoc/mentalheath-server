package com.health.service;

import com.health.po.Answers;
import com.health.vo.AnswersVo;

import java.util.List;


public interface AnswersService {

    List<AnswersVo> findAnswers(Integer e_id);

    int insertAnswers(Answers answers);
}
