package com.example.rpc.network.msg;

import io.netty.channel.Channel;
import lombok.Data;

@Data
public class Request {
    private transient Channel channel;

    private String requestId;
    private String methodName;
    private Class[] paramTypes;
    private Object[] args;
    private String nozzle;
    private String ref;
    private String alias;
}
