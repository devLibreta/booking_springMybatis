CREATE TABLE userinfo (userid VARCHAR(20) Primary KEY, password VARCHAR(20) NOT NULL);

INSERT INTO userinfo (userid, password)
values ('logo', 1234), ('usuu', 1233), ('lotto',5452),
 ('human',12354),('pineapple',5453),('rumor',123541), ('apple',5454),
 ('easy',12354), ('bbad',5452), ('agood',12354),('farmer',5452),
 ('fisher',12354);

CREATE TABLE record(
    recordId bigint auto_increment Primary key,
    recordType VARCHAR(20) NOT NULL,
    recordTitle VARCHAR2(100) NOT NULL,
    recordDetail VARCHAR2(100) NOT NULL,
    recordPrice int NOT NULL,
    regDate DATETIME NOT NULL,
    modDate DATETIME NOT NULL ,
    paymentMethod VARCHAR2(100) NOT NULL
   );
--
-- INSERT INTO RECORD (RECORDID, RECORDTYPE, RECORDTITLE, RECORDDETAIL, RECORDPRICE, REGDATE, MODDATE, PAYMENTMETHOD)
-- VALUES
--     ('1234', 'input', 'hellow', 'sjdfjasfjklajsf', 10000,'CARD');

