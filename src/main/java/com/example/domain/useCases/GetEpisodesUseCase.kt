package com.example.domain.useCases

import com.example.domain.interfaces.EpisodesRepository
import com.example.domain.modules.Episode

class GetEpisodesUseCase(
    private val repository: EpisodesRepository
) {
    suspend operator fun invoke(ids: String): List<Episode> {
        return repository.getEpisodes(ids).onEach {
            it.episodeNumber = it.episodeNumber.trimStart('0')
        }
    }
}