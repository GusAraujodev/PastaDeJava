import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

     int N;

     System.out.println("Digite o número");
        System.out.print("N = ");
        N = scanner.nextInt();
        if (N > 0){
            System.out.println("Número positivo");
        }
            else if(N < 0){
           System.out.println("Número negativo");
            }
         else{ 
             System.out.println("Número igual a zero");
            
         }
            
            }
}
