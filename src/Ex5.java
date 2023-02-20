import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        String [] array = new String[10];
        Scanner sc = new Scanner(System.in);
        String soma = "";
        System.out.println("Digite as letras a serem concatenadas");
        array[0] = sc.next();
        array[1] = sc.next();
        array[2] = sc.next();
        array[3] = sc.next();
        array[4] = sc.next();
        array[5] = sc.next();
        array[6] = sc.next();
        array[7] = sc.next();
        array[8] = sc.next();
        array[9] = sc.next();
        for (int i = 0; i < array.length; i++) {

            soma = array[i] + soma;

        }
        System.out.println(soma);
    }
}
