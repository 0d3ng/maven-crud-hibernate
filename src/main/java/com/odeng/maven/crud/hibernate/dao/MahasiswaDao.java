/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 12, 2019 8:03:39 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.dao;

import com.odeng.maven.crud.hibernate.entitas.Mahasiswa;
import java.util.List;

/**
 *
 * @author od3ng
 */
public interface MahasiswaDao {

    public boolean insert(Mahasiswa m);

    public boolean update(Mahasiswa m);

    public boolean delete(Mahasiswa m);

    public Mahasiswa getMahasiswaByNim(String nim);

    public List<Mahasiswa> getAllMahasiswa();
}
