
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


            Task1();
            Task2();
            Task3();
            Task4();
            Task5();
            Task6();
    }

    //        Task 1


    public static void Task1(){
       // using for loop

        for (int i = 10; i <=50; i++) {

            System.out.println(i);
        }
    }

    public static void Task2(){

        //        Task 2    find positive or negative

        int a=-100;

        if(a<0){
            System.out.println(a+" is negative number");
        } else if (a==0) {
            System.out.println(a+" is neutral number");
        }else
        {
            System.out.println(a+" is positive number");
        }
    }

    public static void Task3(){

        int num = 876;
        int reversed=0;
        int reminder;

        while(num>0){
            reminder=num%10;
            reversed=(reversed*10)+reminder;
            num=num/10;
        }
        System.out.println(reversed);
    }


    public static void Task4(){

        int[] num={5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        //System.out.println(num[0]);

        int small=num[0];
        for (int i = 1; i < num.length; i++) {
          // System.out.println(num[i]);
            if (num[i]<small){
                small=num[i];
            }
        }
        System.out.println(small);
    }

public static void Task5(){

    System.out.println("Enter amount: ");
    Scanner obj=new Scanner(System.in);
    int amt=obj.nextInt();

    if (amt<500){
        System.out.println("There is no Discount for the Purchase Amount");
    } else if (amt>=500 && amt<=1000) {
        System.out.println("10% Discount for the  Purchase Amount");
    }
    else System.out.println("20% Discount for the  Purchase Amount");
    }

public static void Task6(){

int k=5;
    for (int i = 1; i <=k ; i++) {
        for (int j = 1; j <=k; j++) {
            if (j<=i){
                System.out.print(k-j+1);
            }else {
                System.out.print(k-i+1);
            }
        }
        System.out.println();
    }
    }
}



