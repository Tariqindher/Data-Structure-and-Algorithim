
public class HashTable{
       String table[];
       int size;
       HashTable(int size){
              this.size=size;
              this.table=new String[size];
       }
       int hash(String key){
              int hashvalue=0;
              for(int i=0; i<key.length(); i++){
                     hashvalue+=(int)key.charAt(i);
              }
              return hashvalue%size;
       }
       void insert(String key){
              int index=hash(key);
              if(table[index]==null){
                table[index]=key;
                System.out.println("Inserted   "+key+"  at index  "+index);
              }
              else{
                     System.out.println("Collusion occured  when inserting  "+key+"   at index  "+index);
              }      
       }
        void printtable(){
              for(int i=0; i<size; i++){
                     System.out.println("Indax  "+i+" "+table[i]);
              }
              System.out.println();
       }
       public static void main(String[] args) {
              HashTable hastable=new HashTable(5);
              String keys[]={"apple","orange", "banana","grape","Tariq","Ali"};

              for(String key: keys){
                     hastable.insert(key);
              }
              hastable.printtable();
              
       }
}