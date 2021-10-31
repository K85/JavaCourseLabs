package lab3;
/*
 * PlayingWithCards.java
 * Copyright (C) 2021  <@TEETH>
 *
 * Distributed under terms of the MIT license.
 */

enum Rank {
  ace, two, three, four, five, six, seven, eight, nine, ten, jack, queue, king
}

public class PlayingWithCards {
public static void main(String[] args) {
Rank highCard, faceCard, card1, card2;
highCard = Rank.ace;
faceCard = Rank.jack;
card1 = Rank.four;
card2 = Rank.five;

System.out.println("A blackjack hand: ace and ..." + faceCard);

int card1Val, card2Val;
card1Val = card1.ordinal() + 1;
card2Val = card2.ordinal() + 1;

System.out.println("A two card hand: " + card1 + " and " +card2);
System.out.println("Hand value: " + (card1Val + card2Val));
}
}





