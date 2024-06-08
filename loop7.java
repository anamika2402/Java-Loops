// A 2 C 4 E 6 G 8 I

class loop7{
	public static void main(String[] args){
		
		for(int i=1; i<=9; i++){
			if(i%2 != 0){
				System.out.print((char)(i+64)+" ");
			}
			else{
				System.out.print(i+" ");
			}
		}
	}
}	
			