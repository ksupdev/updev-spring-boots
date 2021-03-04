# spring-boot-simple-rest-service-v2
โดยตัวอย่างนี้จะเพิ่มในส่วนการจัดการรูปแบบ ในการ Request และ Response ของ Rest Service ของเราให้มันดูมี Pattern ที่เ้ขาใจง่ายและเป็นรูปแบบที่เป็นมาตรฐาน

### Imprement common/ApiRequest.java
เราจะใช้ Class นี้เพื่อเป็นโครงสร้างการรับข้อมูล
```
@Data
public class ApiRequest<T> {
    private T data;

}
```
โดย T จะเป็นการระบุ Object ที่จะเป็นโครงสร้างข้อมูลที่รับเข้ามา

### Implement common/ApiResponse.java
```

@Data
public class ApiResponse<T> {
    private boolean status; // false/true
    private T data;
    private String message;
    private ERRCODE errCode;

    public static <T> ApiResponse<T> success(T object) {    }

    public static <T> ApiResponse<T> success(T object, String message) {}

    public static <T> ApiResponse<T> fail(ERRCODE errCode, String message) {}

    public enum ERRCODE {
        REQUIRED, NOTEQUAL, LOWERLENGTH, OVERLENGTH, FAILED, PATTERN, MISMATCH, DUPLICATED, UNSUPPORTMEDIATYPE, UNKNOWERROR, ERROR
    };
}

```


### command
```
// Buid project with maven
mvn clean compile spring-boot:run
```
Service list
 - Get employee ``http://localhost:8089/simple-rest-v2/api/v1/simple/employees``
 ```
[
  {
    "id": 1,
    "name": "Test data",
    "role": "Developer"
  }
]
```

```
