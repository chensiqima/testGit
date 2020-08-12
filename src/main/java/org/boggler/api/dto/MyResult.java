package org.boggler.api.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyResult<T> {
    private Integer code;
    private String msg;
    private T data ;

    public MyResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
