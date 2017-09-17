package com.areatak.controller;

import com.areatak.dao.UserRepo;
import com.areatak.entities.User;
import com.areatak.sms.SmsHandler;
import com.areatak.util.Logger;
import org.apache.commons.collections4.map.LRUMap;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Payam on 9/16/2017.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private SmsHandler smsHandler;
    public static LRUMap<String, Object> verifyMobile = new LRUMap<>(5000);

    @RequestMapping(method = RequestMethod.POST, value = "/sendVerificationCode", produces = "application/json; charset=utf-8")
    public ResponseEntity<HashMap<String, Serializable>> sendVerificationCode(@RequestParam(name = "mobile") String mobile) {
        if (StringUtils.isEmpty(mobile)) {
            Logger.info("UserController", "sendVerificationCode", "mobile", "mobile is empty");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        String verificationCode = String.valueOf(100000 + new Random().nextInt(900000));
        if (verifyMobile.containsValue(mobile)) {
            verifyMobile.values().remove(mobile);
        }
        verifyMobile.put(verificationCode, mobile);
        smsHandler.sendSms(mobile, verificationCode);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/verifyMobile", produces = "application/json; charset=utf-8")
    public ResponseEntity<HashMap<String, Serializable>> verifyMobile(@RequestParam(name = "verificationCode") String verificationCode) {
        if (StringUtils.isEmpty(verificationCode)) {
            Logger.info("UserController", "verifyMobile", "verificationCode", "verificationCode is empty");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        String mobile = (String) verifyMobile.remove(verificationCode);
        if (mobile == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            User user = new User();
            user.mobile = mobile;
            user.verifiedMobile = true;
            userRepo.save(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
