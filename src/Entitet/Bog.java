package Entitet;

public class Bog {

    private int bogID;
    private String title;
    private String forfatter;

    public Bog(int bogID, String title, String forfatter) {  //Det er fra min database til mit objekt
        this.bogID = bogID;
        this.title = title;
        this.forfatter = forfatter;
    }

    public Bog(String title, String forfatter) {  //Fra objekt til db (Første gang)
        this.title = title;
        this.forfatter = forfatter;
    }

    public int getBogID() {
        return bogID;
    }

    public void setBogID(int bogID) {
        this.bogID = bogID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }
}
