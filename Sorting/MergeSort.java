public class MergeSort{
       
       public static void conquer(int arr[],int sI,int mid, int eI){
             int merger[]=new int[eI-sI+1];
             int index1=sI;
             int index2=mid+1;
             int x=0;
             while (index1<=mid && index2<=eI) {
              if(arr[index1]<=arr[index2]){
                     merger[x++]=arr[index1++];
              }
              else{
                     merger[x++]=arr[index2++];     
              }
             }
             while (index1<=mid) {
              merger[x++]=arr[index1++];
             }
             while (index2<=eI) {
              merger[x++]=arr[index2++];
             }
             for(int i=0,j=sI;  i<merger.length; i++,j++ ){
              arr[j]=merger[i];
             }


       }
       public static void divide(int arr[],int sI, int eI){
              if(sI>=eI){
                     return;
              }
              int mid=sI+(eI-sI)/2;
              divide(arr, sI, mid);
              divide(arr, mid+1, eI);
              conquer(arr, sI, mid, eI);

       }
       public static void main(String[] args) {
              int arr[]={6,3,9,5,8,2};
              int n=arr.length;
              for(int i=0; i<n; i++){
                     System.out.print(arr[i]+"  ");
              }
              System.out.println();
              System.out.println("After Mergeing ");
              divide(arr, 0, n-1);
              for(int i=0; i<n; i++){
                     System.out.print(arr[i]+"  ");
              }
              System.out.println();
       }
}