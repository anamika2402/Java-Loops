class program5{
	public static void main(String[] args){
		int num=216985;
		while(num>0){
			int k=num%10;
			if(k%2==0){
				System.out.print(k*k*k+" ");
			}
			num/=10;
		}
	}
}
