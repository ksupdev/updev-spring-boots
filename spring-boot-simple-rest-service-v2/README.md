# spring-boot-simple-rest-service-v2
โดยตัวอย่างนี้จะเพิ่มในส่วนการจัดการรูปแบบ ในการ Request และ Response ของ Rest Service ของเราให้มันดูมี Pattern ที่เ้ขาใจง่ายและเป็นรูปแบบที่เป็นมาตรฐาน
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
