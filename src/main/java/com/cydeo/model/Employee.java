package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee {

        @NotBlank
@Size(max = 12,min = 2)
    private String firstName;
    private String lastName;
@NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
@NotNull
@Email
private String email;
@NotBlank
@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z].{4,})")
private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

}
