package lotrsdk;

import client.LOTR;
import client.impl.LOTRimpl;

public class TestGetMovieById {

	public static void main(String[] args) {
		LOTR lotr = LOTRimpl.Builder().withAPIKey("tQIFsTgVTNxsxwrbMt19");
		lotr.getMovieById("5cd95395de30eff6ebccde57");
	}

}
