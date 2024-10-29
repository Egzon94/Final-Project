package com.activity.finalprojecttradingjournal.Demo;


import com.activity.finalprojecttradingjournal.Service.impl.RoleService;
import com.activity.finalprojecttradingjournal.Service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor

public class DataLoader implements ComandLineRunner {

    private final UserService userService;
    private final RoleService roleService;

}
