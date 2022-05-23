package com.health.mapper;

import com.health.po.Replay;
import java.util.List;


public interface ReplayMapper {


    List<Replay> selectByMid(Integer m_id);
}
