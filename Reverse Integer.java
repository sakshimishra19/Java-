import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	     
        int res = reverse(n);
        System.out.println(res);
	}
	
	 public static int reverse(int x) {
        int result=0;
        while(x!=0){
            int lastDigit=x%10;
            int reverse=result*10+lastDigit;
            if((reverse-lastDigit)/10!=result){
                return 0;
            }
            x=x/10;
            result=reverse;
        }
        return result;
        
        
    }
}
