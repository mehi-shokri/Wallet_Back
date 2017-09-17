package com.areatak.dao;


import com.areatak.entities.Device;
import com.areatak.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Payam on 9/16/2017.
 */
@Repository
public interface DeviceRepo extends CrudRepository<Device, String>{
    Device findByToken(String token);
    List<Device> findByUser(User user);
}
