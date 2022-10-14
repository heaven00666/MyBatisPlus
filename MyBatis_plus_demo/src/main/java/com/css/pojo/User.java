package com.css.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * @author hs
 * @version 1.0
 * Create by 2022/7/25 11:40
 */

@Data
@TableName("leader")
public class User {

    private Integer id;
    private String name;
    private Integer score;
    private Timestamp time;

    public User() {
    }

    public User(Integer id, String name, Integer score, Timestamp time) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.time = time;
    }
}
