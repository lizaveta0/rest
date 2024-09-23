package ru.netology.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int cash = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
           if (cash >= threshold) {
               // отдыхаем
               cash -= expenses;
               cash /= 3;
               counter++;
           } else {
               // работаем
               cash += income;
               cash -= expenses;

           }
        }
      return counter;
    }
}
