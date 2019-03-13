package com.chenjie.druid.service.Impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.chenjie.druid.constants.enums.ResCodeEnum;
import com.chenjie.druid.entity.User;
import com.chenjie.druid.exception.BusinessException;
import com.chenjie.druid.exception.ExceptionMessageEnum;
import com.chenjie.druid.mapper.UserMapper;
import com.chenjie.druid.service.UsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenjie
 * @since 2019-03-06
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UserMapper, User> implements UsersService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfo(Integer id) throws BusinessException {
        User user = userMapper.selectOne(new User().setId(id));
        if (ObjectUtils.isEmpty(user)){
            //user.setId(2112121);
            throw new BusinessException(ResCodeEnum.NOT_FOUND_USER, ExceptionMessageEnum.USER_NOT_EXIST);
        }
        return user;
    }

    @Override
    public List<User> listUsers() {
        return userMapper.selectList(new EntityWrapper<>());
    }
}
