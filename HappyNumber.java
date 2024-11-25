import java.util.*;


public class HappyNumber{


		public static void main(String [] args){




			Scanner sc=new Scanner(System.in);

			int n=sc.nextInt();


			System.out.println(isHappy(n));



		}


		public static  boolean isHappy(int n){


		Set<Integer> set=new HashSet<>();


		if(n==1) return true;


		//detect cycle

		if(set.contains(n)) return false;

		set.add(n);

		  int newNum = 0;
		while(n>0){

		int x=n%10;

		  newNum += (x * x);


		n=n/10;



		}


		return isHappy(newNum);







		}















}