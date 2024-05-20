//Uma função que receba como parâmetro a temparatura em celsius e retorne a temperatura em farenheight
import java.util.Scanner;
public class Atv5 
{
    public static double grau(double x)
    {
        double f;    
        f=(1.8*x)+32;
        return f;
    }
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float temp;
        System.out.println("Digite a temperatura(celsios) - ");
        temp= scan.nextInt();
        System.out.println(grau(temp));
    }
}
