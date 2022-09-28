package com.example.springbatchexample.batch;

import com.example.springbatchexample.model.User;
import com.example.springbatchexample.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DBWriter implements ItemWriter<User> {
    @Autowired
    private UserRepository userRepository;
    private User users;

    @Override
    public void write(List<? extends User> list) throws Exception {
        System.out.println("Data Saves for Users:  " +users);
        userRepository.save(users);

    }
}
