import java.util.Scanner;

public class MultiplicationMatrices {

	public static void main(String[] args) {
		int c, d;
		System.out.println("Enter The Order Of Matrix");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int m1[][] = new int[m][m];
		int m2[][] = new int[m][m];
		int m3[][] = new int[m][m];
		System.out.println("Enter The Elements Of First Matrix");
		for (c = 0; c < m; c++)
			for (d = 0; d < m; d++)
				m1[c][d] = sc.nextInt();
		System.out.println("Enter The Elements Of Second Matrix");
		for (c = 0; c < m; c++)
			for (d = 0; d < m; d++)
				m2[c][d] = sc.nextInt();
		for (c = 0; c < m; c++) {
			for (d = 0; d < m; d++) {
				m3[c][d] = 0;
				for (int e = 0; e < m; e++) {
					m3[c][d]+=m1[c][e]*m2[e][d];
				}

			}
		}
		System.out.println("The Resultant Matrix Is \n");
		for(c=0;c<m;c++){
			for(d=0;d<m;d++){
				System.out.print(m3[c][d]+" ");
			}
			System.out.println();
		}
	}
}
