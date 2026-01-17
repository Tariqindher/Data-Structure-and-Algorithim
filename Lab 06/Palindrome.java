public class Palindrome{
    public static void main(String[] args) {
        String s= "racecar";
        boolean ans= isPalindrome(s, 0, s.length()-1);
        System.out.println(ans);
    }
    static boolean isPalindrome(String s,int start, int end){
    if(start >= end){
        return true;
    }
    if(s.charAt(start) !=s.charAt(end)){
        return false;
    }
    return  isPalindrome(s, start+1, end-1);
}    
}