package com.example.domain.modules



data class Character(
    val id: Int,
    val name: String,
    val status: CharacterStatus,
    val species: String,
    val type: String,
    val gender: CharacterGender,
    val origin: Origin,
    val location: Location,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
){
    data class Origin(
        val name: String,
        val url: String
    )
    data class Location(
        val name: String,
        val url: String
    )
}


