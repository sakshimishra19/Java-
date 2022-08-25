import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        System.out.println("WELCOME IN ROCK PAPER SCISSOR GAME");
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Select:\n\t 0 for Rock\n\t 1 for Paper\n\t 2 for Scissor");
        System.out.println("Enter number:");
        int X = s.nextInt();
        int Y = r.nextInt(2);
        if(X==Y){
            System.out.println("draw match\\n because you and computer select the same number \"");
        }
        else if (X==0&&Y==1){
            System.out.println("\t\t you selected:rok \n \t\t\tand \n\t\tcomputer selected:paper\n\t\t you:loss ");
            System.out.println("computer: win");
            System.out.println("play again");


        }
        else if (X==0&&Y==2){
            System.out.println("\t\tyou selected:rok \n \t\t\tand \n\t\tcomputer selected:scissor\n\t\t you :win ");
            System.out.println("computer: loss");
            System.out.println("play again");


        }
        else if (X==1&&Y==0){
            System.out.println("\t\t you selected:paper \n \t\t\tand \n\t\tcomputer selected:rok\n\t\t you :win ");
            System.out.println("computer: loss");
            System.out.println("play again");


        }
        else if (X==1&&Y==2){
            System.out.println("\t\t you selected:paper \n \t\t\tand \n\t\tcomputer selected:scissor\n\t\t you :loss ");
            System.out.println("computer: win");
            System.out.println("play again");


        }
        else if (X==2&&Y==0){
            System.out.println("\t\t you selected:scissor \n \t\t\tand \n\t\tcomputer selected:rok\n\t\t you :loss ");
            System.out.println("computer: win");
            System.out.println("play again");

        }
        else if (X==2&&Y==1){
            System.out.println("\t\t you selected:scissor \n \t\t\tand \n\t\tcomputer selected:paper\n\t\t you :win ");
            System.out.println("computer: loss");
            System.out.println("play again");
        }


        else if (X==2&&Y==0){
            System.out.println("\t\t you selected:scissor \n \t\t\tand \n\t\tcomputer selected:rok\n\t\t you :loss ");
            System.out.println("computer: win");
            System.out.println("play again");


        }


        else{
            System.out.println("select the proper number between 0,1,2");
            System.out.println("play again");
        }

    }
}
