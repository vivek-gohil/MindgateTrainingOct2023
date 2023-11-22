create table file_details(
    id NUMBER(10) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    data blob
);

CREATE SEQUENCE FILE_DETAILS_SEQUENCE
START WITH 1
INCREMENT BY 1;