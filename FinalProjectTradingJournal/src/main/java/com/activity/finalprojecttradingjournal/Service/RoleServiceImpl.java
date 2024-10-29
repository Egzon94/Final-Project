package com.activity.finalprojecttradingjournal.Service;


import com.activity.finalprojecttradingjournal.Model.Role;
import com.activity.finalprojecttradingjournal.Model.User;
import com.activity.finalprojecttradingjournal.Repository.RoleRepository;
import com.activity.finalprojecttradingjournal.Repository.UserRepository;
import com.activity.finalprojecttradingjournal.Service.impl.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    private final UserRepository userRepository;

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
       log.info("Adding role {} to user {}", roleName, username);
       

       User user = userRepository.findByUsername(username);
       Role role = roleRepository.findByName(roleName);

       user.getRoles().add(role);
       userRepository.save(user);

   }
}