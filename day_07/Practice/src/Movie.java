public class Movie extends Film {
    private int time;

    public Movie(int i) {
    }

    public Movie(int id, String title, String category, String director, int premieredate, int time) {
        super(id, title, category, director, premieredate);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + super.getId() +
                ", title='" + super.getTitle() + '\'' +
                ", category='" + super.getCategory() + '\'' +
                ", director='" + super.getDirector() + '\'' +
                ", premieredate=" + super.getPremieredate() +
                "time=" + time +
                '}';
    }
}
