package com.api.canarysoundsphereapi.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "admins")
public class Admin {
    private String id;
    private String name;
    private String password;
}
