package IntArray.ElementsWeight;
import java.util.Scanner;
class TestElementsWeight{
  public static void main(String [] abc){
    Scanner s= new Scanner (System.in);
    ElementsWeight ew= new ElementsWeight();
    System.out.print("Enter the number of elements : ");
    int size = s.nextInt();
    int [] A= new int [size];
    System.out.print("Enter the elements : ");
    for (int i = 0; i< size; i++) A[i]= s.nextInt();
    ew.setin(A);
    ew.result();
  }
}