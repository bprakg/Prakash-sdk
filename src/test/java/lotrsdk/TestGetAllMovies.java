package lotrsdk;

import client.LOTR;
import client.impl.LOTRimpl;

public class TestGetAllMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOTR lotr = LOTRimpl.Builder().withAPIKey("tQIFsTgVTNxsxwrbMt19");
		lotr.getAllMovies();
	}

}
