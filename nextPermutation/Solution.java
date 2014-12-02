public class Solution{
  public int [] nextPermutation(int [] num){
      if (num ==null|| num.length==1) return null;

      int i=num.length-2;
      while (i>=0 && num[i]>=num[i+1]){
        i--;
      }
      if (i>=0){
         int j=i+1;
         while (j<num.length && num[j]>num[i])
           j++;
        j--;
      
      swap(num, i ,j);
      reverse(num, i+1, num.length-1);
      }
      return num;
  }
  private void swap(int [] num, int i, int j){
    int temp=0;
    temp = num[i];
    num[i]=num[j];
    num[j]=temp;
  }
  private void reverse(int [] num, int i, int j){
      while (i<j){
        swap(num,i++,j--);
      }
  }


  
}
