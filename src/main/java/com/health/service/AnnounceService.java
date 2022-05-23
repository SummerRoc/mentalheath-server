package com.health.service;

import com.health.po.Announcement;

import java.util.List;


public interface AnnounceService {
    List<Announcement> findAnnounce();

    int addAnnounce(Announcement announcement);

    int deleteAnnounceById(Integer announcementid);

    List<Announcement> findAnnounceByTime();
}
