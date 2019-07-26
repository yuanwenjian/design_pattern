package com.yuanwj.design_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with Intellij IDEA
 * Author: xuziling
 * Date:  2019/7/25
 * Description:
 */
public class MapperProxy<T> implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===start====");
//        if (Object.class.equals(method.getDeclaringClass())) {
//            return method.invoke(proxy, args);
//        }
        Object result = method.invoke(proxy, args);
        System.out.println("=======end==========");
        return result;
    }



}
