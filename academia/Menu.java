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

        }
    }
}
