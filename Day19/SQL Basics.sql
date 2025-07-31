-- to create database
CREATE DATABASE FullStack;

-- to use the database
USE FullStack;

-- to create the table with column name
CREATE TABLE Program(
PNo int PRIMARY KEY,
PName VARCHAR(30),
PLevel DECIMAL(2,2)
);

-- to see the structure of the created table
DESCRIBE Program;

-- to alter the table with adding the column
ALTER TABLE Program ADD PPrice int;

-- to alter the table by remove / drop the column
ALTER TABLE Program DROP PNo;

-- to alter the table with adding the column
ALTER TABLE Program ADD PNo int Primary key;

-- to rename the column in the table
ALTER TABLE Program RENAME COLUMN PPrice to Price;

-- to rename the table name 
ALTER TABLE Program RENAME ProgrammingLang;

-- to drop the table 
DROP TABLE ProgrammingLang;

-- to drop the database
DROP DATABASE fullstack;

CREATE TABLE CSE(
RNO INT PRIMARY KEY,
NAME VARCHAR(20),
CGPA DECIMAL(3, 2),
PDATE DATE,
ABC TIME,
POUT YEAR,
AANO INT UNIQUE,
GENDER VARCHAR(7) NOT NULL
);

-- to see the structure of the table
DESCRIBE CSE;

-- to insert the data into the table
INSERT INTO CSE VALUE(1,'Aishu',9.86,'2025-02-27','11:11:11','2025',123,'FEMALE');

-- to see the data from the table
SELECT * FROM CSE;

-- to insert the specific values
INSERT INTO CSE (RNO, NAME, AANO, GENDER) VALUE(5,'SivaSankar',450,'MALE');

-- to insert multiple data at a time
INSERT INTO CSE VALUE(3,'Vinu',9.96,'2025-12-25','15:01:12','2025',678,'MALE'),
                     (4,'Geetha',9.99,'2025-05-31','15:01:17','2025',569,'FEMALE');

-- to drop the column from the table
ALTER TABLE CSE DROP POUT;
ALTER TABLE CSE DROP AANO;
ALTER TABLE CSE DROP ABC;
ALTER TABLE CSE DROP PDATE;

 -- to add the column in the table
 ALTER TABLE CSE ADD DEPT VARCHAR(10);

-- to call the data in a column
SELECT * FROM CSE WHERE GENDER = 'MALE';

-- to fill the same data in a column and we should use safe mode to turn off that is 0
UPDATE CSE SET DEPT = 'IT';
SET SQL_SAFE_UPDATES = 0;

-- to fill the specific data in a column we should use safe mode to turn on that is 1
SET SQL_SAFE_UPDATES = 1;
UPDATE CSE SET DEPT='CSE' WHERE RNO=1;

-- it fill the data except the particular specified element
UPDATE CSE SET DEPT='ECE' WHERE RNO NOT IN (1) ;

-- it fill the data only it fill particular specified element
UPDATE CSE SET DEPT='CSE' WHERE RNO IN (1, 3, 5) ;

-- to delete the entire row
DELETE FROM CSE WHERE RNO=3;

-- to delete the entire values or data
TRUNCATE TABLE CSE;

-- to create a table
CREATE TABLE IT(
RNO INT,
NAME VARCHAR(100),
MARK INT
);

-- to view all the data in IT
SELECT * FROM IT;

-- to insert the value into IT Table
INSERT INTO IT VALUES(1, 'Aishu', 99), (2, 'Abi', 100),(3,'Vinu',100);

-- using the world database
USE WORLD;

-- to view the datas in the table
SELECT * FROM COUNTRY;

-- to get the count of country based on continent
SELECT CONTINENT, COUNT(CONTINENT)
FROM COUNTRY
GROUP BY CONTINENT;

-- to create a table
CREATE TABLE EMPLOYEEDATA(
EMPID INT PRIMARY KEY,
NAME VARCHAR(30),
DEPARTMENT VARCHAR(10),
SALARY int);

-- to view the datas in the table
SELECT * FROM EMPLOYEEDATA;

-- to insert the data into the table
INSERT INTO EMPLOYEEDATA VALUES(1,'Alice','HR',50000),(2,'Bob','IT',60000),(3,'Carol','IT',75000),(4,'David','Finance',70000),(5,'Eve','HR',52000);

-- to view thw data above 50000 
SELECT * FROM EMPLOYEEDATA WHERE SALARY BETWEEN 50000 AND 60000 ORDER BY SALARY;