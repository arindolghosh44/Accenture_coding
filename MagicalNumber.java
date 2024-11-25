import java.util.Scanner;

public class MagicalNumber {

    public static int solve(int n) {



		int count=0;



		for(int i=1;i<=n;i++){


		int num=i;

		int zero=0;


		//decimal to binary Conversion Method

		while(num>0){

			if(num%2==0){
			zero++;

			}

			num=num/2;


		}


			if(zero%2==1)
				count++;






		}


			return count;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Input the number
        System.out.println(solve(n)); // Output the result

        sc.close();
    }
}
