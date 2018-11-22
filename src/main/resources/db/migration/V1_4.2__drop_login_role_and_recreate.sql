drop TABLE login;
drop table role;
CREATE TABLE role (
    roleid INT(11) NOT NULL PRIMARY KEY,
    title INT(11) NOT NULL
);

CREATE TABLE Users(
    userid INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL ,
    password VARCHAR (50) NOT NULL ,
    roleid INT(11),
    CONSTRAINT fk_group FOREIGN KEY (roleid) REFERENCES role(roleid)
);