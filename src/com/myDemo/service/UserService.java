package com.myDemo.service;

import com.myDemo.model.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by thanatos on 2017/7/24.
 */
public class UserService {
//    private static SessionFactory ourSessionFactory;
//
//    static {
//        Configuration configuration = new Configuration();
//        configuration.configure();
//
//        ourSessionFactory = configuration.buildSessionFactory();
//    }
//
//    public static Session getSession() throws HibernateException {
//        return ourSessionFactory.openSession();
//    }

    public void addUser(UserEntity userEntity, String userName, String password, String sex, int age) {
        userEntity = new UserEntity();
        userEntity.setUserName(userName);
        userEntity.setPassword(password);
        userEntity.setAge(age);
        userEntity.setSex(sex);
        System.out.println("set finished");

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(userEntity);
        transaction.commit();
        System.out.println("save finished");

        session.close();
        sessionFactory.close();
    }
}
