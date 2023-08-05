package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   User getById(long id);
   void updateUser(User user);
   void deleteById(long id);
   List<User> getUsers();
}
