package com.wl.lesson01;

import com.wl.util.Property;
import com.wl.util.Table;

@Table(name="t_user")
public class User {

    @Property(name="t_id",len=11)
    private int id;
    @Property(name="t_username",len=50)
    private String name;
    @Property(name="t_password",len=50)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
