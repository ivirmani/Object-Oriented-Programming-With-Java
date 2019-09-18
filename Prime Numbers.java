import java.util.*;

public class Prime {

	public static void main(String[] args) {
		int i, j, k,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of prime numbers");
		k = sc.nextInt();
		
		
		for(i=2;i<k;i++){
			
			count = 0;
		
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(i);
			}
						
		}
	}

}
