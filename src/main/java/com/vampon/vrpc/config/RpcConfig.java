package com.vampon.vrpc.config;

import com.vampon.vrpc.serializer.SerializerKeys;
import lombok.Data;

@Data
public class RpcConfig {
    /**
     * 名称
     */
    private String name = "vam-rpc";
    /**
     * 版本号
     */
    private String version = "1.0";
    /**
     * 服务器主机名
     */
    private String serverHost = "localhost";
    /**
     * 服务器端口号
     */
    private Integer serverPort = 8080;
    /**
     * mock模拟调用
     */
    private boolean mock = false;
    /**
     * 序列化器
     */
    private String serializer = SerializerKeys.JDK;
}
