package ru.netology.sqr.SQRService;

public class SQRService {
    int count = 0;
    int lowerLimit = 200;
    int upperLimit = 400;

    public int sqrRange (int lowerLimit, int upperLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit) {
                System.out.println("Число проходит по нижней границе");
                if (i * i <= upperLimit) {
                    System.out.println("Число проходит по верхней границе");
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}

