import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int sum=0;
      int t=n;
      while(n!=0)
      {
        int r=n%10;
        sum=sum+r*r*r;
        n=n/10;
      }
      if (t==sum)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
	}
}