package com.dh.demo.domain;

import javax.persistence.*;

/**
 * Created by jhonny on 6/17/17.
 */
@Entity
public class GroupUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Group group;

    public void setId(long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Group getGroup() {
        return group;
    }
}
