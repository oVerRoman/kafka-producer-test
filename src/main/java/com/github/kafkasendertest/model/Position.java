package com.github.kafkasendertest.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Position {

    private String name;
    private Double experience;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate hireDate;
}
