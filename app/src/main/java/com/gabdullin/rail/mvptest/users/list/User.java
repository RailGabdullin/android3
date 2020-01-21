package com.gabdullin.rail.mvptest.users.list;

import java.util.Objects;

public class User {

    public User(long id, String name, String userName, String profileURL, String avatarURL) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.profileURL = profileURL;
        this.avatarURL = avatarURL;
    }

    private long id;
    private String name;
    private String userName;
    private String profileURL;
    private String avatarURL;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(profileURL, user.profileURL) &&
                Objects.equals(avatarURL, user.avatarURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userName, profileURL, avatarURL);
    }
}
