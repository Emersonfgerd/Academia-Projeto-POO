package academia;

import java.util.Scanner;
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){
        int escolha;
        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Cadrastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Editar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("5. Cadrastrar Instrutor");
            System.out.println("6. Listar Instrutor");
            System.out.println("7. Editar Instrutor");
            System.out.println("8. Excluir Instrutor");
            System.out.println("9. Tornar Aluno Membro");
            System.out.println("10. Excluir um Membro");
            //Alterada para opção 10
            System.out.println("11. Listar Alunos Membros");
            System.out.println("12. Buscar por ID");
            System.out.println("13. Obter Treino");
            System.out.println("14. Sair do Programa");
            System.out.print("Escolha uma opção: ");
            escolha = lerOpcao();

            switch(escolha){
                case 1:
                  AcademiaApp.cadrastrarAluno();
                  break;
                case 2:
                  AcademiaApp.listarAlunos();
                  break;
                case 3:
                  AcademiaApp.editarAluno();
                  break;
                case 4:
                  AcademiaApp.excluirAluno();
                  break;
                case 5:
                  AcademiaApp.cadastrarInstrutor();
                  break;
                case 6:
                  AcademiaApp.listarInstrutores();
                    break;
                case 7:
                    AcademiaApp.editarInstrutor();
                    break;
                case 8:
                    AcademiaApp.excluirInstrutor();
                    break;
                case 9:
                    AcademiaApp.tornarAlunoMembro();
                    break;
                case 10: 
                    AcademiaApp.removerAlunoMembro();
                    break;
                case 11:
                    AcademiaApp.listarAlunosMembros();
                    break;
                case 12:
                AcademiaApp.buscarPorId();
                    break;
                case 13:
                    AcademiaApp.obterTreino();
                    break;
                case 14:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }   
    }
}  


    




        
    

