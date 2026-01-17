public class oneTask{
       int hash(String key, int tablesize){
              int hashValue=0;
              for(int i=0; i<key.length(); i++){
                     hashValue+=(int)key.charAt(i);
              }
              return hashValue%tablesize;
       }
       public static void main(String[] args) {
              oneTask task1=new oneTask();
              System.out.println("Hash Value "+task1.hash("Tariq", 10));
       }
}