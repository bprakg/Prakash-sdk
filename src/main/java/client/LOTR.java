package client;

public interface LOTR {

	String baseURL = "https://the-one-api.dev/v2/movie/";
	
	void getAllMovies();
	void getMovieById(String id);
	void getQuotesByMovieId(String id);
}
