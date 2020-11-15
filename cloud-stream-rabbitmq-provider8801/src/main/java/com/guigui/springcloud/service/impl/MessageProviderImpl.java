package com.guigui.springcloud.service.impl;

import com.guigui.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;
    @Override
    public String send() {
        UUID uuid = UUID.randomUUID();
        output.send(MessageBuilder.withPayload(uuid).build());
        return "消息发送成功（"+uuid+")";
    }
}
