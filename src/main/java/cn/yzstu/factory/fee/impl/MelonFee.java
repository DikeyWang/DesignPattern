package cn.yzstu.factory.fee.impl;

import cn.yzstu.factory.fee.FeeInterface;

/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 12:19
 * \* Description:
 * \
 */
public class MelonFee implements FeeInterface {
    public String getToken() {
        return "MelonToken";
    }

    public String reqFee() {
        return "MelonFee";
    }
}