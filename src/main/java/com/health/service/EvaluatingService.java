package com.health.service;

import com.health.po.Evaluating;

import java.util.List;


public interface EvaluatingService {
    List<Evaluating> findEvaluating();

    Evaluating findEvaluatInfo(Integer e_id);


    int updataEvaluatingByid(Evaluating evaluating);

    int deleteEvaluatingById(Integer e_id);

    int addEvaluating(Evaluating evaluating);

    List<Evaluating> findAllEvaluating();
}
