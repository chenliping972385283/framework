package org.smart4j.framework.util;

/**
 * Created by chenliping on 16/8/13.
 */
public interface Proxy {

    /**
     * 执行链示代理
     */
    Object doProxy(ProxyChain proxyChain)throws Throwable;
}
