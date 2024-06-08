/* 1 2 3
   4 5 6
   7 8 9
*/
class loop1{
	public static void main(String[] args){
		int num=1;
		for(int i=0; i<=2; i++){
			for(int j=0; j<=2; j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}