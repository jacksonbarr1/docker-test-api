CREATE USER 'root'@'%' IDENTIFIED BY 'root';
CREATE DATABASE customer_db;
GRANT ALL PRIVILEGES ON customer_db.* TO 'root'@'%';