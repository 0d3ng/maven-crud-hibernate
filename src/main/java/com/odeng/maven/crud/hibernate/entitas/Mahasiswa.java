/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 12, 2019 1:39:22 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.entitas;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author od3ng
 */
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa implements Serializable {

    @EmbeddedId
    private MahasiswaPK mhs_pk;
    @Column(name = "nama", nullable = false, length = 50)
    private String nama;
    @Column(name = "ipk", nullable = false, length = 4)
    private float ipk;
    @Column(name = "jurusan", nullable = false, length = 50)
    private String jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(MahasiswaPK mhs_pk, String nama, float ipk, String jurusan) {
        this.mhs_pk = mhs_pk;
        this.nama = nama;
        this.ipk = ipk;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public MahasiswaPK getMhs_pk() {
        return mhs_pk;
    }

    public void setMhs_pk(MahasiswaPK mhs_pk) {
        this.mhs_pk = mhs_pk;
    }

}
