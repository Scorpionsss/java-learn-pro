package com.chenjie.druid.constants.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName ResCodeEnum
 * @Description (1)、code为0时：
 *                    0->请求成功，程序可以继续往下执行；
 *              (2)、code为正数时：
 *                    1到20->给tost提示，程序可以继续往下执行；
 *                    21到40：弹确认框，用户点击确认之后程序可以继续往下执行；
 *                    41到60：跳转业务逻辑页面。
 *              (3)、code为负数时：
 *                    -10到-1->弹窗错误提示框，并阻止程序继续往下执行；
 *                    -20到-11->跳转错误页面
 * @author zhigang.zhou
 * @Date 2018年10月26日 下午1:16:35
 * @version 1.0.0
 */
@Getter
@AllArgsConstructor
public enum ResCodeEnum {
    SUCCESS(0, "成功"),
    ERROR_SYSTEM(-1, "系统繁忙,请稍后再试"),
    ERROR_SUBMIT(-1, "提交出错,请联系管理员"),
    ERROR_DATA_EXISTED(-1, "已存在id对应数据"),
    STATUS_WITHOUT_MODIFY(-1, "该数据状态无需修改"),
    ERROR_NOFOUND(-1, "无法找到相应的数据"),
    HYSTRIX_ENABLED(-1000, "无法找到相应的数据，该服务被熔断"),
    ERROR_PARAMETER(-1, "参数错误"),
    TIME_PARAMETER_NULL(-1, "时间区间参数为空"),
    ROLE_MISMATCHING(-1,"角色不匹配"),
    PARAMETER_INCOMPLETE(-1, "参数不全"),
    INVALID_DATA(-1,"无效的数据"),
    ERROR_NOAUTH(-10, "没有权限"),
    NOT_CHOOSE_ROLE(-10,"信息有误,未选择角色,请重新登录"),
    MUST_BEETRADE_COMPANY(-10, "必须是乐山金蜜工业卫士服务股份有限公司登录的用户才可进入该权限"),
    ERROR_DUPLICATE_VALUE(-9,"手机号码已被使用"),
    NO_TWICE(-1,"报价次数不能超过两次"),
    NO_TWICEJUDGE(-1,"您已经审核过"),
    NOT_FOUND_USER(-1,"该用户不存在"),
    NOT_FOUND_ROLE(-1,"无法获得角色信息"),
    NOT_FOUND_TEAM(-1,"团队不存在"),
    NOT_FOUND_TEAM_ID(-1, "团队id不存在"),
    SAME_TEAM(-1,"团队名称已经存在"),
    MEMBER_IN_TEAM(-1,"团队中存在成员,无法删除团队"),
    USERNAME_OR_PASSWORD(-1,"账号或密码不允许为空"),
    USERNAME_OR_PASSWORD_ERROR(-1,"账号或密码错误"),
    CHOICE_TEAM(-1,"请为综合营销部角色的成员选择团队"),
    FAILED_TO_GET_USER_INFO(-2,"登录信息有误，请重新登录"),
    FINANCE_TOKEN_IS_NULL(-2,"登录凭证有误，请重新登录"),
    NOT_FOUND_COMPANY(-3,"未获得企业信息"),
    SAME_DEPARTMENT(-4,"相同部门不能设置多个角色"),
    BUSINESS_NO_ORDERBIDDING(-1,"报价单不存在或已被删除"),
    BUSINESS_NO_PRODUCT(-1,"询价单不存在或已被删除"),
    BUSINESS_ACCEPTED(-1,"已经接受报价,不能重复接受"),
    QUOTED_ACCEPTED(-1,"报价已经被接受,不能修改"),
    SAVE_TWO_MORE(-1,"保存失败，不要重复提交订单"),
    NO_SUCH_ORDER(-1,"该订单不存在"),
    NO_SUCH_APPLY(-1,"该申请不存在"),
    UPDATE_ORDER_FAIL(-1,"该申请不存在"),
    NO_PROCESS_INFO(-1,"未查询到当前流程信息"),
    SAVE_FAILED(-1,"保存失败"),
    NOT_LOGIN(401,"未登录,请先登录"),
    NO_AUTHORITY(403,"没有权限"),
    UPDATA_FAIL(-1,"更新失败"),
    CHCEK_FAIL(-1,"审核失败"),
    NOT_CONFIRM_TWICE(-1,"请勿重复确认"),
    SURE_FAIL(-1,"确认失败"),
    DATE_FORMAT_ERROR(-1,"时间格式不正确"),
    ERROR_DATA(-1,"数据异常"),
    ONLY_ONCE(-1,"该订单状态只能提交一次该证明"),
    THREE_INTERFACE_DOWNTIME(-1,"获取风控评分数据失败，请联系管理员"),
    RISK_GRADE_ERROR(-1,"风控评分数据异常"),
    BUY_DELAY_APPLY_NOT_FOUND(-1,"该延期提货申请不存在"),
    BUY_BOND_PROOF_NOT_FOUND(-1,"该保证金证明不存在"),
    BUY_PICK_UP_APPLY_NOT_FOUND(-1,"该提货申请不存在"),
    STORAGE_STOREHOUSE_PROOF_NOT_FOUND(-1,"该仓单申请不存在"),
    PROOF_ALREADY(-1,"您已经提交过证明，请在订单详情票据页重新提交"),
    PICK_UP_APPLY_NOT_FOUND(-1,"该提货申请不存在"),
    WAIT_PAYMENT_PROOF(-1,"当前流程已提交提货申请，请等待提交付款证明"),
    NOT_ACCOUNTS(-1,"该结算单不存在"),
    CAN_NOT_AUDIT(-1,"该申请已经审核完成,请查看审核详细"),
    NOT_CONFIRMED(-1,"该结算单未完成确认,请查看结算单状态"),
    CAN_NOT_REPEAT(-1,"请勿重复提交审核"),
    NOT_FOUND_GOODSPOWER(-1,"该货权转移证明不存在"),
    SUBMIT_FAIL(-1,"提交失败"),
    REPULSE_FAIL(-1,"退回失败"),
    LOW_STOCKS(-1,"库存不足"),
    NO_CERTIFICATE(-1,"请上传证明"),
    LESS_THAN_THREE(-1,"最多上传三张"),
    EXISTING_PROCESSES(-1,"已存在审核中流程,请勿重复提交"),
    EXISTING_RETURN_PROCESSES(-1,"已存在退回流程,请在订单详情票据页重新提交"),
    NO_DATA(-1, "无法找到对应的数据"),
    NOT_FOUNT_ROLE(-1,"角色不存在"),
    NOT_FOUNT_MENUS(-1,"错误的菜单编号,无法查询到对应菜单"),
    ORDER_STATUS_EXCEPTION(-1,"订单状态异常"),
    NOT_REFUSED_ACCOUNTS(-1,"未选中要拒绝的结算单"),
    NOT_CREATE_TEAM_MANAGER(-1,"该团队已经存在部门经理，清勿重复新增部门经理"),
    NOT_TEST_ROLEID(-1,"未填写测试角色id"),
    THIRD_INTERFACE_FAILED(-1,"调用三方验证接口失败"),
    ROLE_NOT_FOUND(-1,"该角色不存在，无法编辑修改"),
    MEUN_FAIL(-1,"资源有误无法新增角色"),
    ROLE_NAME_DUPLICATION(-1,"角色名称重复"),
    ROLE_NOT_HAVE_AUTH(-1,"该角色没有权限操作"),
    INSIDE_SERVICE_ERROR(-1,"内部服务请求异常，未获得头信息"),
    DECISION_MAKER_NUM_THAN_FOUR(-1,"决策委员会成员已大于{0}人，无法为该用户赋予决策委员会角色"),
    INVOICE_ALREADY(-1,"当前提货申请流程已提交过发票"),
    PAY_TOO_MANY(-1,"付款金额大于剩余付款金额"),
    CLOSE_CHECK(-1,"已关闭三方接口信息验证"),
    CHECK_INVALID(-1,"三方接口验证开关失效"),
    NULL_OF_INVOICE_MODE(-1,"开票模式为null"),
    GOODS_NOT_FOUND(-1,"标的物不存在"),
    FRACTIONAL_LINE_ERROR(-1,"分数不正确，请重新配置"),
    FRACTIONAL_LINE_PLUS(-1,"分数线范围限制0-100，请重新配置"),
    LOW_RISK_CONFIG_NOT_FOUND(-1,"风控配置不存在，修改失败"),
    LOW_RISK_EXIST(-1,"风控配置已存在，修改失败"),
    LOW_RISK_CONFIG_EXIST(-1,"该规则配置已经存在，编辑失败"),
    LOW_GRADE_CONFIG_NOT_FOUND(-3,"{0}模式中未查询到标的物{1}的低分规则配置，请先为该标的物配置低分规则。"),
    LOW_GRADE_CONFIG_NOT_EXIST(-1,"低分规则不存在  Triggered rejection rule"),
    TRIGGERED_REJECTION_RULE(-4,"标的物{0}的拒绝规则分数线是{1}分。该订单获得分数是{2}分，低于拒绝规则分数线。触发拒绝规则，将被退回"),
    TRIGGERED_LOW_GRADE(-5,"该订单触发低分规则，部分字段将被强制修改，请到订单详细中查看。"),
    NOT_FIND_COMPANY_INFO(-1,"未查询到该企业"),
    CALL_COMPANY_INFO_FAILED(-1,"调用企查查API企业关键字精确获取详细信息(Full)接口错误"),
    CALL_SEARCH_FAILED(-1,"调用企查查API（企业库接口：投资机构工商追踪）接口错误   "),
    CALL_SERIOUSVIOLATION_FAILED(-1,"调用企查查API接口（严重违法） 接口错误  "),
    CALL_OPEXCEPTION_FAILED(-1,"调用企查查API接口（企业经营异常信息） 接口错误  "),
    CALL_JUDGMENTDOC_FAILED(-1,"调用企查查API接口（查询裁判文书） 接口错误  "),
    ;
    public Integer code;

    public String msg;

}

