public class Pessoa {
    private String nome;
    private String dataNascismento;
    private String cpf;

    public String getNome(){
        return this.nome;
    }
    public String getDataNascismento(){
        return this.dataNascismento;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setDataNascismento(String dataNascismento){
        this.dataNascismento = dataNascismento;
    }
    public void criar (String nome, String dataNascismento, String cpf ){
        Pessoa pessoa = new Pessoa();
        RepositoryPessoa repositoryPessoa = new RepositoryPessoa();
        this.setNome(nome);
        this.setDataNascismento(dataNascismento);
        this.setCpf(cpf);
        repositoryPessoa.salvarNome(nome);
        repositoryPessoa.salvarDataNascimento(dataNascismento);
        repositoryPessoa.salvarCpfs(cpf);
    }
    /*public String buscar (String nome){
        return
    }*/
    public void mostrar (){
        this.getNome();
        this.getCpf();
        this.getDataNascismento();
    }
    public void alterar (String nome, String dataNascismento, String cpf){
        this.setCpf(cpf);
        this.setDataNascismento(dataNascismento);
        this.setNome(nome);


    }

}
