class program10{
	public static void main(String[] args){
		int num=9367924;
		int product=1;
		int sum=0;
		while(num>0){
			int k=num%10;
			if(k%2==0){
				product=product*k;
			}
			else{
				sum=sum+k;
			}
			num/=10;
		}
		System.out.println("The sum of odd digits is "+sum);
		System.out.println("The product of even digits is "+product);
	}
}
