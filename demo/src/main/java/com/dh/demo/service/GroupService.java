package com.dh.demo.service;

import com.dh.demo.domain.Group;
import com.dh.demo.domain.User;
import com.dh.demo.repository.GroupRepository;
import com.dh.demo.repository.UserRepository;
import com.dh.demo.web.GroupController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jhonny on 6/17/17.
 */
@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private UserRepository userRepository;
    public List<Group> getAllGroups(){
        return (List<Group>) groupRepository.findAll();
    }

    public void addNewGroup(GroupController.GroupRequestDTO newGroupDTO){
        Group newGroup = new Group();

        newGroup.setCreation_date(newGroupDTO.getCreation_date());
        newGroup.setLogo(newGroupDTO.getLogo());
        newGroup.setName(newGroupDTO.getName());
        User user = userRepository.findOne(newGroupDTO.getOwnerId());
        newGroup.setOwner(user);

        groupRepository.save(newGroup);
    }
}
