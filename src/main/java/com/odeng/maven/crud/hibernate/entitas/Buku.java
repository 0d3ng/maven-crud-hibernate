/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 20, 2019 2:51:22 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.entitas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author od3ng
 */
@Entity
@Table(name = "buku")
public class Buku implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Penulis penulis;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Penerbit penerbit;
    @Id
    private String judul;

    public Buku() {
    }

    public Buku(Penulis penulis, Penerbit penerbit, String judul) {
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.judul = judul;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }

    public Penerbit getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(Penerbit penerbit) {
        this.penerbit = penerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
}
