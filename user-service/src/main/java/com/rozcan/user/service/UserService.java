package com.rozcan.user.service;

import com.rozcan.user.VO.Department;
import com.rozcan.user.VO.UserWithDepartmentResponseTemplate;
import com.rozcan.user.client.DepartmentClient;
import com.rozcan.user.entity.User;
import com.rozcan.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    private DepartmentClient departmentClient;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public UserWithDepartmentResponseTemplate getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        UserWithDepartmentResponseTemplate responseTemplate =  new UserWithDepartmentResponseTemplate();
        User user = userRepository.findByUserId(userId);
        Department department = departmentClient.getDepartment(user.getDepartmentId());
        responseTemplate.setUser(user);
        responseTemplate.setDepartment(department);
        return responseTemplate;
    }
}
