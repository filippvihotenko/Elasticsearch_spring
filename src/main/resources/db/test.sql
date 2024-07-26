CREATE SCHEMA if not exists tz;

CREATE TABLE Product (
                    product_id  UUID PRIMARY KEY NOT NULL ,
                        product_name VARCHAR(50) NOT NULL ,
                        start_date TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
                        active boolean NOT NULL
                     );

CREATE TABLE Sku (
                     sku_id UUID PRIMARY KEY ,
                     product_id UUID references Product(product_Id),
                     size VARCHAR(20),
                     color VARCHAR(20),
                     price NUMERIC(10,2) NOT NULL default 0,
                     quantity int NOT NULL DEFAULT 0
);