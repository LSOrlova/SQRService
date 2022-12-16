package ru.netology.sqr;

public class SQRService {
    public long calcSqrt(int x, int y) {
        int q = 0;
        // где х - нижняя граница диапазона, у - верхняя, q - количество чисел
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                q = q + 1;
            }
        }
        return q;
    }
}