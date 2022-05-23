package com.health.service;

import com.health.po.Classification;

import java.util.List;


public interface ClassificationService {

    List<Classification> findHealthWaringScore();
}
