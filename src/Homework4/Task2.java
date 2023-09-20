package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main (String [] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число для удаления");
        int scan=sc.nextInt();
        boolean contains = Arrays.stream(a).anyMatch(numb -> numb == scan);  // Эти функции подсмотрены в решениях в инете. Для решения через циклы см. класс test
        if (contains){
            int [] newarray = Arrays.stream(a).filter(numb -> numb != scan)
                    .toArray();
            System.out.println(Arrays.toString(newarray));
        }
        else {
            System.out.println("Ваше  число не входит в массив");
        }
    }
}
