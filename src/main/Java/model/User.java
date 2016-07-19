package model;

/**
 * Created by cdanial on 18.07.2016.
 */


public class User {

    private String name;
    private String age;

    public User (String n , String a){
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



}
