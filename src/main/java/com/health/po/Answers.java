package com.health.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answers {
    private Integer q_grade;               //题目得分
    private Integer s_id;                  //学生id
    private Integer q_id;                  //题目id
    private Integer e_id;                  //评测表id
}
