public class TowerOFHonio {
    static void fun(int n, String s,String H, String D){
        if(n==1){
            System.out.println("Moving Disk "+n+" From "+s+" to "+D);
            return;
        }
        else{
            fun(n-1,s,D,H);
             System.out.println("Moving Disk "+n+" From "+s+" to "+D);
             fun(n-1,H,s,D);
            
        }
    }
    public static void main(String[] args) {
        
        int n=3;
        fun(n,"S","H","D");
    }
}