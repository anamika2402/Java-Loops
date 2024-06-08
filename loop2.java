// 1 4 3 16 5 36 7 64 9

class loop2{
	public static void main(String[] args){
		for(int i=1; i<=9; i++){
			if(i%2 != 0){
				System.out.print(i+" ");
			}
			else{
				System.out.print(i*i+" ");
			}
		}
	}
}
				