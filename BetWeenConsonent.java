import java.util.Scanner;

public class BetWeenConsonent {

    // Function to check if a character is a vowel
    static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Function to solve the problem
    static String solve(String s) {



		StringBuilder st=new StringBuilder();

		st.append(s.charAt(0));

		int n=s.length();

		for(int i=1;i<n-1;i++){

		char ch=s.charAt(i);


		 if (isVowel(s.charAt(i)) && !isVowel(s.charAt(i - 1)) && !isVowel(s.charAt(i + 1))) {

			continue;

		}


			else{
					st.append(ch);

				}




		}

		st.append(s.charAt(n-1));

		return st.toString();
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Input the string
        System.out.println(solve(s)); // Print the result
        sc.close();
    }
}
