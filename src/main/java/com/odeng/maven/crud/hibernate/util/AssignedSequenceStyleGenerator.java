package com.odeng.maven.crud.hibernate.util;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import java.io.Serializable;

public class AssignedSequenceStyleGenerator
        extends SequenceStyleGenerator {

    public Serializable generate(SessionImplementor session,
                                 Object obj) {
        if (obj instanceof Identifiable) {
            Identifiable identifiable = (Identifiable) obj;
            Serializable id = identifiable.getId();
            if (id != null) {
                return id;
            }
        }
        return super.generate(session, obj);
    }
}
