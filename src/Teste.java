public class Teste{
    
    public static void main(String[] args) {
        
        Proprietario p1 = new Proprietario();
        p1.setNome("Thiago");
        
        Data da = new Data();
        da.setano(1997);
        da.setmes(05);
        da.setdia(19);
        
        Data r1 = new Data();
        r1.setdia(15);
        r1.setmes(9);
        r1.setano(1997);
        
        Imovel m1 = new Imovel();
        m1.setDatadaCompra(da);
        m1.setProprietario(p1);
        m1.setTipo("");
        
        p1.getmostrar();;
        m1.getinformarTipo("casa");
        m1.getmostrar();
        
}
    
}