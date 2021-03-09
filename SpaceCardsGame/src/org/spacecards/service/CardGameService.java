package org.spacecards.service;

import java.util.List;

public interface CardGameService {
	void playRound(List<Integer> player1Dec, List<Integer> player2Dec);

	Integer calculateWinnerScore(List<Integer> winner);
}
