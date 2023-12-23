package ru.sevagrbnv.domain.usecases

import ru.sevagrbnv.data.model.CardModel
import ru.sevagrbnv.domain.repository.CardRepository

class CardUseCase(
    private val cardRepository: CardRepository
) {

    suspend fun addCard(card: CardModel) {
        cardRepository.addCard(card = card)
    }

    suspend fun getAllCards(): List<CardModel> {
        return cardRepository.getAllCards()
    }

    suspend fun updateCard(card: CardModel, ownerId: Int) {
        cardRepository.updateCard(card = card, ownerId = ownerId)
    }

    suspend fun deleteCard(cardId: Int, ownerId: Int) {
        cardRepository.deleteCard(cardId = cardId, ownerId = ownerId)
    }
}