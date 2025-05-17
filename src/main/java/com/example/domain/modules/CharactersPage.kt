package com.example.domain.modules

data class CharactersPage(
    val info: Info,
    val results: List<Character>
)
data class Info(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)
