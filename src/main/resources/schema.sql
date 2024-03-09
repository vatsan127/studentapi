CREATE TABLE IF NOT EXISTS professor_info (
professor_id INT AUTO_INCREMENT PRIMARY KEY,
professor_name VARCHAR(255),
professor_domain VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS student_info (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
age INT,
degree VARCHAR(255),
branch VARCHAR(255),
address varchar(5000),
class_incharge INT,
FOREIGN KEY (class_incharge) REFERENCES professor_info(professor_id)
);
