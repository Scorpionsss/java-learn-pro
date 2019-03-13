package com.chenjie.druid.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain=true)
@TableName("users")
public class User extends Model<User> {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userId;

    private String userName;

    private Integer password;

    private Date date;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
