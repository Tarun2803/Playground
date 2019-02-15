import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int sum=0;
      int t=n;
      while(n>0)
      {
        int r=n%10;
        int f=1;
        for(int i=1; i<=r; i++)
        {
          f=f*i;
        }
        sum=sum+f;
        n=n/10;
      }
      if (t==sum)
        System.out.println("Yes");
      else 
        System.out.println("No");
	}
}