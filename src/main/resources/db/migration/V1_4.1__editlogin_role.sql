ALTER TABLE login ADD CONSTRAINT id_role FOREIGN KEY(id) REFERENCES role(id);