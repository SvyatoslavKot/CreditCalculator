package com.company;

import java.util.Scanner;

public class PaymentCalculator {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    public void calculator(){
        System.out.println("Введите сумму кредита");
        int sum = scanner.nextInt();
        System.out.println("Введите процент");
        double ptc = scanner.nextDouble();
        System.out.println("Введите срок в месяцах");
        int month = scanner.nextInt();

        double payment;
        payment = calculator.calc(sum,ptc,month);
        double overpayment = month * payment - sum;

        String paymentCredit = String.format("%.2f", payment);
        String overpaymentCredit = String.format("%.2f", overpayment);

        System.out.println("Ануитетный  ежемесячный платёж по кредиту составит " + paymentCredit +
                "\nПереплата за весь срок кредита составит " + overpaymentCredit);


    }
}
