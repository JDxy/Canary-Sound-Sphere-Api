package com.api.canarysoundsphereapi.model;


import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "authors")
public class Author {
    private String id;
    private String name;
    private String image;
    private int foundation_Year;
    private String music_Type;
    private String description;
    private String music_List;
}
