package ru.linew.retrofit.domain.repository

import io.reactivex.Single
import ru.linew.retrofit.data.models.spotify.Track

interface ISpotifyRepository {
    fun getTrack(uid: String): Single<Track>
    fun searchTracks(searchString: String): Single<List<Track>>
}