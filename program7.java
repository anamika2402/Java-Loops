class program7{
	public static void main(String[] args){
		int num=256985;
		int sum=0;
		while(num>0){
			int k=num%10;
			if(k%2==0){
				sum=sum+k;
			}
			num/=10;
		}
		System.out.println("The sum of even digits :"+sum);
	}
}

