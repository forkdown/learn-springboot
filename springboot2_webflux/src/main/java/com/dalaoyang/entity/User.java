package com.dalaoyang.entity;

/**
 * @author dalaoyang
 * @project springboot_learn
 * @package com.dalaoyang.entity
 * @email yangyang@dalaoyang.cn
 * @date 2018/8/8
 */
public class User {
    private int id;
    private String name;

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

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }
}
