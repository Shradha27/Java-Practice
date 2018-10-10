import java.util.Scanner;

public class KaratsubaAlgo {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int bin1,bin2,rem;
			String x1=in.nextLine();
			String x2=in.nextLine();
			bin1=Integer.parseInt(x1);
			bin2=Integer.parseInt(x2);
			int num=bin1;
			double b=0,sum=0;
			while(num!=0)
			{
				
				rem=num%10;
				sum+=Math.pow(2, b)*rem;
				num=num/10;
				b++;
			}	
			double b1=sum;
			sum=0;
			b=0;
			num=bin2;
			while(num!=0)
			{
				
				rem=num%10;
				sum+=Math.pow(2, b)*rem;
				num=num/10;
				b++;
			}	
			double b2=sum*b1;
			System.out.println(b2);
			
			
	}
}