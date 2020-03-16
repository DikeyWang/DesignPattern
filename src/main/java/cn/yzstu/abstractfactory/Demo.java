package cn.yzstu.abstractfactory;

import cn.yzstu.abstractfactory.fee.FeeTypeInterface;

/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 14:56
 * \* Description:
 * \
 */
public class Demo {

    public static void main(String[] args) {

        //获取typeFactory
        AbstractFactory typeFactory = FactoryProducer.getFactory("typeFactory");
        //通过typeFactory获取typeSMS
        FeeTypeInterface typeSms = typeFactory.getFeeType("SMS");

        System.out.println(typeSms.getType());
    }

}