public class FilmService {

    public Film[] getFilms() {
        Film[] films = {
                new Film(1, "Avengers", "Hành động, khoa học viễn tưởng", "Joss Whedon", 27),
                new Film(2, "X-Men", "Hành động, khoa học viễn tưởng", "Bryan Singer", 14),
                new Film(3, "Justice League", "Hành động, khoa học viễn tưởng", "Zack Snyder", 17),
        };
        return films;
    }

    public void findByTitle(String title) {
        int count = 0;
        for (Film film : getFilms()) {
            if(film.getTitle().contains(title)) {
                count++;
                System.out.println(film);
            }
        }

        if(count == 0) {
            System.out.println("Không có sách phù hợp với title là : " + title);
        }
    }
}


