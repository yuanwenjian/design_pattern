package com.yuanwj.design_pattern.proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with Intellij IDEA
 * Author: xuziling
 * Date:  2019/7/25
 * Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        MapperProxy<UserMapper> mapperProxy = new MapperProxy();// mybatis 实际由反射创建

        //注释为模拟mybatis代码
//        Map<Class, MapperProxy> registMapper = new HashMap<>();
//
//        registMapper.put(UserMapper.class, mapperProxy);
//        Configuration configuration = new Configuration();
//        configuration.addMapper(registMapper);//添加到configuration中
//
//        MapperProxy mapperProxy1 = configuration.getMapper(UserMapper.class);//mybatis实际由sqlSession获取

//        UserMapper userMapper =(UserMapper) Proxy.newProxyInstance(UserMapper.class.getClassLoader(),
//                new Class[]{UserMapper.class}, mapperProxy1);//创建代理对象

        UserMapper userMapper =(UserMapper) Proxy.newProxyInstance(UserMapper.class.getClassLoader(),
                new Class[]{UserMapper.class}, mapperProxy);//创建代理对象
        userMapper.getAllIds();//调用方法，实际调用jdbc
    }


}
