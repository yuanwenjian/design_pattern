package com.yuanwj.design_pattern.proxy;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    private Map<Class, MapperProxy> registMapper;

    public void addMapper(Map<Class,MapperProxy> mapper) {
        if (registMapper == null) {
            registMapper = new HashMap<>();
        }

        registMapper.putAll(mapper);
    }

    public MapperProxy getMapper(Class mapperClass) {
        if (registMapper.containsKey(mapperClass)) {
            return registMapper.get(mapperClass);
        }
        return null;
    }
}
