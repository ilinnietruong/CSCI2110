
/**
 * CSCI2110
 * Linh Truong 
 * B00708389
 * Lab 2: Excercise 3 (Matrix Multiplying) 
This class tests the code for Lab2: Exercise3. It calls a method to
multiply two square matrices of size n x n, and prints information about
running time. 
It expands upon a framework provided by Srini.
*** I reused the formatting from the lab given to us.
*/
//Multiplication of two square matrices of size n X n each
import java.util.*;
public class MatrixMult{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // declare sentinel and element variable
    int n;
    double num;
    while((n = sc.nextInt())!=0){
      num = sc.nextDouble();
      double[][] matrix1 = new double[n][n];
      for (int i = 0; i<n; i++)
        Arrays.fill(matrix1[i], num);
      double[][] matrix2 = new double[n][n];
      for (int i = 0; i<n; i++)
        Arrays.fill(matrix2[i], num);
      // This is Srini's template for timing execution
      long startTime, endTime, executionTime;
      startTime = System.currentTimeMillis();
      double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
      endTime = System.currentTimeMillis();
      executionTime = endTime - startTime;
      //use for testing/debugging
      System.out.println(n+" "+ executionTime);
     }
  }
  /** The method for multiplying two matrices */
  public static double[][] multiplyMatrix(double[][] m1, double[][] m2){
	  int i,j,k;
      double[][] m3 = new double[m1.length][m1.length]; //create the third matrix for the result
      for(i=0; i<m1.length; i++){  //look at rows
         for(j=0; j<m1.length; j++){ //look at columns
            for(k=0; k<m1.length; k++){ //third loop for both 
            	double mm= m1[i][k]*m2[k][j];  //multiply the matrix together
            	m3[i][j] = m3[i][j] + mm; //then add them together
            }
         }
      }
      return m3;
   }
} 
