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
