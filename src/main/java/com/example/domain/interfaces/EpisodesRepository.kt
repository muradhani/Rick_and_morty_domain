package com.example.domain.interfaces

import com.example.domain.modules.Episode

interface EpisodesRepository {
    suspend fun getEpisodes(episodeIds: String): List<Episode>
    suspend fun getEpisode(episodeId: String): Episode
}