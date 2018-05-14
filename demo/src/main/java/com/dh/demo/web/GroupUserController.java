package com.dh.demo.web;

import com.dh.demo.domain.GroupUser;
import com.dh.demo.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jhonny on 6/17/17.
 */
@RestController
@RequestMapping("/groupUsers")
public class GroupUserController {
    @Autowired
    private GroupUserService groupUserService;

    @RequestMapping(method = RequestMethod.GET)
    public List<GroupUser> getAllGroupUsers(){
        return groupUserService.getAllGroupUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewUserGroup(@RequestBody GroupUserRequestDTO groupUserDTO){
        groupUserService.addNewGroupUser(groupUserDTO);
    }

    public static class GroupUserRequestDTO{
        private Long userId;
        private Long groupId;

        public Long getUserId() {
            return userId;
        }

        public Long getGroupId() {
            return groupId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public void setGroupId(Long groupId) {
            this.groupId = groupId;
        }
    }
}
