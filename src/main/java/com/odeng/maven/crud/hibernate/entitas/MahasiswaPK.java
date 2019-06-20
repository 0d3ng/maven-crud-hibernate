/*
 * maven-crud-hibernate

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 20, 2019 1:20:09 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.hibernate.entitas;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author od3ng
 */
@Embeddable
public class MahasiswaPK implements Serializable {

    private String nim;
    private String no_telf;

    public MahasiswaPK() {
    }

    public MahasiswaPK(String nim, String no_telf) {
        this.nim = nim;
        this.no_telf = no_telf;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNo_telf() {
        return no_telf;
    }

    public void setNo_telf(String no_telf) {
        this.no_telf = no_telf;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nim);
        hash = 37 * hash + Objects.hashCode(this.no_telf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MahasiswaPK other = (MahasiswaPK) obj;
        if (!Objects.equals(this.nim, other.nim)) {
            return false;
        }
        if (!Objects.equals(this.no_telf, other.no_telf)) {
            return false;
        }
        return true;
    }

}
