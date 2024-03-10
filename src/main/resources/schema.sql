CREATE TABLE IF NOT EXISTS student_info
(
    id             INT AUTO_INCREMENT PRIMARY KEY,
    name           VARCHAR(255),
    age            INT,
    degree         VARCHAR(255),
    branch         VARCHAR(255),
    address        VARCHAR(5000)
);
