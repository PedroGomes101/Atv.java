//Uma função que preencha um vetor de 10 posições com números sequenciais menores do que um valor digitado pelo usuário.
import java.util.Scanner;
public class Atv3 {
    public static int[] f(int num){
        int[] v = new int[10];
        num--;
        for(int i=0; i<10; num--){
            v[i]=num;
            i++;
        }
        return v;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite um número:");
        num = scan.nextInt();
        int[] v = f(num);//MUito interesante
        System.out.println("Aqui está:");
        for(int x=0;x<10;x++){
            System.out.println(v[x]);
        }
    }
}
