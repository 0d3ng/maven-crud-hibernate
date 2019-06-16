/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 16, 2019 7:17:35 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.dao;

import com.odeng.maven.crud.hibernate.entitas.Peminjaman;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author od3ng
 */
public class PeminjamanImpl implements PeminjamanDao {

    private final Session session;

    public PeminjamanImpl(Session session) {
        this.session = session;
    }

    @Override
    public boolean save(Peminjaman o) {
        try {
            session.beginTransaction();
            long id = (Long) session.save(o);
            session.getTransaction().commit();
            return id != 0;
        } catch (Exception e) {
            Logger.getLogger(MahasiswaImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean update(Peminjaman o) {
        try {
            session.beginTransaction();
            session.update(o);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Logger.getLogger(MahasiswaImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean delete(Peminjaman o) {
        try {
            session.beginTransaction();
            session.delete(o);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Logger.getLogger(MahasiswaImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Peminjaman> getAll() {
        try {
            return session.createQuery("FROM Peminjaman p").list();
        } catch (Exception e) {
            Logger.getLogger(MahasiswaImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return null;
    }

}
