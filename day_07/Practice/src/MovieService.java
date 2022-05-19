public class MovieService {
    public Movie[] getMoives() {
        Movie[] movies = {
                new Movie(1, "A", "Hoạt hình", "a", 1,10),
                new Movie(2, "B", "Hành động, khoa học viễn tưởng", "b", 2, 20),
                new Movie(3, "C", "Tâm lý tình cảm", "c", 3, 30),
        };
        return movies;
    }

    public void findByTitle(String title) {
        int count = 0;
        for (Movie movie : getMoives()) {
            if(movie.getTitle().contains(title)) {
                count++;
                System.out.println(movie);
            }
        }
        if(count == 0) {
            System.out.println("Không có sách phù hợp với title là : " + title);
        }
    }

}
