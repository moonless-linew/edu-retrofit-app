package ru.linew.retrofit.domain.usecases

import io.reactivex.Single
import ru.linew.retrofit.data.models.spotify.Track
import ru.linew.retrofit.domain.repository.ISpotifyRepository

class DownloadTrackUseCase(
    private val spotifyRepository: ISpotifyRepository
) {
    operator fun invoke(uid: String): Single<Track> = spotifyRepository.getTrack(uid)
}