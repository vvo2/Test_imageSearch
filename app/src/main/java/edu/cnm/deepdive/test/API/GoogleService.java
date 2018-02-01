package edu.cnm.deepdive.test.API;

import edu.cnm.deepdive.test.API.models.SearchResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Single;

public interface GoogleService {
  @GET("customsearch/v1")
  Single<SearchResponse> imageSearch(
      @Query("key") String key,
      @Query("cx") String cx,
      @Query("q") String query,
      @Query("num") int num,
      @Query("start") int start
  );
}
