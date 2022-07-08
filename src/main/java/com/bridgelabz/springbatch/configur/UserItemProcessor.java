package com.bridgelabz.springbatch.configur;

import com.bridgelabz.springbatch.model.User;
import org.springframework.batch.item.ItemProcessor;


public class UserItemProcessor implements ItemProcessor<User, User> {
    @Override
    public User process (User user) throws Exception {
        return user;
    }
}
