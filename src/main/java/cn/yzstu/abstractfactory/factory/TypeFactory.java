package cn.yzstu.abstractfactory.factory;

import cn.yzstu.abstractfactory.AbstractFactory;
import cn.yzstu.abstractfactory.fee.FeeInterface;
import cn.yzstu.abstractfactory.fee.FeeTypeInterface;
import cn.yzstu.abstractfactory.fee.impl.TypeMo;
import cn.yzstu.abstractfactory.fee.impl.TypeSms;

/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 14:46
 * \* Description:
 * \
 */
public class TypeFactory extends AbstractFactory {

    @Override
    public FeeInterface getFee(String feeName) {
        return null;
    }

    @Override
    public FeeTypeInterface getFeeType(String type) {
        FeeTypeInterface feeTypeInterface;

        if (null == type) return null;

        if ("SMS".equalsIgnoreCase(type)){
            feeTypeInterface = new TypeSms();
        }else if("MO".equalsIgnoreCase(type)){
            feeTypeInterface = new TypeMo();
        }else {
            feeTypeInterface = null;
        }
        return feeTypeInterface;
    }
}