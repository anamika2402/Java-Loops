class program9{
	public static void main(String[] args){
		int num=2469185;
		int sum=0;
		while(num>0){
			int k=num%10;
			if(k%2!=0){
				sum=sum+k*k;
			}
			num/=10;
		}
		System.out.println("The sum of the squares of odd digit in the number is "+sum);
	}
}

