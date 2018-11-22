package click.botay.japan.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "role")
public class RoleEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleid;
    @Column(name = "title")
    private Integer title;
    @OneToMany(mappedBy = "roleEntity", fetch = FetchType.LAZY)
    List<LoginEntity> userList;

    public long getId() {
        return roleid;
    }

    public void setId(long id) {
        this.roleid = id;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public List<LoginEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<LoginEntity> userList) {
        this.userList = userList;
    }
}
