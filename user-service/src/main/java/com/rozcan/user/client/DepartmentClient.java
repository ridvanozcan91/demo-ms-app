package com.rozcan.user.client;

import com.rozcan.user.VO.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("DEPARTMENT-SERVICE")
public interface DepartmentClient {

    @RequestMapping(method = RequestMethod.GET, value = "/departments/{id}")
    Department getDepartment(@PathVariable("id") Long departmentId);
}
