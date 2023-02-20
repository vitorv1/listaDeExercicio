import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Digite os numeros a serem comparados");
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
        for (int i = 0; i  <array.length ; ++i) {
            if (array[i] % 2 == 0){
                System.out.println("os numeros pares são:" + array[i]);
            }
        }
    }
}
