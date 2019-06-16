/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 16, 2019 9:01:00 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.entitas;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author od3ng
 */
@Entity
@Table
public class Pengembalian implements Serializable {

    @Id
    @GeneratedValue
    private UUID id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date tanggalPengembalian;

    public Pengembalian() {
    }

    public Pengembalian(UUID id, Date tanggalPengembalian) {
        this.id = id;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    @Override
    public String toString() {
        return "Pengembalian{" + "id=" + id + ", tanggalPengembalian=" + tanggalPengembalian + '}';
    }

}
