package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main (String [] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число для удаления");
        int scan=sc.nextInt();
        int [] newarray;
        int size = a.length;
        for (int element : a) {
            if (element == scan) {
                size -= 1;
            }
        }
        if (size == a.length){
            System.out.println("Введенного числа нет в массиве");
        }else {
            newarray = new int[size];
            for (int i = 0; i < a.length; i++) {
                if(a[i] != scan){
                    for (int j = 0; j < newarray.length; j++) {
                        if (newarray[j] == 0){
                            newarray[j] = a[i];
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < newarray.length; i++) {
                System.out.print(newarray[i] + " ");
            }
        }
    }
}
