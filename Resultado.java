import java.util.List;
import java.util.ArrayList;

public class Resultado {
    private double valorTotalRetorno;
    private List<Projeto> projetosSelecionados;

    public Resultado(double valorTotalRetorno, List<Projeto> projetosSelecionados) {
        this.valorTotalRetorno = valorTotalRetorno;
        this.projetosSelecionados = projetosSelecionados;
    }

    public void apresentarResultado() {
        System.out.println("Resultado da Otimização:");
        System.out.println("Valor Total de Retorno: " + valorTotalRetorno);
        System.out.println("Projetos Selecionados:");
        for (Projeto projeto : projetosSelecionados) {
            System.out.println(" - " + projeto.getNome() + " (Retorno: " + projeto.getRetorno() + ", Valor: " + projeto.getValor() + ")");
        }
    }
}
