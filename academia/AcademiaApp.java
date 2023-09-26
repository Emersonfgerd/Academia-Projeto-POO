import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AcademiaApp {
    private static List<Aluno> alunos= new ArrayList<>();
    private static List<Instrutor> instrutores = new ArrayList<>();
    private static List<AlunoMembro>
    alunoMembros = new ArrayList<>(); // Lista para armazenar alunos membros
    private static Treino treino = new Treino();
    private static Scanner scanner = new
Scanner(System.in);
  private static AtomicInteger alunoldGenerator = new AtomicInteger(1);
  private static AtomicInteger instrutorldGenerator = new AtomicInteger(1);


  public static void cadastrarAluno(){
    System.out.println("\nCadastrar Aluno:");
    System.out.println("Nome do aluno: ");
    String nome = scanner.nextLine();

    // Verificar se o nome contem apenas letras e espacos
    if (!nome.matches("^[a-zA-Z\\s]+$")) {
        System.out.println("O nome do aluno nao pode conter caracteres especiais.");
        return;

    }
     
    // Coloque a primeira letra do nome em maiuscula e o restante minusculas
    nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

    int idade;
    boolean entradaValida = false;
    do {
        System.out.println("Idade do aluno: ");
        idade = 0;

        try {
            idade = scanner.nextInt();
            scanner.nextLine();
            entradaValida = true;

            if (idade < 0) {
                System.out.println("Idade nao pode ser negativa. Tente novamente.");
                entradaValida = false;
            }
            } catch (java.util.InputMismatchException e){
                System.out.println("Idade invalida. Certifique-se de inserir um numero inteiro.");
                scanner.nextLine(): // Limpa a entrada invalida
            }


            } while (!entradaValida);

            String respostaProblemaSaude;
            do {
                System.out.println("Problema de saude (Sim/Nao): ");
                respostaProblemaSaude = scanner.nextLine();
                if
             
                (!respostaProblemaSaude.equalsIgnoreCase("Sim") && !respostaProblemaSaude.equalsIgnoreCase("Nao"));
                System.out.println("Resposta invalida. Digite 'Sim' ou 'Nao'.");

            }
  } while
  (!respostaProblemaSaude.equalsIgnoreCase("Sim") && !respostaProblemaSaude.equalsIgnoreCase("Nao"));


       String respostaSexo;
    do {
        System.out.println("Sexo M/F");
        respostaSexo = scanner.nextLine();

        if (respostaSexo.equalsIgnoreCase("M")){
            respostaSexo = "Masculino";
        }else if (respostaSexo.equalsIgnoreCase("F")){
            respostaSexo = "Feminino";

        } else {
            System.out.println("Reposta invalida. Digite 'M' para homem ou 'F' para mulher.");

        }
    }while 
    (!respostaSexo.equalsIgnoreCase("Masculino") && !respostaSexo.equalsIgnoreCase("Feminino"));

     String tipoPagamento;
     do{
        System.out.println("Tipo de pagamento (Mensal/Anual):");
        tipoPagamento = scanner.nextLine();

        if(!tipoPagamento.equalsIgnoreCase("Mensal") && !tipoPagamento.equalsIgnoreCase("Anual")){
       System.out.println("Tipo de pagamento invalido. Digite 'Mensal' ou 'Anual.");

        }
     } while
     (!tipoPagamento.equalsIgnoreCase("Mensal") && !tipoPagamento.equalsIgnoreCase("Anual"));

     // converter "Mensal" para "Pagamento Mensal e "Anual" para "Pagamento Anual"
      if(tipoPagamento.equalsIgnoreCase("Mensal")){
        tipoPagamento = "Pagamento Mensal";
      } else if
      (tipoPagamento.equalsIgnoreCase("Anual")){
        tipoPagamento = "Pagamento Anual";
      }
         Aluno aluno = new
    Aluno(alunoldGenerator.getAndIncrement(), nome, idade, respostaProblemaSaude.equalsIgnoreCase("Sim"), respostaSexo, tipoPagamento);
     
          alunos.add(aluno);

          // Verifique se o aluno escolheu pagamento anual e , se sim, torne-o membro
          if
          (tipoPagamento.equalsIgnoreCase("Pagamento Anual")){
             aluno.tornarMembro();
          }
          System.out.println("Aluno cadastrado com sucesso!");
      }
      }
 
        }
    }
  }
}