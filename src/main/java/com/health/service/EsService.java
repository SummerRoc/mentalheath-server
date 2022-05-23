package com.health.service;

import com.health.po.Esitem;


public interface EsService {

    int updataState(Esitem esitem);

    int insertEsc(Esitem esitem);

    int insertEsceid(Integer e_id);

    int deleteEsceid(Integer e_id);
}
