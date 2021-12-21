import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GreatestCommonDevisor {
    private int p,q=0;

    public static boolean isPrime(int n){
        boolean prime=true;
        for(int i=n-1;i>1;i--){
            if(n%i == 0){
                prime=false;
                break;
            }
        }
        return prime;
    }

    public static int gcd(int p, int q){
        int gcd=1;
        ArrayList<Integer> commonDivisors = new ArrayList<>();
        if(p<q){
            for(int i=p;i>1;i--){
                if((p%i==0) && (q%i==0)){
                    commonDivisors.add(i);
                }
            }
        }else{
            for(int i=q;i>1;i--) {
                if ((p % i == 0) && (q % i == 0)) {
                    commonDivisors.add(i);
                }

            }
        }
        List<Integer> primeDivisors = commonDivisors.stream().filter(i -> isPrime(i)).collect(Collectors.toList());
        for (int j : primeDivisors){
            gcd = gcd*j;
        }
        return gcd;
    }

    public static void main(String args[]){
        //testing
        System.out.println(gcd(1025,560));
    }
}
