package com.task.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String email;
    private String contact;
    private Date expirationDate;
    private String description;
    private Integer timeout;
    private String datetimeFormat;

    @ElementCollection
    private List<String> roleNameList;

    @ElementCollection
    private List<String> scopeNameList;

    private String primaryGroupName;

    @ElementCollection
    private List<String> secondaryGroupNameList;
    private String language;
    private String organization;
    private String timeZone;
    private String memo;
}

