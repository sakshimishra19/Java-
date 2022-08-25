import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /* Question 1
        System.out.println("Enter the year");
        int y = s.nextInt();
        if(y%4==0 || y%100==0){
            System.out.println("The entered year is a leap year");
        }
        else{
            System.out.println("The entered year is not a leap year");
        }*/
        //question 2
        System.out.println("Enter the link of website");
        String website = s.nextLine();
        if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is a organizational website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is a indian website");
        }
    }
}
