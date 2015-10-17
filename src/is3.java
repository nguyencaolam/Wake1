import java.util.Scanner;

/**
 * 
 */

/**
 * @author nguyencaolam
 *
 */
public class is3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		// an integer for number of value
		System.out.println("Nhap ma tran A:");
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.println("A[" + j + "]" + "[" + i + "]=");
				a[j][i] = input.nextInt();
			}
		}
		System.out.println("Nhap ma tran B:");
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.println("B[" + j + "]" + "[" + i + "]=");
				b[j][i] = input.nextInt();
			}
		}
		System.out.println("Ma tran C:");
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2]
						* b[2][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
