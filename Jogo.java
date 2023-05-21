package jogo;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Jogo {

	public static void main(String[] args) {
		LinkedList<String> players = new LinkedList<>();
		Stack<String> discardPile = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		Boolean gameOver = Boolean.FALSE;

		System.out.println("Bem-vindo ao jogo!");

		// Solicita o número de jogadores
		System.out.print("Digite o número de jogadores: ");
		int numPlayers = scanner.nextInt();

		// Solicita os nomes dos jogadores e adiciona-os à lista
		for (int i = 0; i < numPlayers; i++) {
			System.out.print("Digite o nome do jogador " + (i + 1) + ": ");
			String playerName = scanner.next();
			players.add(playerName);
		}

		System.out.println("Começando o jogo...");

		// Loop principal do jogo
		while (players.size() > 1 && !gameOver) {
			String currentPlayer = players.removeFirst();
			System.out.println("É a vez de " + currentPlayer);

			// Simula a jogada do jogador (pode adicionar lógica adicional aqui)
			// ...

			discardPile.push(currentPlayer); // Descarta o jogador na pilha de descarte
			players.addLast(currentPlayer); // Move o jogador para o final da lista
			
			if(discardPile.size() == 30) {
				gameOver = Boolean.TRUE;
			}
		}

		System.out.println("O jogador vencedor é: " + players.getFirst());
		System.out.println("Cartas descartadas: " + discardPile);
	}
}
