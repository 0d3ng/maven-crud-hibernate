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
import com.odeng.maven.crud.hibernate.entitas.Pengembalian;
import com.odeng.maven.crud.hibernate.util.HibernateUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * @author od3ng
 */
public class PeminjamanPengembalianServiceImplTest {

    PeminjamanService service;
    PengembalianService pengembalianService;

    public PeminjamanPengembalianServiceImplTest() {
    }

    @Before
    public void setUp() {
        service = new PeminjamanServiceImpl(HibernateUtil.getPeminjamanDao());
        pengembalianService = new PengembalianServiceImpl(HibernateUtil.getPengembalianDao());
    }

    @After
    public void tearDown() {
        HibernateUtil.shutdown();
    }

    @Test
    public void testSave() {

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                Peminjaman p = new Peminjaman();
                p.setTanggal_transaksi(new Date());
                assertTrue(service.save(p));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                Pengembalian p = new Pengembalian();
                p.setTanggalPengembalian(new Date());
                assertTrue(pengembalianService.save(p));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
