package com.dh.demo.web;

import com.dh.demo.domain.Group;
import com.dh.demo.domain.User;
import com.dh.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by jhonny on 6/17/17.
 */
@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Group> getAllGroups(){
        return groupService.getAllGroups();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewGroup(@RequestBody GroupRequestDTO newGroupDTO){
        groupService.addNewGroup(newGroupDTO);
    }

    public static class GroupRequestDTO{
        private long ownerId;
        private String logo;
        private String name;
        private Date creation_date;

        public void setOwnerId(long ownerId) {
            this.ownerId = ownerId;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCreation_date(Date creation_date) {
            this.creation_date = creation_date;
        }

        public long getOwnerId() {
            return ownerId;
        }

        public String getLogo() {
            return logo;
        }

        public String getName() {
            return name;
        }

        public Date getCreation_date() {
            return creation_date;
        }
    }
}
