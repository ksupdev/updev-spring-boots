package za.updev.me.common;

import lombok.Data;

@Data
public class ApiRequest<T> {
    private T data;

}
