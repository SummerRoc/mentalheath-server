package com.health.mapper;

import com.health.po.Esitem;


public interface EsMapper {
    int updataState(Esitem esitem);

    int insertEsc(Esitem esitem);

    int insertEsceid(Integer e_id);

    int deleteEsceid(Integer e_id);
}
