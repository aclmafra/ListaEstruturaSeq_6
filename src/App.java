import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double r, a;

        System.out.println("Digite o valor do raio referente ao seu circulo: ");
        r = sc.nextDouble();
        a = Math.PI * (r * r);

        System.out.println("O valor da area e: " + a);

        sc.close();
    }
}
