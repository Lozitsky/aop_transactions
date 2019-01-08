package com.kirilo.spring.aop.transactions;

import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class CheckTransaction {
    public void checkTransactionActive() {
        System.out.println(TransactionSynchronizationManager.isActualTransactionActive());
    }
    public void print(Object obj) {
        System.out.println(obj);
    }
}
