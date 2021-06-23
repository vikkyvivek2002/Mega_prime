import java.util.*;
 class Mega_prime
{

	static int prime(int n)
	{
		int i =0, flag =1;
		if(n ==0 || n==1)
			return 0;
		else 
		{	for (i =2; i<=n/2; i++)
			{	if(n%i == 0)
				{
					flag = 0;
					break;
				}
			}
		}
		if(flag == 0)
			return 0;
		else
			return 1;
	}
	static int megprime (int n)
	{ 
		int r = 0, flag =1;
		if(prime(n) == 0 )
			return 0;
		else
		{while(n!=0)
		{
			r = n%10;
			flag = prime(r);
			if(flag == 0)
			return 0;
			n = n/10;
		}	
		}
		if(flag == 0)
			return 0;
		else
			return 1;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int n = megprime(num);
		
			if (n ==1)
				System.out.println(num+ " is a mega prime");
			else
				System.out.println(num + " is not a mega prime");

	}

}
