class program4{
	public static void main(String[] args){
		int num=256985;
		while(num>0){
			int k=num%10;
			if(num%2==1){
				System.out.print(k*k+" ");
			}
			num/=10;
		}
	}
}
