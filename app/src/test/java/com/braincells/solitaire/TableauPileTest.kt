package com.braincells.solitaire

import org.junit.Test

import org.junit.Assert.*

/**
 * unit tests for TableauPile, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class TableauPileTest {
    @Test
    fun addCards() {
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))
        val cards = mutableListOf(Card(11, hearts))

        // act
        tableauPile.addCards(cards)

        // assert
        assert(Equals(2, tableauPile.cards.size))
    }

    @Test
    fun removeCards() {
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(4, clubs), Card(3, diamonds), Card(2, spades)))

        // act
        tableauPile.removeCards(1)

        // assert
        assert(Equals(mutableListOf(Card(4, clubs, true), tableauPile.cards)))
    }

}