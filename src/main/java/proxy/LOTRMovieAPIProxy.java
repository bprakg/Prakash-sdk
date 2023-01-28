package proxy;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LOTRMovieAPIProxy {

	public static String connectToAPIGetResponse(String url, String apiKey) throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		Request request = new Request.Builder().url(url).method("GET", null).header("Authorization", apiKey).build();
		Response response = null;
		response = client.newCall(request).execute();

		return response.body().string();
	}
}
