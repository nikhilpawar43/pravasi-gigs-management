package com.pravasi.pravasigigsmanagement.resources;

import com.pravasi.pravasigigsmanagement.dto.UserDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pravasi-user-management")
@RibbonClient(name = "pravasi-user-management")
public interface UserServiceResource {

    @GetMapping(value = "/users/driver/{driverId}")
    UserDto findAllByDriverId(@PathVariable("driverId") Long driverId);
}
