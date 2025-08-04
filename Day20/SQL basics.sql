-- to create the table
CREATE TABLE CSE(
RNO INT PRIMARY KEY,
NAME VARCHAR(10),
MARK INT
);

-- insert the data into the table
INSERT INTO CSE VALUES(1,'Vinu',98),(2,'Aishu',87),(3,'Abinaya',96),(4,'Geetha',100),(5,'Sivasankar',100);

-- to see the datas in the table
SELECT * FROM CSE;

-- to get the sum of all marks
SELECT SUM(MARK) FROM CSE;

-- to get the first mark from the given data
SELECT * FROM CSE WHERE MARK>90 LIMIT 1; -- it takes based on the arrangement

-- to get the average of the mark
SELECT AVG(MARK) FROM CSE;

-- to get the count of the datas present in the table
SELECT COUNT(NAME) FROM CSE;

-- to get the maximum value in the table
SELECT MAX(MARK) FROM CSE;

-- to get the minimum value in the table
SELECT MIN(MARK) FROM CSE;

-- to get the data in lower case
SELECT LCASE(NAME) FROM CSE;

-- to get the data in upper case
SELECT UCASE(NAME) FROM CSE;

-- to get the length of the character
SELECT char_length(NAME) FROM CSE;

-- to add the data with the previous data (BEFORE)
SELECT concat('HI ',NAME) FROM CSE;

-- to add the data with the previous data (AFTER)
SELECT concat(NAME, ' NICE TO MEET YOU') FROM CSE;

-- to get the current date and time
SELECT NOW();

-- to get the current time
SELECT TIME(NOW());

-- to get the current date
SELECT curdate();

-- to get the current date
SELECT DATE(NOW());

-- to get the date in different format
SELECT date_format(CURDATE(),'%M/%D/%Y');

-- to get the date in different from the current date
SELECT datediff(CURDATE(),'2004-12-25') AS MUTHAYMMAL;

-- it will print after 2 years
SELECT DATE_ADD(CURDATE(), INTERVAL 2 YEAR);

-- it will print after 2 months
SELECT DATE_ADD(CURDATE(), INTERVAL 2 MONTH);

-- it will print after 2 days
SELECT DATE_ADD(CURDATE(), INTERVAL 2 DAY);

-- we create a table
CREATE TABLE TIMESOFNOW(
a DATETIME,
b TIME);

-- insert the data into table
INSERT INTO TIMESOFNOW VALUES(NOW(), TIME(NOW()));

--  to see the data
SELECT * FROM TIMESOFNOW;

-- foreign key concept
-- create a table named OD
CREATE TABLE OD(
RNO INT PRIMARY KEY,
NAME VARCHAR(10),
DEPT VARCHAR(10)
);

-- insert the data into the table
INSERT INTO OD VALUES(1,'Vinu','CSE'),(2,'Aishu','IT'),(3,'Abi','ECE');

-- create a another table named LD
CREATE TABLE LD(
SNO INT PRIMARY KEY,
RNO INT,
NAME VARCHAR(10),
FOREIGN KEY(RNO) REFERENCES OD(RNO)
);

INSERT INTO LD VALUES(1,1,'Vinu'),(2,2,'Aishu'),(3,3,'Anu');

-- if we enter the unknown rno it gives error
INSERT INTO LD VALUES(1,1,'Vinu'),(2,2,'Aishu'),(3,4,'Anu');

SELECT * FROM OD;
SELECT * FROM LD;

-- join concept
-- inner join
-- create two tables and insert the data
CREATE TABLE PT1(
RNO INT PRIMARY KEY, 
NAME VARCHAR(10),
CNAME VARCHAR(10)
);

CREATE TABLE PT2(
SNO INT PRIMARY KEY,
CNAME VARCHAR(10),
CLOC VARCHAR(10)
);

INSERT INTO PT1 VALUES(1,'Vinu','ZOHO'),(2,'Aishu','ZOHO'),(3,'Abinaya','Kaar');

INSERT INTO PT2 VALUES(1,'ZOHO','CHENNAI'),(2,'Kaar','COVAI'),(3,'TCS','BANGALORE');

-- join concept (Inner join - it compares and print required data)
SELECT PT1.RNO, PT1.NAME, PT1.CNAME, PT2.CLOC FROM PT1 INNER JOIN PT2 ON PT1.CNAME = PT2.CNAME;

-- Right join (it prints as required data and print exceeds data that belongs to left table)
SELECT PT1.RNO, PT1.NAME, PT1.CNAME, PT2.CLOC FROM PT1 RIGHT JOIN PT2 ON PT1.CNAME = PT2.CNAME;

-- Left join (it prints as required data and print exceeds data that belongs to right table)
SELECT PT1.RNO, PT1.NAME, PT1.CNAME, PT2.CLOC FROM PT1 LEFT JOIN PT2 ON PT1.CNAME = PT2.CNAME;

-- Data Control Language
grant SELECT, INSERT ON FULLSTACK.* TO "college";
REVOKE SELECT, INSERT ON FULLSTACK.* FROM "college";
