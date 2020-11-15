package com.mqtest.producer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class MyListener {

    /*** 监听某个队列的消息 * @param message 接收到的消息 */
    @RabbitListener(queues = "item_queue")
    public void myListener1(String message)
    {
        System.out.println("消费者接收到的消息为：" + message);
    }
}
