class program1{
	public static void main(String[] args){
		int num=2569185;
		while(num>0){
			int k=num%10;
			if(k%2==0){
				System.out.print(k+" ");
			}
			num/=10;
		}
	}
}
