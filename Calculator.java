package oop2;
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your first number of choice ");
        int n1=in.nextInt();
        System.out.println("Enter your second number of choice ");
        int n2=in.nextInt();
        System.out.println("Choose the operation you want\n "
                + "Enter 1 for summation \n "
                + "Enter 2 for subtraction \n"
                + "Enter 3 for multiplication \n"
                + "Enter 4 for division ");
        int operation=in.nextInt();
        if (operation==1){
            System.out.print(n1+n2);
        }
        else if (operation==2){
            System.out.print(n1-n2);
        }
        else if (operation==3){
            System.out.print(n1*n2);
        }
        else if (operation==4){
            System.out.print(n1/n2);
        }
        else {
            System.out.print("Input invalid ");
        }
    }
}
