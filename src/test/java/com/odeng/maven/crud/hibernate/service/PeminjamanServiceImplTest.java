/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 16, 2019 7:44:14 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.entitas.Peminjaman;
import com.odeng.maven.crud.hibernate.util.HibernateUtil;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author od3ng
 */
public class PeminjamanServiceImplTest {

    PeminjamanService service;

    public PeminjamanServiceImplTest() {
    }

    @Before
    public void setUp() {
        service = new PeminjamanServiceImpl(HibernateUtil.getPeminjamanDao());
    }

    @After
    public void tearDown() {
        HibernateUtil.shutdown();
    }

    @Test
    public void testSave() {
        Peminjaman p = new Peminjaman();
        p.setTanggal_transaksi(new Date());
        assertTrue(service.save(p));
    }

}
