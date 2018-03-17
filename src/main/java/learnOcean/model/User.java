package learnOcean.model;

import java.util.Date;

public class User {

    private Long id;


    private String username;


    private String password;


    private String salt;

    private String email;


    private Short authority;


    private Date time;


    private Date modifiedTime;


    private Byte sex;


    private String profile;

    private String school;


    private String major;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public String getSalt() {
        return salt;
    }


    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }


    public Short getAuthority() {
        return authority;
    }


    public void setAuthority(Short authority) {
        this.authority = authority;
    }


    public Date getTime() {
        return time;
    }


    public void setTime(Date time) {
        this.time = time;
    }


    public Date getModifiedTime() {
        return modifiedTime;
    }


    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }


    public Byte getSex() {
        return sex;
    }


    public void setSex(Byte sex) {
        this.sex = sex;
    }


    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }


    public String getSchool() {
        return school;
    }


    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }


    public String getMajor() {
        return major;
    }


    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }
}