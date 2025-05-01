package com.example.domain.interfaces

interface CharacterRepository {
    suspend fun getCharacter(id: Int): com.example.domain.modules.Character?
}