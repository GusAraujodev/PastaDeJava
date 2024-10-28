import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int N=1 , soma = 0;

    while(N<=100){
        if(N%2==0){
            soma+=N;
        }
          N++;
        }
        System.out.println(soma);
    }
}
