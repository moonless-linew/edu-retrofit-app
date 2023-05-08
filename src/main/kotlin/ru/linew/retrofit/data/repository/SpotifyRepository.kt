package ru.linew.retrofit.data.repository

import io.reactivex.Single
import ru.linew.retrofit.data.api.SpotifyService
import ru.linew.retrofit.data.models.spotify.Track
import ru.linew.retrofit.domain.repository.ISpotifyRepository
import ru.linew.retrofit.network.RetrofitClient

class SpotifyRepository(): ISpotifyRepository {
    private val service = RetrofitClient.retrofit.create(SpotifyService::class.java)

    override fun getTrack(uid: String): Single<Track> {
        return service.getTrack(uid)

    }

    override fun searchTracks(searchString: String): Single<List<Track>> {
        return service.searchTracks(searchString).map { it.searchResponse.items }
    }
}