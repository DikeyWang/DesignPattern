package cn.yzstu.factory;

import cn.yzstu.factory.fee.FeeInterface;
import cn.yzstu.factory.fee.impl.BeiJingFee;
import cn.yzstu.factory.fee.impl.GzFee;
import cn.yzstu.factory.fee.impl.MelonFee;

/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 12:02
 * \* Description:
 * \
 */
public class FeeFactory {
    public static FeeInterface getFee(String feeName){
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