package org.smart4j.framework.bean;

/**
 * Created by chenliping on 16/7/2.
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model){
        this.model = model;
    }

    public Object getModel(){
        return model;
    }
}
