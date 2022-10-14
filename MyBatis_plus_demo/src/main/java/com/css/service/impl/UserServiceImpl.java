package com.css.service.impl;

/**
 * @author hs
 * @version 1.0
 * Create by 2022/7/25 13:56
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.css.mapper.UserMapper;
import com.css.pojo.User;
import com.css.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ServiceImpl实现了IService，提供了IService中基础功能的实现
 * 若ServiceImpl无法满足业务需求，则可以使用自定的UserService定义方法，并在实现类中实现
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements
        UserService {
}
