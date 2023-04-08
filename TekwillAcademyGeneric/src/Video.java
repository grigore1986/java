public class Video {
    private String denumire;

    public Video(String denumire){
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Videoul{" +
                "denumire='" + denumire + '\'' +
                '}';
    }
}
