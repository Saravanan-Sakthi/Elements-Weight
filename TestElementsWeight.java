package IntArray.ElementsWeight;
import java.util.Scanner;
class TestElementsWeight{
  public static void main(String [] abc){
    Scanner s= new Scanner (System.in);
    ElementsWeight ew= new ElementsWeight();
    int n= s.nextInt();
    int [] A= new int [n];
    for (int i=0;i<n;i++) A[i]= s.nextInt();
    ew.setin(A);
    ew.result();
  }
}