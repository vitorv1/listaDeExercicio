import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os numeros desejados a serem somados");
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        array[3] = sc.nextInt();
        array[4] = sc.nextInt();
        array[5] = sc.nextInt();
        array[6] = sc.nextInt();
        array[7] = sc.nextInt();
        array[8] = sc.nextInt();
        array[9] = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            soma = soma + array[i];
        }
        System.out.println(soma);
    }
}