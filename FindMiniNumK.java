import java.util.Scanner;

public class FindMiniNumK {

    // Function to find the minimum value of K
    public static int findMinimumK(int[][] mat) {


		int n=mat.length;



		for(int k=0;k<n;k++){


			boolean rowCheck=true;

			boolean colCheck=true;


			//check for row excluding (k,k)

			for(int j=0;j<n;j++){



				if(j!=k && mat[k][j]!=0){

					rowCheck=false;

					break;

				}






			}



				//check for col excluding (k,k)

			for(int i=0;i<n;i++){



				if(i!=k && mat[i][k]!=0){

					colCheck=false;

					break;

				}






			}



				if(colCheck && rowCheck){

					return k;

				}








		}
		


			return -1;
       
		

	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Size of the matrix
        int[][] matrix = new int[N][N];

        // Input the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find the minimum K
        int result = findMinimumK(matrix);

        System.out.println(result); // Output the result
        sc.close();
    }
}
