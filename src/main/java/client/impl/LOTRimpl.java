package client.impl;

import java.io.IOException;

import client.LOTR;
import proxy.LOTRMovieAPIProxy;

public class LOTRimpl implements LOTR {

	private String apiKey;

	private LOTRimpl() {
	}

	public static final LOTRimpl Builder() {
		LOTRimpl lotr = new LOTRimpl();
		return lotr;
	}

	public LOTRimpl withAPIKey(String apiKey) {
		this.apiKey = "Bearer "+apiKey;
		return this;
	}

	public void getAllMovies() {
		try {
			System.out.println(LOTRMovieAPIProxy.connectToAPIGetResponse(baseURL, apiKey));
		} catch (IOException e) {
			e.printStackTrace();
		}
		;
	}

	public void getMovieById(String id) {
		StringBuilder sb = new StringBuilder(baseURL).append(id);
		try {
			System.out.println(LOTRMovieAPIProxy.connectToAPIGetResponse(sb.toString(), apiKey));
		} catch (IOException e) {
			e.printStackTrace();
		}
		;

	}

	public void getQuotesByMovieId(String id) {
		StringBuilder sb = new StringBuilder(baseURL).append(id).append("/quote");
		try {
			System.out.println(LOTRMovieAPIProxy.connectToAPIGetResponse(sb.toString(), apiKey));
		} catch (IOException e) {
			e.printStackTrace();
		}
		;
	}

}
