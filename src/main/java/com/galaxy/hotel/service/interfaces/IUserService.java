package com.galaxy.hotel.service.interfaces;


import com.galaxy.hotel.dto.LoginRequest;
import com.galaxy.hotel.dto.Response;
import com.galaxy.hotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}