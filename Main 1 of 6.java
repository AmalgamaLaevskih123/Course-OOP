package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Начинаем работать по первому блоку задач");
        System.out.println("Результат задачи 1: " + (int) (task1(8, 3)));
        System.out.println("Результат задачи 2: " + (int) (task2(10, 15)));
        System.out.println("Результат задачи 3, массив задается внутри функции: " + task3());
        System.out.println("Результат задачи 4: " + (task4((float)0.20,50,9)));
        System.out.println("Результат задачи 5: " + (task5(24, 15,9)));
        System.out.println("Результат задачи 6: " + (task6('a')));
        System.out.println("Результат задачи 7: " + (task7(10)));
        System.out.println("Результат задачи 8: " + (task8(8,10)));
   //     System.out.println("Результат задачи 9: " + (task9())); // массив задается в процессе выполнения
        System.out.println("Результат задачи 10: " + (task10(1,2,3)));
    }

    public static float task1(int x, int y) {
        return x % y;
    }

    public static int task2(int x,int y) {
        return (x*y)/2;
    }
    public static int task3() {
        int[] massive={2,4,5};
        return massive[0]*2+massive[1]*4+massive[2]*4;
    }
    public static boolean task4( float prob, float prize, float pay) {
        return ((prob*prize>pay) ? true : false);
    }
    public static String task5(int N,int a, int b) {
        if (a+b==N)
            return "added";
        else if ((a-b)==N |(b-a)==N)
            return "subtracted one of number with other";
        else if (a*b==N)
            return "multiplication";
        else if (a/b==N | b/a==N)
            return "division one of number with other";
        else
        return "None";
    }
    public static int task6( char z) {
        return (int) z;
}
    public static int task7( int k) {
        int summ=0;
        for (int i=0;i<=k;i++)

            summ += i;
        return summ;
}
    public static double task8( double a,double b) {
        return Math.sqrt(a*a+b*b-2*a*b*(-1))-1;
}
    public static int task9() {
        Scanner input = new Scanner(System.in);
        System.out.println("    Enter size of massive");
        int size = input.nextInt();
        int massiv[] = new int[size];
        int cube=0;
        System.out.println("    Enter elements of massive one by one");
        for (int i = 0; i < size; i++){
            massiv[i] = input.nextInt();
            cube+=Math.pow(massiv[i],3);
        }
        return cube;
    }
    public static String task10( int a,int b, int c) {
        for(int i=0;i<=b;i++)
            a+=a;
        return '\n'+ "Result A: "+a+'\n'+"Divisibility test: "+ (a%c==0? true:false);
    }} 
