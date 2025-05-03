package com.example.domain.modules

data class Episode(
    val id: Int,
    val name: String,
    val seasonNumber:Int,
    var episodeNumber: String,
    val airDate: String,
    val charactersIdsInEpisode: List<Int>
)
