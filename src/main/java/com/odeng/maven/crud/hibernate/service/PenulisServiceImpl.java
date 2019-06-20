/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 20, 2019 3:32:34 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.dao.PenulisDao;
import com.odeng.maven.crud.hibernate.entitas.Penulis;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class PenulisServiceImpl implements PenulisService{

    private final PenulisDao dao;

    public PenulisServiceImpl(PenulisDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Penulis o) {
        return dao.save(o);
    }

    @Override
    public boolean update(Penulis o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Penulis o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Penulis> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
