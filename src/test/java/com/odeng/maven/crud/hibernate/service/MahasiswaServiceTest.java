/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 13, 2019 5:53:11 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.entitas.Mahasiswa;
import com.odeng.maven.crud.hibernate.entitas.MahasiswaPK;
import com.odeng.maven.crud.hibernate.util.HibernateUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author od3ng
 */
public class MahasiswaServiceTest {

    MahasiswaService ms;

    @Before
    public void setUp() {
        ms = new MahasiswaServiceImpl(HibernateUtil.getMahasiswaDao());
    }

    @After
    public void tearDown() {
        HibernateUtil.shutdown();
    }

    @Test
    public void testInsert() {
        MahasiswaPK pK = new MahasiswaPK("075410099", "08587855xxxx");
        Mahasiswa m = new Mahasiswa(pK.getNim(), pK.getNo_telf(), "Singgih Kuncoro", 2.75F, "Teknik Mesin");
        assertTrue(ms.insert(m));
    }

}
