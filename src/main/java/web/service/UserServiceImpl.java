package web.service;

import org.springframework.stereotype.Component;
import web.model.User;
import web.dao.UserDao;
import web.dao.UserDaoImpl;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {
   private UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public List<User> getUserById(int index) {
        return userDao.getUserById(index);
    }
}
