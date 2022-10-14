package com.css;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.css.mapper.UserMapper;
import com.css.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Tests {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void testinsert() throws InterruptedException {

        for (int i = 100;i < 110;i++){
            //插入数据
            User user = new User(i, "jack"+i, 88+(int)Math.random()*1000,
                    new java.sql.Timestamp(new java.util.Date().getTime()));
            int result = userMapper.insert(user);
            Thread.sleep(1000);
        }
    }

    //查看前3名玩家的分数
    @Test
    public void test01(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("score").orderByDesc("time");
        List<User> list = userMapper.selectList(queryWrapper).subList(0,3);
        list.forEach(System.out::println);
    }
}
