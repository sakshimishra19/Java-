public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        //for AND operator
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        //for OR operator
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        //for NOT operator

        System.out.print("Not(a) is :");
        System.out.println(!a);
        System.out.print("Not(b) is :");
        System.out.println(!b);

    }
}
