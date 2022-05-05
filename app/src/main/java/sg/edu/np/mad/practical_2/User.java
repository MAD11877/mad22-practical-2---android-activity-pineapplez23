package sg.edu.np.mad.practical_2;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Hello World!";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = "MAD Practical 2";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}
