package cn.yzstu.factory;

import cn.yzstu.factory.fee.FeeInterface;


/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 12:31
 * \* Description:
 * \
 */
public class Demo {
    public static void main(String[] args) {
        FeeInterface fee = FeeFactory.getFee("BeiJing");
        System.out.println(fee.reqFee());
    }

}