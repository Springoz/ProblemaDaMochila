public class Projeto {
    private String nome;
    private double valor;
    private double retorno;

    public Projeto(String nome, double valor, double retorno) {
        this.nome = nome;
        this.valor = valor;
        this.retorno = retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getRetorno() {
        return retorno;
    }

    public void setRetorno(double retorno) {
        this.retorno = retorno;
    }
}
