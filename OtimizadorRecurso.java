import java.util.List;
import java.util.ArrayList;

public class OtimizadorRecurso {
    public Resultado otimizar(Recurso recurso, Projeto[] projetos) {
        int n = projetos.length;
        int capacidade = (int) recurso.getQuantidade();
        double[][] dp = new double[n+1][capacidade+1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacidade; w++) {
                if (projetos[i-1].getValor() <= w) {
                    dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w - (int)projetos[i-1].getValor()] + projetos[i-1].getRetorno());
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

        double valorTotalRetorno = dp[n][capacidade];
        List<Projeto> projetosSelecionados = new ArrayList<>();

        for (int i = n, w = capacidade; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i-1][w]) {
                projetosSelecionados.add(projetos[i-1]);
                w -= projetos[i-1].getValor();
            }
        }

        return new Resultado(valorTotalRetorno, projetosSelecionados);
    }
}
