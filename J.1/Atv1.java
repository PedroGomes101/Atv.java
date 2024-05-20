//Uma função que dado um número retorne seu fatorial.
import java.util.Scanner;

public class Atv1 {
    static int fat(int num){
        int x=1;
        for(int i=1;num>=i;num--){
            x=num*x;
        }
        return x;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, x=1;
        System.out.println("Digite um número:");
        num = scanner.nextInt();        
        x=fat(num);
        if(x>1){
        System.err.println(x);
        }
        else{
        System.out.println("Opá!Não existe fatorial negativo!");
        }
    }
}    

