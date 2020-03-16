package cn.yzstu.abstractfactory;

import cn.yzstu.abstractfactory.fee.FeeInterface;
import cn.yzstu.abstractfactory.fee.FeeTypeInterface;

/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 14:43
 * \* Description:
 * \
 */
public abstract class AbstractFactory {
    public abstract FeeInterface getFee(String feeName);
    public abstract FeeTypeInterface getFeeType(String type);
}