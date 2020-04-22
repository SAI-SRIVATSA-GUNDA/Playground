import java.util.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
	    int n= in.nextInt();
	    int n1= n%10000;
	    int n2= n1%1000;
	    int n3= n2%100;
	    int n4= n3/10;
	    System.out.println(n4);
	}
}
