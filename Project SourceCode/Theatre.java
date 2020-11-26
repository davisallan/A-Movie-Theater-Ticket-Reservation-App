import java.util.ArrayList;

public class Theatre {

	private String theatreName;
	private ArrayList<Movie> movieList;
	
	
	public Theatre(String name, ArrayList<Movie> movieList) {
		this.theatreName = name;
		this.movieList = movieList;
	}
	
	public String getName() {
		return theatreName;
	}
	
	// get movie list for this theatre
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
	
}
