package com.pablo.entity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    @Id
    @Column(name = "id")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AbstractEntity(String id) {
        this.id = id;
    }
}
