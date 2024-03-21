package com.api.canarysoundsphereapi.DTO;

import lombok.Data;

@Data
public class EventDTO {
    private String _id;
    private String logo;
    private String image;
    private String name;
    private String date;
    private String time;
    private int capacity;
    private String description;
    private String direction;
    private String marker;
    private String ticket_store;
}

