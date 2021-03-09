package org.spacecards;

import java.util.List;

import org.spacecards.service.CardGameService;
import org.spacecards.service.impl.CardGameServiceImpl;
import org.spacecards.util.CardsGameUtil;

public class PlaySpaceGame {

	public static void main(String[] args) {
		CardGameService service = new CardGameServiceImpl();
		List<Integer> player1Dec = CardsGameUtil.getPlayer1Dec();
		List<Integer> player2Dec = CardsGameUtil.getPlayer2Dec();
		int round = 1;
		while (player1Dec.size() > 0 && player2Dec.size() > 0) {
			System.out.println("-- Round " + round++ + " --");
			System.out.println("Player 1's deck:" + player1Dec);
			System.out.println("Player 2's deck:" + player2Dec);
			System.out.println("Player 1's plays:" + player1Dec.get(0));
			System.out.println("Player 2's plays:" + player2Dec.get(0));
			service.playRound(player1Dec, player2Dec);
		}
		System.out.println("\n== Post-game results ==");
		System.out.println("Player 1's deck:" + player1Dec);
		System.out.println("Player 2's deck:" + player2Dec);
		List<Integer> winner = player1Dec.size() > 0 ? player1Dec : player2Dec;
		
		Integer score = service.calculateWinnerScore(winner);
		System.out.println("final score "+score);
	}
}
