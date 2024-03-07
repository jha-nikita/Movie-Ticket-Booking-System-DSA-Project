public class Movie {
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return title + " (" + director + ", " + releaseYear + ")";
    }
}
