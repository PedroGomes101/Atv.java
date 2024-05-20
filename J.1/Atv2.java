import java.util.Scanner;

public class Atv2 {
    public static void tro(int a, int b, int c) {
        int n1, n2, n3;

        if (a <= b && a <= c) {
            n1 = a;
            if (b <= c) {
                n2 = b;
                n3 = c;
            } else {
                n2 = c;
                n3 = b;
            }
        } else if (b <= a && b <= c) {
            n1 = b;
            if (a <= c) {
                n2 = a;
                n3 = c;
            } else {
                n2 = c;
                n3 = a;
            }
        } else {
            n1 = c;
            if (a <= b) {
                n2 = a;
                n3 = b;
            } else {
                n2 = b;
                n3 = a;
            }
        }

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite a, b e c: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        tro(a, b, c);
    }
}
