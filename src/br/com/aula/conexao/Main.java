package br.com.aula.conexao;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	//Criação de um scanner para que o usuário possa interagir no programa
        Scanner scanner = new Scanner(System.in);
        //Utiliza-se boolean para saber se é true ou false
        boolean continuar = true;

        //Inicia o loop do menu até que "continuar" for true
        while (continuar) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1 - Inserir Aluno");
            System.out.println("2 - Atualizar Aluno");
            System.out.println("3 - Deletar Aluno");
            System.out.println("4 - Ler Registro de Alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            //Estrutura de decisão para executar o programa com base na opção escolhida
            switch (opcao) {
                case 1:
                    InserirDados.main(null); 
                    break;
                case 2:
                    AtualizarDados.main(null); 
                    break;
                case 3:
                    DeletarDados.main(null); 
                    break;
                case 4:
                    LerDados.main(null); 
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
