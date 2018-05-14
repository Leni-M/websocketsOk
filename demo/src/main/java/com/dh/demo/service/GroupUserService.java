package com.dh.demo.service;

import com.dh.demo.domain.Group;
import com.dh.demo.domain.GroupUser;
import com.dh.demo.domain.User;
import com.dh.demo.repository.GroupRepository;
import com.dh.demo.repository.GroupUserRepository;
import com.dh.demo.repository.UserRepository;
import com.dh.demo.web.GroupUserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jhonny on 6/17/17.
 */
@Service
public class GroupUserService {
    @Autowired
    private GroupUserRepository groupUserRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GroupRepository groupRepository;

    public List<GroupUser> getAllGroupUsers(){
        return groupUserRepository.findAll();
    }

    public void addNewGroupUser(GroupUserController.GroupUserRequestDTO groupUserDTO) {

        User user = userRepository.findOne(groupUserDTO.getUserId());//get usser id
        Group group = groupRepository.findOne(groupUserDTO.getGroupId());//get group id
        GroupUser newGroupUser = new GroupUser();
        newGroupUser.setGroup(group);
        newGroupUser.setUser(user);
        groupUserRepository.save(newGroupUser);
    }
}
