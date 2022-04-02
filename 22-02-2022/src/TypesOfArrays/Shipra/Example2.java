package TypesOfArrays.Shipra;

public class Example2 {

	public static void main(String[] args) {
		
int matrix[][] = new int[2][2];	
		matrix[0][0] = 12;
		matrix[0][1] = 24;
		
		
		matrix[1][0] = 36;
		matrix[1][1] = 48;
		
		
		
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n");
		}
	}

}
