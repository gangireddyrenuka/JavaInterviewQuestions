package pack2;

public class AmstromNumber {

	public static void main(String[] args) {
		
		
		//amstrom number means
		//153=1*1*1+5*5*5+3*3*3=1+75+27=157
		//371 is also armstrom number...
		int num=153;
		int actualNum=num;
		double result=0;
		
			
			while(actualNum !=0){
				int n=num%10;
				 result=result + Math.pow(n, 3);
				actualNum=actualNum%10;
			}
			if(result==num)
			
			System.out.println(num +"is a armstrome number");
		
	else{
		System.out.println(num +"is  not a armstrome number");
	}

	}
}

