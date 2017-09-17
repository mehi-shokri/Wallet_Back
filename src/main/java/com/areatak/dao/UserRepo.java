package com.areatak.dao;

import com.areatak.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Payam on 9/16/2017.
 */
@Repository
public interface UserRepo extends CrudRepository<User, String>,PagingAndSortingRepository<User, String> {
    User findByEmail(String email);
    User findByMobile(String mobile);
}
