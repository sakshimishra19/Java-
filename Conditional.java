import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please  enter the age of candidate");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are eligible for voting!");
        }
        else{
            System.out.println("You are not eligible for voting!");
        }

    }
}
