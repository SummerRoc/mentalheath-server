package com.health.mapper;

import com.health.po.Announcement;

import java.util.List;


public interface AnnounceMapper {

    List<Announcement> findAnnounce();

    int addAnnounce(Announcement announcement);

    int deleteAnnounceById(Integer announcementid);

    List<Announcement> findAnnounceByTime();
}
