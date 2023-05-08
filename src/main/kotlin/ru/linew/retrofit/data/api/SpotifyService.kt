package ru.linew.retrofit.data.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ru.linew.retrofit.data.models.spotify.SearchResponseContainer
import ru.linew.retrofit.data.models.spotify.Track


interface SpotifyService {
    @GET("tracks/{uid}")
    fun getTrack( @Path("uid") uid: String): Single<Track>

    @GET("search?type=track&market=ES&limit=5")
    fun searchTracks(@Query("q") searchString: String): Single<SearchResponseContainer>


}