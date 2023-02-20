import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int aux = 0;
        int [] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores a serem comparados");
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
            if (array[i] > aux){
                aux = array[i];
            }
        }
        System.out.println("O maior numero é" + aux);
    }
}
