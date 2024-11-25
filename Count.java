import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        // Input the character to be counted
        System.out.print("Enter the character to count: ");
        char ch = sc.next().charAt(0);
        
        int count = 0;
        
        // Iterate through the string to count occurrences of the character
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        
        // Print the result
        System.out.println("Count of '" + ch + "' in the string: " + count);
        
        sc.close();
    }
}
