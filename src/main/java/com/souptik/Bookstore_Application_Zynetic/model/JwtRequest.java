package com.souptik.Bookstore_Application_Zynetic.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtRequest {

    private String email;
    private String password;
}
