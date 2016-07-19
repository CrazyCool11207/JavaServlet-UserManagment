package controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import model.User;


/**
 * Created by cdanial on 18.07.2016.
 */
public class UserManagment {
    // mit equals Methode
    ArrayList<User> users = new ArrayList<User>();

    public UserManagment() {
    }

    public boolean registerBoolean(String userName, String alter) {
        boolean isValid = validateAge(alter) && validateName(userName);
        User u = new User(userName, alter);
        u.setName(userName);
        u.setAge(alter);
        if (users.contains(u)) {
            return false;
        } else {
            users.add(u);
            return true;
        }
    }

    List<String> errorMessges = new ArrayList<String>();

    private boolean validateAge(String ageStr) {
        int age = Integer.parseInt(ageStr);
        if (age < 18) {
            errorMessges.add("Du musst mindestens 18 sein");
        }
    }
    private boolean validateName(String name) {

    }

    public boolean hasErrors() {
        return !errorMessges.isEmpty();
    }

    public boolean equalsName(Object obj) {
        if (obj instanceof User) {
            return users.equals(((User) obj).getName());
        } else {
            return false;
        }
    }

    public boolean equalsAge(Object obj) {
        if (obj instanceof User) {
            return users.equals(((User) obj).getAge());
        } else {
            return false;
        }
    }


}





//    ArrayList <String> users = new ArrayList <String>();
//    // size = 1, [0]
//    users.add("Player_1"+"+");
//    // size = 2, [1]
//    users.add(0, "ersetzt ersten");
//
//    System.out.println(users.toString());



