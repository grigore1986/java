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
        boolean bo = Boolean.parseBoolean(One);
        byte by = Byte.parseByte(Two);
        short s = Short.parseShort(Thre);
        int i = Integer.parseInt(Four);
        long l = Long.parseLong(Five);
        double d = Double.parseDouble(Six);
        float f = Float.parseFloat(Seven);
        System.out.println(bo);
        System.out.println(by);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
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



