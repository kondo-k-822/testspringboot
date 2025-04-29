CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- サンプルデータの挿入
INSERT INTO users (name, email, username, password) VALUES
('John Doe', 'john.doe@example.com', 'johndoe', '$2a$08$gko8IyKOZkdhK6B2DpwPqeHHwZj6hCE1a.As1Y0QXh2gsoXJHFn/W'), -- bcryptハッシュ　password123
('Jane Smith', 'jane.smith@example.com', 'janesmith', '$2a$08$gko8IyKOZkdhK6B2DpwPqeHHwZj6hCE1a.As1Y0QXh2gsoXJHFn/W');