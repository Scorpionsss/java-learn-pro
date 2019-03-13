/*package com.chenjie.druid.mapper;

import java.util.List;

import com.chenjie.druid.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper{



}*/

package com.chenjie.druid.mapper;

import com.chenjie.druid.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chenjie
 * @since 2019-03-06
 */
public interface UserMapper extends BaseMapper<User> {
    /*List<User> list();

    User getOne(int id);*/
}
