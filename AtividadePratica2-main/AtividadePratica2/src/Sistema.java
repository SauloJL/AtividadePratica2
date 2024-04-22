public class Sistema {

    private static void Menu() {

        System.out.print("______________________");
        System.out.println("\nSISTEMA HOSPITAL JAVA");
        System.out.println("1) Cadastrar Medico");
        System.out.println("2) Cadastrar Enfermeiro");
        System.out.println("3) Cadastrar Paciente");
        System.out.println("4) Buscar pelo Id");
        System.out.println("5) Excluir pelo Id");
        System.out.println("6) Listar Todas as Pessoas");
        System.out.println("7) Excluir Todas as Pessoas");
        System.out.println("0) Sair");
        System.out.print("\nInforme uma opção: ");

    }

    private static void verificarOp(int op) {

        switch (op) {
            case 1:

                cadastrarMedico();

                break;

            case 2:

                cadastrarEnfermeiro();

                break;

            case 3:

                cadastrarPaciente();

                break;

            case 4:

                buscarId();

                break;

            case 5:

                excluirId();

                break;

            case 6:

                listarPessoas();

                break;

            case 7:

                excluirLista();

                break;

            case 0:

                System.out.println("Programa finalizado!");

                break;

            default:

                System.out.println("Erro! Coloque outro numero!");

                break;
        }

    }

    private static void cadastrarMedico() {

        System.out.println("\n---Novo Médico---\n");

        System.out.print("Id: ");
        String id = Console.lerString();

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Idade: ");
        String idade = Console.lerString();

        System.out.print("Especialidade: ");
        String especialidade = Console.lerString();

        Medico medico = new Medico(id, nome, idade, especialidade);
        Cadastro.cadastrar(medico);

        System.out.println("\nCadastro feito com sucesso!");

    }

    private static void cadastrarEnfermeiro() {

        System.out.println("\n---Novo Enfermeiro---\n");

        System.out.print("Id: ");
        String id = Console.lerString();

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Idade: ");
        String idade = Console.lerString();

        System.out.print("Setor em que trabalha: ");
        String setor = Console.lerString();

        Enfermeiro enfermeiro = new Enfermeiro(id, nome, idade, setor);
        Cadastro.cadastrar(enfermeiro);

        System.out.println("\nCadastro feito com sucesso!");

    }

    private static void cadastrarPaciente() {

        System.out.println("\n---Novo Paciente---\n");

        System.out.print("Id: ");
        String id = Console.lerString();

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Idade: ");
        String idade = Console.lerString();

        System.out.print("Diagnostico: ");
        String diagnostico = Console.lerString();

        Paciente paciente = new Paciente(id, nome, idade, diagnostico);
        Cadastro.cadastrar(paciente);

        System.out.println("\nCadastro feito com sucesso!");

    }

    private static void buscarId() {

        System.out.println("\n--Busca pelo Id--");

        System.out.print("Insira o Id a ser buscado: ");
        String id = Console.lerString();

        Pessoa pessoa = Cadastro.buscar(id);

        if (pessoa != null) {

            System.out.println(pessoa.toString());
            return;

        }

        System.out.println("\nPessoa não encontrada!");

    }

    private static void excluirId() {

        System.out.println("\n--Excluir pelo Id--");
        System.out.print("Insira o Id a ser excluido: ");
        String id = Console.lerString();

        Pessoa pessoa = Cadastro.buscar(id);

        if (pessoa != null) {

            System.out.println(pessoa.toString());
            Cadastro.getListaPessoas().remove(pessoa);
            System.out.println("\nExcluído com sucesso!");
            return;

        }

        System.out.println("\nPessoa não encontrada!");

    }

    private static void listarPessoas() {

        System.out.println("\n--Mostrar todos na lista--");

        if (Cadastro.getListaPessoas().size() == 0) {

            System.out.println("\nNão há pessoas cadastradas para buscar");
            return;

        }

        for (Pessoa pessoa : Cadastro.getListaPessoas()) {
            System.out.println(pessoa.toString());
        }

    }

    private static void excluirLista() {

        System.out.println("\n--Excluir todos da lista--");

        if (Cadastro.getListaPessoas().isEmpty()) {

            System.out.println("\nNão há pessoas cadastradas para excluir");
            return;

        }

        for (Pessoa pessoa : Cadastro.getListaPessoas()) {

            Cadastro.getListaPessoas().remove(pessoa);

        }

        System.out.println("\nFoi excluido todos da lista!");

    }

    public static void executar() {

        int op;

        do {

            Menu();
            op = Console.lerInt();
            verificarOp(op);

        } while (op != 0);

    }

}
