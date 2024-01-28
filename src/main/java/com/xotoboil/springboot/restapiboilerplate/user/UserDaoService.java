package com.xotoboil.springboot.restapiboilerplate.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static Integer usersCount = 0;

    static {
        users.add(new User(++usersCount, "Alberto", LocalDate.now().minusYears(19)));
        users.add(new User(++usersCount, "Mark", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "John", LocalDate.now().minusYears(48)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int userId) {
        return users.stream().filter((user) -> user.getId() == userId).findFirst().orElse(null);
    }
}
