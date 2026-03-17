package view;

import java.util.List;
import java.util.Scanner;
import model.Jogador;

public class JogoView {
    private Scanner scanner = new Scanner(System.in);

    public String pedirNome() {
        System.out.print("Digite seu nome: ");
        return scanner.nextLine();
    }

    public int pedirPalpite() {
        System.out.print("Palpite (0-100): ");
        return scanner.nextInt();
    }

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }

    public void mostrarRanking(List<Jogador> top5) {
        System.out.println("\n🏆 TOP 5:");

        int pos = 1;
        for (Jogador j : top5) {
            System.out.println(pos + "º - " + j.getNome() + " (" + j.getTentativas() + ")");
            pos++;
        }
    }
    
    public boolean perguntarJogarNovamente() {
        System.out.print("\nDeseja jogar novamente? (s/n): ");
        String resposta = scanner.next();
        return resposta.equalsIgnoreCase("s");
    }

    public boolean perguntarTrocarUsuario() {
        System.out.print("Deseja trocar de jogador? (s/n): ");
        String resposta = scanner.next();
        scanner.nextLine(); // limpar buffer
        return resposta.equalsIgnoreCase("s");
    }
}