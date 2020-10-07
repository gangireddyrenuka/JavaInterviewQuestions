package pack2;

public class PallindromNum {

	public static void main(String[] args) {
		
		int num =121;
		int rev=0;
		
		int actualnum= num;
		
		while(num !=0)
		{
			int n=num %10;
			rev = rev*10+n;
			
		}
		System.out.println(actualnum);
		System.out.println(rev);

	}

}
