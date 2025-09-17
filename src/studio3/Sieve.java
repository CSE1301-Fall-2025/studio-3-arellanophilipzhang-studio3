import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
        System.out.println("Up to what number?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] sieve = new boolean[n+1];
        for(int i=0; i<=n; i++){
            sieve[i] = true;
        }
        sieve[0] = false;
        sieve[1] = false;
        for(int j=2; j<=n; j++){
            for(int k=2*j; k<=n; k+=j){
                sieve[k] = false;
            }
        }
        for(int m=0; m<=n; m++){
            if(sieve[m]==true){
                System.out.println(m);
            }
        }
    }
}
