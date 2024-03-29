package com.beam.todo.ToDoDto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class LoginRequest {

    private String mailAddress;

    private String password;
}
