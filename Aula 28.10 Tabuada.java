import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N , tabuada = 1;

     System.out.print("Digite seu número");
     N = scanner.nextInt();
         while(tabuada <= 10){
             System.out.println(N + "x" + tabuada + "=" + N * tabuada);
             tabuada++;
         }
    }
}
