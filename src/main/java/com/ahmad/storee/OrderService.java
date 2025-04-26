package com.ahmad.storee;

public class OrderService {

    public  void  placeOrder(){

        var paymentService=new StripePyamentService();
        paymentService.processPayment(100);

    }
}
