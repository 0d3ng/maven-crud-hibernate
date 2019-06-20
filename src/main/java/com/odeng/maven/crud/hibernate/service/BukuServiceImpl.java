/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 20, 2019 3:37:40 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.dao.BukuDao;
import com.odeng.maven.crud.hibernate.entitas.Buku;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class BukuServiceImpl implements BukuService {

    private final BukuDao dao;

    public BukuServiceImpl(BukuDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Buku o) {
        return dao.save(o);
    }

    @Override
    public boolean update(Buku o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Buku o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Buku> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
