package com.webApi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NameDTO {
    @JsonProperty
    private String name;

    public NameDTO(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
