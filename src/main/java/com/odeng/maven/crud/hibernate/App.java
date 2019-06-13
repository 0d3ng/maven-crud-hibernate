/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 13, 2019 8:23:39 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate;

import com.odeng.maven.crud.hibernate.dao.MahasiswaDao;
import com.odeng.maven.crud.hibernate.entitas.Mahasiswa;
import com.odeng.maven.crud.hibernate.util.HibernateUtil;

/**
 *
 * @author od3ng
 */
public class App {
    public static void main(String[] args) {
        MahasiswaDao mahasiswaDao = HibernateUtil.getMahasiswaDao();
        Mahasiswa m = new Mahasiswa("075410200", "Singgih Kuncoro", 2.75F, "Teknik Mesin");
        mahasiswaDao.insert(m);
    }
}
