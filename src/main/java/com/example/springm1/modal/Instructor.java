package com.example.springm1.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
    private String firstName;
    private String lastName;
    private String title;
    private String office;
}
