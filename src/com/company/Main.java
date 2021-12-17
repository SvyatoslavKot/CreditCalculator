package com.company;

public class Main {

    public static void main(String[] args) {
       CreditSelection creditSelection= new CreditSelection();
       PaymentCalculator paymentCalculator = new PaymentCalculator();

       creditSelection.openCreditConsumer();
       paymentCalculator.calculator();


    }
}
