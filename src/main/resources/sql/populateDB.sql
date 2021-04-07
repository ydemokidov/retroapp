delete from users;
ALTER SEQUENCE users_id_seq RESTART WITH 1;
INSERT INTO users (last_name, fst_name, login, pwd, created_at) VALUES ('Ivanov','Ivan','ivan_01','123',now());
INSERT INTO users (last_name, fst_name, login, pwd, created_at) VALUES ('Petrov','Petr','petr_01','123',now());
INSERT INTO users (last_name, fst_name, login, pwd, created_at) VALUES ('Sergeev','Sergey','serg_01','123',now());