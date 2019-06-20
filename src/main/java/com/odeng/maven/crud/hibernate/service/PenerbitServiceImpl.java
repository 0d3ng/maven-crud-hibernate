/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 20, 2019 3:42:27 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.dao.PenerbitDao;
import com.odeng.maven.crud.hibernate.entitas.Penerbit;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class PenerbitServiceImpl implements PenerbitService{

    private final PenerbitDao dao;

    public PenerbitServiceImpl(PenerbitDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Penerbit o) {
        return dao.save(o);
    }

    @Override
    public boolean update(Penerbit o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Penerbit o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Penerbit> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
