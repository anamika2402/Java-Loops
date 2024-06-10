class program2{
	public static void main(String[] args){
		int num=2569185;
		while(num>0){
			int k=num%10;
			if(k%3!=0){
				System.out.print(k+" ");
			}
			num/=10;
		}
	}
}
