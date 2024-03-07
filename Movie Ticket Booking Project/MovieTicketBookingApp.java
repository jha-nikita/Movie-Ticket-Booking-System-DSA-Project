public class MovieTicketBookingApp {
    private UserInterface ui;
    private MovieDatabase movieDatabase;

    public MovieTicketBookingApp() {
        this.ui = new UserInterface();
        this.movieDatabase = new MovieDatabase();
        // Add some sample data to the movie database
        movieDatabase.addMovie(new Movie("Inception", "Christopher Nolan", 2010));
        movieDatabase.addMovie(new Movie("The Dark Knight", "Christopher Nolan", 2008));
    }

    public void start() {
        boolean running = true;
        while (running) {
            ui.displayMenu();
            int choice = ui.getMenuChoice();
            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    displayMovies();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    ui.displayErrorMessage("Invalid choice. Please try again.");
            }
        }
        ui.displayMessage("Thank you for using the Movie Ticket Booking App!");
    }

    private void bookTicket() {
        // Add booking logic here
        ui.displayMessage("Booking not implemented yet.");
    }

    private void displayMovies() {
        ui.displayMessage("Movies:");
        for (Movie movie : movieDatabase.getAllMovies()) {
            ui.displayMessage(movie.toString());
        }
    }
}
