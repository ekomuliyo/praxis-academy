-- membuat database
create database  testDB;

-- menghapus database
drop database testDB;

-- memilih database
use testDB;

-- membuat table
CREATE TABLE CUSTOMERS(
    ID INT NOT NULL,
    NAME VARCHAR (20)NOT NULL,
    AGE INT NOT NULL,
    ADDRESS CHAR (25),
    SALARY DECIMAL (18, 2),
    PRIMARY KEY (ID)
);

-- menampilkan deskripsi table
DESC CUSTOMERS;

-- menghapus tabel
DROP TABLE CUSTOMERS;

-- Insert / memasukan data
INSERT INTO CUSTOMERS (ID, NAME, AGE, ADDRESS, SALARY) VALUES (1, 'Ramesh', 32, 'Ahmadabad', 2000.00);
INSERT INTO CUSTOMERS (ID, NAME, AGE, ADDRESS, SALARY) VALUES (2, 'Khilan', 25, 'Delhi', 1500.00);
INSERT INTO CUSTOMERS (ID, NAME, AGE, ADDRESS, SALARY) VALUES (3, 'Eko', 25, 'Indonesia', 2500.00);
INSERT INTO CUSTOMERS (ID, NAME, AGE, ADDRESS, SALARY) VALUES (4, 'Muliyo', 23, 'Palembang', 3000.00);
INSERT INTO CUSTOMERS VALUES (5, 'Andi', 21, 'Palembang', 5000.00);

-- meng copy seluruh isi table ke table yang lain

-- 1. membuat database yang bakal diisi dari copy
CREATE TABLE CUSTOMERS_2( ID INT NOT NULL, NAME VARCHAR (20)NOT NULL, AGE INT NOT NULL, ADDRESS CHAR (25), SALARY DECIMAL (18, 2), PRIMARY KEY (ID) );

-- 2. copy data dari tabel CUSTOMERS ke table CUSTOMERS_2
INSERT INTO CUSTOMERS_2 (ID, NAME, AGE, ADDRESS, SALARY) SELECT CUSTOMERS.ID, CUSTOMERS.NAME, CUSTOMERS.AGE, CUSTOMERS.ADDRESS, CUSTOMERS.SALARY FROM CUSTOMERS;


-- SELECT / Menampilkan seluruh data tabel CUSTOMERS dan CUSTOMERS_2
SELECT ID, NAME, SALARY FROM CUSTOMERS;

SELECT * FROM CUSTOMERS_2;

-- WHERE CLAUSE
SELECT * FROM CUSTOMERS WHERE SALARY > 2500;
SELECT * FROM CUSTOMERS WHERE SALARY > 2500 AND AGE < 23;
SELECT * FROM CUSTOMERS WHERE SALARY > 2500 OR AGE < 23;

-- UPDATE, mengubah data
UPDATE CUSTOMERS SET ADDRESS = 'Indonesia' Where ID = 1
UPDATE CUSTOMERS SET ADDRESS = 'Indonesia', SALARY = 10000.00;

-- DELETE, menghapus data
DELETE FROM CUSTOMERS WHERE ID = 1;

-- LIKE CLAUSE, mencari data dengan kriteria terntentu, dengan memliki 2 ciri berikut
-- (%) persen dan (_) underscore
-- persen (%) mencari data yang terdapat huruf apapun yang terkandung didalamnya dimana persen diletakan
-- underscore (_) mirip seperti persen namun dia lebih spesifik pada posisi index karakter yang ditentukan

-- mencari data dengan nama yang di ujung karakter terdapat huruf o
SELECT * FROM CUSTOMERS WHERE NAME LIKE '%o'; 

-- LIMIT, membatasi jumlah query
 SELECT * FROM CUSTOMERS LIMIT 2;

-- ORDER BY, mengurutkan data dengan Sorting ASC, DESC
SELECT * FROM CUSTOMERS ORDER BY NAME ASC;
SELECT * FROM CUSTOMERS ORDER BY NAME DESC;

-- GROUP BY, menghindari nilai yang sama, dan kita bisa menambahkan fungsi lain seperti (MAX, MIN, SUM, COUNT)
SELECT NAME, SUM(SALARY) AS TOTAL_SALAY FROM CUSTOMERS GROUP BY NAME;

-- DISTINCT, sama seperti GROUP BY, namun tidak dapat menambahkan fungsi (MAX, MIN, SUM, COUNT)
SELECT DISTINCT SALARY FROM CUSTOMERS ORDER BY SALARY;

