package com.pravasi.pravasigigsmanagement.service;

import com.pravasi.pravasigigsmanagement.dto.UserDto;
import com.pravasi.pravasigigsmanagement.model.Gig;
import com.pravasi.pravasigigsmanagement.repositories.GigRepository;
import com.pravasi.pravasigigsmanagement.resources.UserServiceResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GigService {

    @Autowired
    private UserServiceResource userResource;

    @Autowired
    private GigRepository gigRepository;

    public List<Gig> findAll() {
        return gigRepository.findAll();
    }

    public List<Gig> findByDriver(Long driverId) {
        UserDto currentUser = userResource.findAllByDriverId(driverId);
        return gigRepository.findByUserId(currentUser.getId());
    }
}
