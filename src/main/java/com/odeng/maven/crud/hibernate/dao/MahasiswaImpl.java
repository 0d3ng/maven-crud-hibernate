/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 12, 2019 8:04:42 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.dao;

import com.odeng.maven.crud.hibernate.entitas.Mahasiswa;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author od3ng
 */
public class MahasiswaImpl implements MahasiswaDao {

    private final Session session;

    public MahasiswaImpl(Session session) {
        this.session = session;
    }

    @Override
    public boolean insert(Mahasiswa m) {
        try {
            session.beginTransaction();
            String nim = (String) session.save(m);
            session.getTransaction().commit();
            return nim != null;
        } catch (Exception e) {
            Logger.getLogger(MahasiswaImpl.class.getName()).log(Level.SEVERE, null, e);
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean update(Mahasiswa m) {
        try {
            session.beginTransaction();
            session.update(m);
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
    public boolean delete(Mahasiswa m) {
        try {
            session.beginTransaction();
            session.delete(m);
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
    public Mahasiswa getMahasiswaByNim(String nim) {
        try {
            Query query = session.createQuery("FROM Mahasiswa m WHERE m.nim=:nim");
            query.setParameter("nim", nim);
            return (Mahasiswa) query.uniqueResult();
        } catch (Exception e) {
            Logger.getLogger(MahasiswaImpl.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        try {
            return session.createQuery("FROM Mahasiswa", Mahasiswa.class).list();
        } catch (Exception e) {
            Logger.getLogger(MahasiswaImpl.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }
        return null;
    }

}
