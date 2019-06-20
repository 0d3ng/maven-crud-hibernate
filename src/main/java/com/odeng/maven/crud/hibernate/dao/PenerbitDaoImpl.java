/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 20, 2019 2:55:06 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.dao;

import com.odeng.maven.crud.hibernate.entitas.Penerbit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author od3ng
 */
public class PenerbitDaoImpl implements PenerbitDao{

    private final Session session;

    public PenerbitDaoImpl(Session session) {
        this.session = session;
    }

    @Override
    public boolean save(Penerbit o) {
        try {
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Logger.getLogger(PenerbitDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean update(Penerbit o) {
        try {
            session.beginTransaction();
            session.update(o);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Logger.getLogger(PenerbitDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean delete(Penerbit o) {
        try {
            session.beginTransaction();
            session.delete(o);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Logger.getLogger(PenerbitDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Penerbit> getAll() {
        try {
            return session.createQuery("FROM Penerbit p").list();
        } catch (Exception e) {
            Logger.getLogger(PenerbitDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return null;
    }
    
}
