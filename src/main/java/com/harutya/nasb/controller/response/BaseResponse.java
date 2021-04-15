package com.harutya.nasb.controller.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@EqualsAndHashCode
@NoArgsConstructor
public class BaseResponse<T> implements Serializable {

    private Integer code;

    private T data;

    private String message;

    public static <T> BaseResponse<T> success(T data,String message){
        BaseResponse<T> baseResponse = new BaseResponse<>();
        baseResponse.setCode(200);
        baseResponse.setData(data);
        baseResponse.setMessage(message);
        return baseResponse;
    }
}
