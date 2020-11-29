package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TheatreList {

    private ArrayList<Theatre> theatres;

    public TheatreList() {
        theatres = new ArrayList<>();
    }

    public void loadTheatres(ResultSet rs) {
        try {
            while (rs.next()) {
                theatres.add(new Theatre (
                        rs.getInt("TheatreID"),
                        rs.getString("Theatre_name"),
                        rs.getString("Address")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadMovies(ResultSet rs) {
        try {
            while (rs.next()) {
                int theatreID = rs.getInt("TheatreID");
                for (Theatre theatre: theatres) {
                    if(theatre.getTheatreID() == theatreID) {
                        theatre.addMovie(new Movie (
                                rs.getInt("MovieID"),
                                rs.getString("Mov_Name")));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //dummy method for testing to display results from query
    public void display() {
        for (Theatre t : getTheatres()) {
            System.out.println(t);
            System.out.println("Movies playing here:");
            for (Movie m: t.getMovieList()) {
                System.out.println(m);
            }
        }
    }

    public ArrayList<Theatre> getTheatres() {
        return theatres;
    }
}
