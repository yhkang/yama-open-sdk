package com.dsc.financeopen.request.carloan;

import com.dsc.financeopen.request.OpenRequestParam;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shengchaojie
 * @date 2020/6/28
 **/
@Data
public class OrderApplyRequest extends OpenRequestParam<OrderApplyResponse, OrderApplyRequest.Wrapper> {

    private static final String API = "com.souche.yama.carloan.facade.CarLoanFacade#orderApply";

    public OrderApplyRequest() {
        super(API);
        setData(new Wrapper(this));
    }

    @Override
    public Class<OrderApplyResponse> getResultClass() {
        return OrderApplyResponse.class;
    }

    @Data
    @AllArgsConstructor
    public static class Wrapper {
        private OrderApplyRequest request;
    }

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 身份证地址/常用地址
     */
    private String address;

    /**
     * 身份证号
     */
    private String certNo;

    /**
     * 证件有效时间
     */
    private String certValidTime;

    /**
     * 工作单位
     * 可不填
     */
    private String company;

    /**
     * 月收入 分
     * 可不填
     */
    private Integer salary;

    /**
     * 行业 国标码
     * 可不填
     */
    private String industry;

    /**
     * 职业 国标码
     * 可不填
     */
    private String occupation;

    /**
     * 抵押人全称
     * 可不填 或无
     */
    private String mortgagee;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 车系
     */
    private String series;

    /**
     * 车型
     */
    private String type;

    /**
     * 颜色
     */
    private String color;

    /**
     * 销售人员
     */
    private String saler;

    /**
     * 销售人员手机号
     */
    private String salerMobile;

    /**
     * 车辆成交价 分
     */
    private Integer carPrice;

    /**
     * 车辆认证价 分
     */
    private Integer evaluatePrice;

    /**
     * 贷款总金额
     */
    private Integer loanAmount;

    /**
     * 贷款总期数
     */
    private Integer loanPeriod;

    /**
     * 首付款金额 分
     */
    private Integer downPayment;

    /**
     * 最低首付比例
     */
    private String downPaymentRatio;

    /**
     * 尾款 分
     */
    private Integer lastPayment;

    /**
     * 月供 分
     */
    private Integer monthPayment;

    /**
     * 贷款年利率
     */
    private String interestRate;

    /**
     * 罚息上浮比例
     */
    private String penaltyRate;

}
