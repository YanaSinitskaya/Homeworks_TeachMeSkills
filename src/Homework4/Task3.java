package Homework4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array size");
        int size = sc.nextInt ();
        double [] mas = new double [size];
        for (int i=0; i < mas.length; i++) {
        mas [i] = Math.random();
        System.out.println(mas [i] + " ");
        }
        double max = mas[0];
        double min = mas[0];
        double avg = 0;
        for (int i = 0; i < mas.length; i++) {
            if(max < mas[i])
                max = mas[i];
            if(min > mas[i])
                min = mas[i];
            avg += mas[i];
        }
        avg = avg/mas.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
        }

}
