package com.health.mapper;

import com.health.po.Message;
import com.health.po.Replay;

import java.util.List;


public interface MessageMapper {

    List<Message> findMessage();

    int insertMessage(Message message);

    int insertMessageCount(Replay replay);
}
