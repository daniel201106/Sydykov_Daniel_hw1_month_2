public class Earth extends Sun{
    private int year;
    private Colors colors;
    private int size;

    public int getYear() {
        return year;
    }

    public int getSize() {
        return size;
    }

    public Earth(int year, Colors colors) {
        super(year, colors);
        this.year = year;
        this.colors = colors;
    }

    public Earth(int year, Colors colors, int year1, Colors colors1) {
        super(year, colors);
        this.year = year1;
        this.colors = colors1;
    }

    public int sizePlanet(int sizes, int year){
        return size;
    }

    public final int sizePlanet(int year){
        return year;
    }
    public String resalt() {
        return super.resalt();
    }
}
