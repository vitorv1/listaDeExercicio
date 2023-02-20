import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 8- Faça um programa orientado a objetos que tenha um objeto Pessoa com nome, data nascimento e cpf
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        int ponte;
        boolean stop = true;
        String validar;
        while (stop) {
            System.out.println("Caso deseje criar digite 1");
            System.out.println("Caso deseje alterar alguma informação digite 2");
            System.out.println("Caso deseje ver alguma informação digite 3");
            ponte = sc.nextInt();
            if (ponte == 1) {
                System.out.println("Digite seu nome, sua data de nascimento, e seu cpf");
                pessoa.criar(sc.next(), sc.next(), sc.next());
                System.out.println("Criado com sucesso");
            }
            if (ponte == 2) {
                System.out.println("Caso queira altera seu nome, digite 1");
                System.out.println("Caso queira alterar sua data de nascimento, digite 2");
                System.out.println("Caso queira alterar seu cpf, digite 3");
                System.out.println("Caso queira alterar todos os dados, digite 4");
                ponte = sc.nextInt();
                if (ponte == 1) {
                    System.out.println("Digite o nome");
                    pessoa.setNome(sc.next());
                    System.out.println("Alterado com sucesso");
                }
                if (ponte == 2) {
                    System.out.println("Digite a data de nascimento");
                    pessoa.setDataNascismento(sc.next());
                    System.out.println("Alterado com sucesso");
                }
                if (ponte == 3) {
                    System.out.println("Digite o cpf");
                    pessoa.setCpf(sc.next());
                    System.out.println("Alterado com sucesso");
                }
                if (ponte == 4){
                    System.out.println("Digite o nome, data de nascimento e cpf");
                    pessoa.alterar(sc.next(), sc.next(), sc.next());
                    System.out.println("Alterado com sucesso");
                }
            } if (ponte == 3){
                System.out.println(pessoa.getNome()+"   " + "    " + pessoa.getCpf()+ "      " + "      " + pessoa.getDataNascismento() );
            }
            System.out.println("Deseja continuar, s ou n");
            validar = sc.next();
            if (validar == "n"){
                stop = false;
            }
        }
    }
}
