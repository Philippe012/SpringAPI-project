package com.example.springapi.Service;

import com.example.springapi.APi.Controller.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
        User user1 = new User(1, "Philippe", 21, "mugishaphilippe3@gmail.com");
        User user2 = new User(2, "Pamella", 26, "pamella@gmail.com");
        User user3 = new User(3, "Brenda", 25, "brenda@gmail.com");
        User user4 = new User(4, "Ben", 32, "ben@gmail.com");
        User user5 = new User(5, "Eva", 59, "eva@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        for (User user : userList) {
            if (id.equals(user.getId())) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
