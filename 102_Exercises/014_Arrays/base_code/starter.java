import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] i = new int[1001];
		 int c = 0;
		 int num = 0;
		 while(c < 1001){
		 	
		 	i[c] = 3 + num;
		 	System.out.println(i[c]);
		 	num = num + 3;
		 	c++;
		 }
		 
		 int [] x = new int[1001];
		 int c1 = 0;
		 int num2 = 0;
		 while(c1 < 1001){
		 	x[c1] = 1000 - num2;
		 	System.out.println(x[c1]);
		 	num2++;
		 	c1++;
		 }
	}
}
