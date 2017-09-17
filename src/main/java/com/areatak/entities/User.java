package com.areatak.entities;

import com.areatak.common.entities.BaseEntity;
import com.areatak.metadata.UserStatus;

import javax.persistence.*;

/**
 * Created by Payam on 9/16/2017.
 */
@Entity
@Table(name = "User")
public class User extends BaseEntity {
    @Column(unique = true)
    public String mobile;

    @Column(nullable = true)
    public String email;

    @Column(nullable = true)
    public String firstName;

    @Column(nullable = true)
    public String lastName;

    @Column(nullable = true)
    public String address;

    @Column(nullable = true)
    public boolean verifiedMobile;

    @Column(nullable = true)
    public boolean verifiedEmail;

    @Column(nullable = true)
    public boolean verifiedAddress;

    @Enumerated(EnumType.ORDINAL)
    public UserStatus status;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isVerifiedMobile() {
        return verifiedMobile;
    }

    public void setVerifiedMobile(boolean verifiedMobile) {
        this.verifiedMobile = verifiedMobile;
    }

    public boolean isVerifiedEmail() {
        return verifiedEmail;
    }

    public void setVerifiedEmail(boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }

    public boolean isVerifiedAddress() {
        return verifiedAddress;
    }

    public void setVerifiedAddress(boolean verifiedAddress) {
        this.verifiedAddress = verifiedAddress;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
