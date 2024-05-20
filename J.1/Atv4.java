//Uma função que retorne verdadeiro se um número for primo e falso caso contrário
import java.util.Scanner;
public class Atv4 {
    public static boolean fv(int num){
        boolean x;
        if(num%2==0){
            x=true;
        }else{
            x=false;
        }
        return x;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num=0;
        System.out.print("Digite o número - ");
        num = scan.nextInt();
        System.out.println(fv(num));
    }
    
}
