package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl implements UserDao {
   private List<User> userList;
    {
        userList = new ArrayList<>();
        userList.add(new User(1, "Enco", "Red"));
        userList.add(new User(2, "Sedan", "Bacladjan"));
        userList.add(new User(3, "911", "Yellow"));
        userList.add(new User(4, "Accord", "Black"));
        userList.add(new User(5, "A4", "Grey"));
        userList.add(new User(6, "A4", "Grey"));
        userList.add(new User(7, "A4", "Grey"));
        userList.add(new User(8, "A4", "Grey"));
    }
    @Override
    public List<User> getUserList() {
        return userList;
    }

    @Override
    public List<User> getUserById(int index) {
        return userList.stream().limit(index).toList();
    }
}
