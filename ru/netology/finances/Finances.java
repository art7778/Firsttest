package ru.netology.finances;

public class Finances {
 public static double calcPayment(double start, double amount, double years) {
    double calcPayment = (amount - start) / (years * 12);
    return calcPayment;
  }
}