package com.example.demo.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class CommentaireDto {
    private long id;
    private String description;
    private String date;
    private long pizzaOrigine;
    private int note;

}