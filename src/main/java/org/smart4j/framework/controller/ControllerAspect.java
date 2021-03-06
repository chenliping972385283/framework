package org.smart4j.framework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.annotation.Aspect;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.util.AspectProxy;

import java.lang.reflect.Method;

/**
 * Created by chenliping on 16/8/13.
 */
@Aspect(Controller.class)
public class ControllerAspect  extends AspectProxy {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    private long begin;

    public void before(Class<?> cls, Method method,Object[] params)throws Throwable{

        LOGGER.debug("-------begin----");
        LOGGER.debug(String.format("Class: %s",cls.getName()));
        LOGGER.debug(String.format("method: %s",method.getName()));
        begin = System.currentTimeMillis();
    }

    public void after(Class<?> cls,Method method,Object[] params,Object result)throws Throwable{
        LOGGER.debug(String.format("time: %dms",System.currentTimeMillis()-begin));
        LOGGER.debug("---------end---------");
    }
}
