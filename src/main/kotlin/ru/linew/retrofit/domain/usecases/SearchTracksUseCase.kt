package ru.linew.retrofit.domain.usecases

import io.reactivex.Single
import ru.linew.retrofit.domain.repository.ISpotifyRepository

class SearchTracksUseCase(
    private val spotifyRepository: ISpotifyRepository
) {
    operator fun invoke(searchString: String): Single<List<String>> =
        spotifyRepository.searchTracks(searchString).map { searchResult ->
            mutableListOf<String>().also { list ->
                searchResult.forEach {
                    list.add("${it.name} - ${it.artists[0].name}")
                }
            }
        }
}

