package system;

public class Movie {
    private Integer id;
    private String name;
    private Integer year;
    private String director;
    private Integer rating;
    private boolean available;

    public Movie(Integer id, String name, Integer year, String director, Integer rating, boolean available) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.available = available;
    }

    public boolean isAvailable(){
        return available;
    }

    @Override
    public String toString() {
        String ratingText = rating == 0 ? "Unrated" : rating.toString();
        return id + " - " + name + " - " + year + " - " + director + " - " + ratingText;
    }
}
