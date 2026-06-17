-- T-SQL specific script that includes constructs JSqlParser cannot handle
-- This exercises the UnparsedStatement fallback

CREATE TABLE dbo.Products (
    ProductID INT IDENTITY(1,1) PRIMARY KEY,
    ProductName NVARCHAR(200) NOT NULL,
    Price DECIMAL(10,2)
);
GO

-- This MERGE statement is T-SQL specific and may not parse
MERGE INTO dbo.Products AS target
USING (SELECT 1 AS ProductID, 'Widget' AS ProductName, 9.99 AS Price) AS source
ON target.ProductID = source.ProductID
WHEN MATCHED THEN
    UPDATE SET ProductName = source.ProductName, Price = source.Price
WHEN NOT MATCHED THEN
    INSERT (ProductName, Price) VALUES (source.ProductName, source.Price);
GO

-- Another standard DDL after the unparseable statement
CREATE TABLE dbo.Orders (
    OrderID INT IDENTITY(1,1) PRIMARY KEY,
    ProductID INT NOT NULL,
    Quantity INT DEFAULT 1,
    CONSTRAINT fk_product FOREIGN KEY (ProductID) REFERENCES dbo.Products(ProductID)
);
