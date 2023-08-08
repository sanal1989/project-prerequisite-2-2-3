package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void add(User user) {
        try {
            entityManager.persist(user);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        try {
            entityManager.merge(user);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void deleteById(long id) {
        try {
            User user = entityManager.find(User.class, id);
            entityManager.remove(user);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            entityManager.close();
        }
    }

    public List<User> getUsers() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }

}
