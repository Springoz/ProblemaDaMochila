import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de recursos disponíveis: ");
        double quantidadeRecurso = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a descrição do recurso: ");
        String descricaoRecurso = scanner.nextLine();
        Recurso recurso = new Recurso(quantidadeRecurso, descricaoRecurso);

        System.out.print("Quantos projetos deseja adicionar? ");
        int numProjetos = scanner.nextInt();
        scanner.nextLine();

        Projeto[] projetos = new Projeto[numProjetos];

        for (int i = 0; i < numProjetos; i++) {
            System.out.println("Digite os detalhes do projeto " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Valor: ");
            double valor = scanner.nextDouble();
            System.out.print("Retorno: ");
            double retorno = scanner.nextDouble();
            scanner.nextLine();

            projetos[i] = new Projeto(nome, valor, retorno);
        }

        OtimizadorRecurso otimizador = new OtimizadorRecurso();
        Resultado resultado = otimizador.otimizar(recurso, projetos);
        resultado.apresentarResultado();

        scanner.close();
    }
}
