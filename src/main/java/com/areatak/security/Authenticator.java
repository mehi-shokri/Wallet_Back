package com.areatak.security;

import com.areatak.common.exception.AuthException;
import com.areatak.dao.DeviceRepo;
import com.areatak.entities.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * Created by Payam on 9/16/2017.
 */
@Component
@Scope("singleton")
public class Authenticator {
    @Autowired
    DeviceRepo deviceRepo;
    public Device validate(String token) throws AuthException {
        Device device = deviceRepo.findByToken(token);
        if (device == null)
            throw new AuthException();
        else {
            return device;
        }
    }
}
