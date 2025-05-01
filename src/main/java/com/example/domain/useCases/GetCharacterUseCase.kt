package com.example.domain.useCases

import com.example.domain.interfaces.CharacterRepository
import com.example.domain.modules.Character
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Character? {
        return repository.getCharacter(id)
    }
}