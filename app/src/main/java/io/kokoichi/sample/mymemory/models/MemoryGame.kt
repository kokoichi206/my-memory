package io.kokoichi.sample.mymemory.models

import io.kokoichi.sample.mymemory.utils.DEFAULT_ICONS

class MemoryGame(private val boardSize: BoardSize) {

    val cards: List<MemoryCard>
    val numPairsFound = 0

    init {
        // ランダムで必要なペアの数選んだあと、そのペアを生成し、シャッフル
        val chosenImages = DEFAULT_ICONS.shuffled().take(boardSize.getNumPairs())
        val randomizedImages = (chosenImages + chosenImages).shuffled()
        cards = randomizedImages.map { MemoryCard(it) }   // ??
    }
}