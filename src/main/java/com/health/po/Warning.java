package com.health.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warning {
    private Integer w_id;                    //预警id
    private String w_name;                   //预警级别
    private Integer w_grademin;              //最小分数
    private Integer w_grademax;              //最大分数
}
