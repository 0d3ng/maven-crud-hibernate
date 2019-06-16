/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 16, 2019 9:06:47 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.dao.PengembalianDao;
import com.odeng.maven.crud.hibernate.entitas.Pengembalian;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class PengembalianServiceImpl implements PengembalianService{
private final PengembalianDao dao;

    public PengembalianServiceImpl(PengembalianDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Pengembalian o) {
        return dao.save(o);
    }

    @Override
    public boolean update(Pengembalian o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Pengembalian o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pengembalian> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
