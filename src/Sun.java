public class  Sun {
    private int year;
    private Colors colors;

    public int getYear() {
        return year;
    }

    public Colors getColors() {
        return colors;
    }

    public Sun(int year, Colors colors) {
        this.year = year;
        this.colors = colors;
    }

    public String resalt(){
         return "Colors: " + colors + " year: " + year;
    }
}
