package cn.yzstu.abstractfactory.fee.impl;

import cn.yzstu.abstractfactory.fee.FeeTypeInterface;

/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 14:41
 * \* Description:
 * \
 */
public class TypeMo implements FeeTypeInterface {
    public String getType() {
        return "MO";
    }
}