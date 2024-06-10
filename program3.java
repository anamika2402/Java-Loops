class program3{
	public static void main(String[] args){
		int num=436780521;
		while(num>0){
			int k=num%10;
			if(k%2==0 || k%3==0){
				System.out.print(k+" ");
			}
			num/=10;
		}
	}
}
