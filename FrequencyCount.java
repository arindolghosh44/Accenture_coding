import java.util.*;


public class FrequencyCount{



		static boolean isVowel(char ch){

			return (ch=='a' || ch == 'e' || ch == 'i'  ||  ch == 'o' ||  ch == 'u' || ch == 'A'  ||  ch == 'E' ||  ch == 'I'  ||  ch == 'O' || ch == 'U');


		}




		static int fact(int n){

			if(n==0 || n==1) return 1;


			int ans=1;


			while(n>0){

				ans*=n--;

			}



			return ans;


		}






	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		String st=sc.nextLine();


		int count=0;


		Map<Character,Integer> map=new HashMap<>();


		for(int i=0;i<st.length();i++){


			char ch=st.charAt(i);


				if(!isVowel(ch)){


				count++;

				map.put(ch, map.getOrDefault(ch, 0) + 1);



				}







		}




		if(count==0){



			System.out.println(0);


			sc.close();



			return;



		}
		


			int demo=1;

			for(int i:map.values()){

				demo*=fact(i);

			}


			System.out.println(fact(count)/demo);


			sc.close();






	}












}