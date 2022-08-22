public class practice_set_3 {
    public static void main(String[] args) {
        //problem 1
        String name = "My Name Is Sakshi.";
        System.out.println(name.toLowerCase());

        //problem 2
        System.out.println(name.replace(" ","_"));

        //problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
         letter = letter.replace("<|name|>","Sakshi");
        System.out.println(letter);

        //problem 4
        String str = "This is a  java   program.";
        System.out.println(str.indexOf("   "));
        System.out.println(str.indexOf("  "));

        //problem 5
        String letter2 = "Dear Sakshi,\n\tThis Event is so Nice.\n\tThanks.";
        System.out.println(letter2);


    }
}
