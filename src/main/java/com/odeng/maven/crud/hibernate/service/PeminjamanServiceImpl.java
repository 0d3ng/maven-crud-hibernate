/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 16, 2019 7:41:42 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.service;

import com.odeng.maven.crud.hibernate.dao.PeminjamanDao;
import com.odeng.maven.crud.hibernate.entitas.Peminjaman;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class PeminjamanServiceImpl implements PeminjamanService {

    private final PeminjamanDao peminjamanDao;

    public PeminjamanServiceImpl(PeminjamanDao peminjamanDao) {
        this.peminjamanDao = peminjamanDao;
    }

    @Override
    public boolean save(Peminjaman o) {
        return peminjamanDao.save(o);
    }

    @Override
    public boolean update(Peminjaman o) {
        return peminjamanDao.update(o);
    }

    @Override
    public boolean delete(Peminjaman o) {
        return peminjamanDao.delete(o);
    }

    @Override
    public List<Peminjaman> getAll() {
        return peminjamanDao.getAll();
    }

}
