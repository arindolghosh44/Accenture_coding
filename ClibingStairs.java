import java.util.*;


public class ClibingStairs{



		public static void main(String [] args){


		Scanner sc=new Scanner(System.in);
		 
        int n = sc.nextInt(); // Input number of steps
        int result = climbStairs(n);

        System.out.println("Number of ways to climb " + n + " steps: " + result);







		}



		static int climbStairs(int n){


			if(n<=1) return 1;




			int prev1=1;

			int prev2=1;



			for(int i=2;i<=n;i++){

				int curr=prev1+prev2;

				prev2=prev1;

				prev1=curr;


			}


				return prev1;

		}











}