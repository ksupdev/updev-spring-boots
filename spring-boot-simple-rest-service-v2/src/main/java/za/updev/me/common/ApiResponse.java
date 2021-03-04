package za.updev.me.common;

import lombok.Data;

@Data
public class ApiResponse<T> {
    private boolean status; // false/true
    private T data;
    private String message;
    private ERRCODE errCode;

    public static <T> ApiResponse<T> success(T object) {
        ApiResponse<T> resp = new ApiResponse<T>();
        resp.setData(object);
        resp.setStatus(Boolean.TRUE);
        return resp;
    }

    public static <T> ApiResponse<T> success(T object, String message) {
        ApiResponse<T> resp = new ApiResponse<T>();
        resp.setData(object);
        resp.setStatus(Boolean.TRUE);
        resp.setMessage(message);
        return resp;
    }

    public static <T> ApiResponse<T> fail(ERRCODE errCode, String message) {
        ApiResponse<T> resp = new ApiResponse<T>();
        resp.setData(null);
        resp.setErrCode(errCode);
        resp.setMessage(message);
        resp.setStatus(Boolean.FALSE);
        return resp;
    }

    public enum ERRCODE {
        REQUIRED, NOTEQUAL, LOWERLENGTH, OVERLENGTH, FAILED, PATTERN, MISMATCH, DUPLICATED, UNSUPPORTMEDIATYPE, UNKNOWERROR, ERROR
    };
}
