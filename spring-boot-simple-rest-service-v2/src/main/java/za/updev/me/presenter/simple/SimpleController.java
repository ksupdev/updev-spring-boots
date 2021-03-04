package za.updev.me.presenter.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.updev.me.presenter.entities.EmployeeResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/simple")
public class SimpleController {

    @GetMapping("/employees")
    List<EmployeeResponse> all() {
        EmployeeResponse response = new EmployeeResponse();
        response.setId(1);
        response.setName("Test data");
        response.setRole("Developer");

        List<EmployeeResponse> results = new ArrayList<>();
        results.add(response);
        return results;
    }

}
