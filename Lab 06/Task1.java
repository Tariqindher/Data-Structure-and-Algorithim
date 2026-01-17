public class Task1{
       public int  binarysearch(int A[],int start,int end, int target){
              for(int i=0; i<A.length; i++){
              
                     int mid=(start+end)/2;
                     if(A[mid]==target){
                            return mid;
                     }
                     if(A[mid]<target){
                            start=mid+1;
                     }
                     else if(A[mid]>target){
                            end=mid-1;
                     }
                    
              }
              return -1;

       }
       public static void main(String[] args) {
              Task1 obj=new Task1();
              
              int Arr[]={112,55,33,44,755,66,77,88};
              int target=66;
              int start=0, end=Arr.length-1;
              
              int result=obj.binarysearch(Arr, start, end, target);
              System.out.println();
              if(result==-1){
                     System.out.println("Elements Not found");
              }
              else{
                     System.out.println("Elements  found at index "+result);
              }
       }
}