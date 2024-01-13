import java.util.Date;

public class Destination {
    private String name;
    private Date date;
    private String preferences;

    public Destination(String name, Date date, String preferences) {
        this.name = name;
        this.date = date;
        this.preferences = preferences;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getPreferences() {
        return preferences;
    }
}
