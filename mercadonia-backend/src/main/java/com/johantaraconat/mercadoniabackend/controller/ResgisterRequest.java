package com.johantaraconat.mercadoniabackend.controller;

import com.johantaraconat.mercadoniabackend.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResgisterRequest {
    private String username;
    private String email;
    private String password;
    private Role role;
}
