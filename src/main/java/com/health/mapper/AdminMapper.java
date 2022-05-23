package com.health.mapper;

import com.health.po.Admin;
import org.apache.ibatis.annotations.Param;


public interface AdminMapper {

    Admin adminLogin(@Param("a_id") Integer a_id, @Param("a_password") String a_password);
}
