package pack2;

public class CountIntegerDigits {

	public static void main(String[] args) {
	
		
		
		//1234...4 digits
		//123...3digits
		
		int num=12345678;
		int count=0;
		while(num !=0)
		{
			num=num/10;
			++count;
		}
          System.out.println("number of digits: "+ count);
	}

}
