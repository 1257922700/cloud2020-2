package com.guigu.springcloud.service.impl;


import com.guigu.springcloud.dao.PaymentDao;
import com.guigu.springcloud.entities.Payment;
import com.guigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPayment(id);

    }
}
