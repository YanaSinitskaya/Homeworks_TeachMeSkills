package Homework4;

public class Task4 {
    public static void main (String [] args) {
        int [] a = {5,91,33,71,15};
        int sum1=0;
        System.out.print("ваш первый массив ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum1 +=a[i];
        }
    double avr1 = (double) sum1/a.length;
        System.out.println("Среднее значение массива 1="+avr1);
        System.out.println(" ");
        int [] b = {8,9,33,4,10};
        int sum2=0;
        System.out.print("ваш второй массив ");
        for (int ii = 0; ii < 5; ii++) {
            System.out.print(b[ii]+ " ");
            sum2 +=b[ii];
        }
        double avr2 = (double) sum2/b.length;
        System.out.println("Среднее значение массива 2="+avr2);
if (avr1>avr2) {
    System.out.println("Среднее массива 1 больше");
}
else if (avr2>avr1) {
    System.out.println("Среднее массива 2 больше");
}
    else {
        System.out.println("Средние значения массивов равны");
    }

}
    }