package com.example.domain.useCases

import com.example.domain.interfaces.EpisodesRepository
import com.example.domain.modules.Episode

class GetEpisodesUseCase(
    private val repository: EpisodesRepository
) {
    suspend operator fun invoke(episodeUrls: List<String>): List<Episode> {
        return if (episodeUrls.size == 1) {
            listOf(repository.getEpisode(extractEpisodeIdFromLink(episodeUrls.first())))
        }
        else {
            repository.getEpisodes(extractEpisodeIds(episodeUrls)).onEach {
                it.episodeNumber = it.episodeNumber.trimStart('0')
            }
        }
    }
    fun extractEpisodeIds(episodeUrls: List<String>): String {
        return episodeUrls.joinToString(",") { extractEpisodeIdFromLink(it) }
    }
    fun extractEpisodeIdFromLink(episodeUrl:String) = episodeUrl.substringAfterLast('/')
}