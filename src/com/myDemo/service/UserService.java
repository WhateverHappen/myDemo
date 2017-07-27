package com.myDemo.service;

import com.myDemo.model.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by thanatos on 2017/7/24.
 */
public class UserService {
    private static SessionFactory ourSessionFactory;

    static {
        Configuration configuration = new Configuration();
        configuration.configure();

        ourSessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public String addUser(UserEntity userEntity, String userName, String password, String sex, int age) {
        userEntity = new UserEntity();
        userEntity.setUserName(userName);
        userEntity.setPassword(password);
        userEntity.setAge(age);
        userEntity.setSex(sex);

        Session session = getSession();
        String hql = "from UserEntity user where user.userName=userName";
        Query query = session.createQuery(hql);
        List results = query.list();
        if (results.size() != 0) {
            session.close();
            return "error";
        } else {
            Transaction transaction = session.beginTransaction();
            session.save(userEntity);
            transaction.commit();
            System.out.println("save finished");

            session.close();
            return "success";
        }
    }

    public String checkUser(String userName, String password) {
        Session session = getSession();
        String hql = "from UserEntity user where user.userName=userName";
        Query query = session.createQuery(hql);
        List results = query.list();
        Object o = results.get(0);
        UserEntity user = (UserEntity) o;
        if (user.getPassword().equals(password)) {
            session.close();
            return "success";
        } else {
            session.close();
            return "error";
        }
    }
}
