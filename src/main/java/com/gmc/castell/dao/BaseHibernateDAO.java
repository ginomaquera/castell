/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmc.castell.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author SABADO-MANHANA
 */
public class BaseHibernateDAO extends HibernateDaoSupport {
    @Autowired
    public void initSession(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
}
