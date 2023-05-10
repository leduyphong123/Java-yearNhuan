import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int year;

        Scanner input= new Scanner(System.in);
        System.out.print("input year = ");
        year = input.nextInt();
        CheckYear(year);
    }
    public static void CheckYear(int value){
        if(value%100==0){
            if(value%400==0)
                System.out.print("year nhuan");
            else
                System.out.print("not year nhuan");
        }else {
            if(value%4==0)
                System.out.print("year nhuan");
            else
                System.out.print("not year nhuan");
        }
    }
}