package Homework4;

import java.util.Scanner;

public class Task1 {
    public static void main (String [] args) {
int [] massiv= new int [15];
for (int i=0; i<massiv.length; i++){
    massiv[i] = i;
}

Scanner sc = new Scanner(System.in);
System.out.println("Введите число");
int x = sc.nextInt();
for (int element : massiv) {
if(element == x){
    System.out.println("Ваше число входит в массив");
}
}

}
    }


