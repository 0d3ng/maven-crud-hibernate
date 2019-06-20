/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 20, 2019 3:54:28 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.entitas.Buku;
import com.odeng.maven.crud.hibernate.entitas.Penerbit;
import com.odeng.maven.crud.hibernate.entitas.Penulis;
import com.odeng.maven.crud.hibernate.util.HibernateUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author od3ng
 */
public class BukuServiceImplTest {

    BukuService bukuService;
    PenerbitService penerbitService;
    PenulisService penulisService;

    public BukuServiceImplTest() {
    }

    @Before
    public void setUp() {
        bukuService = new BukuServiceImpl(HibernateUtil.getBukuDao());
        penerbitService = new PenerbitServiceImpl(HibernateUtil.getPenerbitDao());
        penulisService = new PenulisServiceImpl(HibernateUtil.getPenulisDao());
    }

    @After
    public void tearDown() {
        HibernateUtil.shutdown();
    }

    @Test
    public void testSave() {
        Penulis p = new Penulis("Noprianto");
        assertTrue(penulisService.save(p));
        Penerbit penerbit = new Penerbit("Andi Press");
        assertTrue(penerbitService.save(penerbit));
        Buku b = new Buku(p, penerbit, "Mengenal Framework Hibernate Java");
        assertTrue(bukuService.save(b));
    }

}
