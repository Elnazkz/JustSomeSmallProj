public class Palindrome {
    private String word;

    public static boolean isPalindrome(String word){
        if(word.length()%2 ==0){
            System.out.println("Can't be a palindrome");
            return false;
        }
        int wlength = word.length()-1;
        for(int i=0;i<=wlength;i++){
            if(word.charAt(i) != word.charAt(wlength-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String word = "abcbb";
        System.out.println("The " + word + " is Palindrome : " + isPalindrome(word));
    }
}
