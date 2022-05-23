package com.health.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhanggaoxiang
 * @ClassName AnswersVo2
 * @Description TODO
 * @Date 2021/2/10 14:20
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersVo2 {
    private Integer[] q_grade;               //题目得分
    private Integer s_id;                  //学生id
    private Integer[] q_id;                  //题目id
    private Integer e_id;                  //评测表id
}
