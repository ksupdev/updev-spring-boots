package za.updev.me.presenter.simple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.updev.me.common.ApiResponse;
import za.updev.me.presenter.entities.EmployeeResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/simple")
public class SimpleController {

    @GetMapping("/employees")
    ResponseEntity<Object> all() {
        EmployeeResponse response = new EmployeeResponse();
        response.setId(1);
        response.setName("Test data");
        response.setRole("Developer");
        List<EmployeeResponse> results = new ArrayList<>();
        results.add(response);
        ApiResponse<List<EmployeeResponse>> data = ApiResponse.success(results,"Query success");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/employee")
    ResponseEntity<Object> single() {
        EmployeeResponse response = new EmployeeResponse();
        response.setId(1);
        response.setName("Test data");
        response.setRole("Developer");
        ApiResponse<EmployeeResponse> data = ApiResponse.success(response,"Query success");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
