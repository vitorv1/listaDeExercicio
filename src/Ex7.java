import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //7- Faça um programa que recebe uma data e veja se já é no passado, hoje ou no futuro. ----
        Scanner sc = new Scanner(System.in);


        int diaAtual;
        int mesAtual;
        int anoAtual;
        int dia;
        int mes;
        int ano;
        boolean validaDiaFut = false;
        boolean validaDiaPas = false;
        boolean validaMesFut = false;
        boolean validaMesPas = false;
        boolean validaAnoFut = false;
        boolean validaAnoPas = false;
        System.out.println("Digite o dia de hoje");
        diaAtual = sc.nextInt();
        System.out.println("Digite o mes atual");
        mesAtual = sc.nextInt();
        System.out.println("Digite o ano atual");
        anoAtual = sc.nextInt();
        System.out.println("Digite o dia a ser validado");
        dia = sc.nextInt();
        System.out.println("Digite o mes a ser validado");
        mes = sc.nextInt();
        System.out.println("Digite o ano a ser validado");
        ano = sc.nextInt();

        if (ano < anoAtual){
            validaAnoPas = true;
        }
        if (ano > anoAtual){
            validaAnoFut = true;
        }

        if (validaAnoFut){
            System.out.println(dia + "/" + mes + "/" + ano + "  Essa data é do futuro");
        }
        if (validaAnoPas){
            System.out.println(dia + "/" + mes + "/" + ano + "  Essa data é do passado");
        }
        if (ano == anoAtual){
            System.out.println(dia + "/" + mes + "/" + ano + "  Essa data é atual");
        }




        String data = sc.next();
    }
}
