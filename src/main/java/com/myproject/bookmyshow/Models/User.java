package com.myproject.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
    private List<Booking> bookings;
}
