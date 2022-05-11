public class Serial extends Film{
    private int filenumber;
    private int averageduration;

    public Serial() {
    }

    public Serial(int id, String title, String category, String director, int premieredate, int filenumber, int averageduration) {
        super(id, title, category, director, premieredate);
        this.filenumber = filenumber;
        this.averageduration = averageduration;
    }

    public int getFilenumber() {
        return filenumber;
    }

    public void setFilenumber(int filenumber) {
        this.filenumber = filenumber;
    }

    public int getAverageduration() {
        return averageduration;
    }

    public void setAverageduration(int averageduration) {
        this.averageduration = averageduration;
    }

    @Override
    public String toString() {
        return "Serial{" +
                "filenumber=" + filenumber +
                ", averageduration=" + averageduration +
                '}';
    }
}

