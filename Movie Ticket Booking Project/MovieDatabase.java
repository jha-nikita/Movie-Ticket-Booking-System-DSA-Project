public class MovieDatabase {
    private LinkedList<Movie> movies;

    public MovieDatabase() {
        this.movies = new LinkedList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public LinkedList<Movie> getAllMovies() {
        return movies;
    }
}
