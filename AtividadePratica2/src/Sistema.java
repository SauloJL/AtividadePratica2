
public class Sistema {

    private static void exibirMenu() {

        System.out.println("\n~~~ Cadastro de Funcionarios para Hospital ~~~");
        System.out.println("1) Cadastrar Médico");
        System.out.println("2) Cadastrar Enfermeiro");
        System.out.println("3) Cadastrar Paciente");
        System.out.println("4) Listar Pessoas");
        System.out.println("5) Excluir pelo id");
        System.out.println("6) Listar todas as pessoas");
        System.out.println("7) Excluir todas as pessoas");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void verificarOpcao(int op) {

        String id;
        String nome;
        String idade;
        String setor;
        String especialidade;
        String diagnostico;

        switch (op) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:

                break;

        }
    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
