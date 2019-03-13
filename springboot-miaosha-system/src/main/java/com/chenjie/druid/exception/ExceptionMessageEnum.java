package com.chenjie.druid.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * @ClassName ExceptionMessageEnum
 * @Description  所有参照业务模块的com.bee.trade.common.entity.ResCodeEnum的值进行 {@code code} 定义相应的错误编码！
 *               每个业务模块的错误使用相应的错误编码区间！详情见示例！
 * @author zhigang.zhou
 * @Date 2018年10月26日 下午4:00:47
 * @version 1.0.0
 */
@Getter
@AllArgsConstructor
public enum ExceptionMessageEnum {

    /**
     * 系统级错误异常
     */
    SUCCESS(0, "成功"),
    SYSTEM_INVALID_PARAMS(1, "参数错误"),
    SYSTEM_NOT_FOUND(10, "无法找到相应的数据"),
    ERROR_SYSTEM(-1, "系统繁忙,请稍后再试"),
    ERROR_DATA(-1, "无法找到相应数据"),

    /**
     * 示例异常：用户模块
     */

    USER_NOT_EXIST(10001,"用户#######不存在"),
    USER_DATABASE_OPERATE_FAILED(20001,"操作失败"),
    USER_VALUE_DUPLICATE(20002,"name 不允许重复"),
    USER_VALUE_EMPTY(20003,"参数不允许为空"),
    USER_VALUE_OUT_RANGE(20004,"参数不是限定枚举值"),
    USER_URL_NOT_LEGAL(20005,"url路径值不合法"),
    USER_CAN_NOT_UPDATE(20006,"菜单有下级菜单，其类型不能改变"),
    USER_METHOD_ERROR(20007,"无菜单时添加菜单，不允许添加子菜单或子页面"),
    USER_CAN_NOT_HAVE_URL(20008,"菜单类型为普通菜单时，页面路由不允许有值"),
    USER_MENUID_NOT_LEGAL(20009,"menuId参数格式不合法"),
    USER_NO_SUCH_VALUE(20010,"没有找到值"),
    NO_AUTHORITY(20011,"没有权限"),
    USER_NO_MENU(20012,"用户没有分配权限（菜单）"),
    USER_VALUE_NOT_LEGAL(20013,"参数值位数或类型错误"),
    USER_LOGIN_USER_INFO_EMPTY(200014,"获取当前登录用户公司id，公司名称失败"),
    USER_CAN_NOT_HAVE_CHILDID(20015,"url菜单不允许有下级菜单"),
    USER_JSON_ANALYSIS_FAILED(20016,"json解析数组失败"),
    USER_NO_PARENT(20016,"url菜单必须至少有一级上级普通菜单"),
    CHANGE_COMPANY_FAIL(20017,"切换企业失败"),
    MUST_BEETRADE_COMPANY(20018, "必须是{0}登录的用户才可进入{1}"),
    COMPANY_CURBED_ROLE(20019, "必须是{0}的用户才能设置为{1}"),
    PERMISSION_NOT_FOUND(20020,"权限不存在"),
    CAN_NOT_EDIT_ROLE(20021,"企业不存在，不能为该角色限制可访问企业"),
    NOT_CHANGE_ROLE(20022,"系统自动为用户分配{0}角色，请勿手动修改"),
    /**
     * 示例异常：其他模块
     */
    OTHER_ERROR_ONE(200000, "其他模块异常一{0}"),
    OTHER_ERROR_TWO(200001, "其他模块异常二:{0},{1}"),

    /**
     * 示例异常：用户模块
     */

    USER_NO_ROLE(20011,"用户没有分配角色"),
    USER_LOGIN_USER_EMPTY(20014,"获取登录用户信息失败"),
    USER_INFO_FAIL(20017,"登录信息有误，请重新登录"),
    USER_TOKEN_FAIL(20018,"登录失效，请重新登录"),
    USER_ADD_COMPANY(20019,"未获得企业信息"),
    USERNAME_PASSWORD_ERROR(20020,"账号或密码错误"),
    FINANCE_TOKEN_IS_NULL(20021,"登录凭证有误，请重新登录"),
    CHOOSE_ROLE(20022,"信息有误,未选择角色,请重新登录"),

    // ...
    OTHER_ERROR_TEN(200010, "其他模块异常十"),
    ;
    private Integer code;
    private String message;
}
