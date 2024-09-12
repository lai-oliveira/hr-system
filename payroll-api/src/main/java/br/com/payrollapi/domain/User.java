package br.com.payrollapi.domain;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String nome;
    private String email;
    private String password;
    private Double hourlyPrice;


}
