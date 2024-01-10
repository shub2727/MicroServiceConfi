package com.example.com.microServiceProject.Entity;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Hotel {
    private Integer id;
    private String name;
    private String location;
    private String about;
}
