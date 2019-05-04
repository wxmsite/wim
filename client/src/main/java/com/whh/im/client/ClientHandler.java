package com.whh.im.client;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@ChannelHandler.Sharable
public class ClientHandler extends SimpleChannelInboundHandler<String> {
    //异常数据捕获
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    //打印读取到的数据
    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, String s) {
        System.err.println(s);
    }
}
