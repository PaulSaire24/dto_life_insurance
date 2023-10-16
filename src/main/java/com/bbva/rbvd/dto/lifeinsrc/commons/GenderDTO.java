package com.bbva.rbvd.dto.lifeinsrc.commons;

import java.io.Serializable;

public class GenderDTO implements Serializable {
    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GenderDTO{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}