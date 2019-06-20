/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 12, 2019 2:37:09 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.util;

import com.odeng.maven.crud.hibernate.dao.BukuDao;
import com.odeng.maven.crud.hibernate.dao.BukuDaoImpl;
import com.odeng.maven.crud.hibernate.dao.MahasiswaDao;
import com.odeng.maven.crud.hibernate.dao.MahasiswaImpl;
import com.odeng.maven.crud.hibernate.dao.PeminjamanDao;
import com.odeng.maven.crud.hibernate.dao.PeminjamanImpl;
import com.odeng.maven.crud.hibernate.dao.PenerbitDao;
import com.odeng.maven.crud.hibernate.dao.PenerbitDaoImpl;
import com.odeng.maven.crud.hibernate.dao.PengembalianDao;
import com.odeng.maven.crud.hibernate.dao.PengembalianDaoImpl;
import com.odeng.maven.crud.hibernate.dao.PenulisDao;
import com.odeng.maven.crud.hibernate.dao.PenulisDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author od3ng
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static MahasiswaDao mahasiswaDao;
    private static PeminjamanDao peminjamanDao;
    private static PengembalianDao pengembalianDao;
    private static PenulisDao penulisDao;
    private static BukuDao bukuDao;
    private static PenerbitDao penerbitDao;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            Logger.getLogger(HibernateUtil.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static MahasiswaDao getMahasiswaDao() {
        if (mahasiswaDao == null) {
            mahasiswaDao = new MahasiswaImpl(getSessionFactory().openSession());
        }
        return mahasiswaDao;
    }

    public static PeminjamanDao getPeminjamanDao() {
        if (peminjamanDao == null) {
            peminjamanDao = new PeminjamanImpl(getSessionFactory().openSession());
        }
        return peminjamanDao;
    }

    public static PengembalianDao getPengembalianDao() {
        if (pengembalianDao == null) {
            pengembalianDao = new PengembalianDaoImpl(getSessionFactory().openSession());
        }
        return pengembalianDao;
    }

    public static BukuDao getBukuDao() {
        if (bukuDao == null) {
            bukuDao = new BukuDaoImpl(getSessionFactory().openSession());
        }
        return bukuDao;
    }

    public static PenerbitDao getPenerbitDao() {
        if (penerbitDao == null) {
            penerbitDao = new PenerbitDaoImpl(getSessionFactory().openSession());
        }
        return penerbitDao;
    }

    public static PenulisDao getPenulisDao() {
        if (penulisDao == null) {
            penulisDao = new PenulisDaoImpl(getSessionFactory().openSession());
        }
        return penulisDao;
    }

    private static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        try {
            sessionFactory.close();
        } catch (HibernateException e) {
            Logger.getLogger(HibernateUtil.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
