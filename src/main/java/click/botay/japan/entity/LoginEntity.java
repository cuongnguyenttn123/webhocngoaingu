package click.botay.japan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.management.relation.Role;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "users")
public class LoginEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userid;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;
    @ManyToOne
    @JoinColumn(name = "roleid")
    @JsonIgnore
    private RoleEntity roleEntity;

    @Column(name = "session")
    private String session;
    @Column(name = "timelog")
    private Timestamp timeStamp;

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }



    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", roleEntity=" + roleEntity +
                '}';
    }
}
