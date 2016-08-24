package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by chenliping on 16/8/13.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     */
    Class<? extends Annotation> vakue();
}
