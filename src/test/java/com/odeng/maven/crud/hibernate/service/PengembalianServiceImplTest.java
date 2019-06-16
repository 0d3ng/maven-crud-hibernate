/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 16, 2019 9:07:57 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.entitas.Pengembalian;
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
public class PengembalianServiceImplTest {
    
    PengembalianService service;
    
    @Before
    public void setUp() {
        service=new PengembalianServiceImpl(HibernateUtil.getPengembalianDao());
    }
    
    @After
    public void tearDown() {
        HibernateUtil.shutdown();
    }

    @Test
    public void testSave() {
        Pengembalian p = new Pengembalian();
        p.setTanggalPengembalian(new Date());
        assertTrue(service.save(p));
    }
    
}
