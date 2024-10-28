import java.util.Scanner;

public class Recurso {
    private double quantidade;
    private String descricao;

    public Recurso(double quantidade, String descricao) {
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
