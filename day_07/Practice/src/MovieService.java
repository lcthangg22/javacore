public class MovieService {
    public Movie[] getMoives() {
        Movie[] movies = {
                new Movie(90),
                new Movie(2, "X-Men", "Hành động, khoa học viễn tưởng", "Bryan Singer", 14, 120),
                new Movie(3, "Justice League", "Hành động, khoa học viễn tưởng", "Zack Snyder", 17, 150),
        };
        return movies;
    }
}
