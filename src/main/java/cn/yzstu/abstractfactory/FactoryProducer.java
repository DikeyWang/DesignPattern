package cn.yzstu.abstractfactory;

import cn.yzstu.abstractfactory.factory.FeeFactory;
import cn.yzstu.abstractfactory.factory.TypeFactory;
import cn.yzstu.abstractfactory.fee.FeeTypeInterface;

/**
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2020/3/16
 * \* Time: 14:52
 * \* Description:获取对应工厂
 * \
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        AbstractFactory factory;
        if ("feeFactory".equalsIgnoreCase(factoryType)){
            factory = new FeeFactory();
        }else if ("typeFactory".equalsIgnoreCase(factoryType)){
            factory = new TypeFactory();
        }else {
            factory = null;
        }
        return factory;
    }
}