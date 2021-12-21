import java.util.ArrayList;

public class CeaserCipher {

    static ArrayList<Character> alphabets = new ArrayList<>();
//TODO use linked list 2 tarafe
    public static void main(String arg[]){

        for( char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            alphabets.add(c);
        }

        String name = "Reyhan";
        int number= 2;
        String newName = code(name,number);
        System.out.println(newName);

        //String codedName = "dkgenx";
        //int num = 3;
    }

    public static String code(String name,int n){
        String newName = "";
        int index=0;
        char newChar;
        char[] nameChars = name.toCharArray();
        for(char c : nameChars){
            index = alphabets.indexOf(c);
            index += n;
            index = index % 26;
            newChar = alphabets.get(index);
            newName += newChar;
        }
        return newName;
    }

}
