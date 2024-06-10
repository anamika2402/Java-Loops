class program6{
	public static void main(String[] args){
		int num=987123;
		int sum=1;
		while(num>0){
			int k=num%10;
			sum=sum*k;
			num/=10;

		}
		System.out.println("The product :"+sum);
	}
}



			
