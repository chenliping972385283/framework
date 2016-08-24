package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * Created by chenliping on 16/7/2.
 */
public class Handler {

    private Class<?> controllerClass;

    /**
     * action method
     */

    public Method actionMethod;

    public Handler(Class<?> controllerClass,Method actionMethod){
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }


    public Class<?> getControllerClass (){
        return controllerClass;
    }

    public Method getActionMethod(){
        return actionMethod;
    }

}
