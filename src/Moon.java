public final class Moon extends Earth{
    private int year;
    private Colors colors;

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Colors getColors() {
        return colors;
    }

    public Moon(int year, Colors colors) {
        super(year, colors);
        this.year = year;
        this.colors = colors;
    }

    public Moon(int year, Colors colors, int year1, Colors colors1, int year2, Colors colors2) {
        super(year, colors, year1, colors1);
        this.year = year2;
        this.colors = colors2;
    }

    @Override
    public int sizePlanet(int sizes, int year){
        return sizes;
    }
}
