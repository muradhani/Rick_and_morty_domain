package com.example.domain.interfaces

import com.example.domain.modules.CharactersPage

interface CharacterRepository {
    suspend fun getCharacter(id: Int): com.example.domain.modules.Character?
    suspend fun getCharacters(pageNumber:Int): CharactersPage?
}