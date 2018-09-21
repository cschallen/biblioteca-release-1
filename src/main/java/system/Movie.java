package system;

public class Movie extends Item {
    private String name;
    private Integer year;
    private String director;
    private Integer rating;

    public Movie(Integer id, String name, Integer year, String director, Integer rating, boolean available) {
        super(id, available);
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        String ratingText = rating == 0 ? "Unrated" : rating.toString();
        return getId() + " - " + name + " - " + year + " - " + director + " - " + ratingText;
    }
}
