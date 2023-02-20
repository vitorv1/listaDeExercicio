import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class RepositoryPessoa{
    /*String [][] pessoas = new String[id][3];
    public String salvar (String nome, String dataNascimento, String cpf){
        for (int i = 0; i < pessoas.length; i++) {
            for (int j = 0; j < 4; j++) {
                pessoas[i][j] = nome;
            }
        }
    }*/

    List<String> datas = new ArrayList<String>();
    List<String> cpfs = new ArrayList<String>(datas);
    List<String> nomes = new ArrayList<String>(cpfs);
    public void salvarNome (String nome) {
        nomes.add(nome);
    }
    public void salvarDataNascimento(String dataNascimento){
        datas.add(dataNascimento);
    }
    public void salvarCpfs (String cpf){
        cpfs.add(cpf);
    }
   /* public String buscarList(String nome){
        for
    }*/
}
