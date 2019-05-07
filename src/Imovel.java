public class Imovel {
    private Data DataCompra;
    private Proprietario proprietario;
    private String tipo;
    
public void mostrar(){
    System.out.println (DataCompra);
    System.out.println (proprietario);
    System.out.println (tipo);
}
public boolean informarTipo(String tipo){
    if (tipo == "casa"){
        return true;
    }
    if (tipo == "Apartamento"){
        return true;
    }
    if (tipo == "Sitio"){
        return true;
    }
    else{
        return false;
    }
}
 public Data getDataCompra(){
     return this.DataCompra;
 }
 public Proprietario getProprietario(){
     return this.proprietario;
 }
 public String gettipo(){
     return this.tipo;
 }
 public void setDatadaCompra(Data d){
     this.DataCompra = d;
 }
 public void setProprietario(Proprietario p){
     this.proprietario = p;
 }
 public void setTipo (String t){
     this.tipo = t;
 }}
    