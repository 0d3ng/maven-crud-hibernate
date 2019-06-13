/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 12, 2019 8:30:34 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.dao.MahasiswaDao;
import com.odeng.maven.crud.hibernate.entitas.Mahasiswa;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class MahasiswaServiceImpl implements MahasiswaService{

    private final MahasiswaDao dao;

    public MahasiswaServiceImpl(MahasiswaDao dao) {
        this.dao = dao;
    }
    
    @Override
    public boolean insert(Mahasiswa m) {
        return dao.insert(m);
    }

    @Override
    public boolean update(Mahasiswa m) {
        return dao.update(m);
    }

    @Override
    public boolean delete(Mahasiswa m) {
        return dao.delete(m);
    }

    @Override
    public Mahasiswa getMahasiswaByNim(String nim) {
        return dao.getMahasiswaByNim(nim);
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        return dao.getAllMahasiswa();
    }
    
}
