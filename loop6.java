// A 2 C 4 E 6 G 8 I

class loop6{
	public static void main(String[] args){
		char ch=65;
		for(int i=1; i<=9; i++){
			if(i%2 != 0){
				System.out.print(ch+" ");
			}
			else{
				System.out.print(i+" ");
			}
			ch++;
		}
	}
}