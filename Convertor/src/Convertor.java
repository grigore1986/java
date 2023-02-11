public class Convertor {
    private String One;
    private String Two;
    private String Thre;
    private String Four;
    private String Five;
    private String Six;
    private String Seven;

    public void Convertion(String One, String Two, String Thre, String Four, String Five, String Six, String Seven) {
        this.One = One;
        this.Two = Two;
        this.Thre = Thre;
        this.Four = Four;
        this.Five = Five;
        this.Six = Six;
        this.Seven = Seven;
    }

    public void Converted() {
        boolean one = Boolean.parseBoolean(One);
        byte two = Byte.parseByte(Two);
        short thre = Short.parseShort(Thre);
        int four = Integer.parseInt(Four);
        long five = Long.parseLong(Five);
        double six = Double.parseDouble(Six);
        float seven = Float.parseFloat(Seven);
        System.out.println(one);
        System.out.println(two);
        System.out.println(thre);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
    }

    @Override
    public String toString() {
        return (String) ("Boolean " + One + "\n"
                + "Byte " + Two + "\n"
                + "Short " + Thre + "\n"
                + "Int " + Four + "\n"
                + "Long " + Five + "\n"
                + "Double " + Six + "\n"
                + "Float " + Seven);
    }
}



