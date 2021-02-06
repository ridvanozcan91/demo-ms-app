package com.rozcan.user.VO;

import com.rozcan.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithDepartmentResponseTemplate {

    private User user;
    private Department department;
}
