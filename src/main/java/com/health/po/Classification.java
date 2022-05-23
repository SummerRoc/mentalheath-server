package com.health.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classification {
    private Integer c_id;                     //分类id
    private String c_name;                    //分类名称
    private String c_desccribe;               //分类介绍
}
