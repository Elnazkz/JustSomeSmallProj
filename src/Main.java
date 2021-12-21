import java.util.Arrays;
import java.util.List;

public class Main {
    public static Integer getElement(List<Integer> list,Integer n){
        int counter=0;
        Integer i=0;
        if(n>list.size()){
            return -1;
        }

        for(int j=0;j<list.size();j++){
            i = list.get(j);
            if(i%2 != 0){
                counter++;
            }
            if(counter == n){
                break;
            }
        }
        return i;
    }

    public static void main(String args[]){
        Integer n=2;
        List<Integer> list= Arrays.asList(4,5,69,44,32,69);
        Integer i = getElement(list,n);
        System.out.println(i);
    }

}
