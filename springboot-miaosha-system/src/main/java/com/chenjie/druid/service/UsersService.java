package com.chenjie.druid.service;

import com.chenjie.druid.entity.User;
import com.baomidou.mybatisplus.service.IService;
import com.chenjie.druid.exception.BusinessException;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chenjie
 * @since 2019-03-06
 */
public interface UsersService extends IService<User> {

    User getUserInfo(Integer id);

    List<User> listUsers();
}
