package com.example.domain.useCases

import com.example.domain.interfaces.CharacterRepository
import com.example.domain.modules.Character

class GetCharacterPagingUseCase(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(pageNumber:Int): List<Character>?{
        return repository.getCharactersPaging(pageNumber)?.results
    }
}