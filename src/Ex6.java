public class Ex6 {
    public static void main(String[] args) {
        //6- Faça um programa que imprime os numeros primos de 0 a 100.
        int validar= 0;
        for (int i = 1; i < 101; i++) {

                if (i % 2 ==0) {
                    if (i % 1 == 0 && i % i == 0 && i % 2 == 0) {
                        System.out.println(i + "esse numero não é primo");
                    }
                }
                else if (i % 1 == 0 && i % i == 0 && i % 3 ==0){

                    System.out.println(i + "esse mumero não é primo");
                }

        }
    }
}
