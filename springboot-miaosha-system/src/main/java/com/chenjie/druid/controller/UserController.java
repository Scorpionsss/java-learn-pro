package com.chenjie.druid.controller;

import java.util.List;

import com.chenjie.druid.constants.enums.ResCodeEnum;
import com.chenjie.druid.entity.ResponseResult;
import com.chenjie.druid.entity.User;
import com.chenjie.druid.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@Api(value = "user", tags = "user管理相关接口")
@RequestMapping(value="/user")
public class UserController {



    @Autowired
    private UsersService usersService;

    @GetMapping(value="/getUserInfo")
    @ApiOperation(value="获取用户信息",notes="获取用户信息")
    public ResponseResult<User> getUserInfo(@RequestParam Integer id) {
        //return userMapper.getOne(1);
        //return ResponseResult.buildResponseResult(ResCodeEnum.SUCCESS,userMapper.selectOne(new User().setId(1)));
        return ResponseResult.buildResponseResult(ResCodeEnum.SUCCESS,usersService.getUserInfo(id));
    }

    @PostMapping(value="/listUsers")
    @ApiOperation(value="获取用户列表",notes="获取用户列表")
    public ResponseResult<List<User>> listUsers() {
        //return userMapper.list();
        //return ResponseResult.buildResponseResult(ResCodeEnum.SUCCESS,userMapper.selectList(new EntityWrapper<>()));
        return ResponseResult.buildResponseResult(ResCodeEnum.SUCCESS,usersService.listUsers());
    }


}
