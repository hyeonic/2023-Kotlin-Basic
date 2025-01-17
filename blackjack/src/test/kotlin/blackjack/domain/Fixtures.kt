package blackjack.domain

import blackjack.domain.card.Card
import blackjack.domain.card.Cards
import blackjack.domain.card.Denomination.*
import blackjack.domain.card.Suit.SPADE

val ACE_SPACE = Card(ACE, SPADE)
val TWO_SPACE = Card(TWO, SPADE)
val THREE_SPACE = Card(THREE, SPADE)
val FIVE_SPACE = Card(FIVE, SPADE)
val SIX_SPACE = Card(SIX, SPADE)
val JACK_SPACE = Card(JACK, SPADE)
val QUEEN_SPACE = Card(QUEEN, SPADE)
val KING_SPACE = Card(KING, SPADE)

val BLACKJACK = Cards(mutableListOf(ACE_SPACE, JACK_SPACE))
val BUST = Cards(mutableListOf(KING_SPACE, JACK_SPACE, QUEEN_SPACE))
val HIT = Cards(mutableListOf(ACE_SPACE, TWO_SPACE))
val TWELVE_HIT = Cards(mutableListOf(TWO_SPACE, KING_SPACE))
val FIVE_HIT = Cards(mutableListOf(TWO_SPACE, THREE_SPACE))
