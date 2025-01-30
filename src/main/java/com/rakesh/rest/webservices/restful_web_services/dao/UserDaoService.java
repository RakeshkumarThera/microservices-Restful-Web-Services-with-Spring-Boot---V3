package com.rakesh.rest.webservices.restful_web_services.dao;

import com.rakesh.rest.webservices.restful_web_services.user.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(++usersCount, "Rakesh", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Reshma", LocalDate.now().minusYears(29)));
        users.add(new User(++usersCount, "Ravi", LocalDate.now().minusYears(58)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
