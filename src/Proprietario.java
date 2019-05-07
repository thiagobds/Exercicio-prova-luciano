public class Proprietario {
    
    private String nome;
    private Data dataDeNascimento;

public void mostrar(){
    System.out.println (nome);
    System.out.println (dataDeNascimento);
}

public String getNome(){
    return this.nome;
}

public Data getDatadeNascimento(){
    return this.dataDeNascimento;
}

public void setNome(String n){
    this.nome = n;
}

public void setDatadeNascimento(Data d){
    this.dataDeNascimento = d;
}

}
