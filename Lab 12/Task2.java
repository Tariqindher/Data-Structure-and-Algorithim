public class Task2{
       static int hash(String input, int tableSize){
              int hashValue=0;
              for(int i=0; i<input.length(); i++){
                     hashValue+=(int)input.charAt(i);

              }
              return hashValue%tableSize;
       }
       static void insert(String[] hashtable, String key){
              int tablesize=hashtable.length;
              int index=hash(key, tablesize);

              if(hashtable[index]!=null){
                     System.out.println("Collision occurred while inserting key : \""+key+" at index "+index);

              }
              else{
                     hashtable[index]=key;
                    System.out.println("Key \"" + key + "\" inserted at index " + index);;
              }

       }
       public static void main(String[] args) {
              int tableSize=5;

              String[] hashTable = new String[tableSize]; // Create an empty hash table
        
        // Insert keys into the hash table
              insert(hashTable, "apple");
              insert(hashTable, "orange");
              insert(hashTable, "banana");
              insert(hashTable, "grape");
              
       }
}