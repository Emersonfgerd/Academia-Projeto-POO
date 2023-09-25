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
  }
}