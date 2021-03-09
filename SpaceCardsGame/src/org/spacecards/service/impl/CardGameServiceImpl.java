package org.spacecards.service.impl;

import java.util.List;

import org.spacecards.service.CardGameService;

public class CardGameServiceImpl implements CardGameService {
	
	public void playRound(List<Integer> player1Dec, List<Integer> player2Dec) {
		if (player1Dec.get(0) > player2Dec.get(0)) {
			updateCards(player1Dec, player2Dec);
		} else {
			updateCards(player2Dec, player1Dec);
		}
	}

	private void updateCards(List<Integer> winner, List<Integer> looser) {
		winner.add(winner.get(0));
		winner.add(looser.get(0));
		winner.remove(0);
		looser.remove(0);
	}

	public Integer calculateWinnerScore(List<Integer> winner) {
		Integer score = 0;
		for (Integer card : winner) {
			score = score + card * (winner.size() - winner.indexOf(card));
		}
		return score;
	}
}
