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
import com.odeng.maven.crud.hibernate.util.HibernateUtil;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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
        Mahasiswa m = new Mahasiswa("075410200", "Singgih Kuncoro", 2.75F, "Teknik Mesin");
        assertTrue(ms.insert(m));
    }

    @Ignore
    @Test
    public void testUpdate() {
        Mahasiswa m = new Mahasiswa("075410200", "Singgih Kuncoro Aji", 2.75F, "Teknik Mesin");
        assertTrue(ms.update(m));
    }

    @Ignore
    @Test
    public void testDelete() {
        Mahasiswa m = new Mahasiswa("075410200", "Singgih Kuncoro Aji", 2.75F, "Teknik Mesin");
        assertTrue(ms.delete(m));
    }

    @Ignore
    @Test
    public void testGetMahasiswaByNim() {
        Mahasiswa mhs = ms.getMahasiswaByNim("075410200");
        if (mhs != null) {
            System.out.println("" + mhs);
        }
        assertNotNull(mhs);
    }

    @Ignore
    @Test
    public void testGetAllMahasiswa() {
        List<Mahasiswa> allMahasiswa = ms.getAllMahasiswa();
        if (allMahasiswa != null) {
            allMahasiswa.forEach((mahasiswa) -> {
                System.out.println("" + mahasiswa);
            });
        }
        assertNotNull(allMahasiswa);
    }

}
