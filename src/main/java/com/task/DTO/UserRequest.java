package com.task.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Default;

import java.util.Date;
import java.util.List;

@Data
public class UserRequest {

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "First name is required")
    private String firstName;

    private String middleName;
    private String lastName;

    @NotBlank(message = "Password is required")
    @Pattern(regexp = "^[^!@#$%^&*()]+$", message = "Password contains invalid characters")
    private String password;

    @Email(message = "Email should be valid")
    private String email;
//    @Default()
//    private String isPasswordReset;
    private String contact;
    private Date expirationDate;
    private String description;

    @Min(0)
    private Integer timeout;

    private String datetimeFormat;

    private List<String> roleNameList;
    private List<String> scopeNameList;

    @NotBlank(message = "Primary group name is required")
    private String primaryGroupName;

    private List<String> secondaryGroupNameList;
    private String language;
    private String organization;
    private String timeZone;
    private String memo;
}
