package com.health.mapper;

import com.health.po.Classification;

import java.util.List;


public interface ClassificationMapper {

    List<Classification> findHealthWaringScore();
}
