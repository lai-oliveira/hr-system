package br.com.userapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandardError {
    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;

}
