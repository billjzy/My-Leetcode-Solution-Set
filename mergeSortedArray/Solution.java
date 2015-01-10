public class Solution{
  public void merge(int A[] , int m, int B[], int n){
    if (m == 0) {
      for ( int i=0;i<n;i++) {
        A[i] = B[i];
      }
    }
    if (n==0) {return ;}
     int [] C = new int [m+n];
     int i=0,j=0,k=0;
     while (i<m&&j<n){
       C[k++] = A[i]<B[j]? A[i++]: B[i++];
     }
     if (i==m) {
      while(j<n){
        C[k++] = B[j++];
      } 
    }
    if (j==n){
      while (i<m){
        C[k++] = A[i++];
      }
    }
    for (int l=0;l<C.length;l++){
      A[l]= C[l];
    }
  }
}
