package com.api.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {

    int id;
    String username;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    int userStatus;
}
