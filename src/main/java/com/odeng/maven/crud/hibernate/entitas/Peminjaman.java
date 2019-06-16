/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 16, 2019 7:07:26 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.entitas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author od3ng
 */
@Entity
@Table
public class Peminjaman implements Serializable {

    @Id
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggal_transaksi;

    public Peminjaman() {
    }

    public Peminjaman(long id, Date tanggal_transaksi) {
        this.id = id;
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void setTanggal_transaksi(Date tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    @Override
    public String toString() {
        return "Peminjaman{" + "id=" + id + ", tanggal_transaksi=" + tanggal_transaksi + '}';
    }

}
