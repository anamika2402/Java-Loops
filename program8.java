class program8{
	public static void main(String[] args){
		int num=256985;
		int product=1;
		while(num>0){
			int k=num%10;
			if(num%2!=0){
				product=product*k;
			}
			num/=10;
		}
		System.out.println("The product of odd digit in the number is "+product);
	}
}	

