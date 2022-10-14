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

    //查看允许玩家查询⾃⼰前后共10⼈的分数和名次,name为玩家的名称
    @Test
    public void test02(String name){
        //查出玩家自己的信息
        name = "tom";
        QueryWrapper<User> queryWrapper1 = new QueryWrapper<>();
        queryWrapper1.eq("name",name);
        List<User> list1 = userMapper.selectList(queryWrapper1);
        //向前排序
        QueryWrapper<User> queryWrapper2 = new QueryWrapper<>();
        queryWrapper2.ge("score",list1.get(0).getScore())
                .ge("time",list1.get(0).getTime())
                .orderByDesc("score").orderByDesc("time");
        List<User> list2 = userMapper.selectList(queryWrapper2);
        if(list2.size()>= 10){
            List<User> list22 = list2.subList(list2.size()-10, list2.size());
            list22.forEach(System.out::println);
        }else {
            list2.forEach(System.out::println);
            QueryWrapper<User> queryWrapper3 = new QueryWrapper<>();
            queryWrapper3.le("score",list1.get(0).getScore())
                    .le("time",list1.get(0).getTime())
                    .orderByDesc("score").orderByDesc("time");
            List<User> list3 = userMapper.selectList(queryWrapper3);
            if(list3.size()>= (10-list2.size())){
                List<User> list33 = list2.subList(0, (10-list2.size()));
                list33.forEach(System.out::println);
            }else {
                list3.forEach(System.out::println);
            }
        }
    }
}
