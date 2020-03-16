package cn.yzstu.factory.fee.impl;

import cn.yzstu.factory.fee.FeeInterface;

/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 12:18
 * \* Description:
 * \
 */
public class GzFee implements FeeInterface {

    public String getToken() {
        return "GzToken";
    }

    public String reqFee() {
        return "GzFee";
    }
}