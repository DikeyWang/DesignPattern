package cn.yzstu.abstractfactory.factory;

import cn.yzstu.abstractfactory.AbstractFactory;
import cn.yzstu.abstractfactory.fee.FeeInterface;
import cn.yzstu.abstractfactory.fee.FeeTypeInterface;
import cn.yzstu.abstractfactory.fee.impl.BeiJingFee;
import cn.yzstu.abstractfactory.fee.impl.GzFee;
import cn.yzstu.abstractfactory.fee.impl.MelonFee;


/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 12:02
 * \* Description:
 * \
 */
public class FeeFactory extends AbstractFactory {

    @Override
    public FeeTypeInterface getFeeType(String type) {
        return null;
    }

    public FeeInterface getFee(String feeName){
        if (feeName == null) return null;
        FeeInterface feeInterface;
        if ("gzfee".equals(feeName)) {
            feeInterface = new GzFee();
        } else if ("MelonFee".equals(feeName)) {
            feeInterface = new MelonFee();
        } else if ("BeiJing".equals(feeName)) {
            feeInterface = new BeiJingFee();
        }else {
            feeInterface = null;
        }
        return feeInterface;
    }
}