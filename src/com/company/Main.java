package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("введите длину массива");
        Scanner L = new Scanner(System.in);
        int length = L.nextInt();
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("введите элемент массива");
            array[i] = L.nextDouble();
        }
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        double medium = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.println(medium * array[i]);
        }
    }
}