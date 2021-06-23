package IntArray.ElementsWeight;
class ElementsWeight{
  static int [] A;
  void setin(int[] B){
    A=B;
  }
  static int perfectsquare(int a){
    //int res=0;
    for (int i=1;i<=a/2;i++){
      if (a%i==0 && a/i==i) return 5;
    }
    return 0;
  }
  static int multiple(int a){
    //int res=0;
    if (a%4==0 && a%6==0) return 4;
    return 0;
  }
  static int even(int a){
    //int res=0;
    if (a%2==0) return 3;
    return 0;
  }
  static int weightof(int a){
    return perfectsquare(a)+multiple(a)+even(a);
  }
  void result(){
    int [] weight= new int[A.length];
    for (int i=0;i<A.length;i++){
      weight [i]= weightof(A[i]);
    }
    for (int i=0;i<A.length;i++){
      int min=weight[i],index=i;
      for (int j=i+1;j<A.length;j++){
        if (weight[j]<min){
          index=j;
          min=weight[j];
        }
      }
      int temp= weight[i];
      weight[i]=weight[index];
      weight[index]= temp;
      temp= A[i];
      A[i]=A[index];
      A[index]=temp;
    }
    for (int i=0;i<A.length;i++) System.out.print("<"+A[i] +","+weight[i]+"> ");
  }
}