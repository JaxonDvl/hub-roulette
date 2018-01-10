package hr.msa.android.hubroulette.models;

/**
 * Created by Alin TATU on 1/8/2018.
 */

public class User {
    private String name;
    private String phone_number;
    private String profile_image;
    private String user_id;
    private String access_level;
    public User(){

    }
    public User(String name, String phone_number, String profile_image, String user_id, String access_level) {
        this.name = name;
        this.phone_number = phone_number;
        this.profile_image = profile_image;
        this.user_id = user_id;
        this.access_level = access_level;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getAccess_level() {
        return access_level;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setAccess_level(String access_level) {
        this.access_level = access_level;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", profile_image='" + profile_image + '\'' +
                ", user_id='" + user_id + '\'' +
                ", access_level='" + access_level + '\'' +
                '}';
    }


}
