import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int aux = 0;
        int aux2 = 0;
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
            aux2 = array[0];
            if (array[i] > aux){
                aux = array[i];
            }else if (array[i] < aux2){
                aux2 = array[i];
            }
        }
        System.out.println("O maior numero é" + aux);
        System.out.println("O menor numero é" + aux2);



    }

}
