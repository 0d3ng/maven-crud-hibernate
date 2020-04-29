package com.odeng.maven.crud.hibernate.util;

import java.io.Serializable;

public interface Identifiable<T extends Serializable> {
    T getId();
}
