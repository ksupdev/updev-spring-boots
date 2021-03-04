package za.updev.me.presenter.entities;


import lombok.Data;
import lombok.Value;
@Data
public class EmployeeResponse {
    private long id;
    private String name;
    private String role;
}
