package edu.cnm.deepdive.test.API;

import android.content.Context;
import edu.cnm.deepdive.test.API.models.SearchResponse;
import edu.cnm.deepdive.test.R;
import rx.Single;

public class GoogleClient {

  public static Single<SearchResponse> imageSearch(Context context,
      String query) {
    return API.googleService.imageSearch(
        context.getString(R.string.google_api_key),
        context.getString(R.string.search_id),
        query,
        10,
        1
    );
  }
}
