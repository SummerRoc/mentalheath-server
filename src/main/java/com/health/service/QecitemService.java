package com.health.service;
import com.health.vo.QecitemVo;

import java.util.List;


public interface QecitemService {
    List<Integer> getQuestion(Integer c_id);

    int inertQec(QecitemVo qecitemVo);

    void deleteQecitem(Integer e_id, Integer s_id);
}
