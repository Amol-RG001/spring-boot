package com.amol.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int userId;
    public String userName;
    private String cityName;

    private String status;
    private boolean isActive;


    public Users(int userId, String userName, String cityName, String status, boolean isActive) {
        this.userId = userId;
        this.userName = userName;
        this.cityName = cityName;
        this.status = status;
        this.isActive = isActive;
    }

    public Users() {
        super();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(boolean active) {
        isActive = active;
    }
}
