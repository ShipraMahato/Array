package TypesOfArrays.Shipra;

public class Example3 {

	public static void main(String[] args) {
		
	
		char matrix[][] = new char[3][3];
		
		matrix[0][0] = 'A';
		matrix[0][1] = 'B';
		matrix[0][2] = 'C';
		
		matrix[1][0] = 'D';
		matrix[1][1] = 'E';
		matrix[1][2] = 'F';
		
		matrix[2][0] = 'G';
		matrix[2][1] = 'H';
		matrix[2][2] = 'I';
		
		
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
		
	}

}
