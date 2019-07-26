package com.yuanwj.design_pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * Created with Intellij IDEA
 * Author: xuziling
 * Date:  2019/7/25
 * Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        MapperProxy<UserMapper> mapperProxy = new MapperProxy();
        UserMapper userMapper =(UserMapper) Proxy.newProxyInstance(UserMapper.class.getClassLoader(), new Class[]{UserMapper.class}, mapperProxy);
        userMapper.getAllIds();
    }


}
