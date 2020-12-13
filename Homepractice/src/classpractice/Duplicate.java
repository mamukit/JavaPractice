package classpractice;

public class Duplicate {

	public static void main(String[] args) {
		
		int[] num={3,3,4,4,5,5,6,7,8,};
		for(int i=0;i<num.length;i++){
			
			for(int j=i+1;j<num.length;j++)
				if(num[i]==num[j]){
					System.out.println(num[i]);
				}
		}
		
	}

}
