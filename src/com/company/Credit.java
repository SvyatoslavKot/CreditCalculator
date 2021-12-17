package com.company;

import java.util.Scanner;

public class Credit {
    private String creditName;
    private String accountNumber;
    private int amount;
    private double ptc;
    private String openingDate;
    private int creditTerm;


    GenerateAccountNumber generateAccountNumber = new GenerateAccountNumber();
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);

        public void openCreditConsumer(){
            System.out.println(" ввведи желаемую ссуму займа :");
            int sum = scanner.nextInt();


            if (sum < 50000){
                System.out.println("мы можем предложить вам кредитную карту.");
            }else if (sum > 50000 && sum <= 100000 ) {
                openCreditСonsumer100(sum);
            }else if (sum > 100000 && sum <= 200000 ){
                openCreditСonsumer200(sum);
            }else if (sum > 200000 && sum <= 500000 ){
                openCreditСonsumer500(sum);
            }else if (sum > 500000 && sum <= 1000000 ){
                openCreditСonsumer1m(sum);
            }else if (sum > 1000000 && sum <= 2000000 ){
                openCreditСonsumerLarge(sum);
            }else {
                System.out.println("Для вас нет подходящих предложение потребительского кредита.");
            }

        }

        private void openCreditСonsumer100(int sum) {

            this.creditName = "Потребительский кредит 100";
            this.accountNumber = generateAccountNumber.accountNumber();
            this.amount = sum;
            this.ptc = 17.9;
            this.openingDate = openingDate;
            this.creditTerm = 12;
            double k = calculator.calc(this.amount,this.ptc,this.creditTerm);
            String payment = String.format("%.2f", k);

            System.out.println(
                    "\n________________ИНФОРМАЦИЯ__________________" +
                            "\n"+creditName+
                    "\nномер счёта: " + accountNumber +
                    "\nсрок кредита: " + this.creditTerm + " мес" +
                    "\nдата открытия: " + openingDate +
                    "\nпроцентная ставка: " + this.ptc +
                    "\nсумма займа: " + this.amount +
                            "\nежемесячный платёж: " + payment +
                    "\n____________________________________________");
        }
    private void openCreditСonsumer200(int sum) {

        this.creditName = "Потребительский кредит 100";
        this.accountNumber = generateAccountNumber.accountNumber();
        this.amount = sum;
        this.ptc = 15.9;
        this.openingDate = openingDate;
        this.creditTerm = 24;

        double k = calculator.calc(this.amount,this.ptc,this.creditTerm);
        String payment = String.format("%.2f", k);

        System.out.println(
                "\n________________ИНФОРМАЦИЯ__________________" +
                        "\n"+creditName+
                        "\nномер счёта: " + accountNumber +
                        "\nсрок кредита: " + this.creditTerm + " мес" +
                        "\nдата открытия: " + openingDate +
                        "\nпроцентная ставка: " + this.ptc +
                        "\nсумма займа: " + this.amount +
                        "\nежемесячный платёж: " + payment +
                        "\n____________________________________________");
    }
    private void openCreditСonsumer500(int sum) {

        this.creditName = "Потребительский кредит 100";
        this.accountNumber = generateAccountNumber.accountNumber();
        this.amount = sum;
        this.ptc = 12.9;
        this.openingDate = openingDate;
        this.creditTerm = 36;
        double k = calculator.calc(this.amount,this.ptc,this.creditTerm);
        String payment = String.format("%.2f", k);

        System.out.println(
                "\n________________ИНФОРМАЦИЯ__________________" +
                        "\n"+creditName+
                        "\nномер счёта: " + accountNumber +
                        "\nсрок кредита: " + this.creditTerm + " мес" +
                        "\nдата открытия: " + openingDate +
                        "\nпроцентная ставка: " + this.ptc +
                        "\nсумма займа: " + this.amount +
                        "\nежемесячный платёж: " + payment +
                        "\n____________________________________________");
    }
    private void openCreditСonsumer1m(int sum) {

        this.creditName = "Потребительский кредит 100";
        this.accountNumber = generateAccountNumber.accountNumber();
        this.amount = sum;
        this.ptc = 10.9;
        this.openingDate = openingDate;
        this.creditTerm = 60;
        double k = calculator.calc(this.amount,this.ptc,this.creditTerm);
        String payment = String.format("%.2f", k);

        System.out.println(
                "\n________________ИНФОРМАЦИЯ__________________" +
                        "\n"+creditName+
                        "\nномер счёта: " + accountNumber +
                        "\nсрок кредита: " + this.creditTerm + " мес" +
                        "\nдата открытия: " + openingDate +
                        "\nпроцентная ставка: " + this.ptc +
                        "\nсумма займа: " + this.amount +
                        "\nежемесячный платёж: " + payment +
                        "\n____________________________________________");
    }
    private void openCreditСonsumerLarge(int sum) {

        this.creditName = "Потребительский кредит 100";
        this.accountNumber = generateAccountNumber.accountNumber();
        this.amount = sum;
        this.ptc = 8.9;
        this.openingDate = openingDate;
        this.creditTerm = 60;
        double k = calculator.calc(this.amount,this.ptc,this.creditTerm);
        String payment = String.format("%.2f", k);

        System.out.println(
                "\n________________ИНФОРМАЦИЯ__________________" +
                        "\n"+creditName+
                        "\nномер счёта: " + accountNumber +
                        "\nсрок кредита: " + this.creditTerm + " мес" +
                        "\nдата открытия: " + openingDate +
                        "\nпроцентная ставка: " + this.ptc +
                        "\nсумма займа: " + this.amount +
                        "\nежемесячный платёж: " + payment +
                        "\n____________________________________________");
    }
}
