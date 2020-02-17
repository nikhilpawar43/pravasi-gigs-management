package com.pravasi.pravasigigsmanagement.controllers;

import com.pravasi.pravasigigsmanagement.model.Gig;
import com.pravasi.pravasigigsmanagement.service.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gigs")
public class GigsController {

    @Autowired
    private GigService gigService;

    @GetMapping(value = "/driver/{driverId}")
    public List<Gig> findByUserId(@PathVariable("driverId") Long driverId) {
        return gigService.findByDriver(driverId);
    }

    @GetMapping(value = "/feign/driver/{driverId}")
    public List<Gig> findByUserIdWithFeigh(@PathVariable("driverId") Long driverId) {
        return gigService.findByDriver(driverId);
    }

    @GetMapping("/")
    public List<Gig> findAll() {
        return gigService.findAll();
    }
}
