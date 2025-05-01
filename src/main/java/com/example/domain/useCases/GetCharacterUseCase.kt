package com.example.domain.useCases

import com.example.domain.interfaces.CharacterRepository
import com.example.domain.modules.Character

class GetCharacterUseCase (
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Character? {
        return repository.getCharacter(id)
    }
}