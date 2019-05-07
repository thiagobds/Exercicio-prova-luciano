
public class Data {

    private int dia;
    private String mes;
    private double ano;

    public void mostrar() {

        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
    }

    public int getdia() {
        return this.dia;
    }

    public String getmes() {
        return this.mes;
    }

    public double getano() {
        return this.ano;
    }

    public void setdia(int d) {
        this.dia = d;
    }

    public void setmes(String m) {
        this.mes = m;
    }

    public void setano(double a) {
        this.ano = a;
    }
}
