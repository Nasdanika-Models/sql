-- Sample multi-table CREATE TABLE script with constraints and comments
-- This script demonstrates a simple accounting system

-- Accounts table: represents chart of accounts
CREATE TABLE IF NOT EXISTS Accounts (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL, -- Account display name
    TYPE VARCHAR(50) NOT NULL, -- e.g., 'Asset', 'Liability', 'Equity', 'Revenue', 'Expense'
    PARENT_ID INT,
    CREATED_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_parent FOREIGN KEY (PARENT_ID) REFERENCES Accounts(ID) ON DELETE SET NULL
);

-- Transactions table: header for each financial transaction
CREATE TABLE IF NOT EXISTS Transactions (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    TRANSACTION_DATE DATE NOT NULL,
    DESCRIPTION VARCHAR(500),
    REFERENCE_NUMBER VARCHAR(100), -- Optional: e.g., Invoice Number, Check Number
    STATUS VARCHAR(20) DEFAULT 'PENDING',
    CONSTRAINT chk_status CHECK (STATUS IN ('PENDING', 'POSTED', 'VOID'))
);

-- Journal entries: individual debit/credit lines
CREATE TABLE IF NOT EXISTS Journal_Entries (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    TRANSACTION_ID INT NOT NULL,
    ACCOUNT_ID INT NOT NULL,
    DEBIT_AMOUNT DECIMAL(19, 4) DEFAULT 0.00,
    CREDIT_AMOUNT DECIMAL(19, 4) DEFAULT 0.00,
    FOREIGN KEY (TRANSACTION_ID) REFERENCES Transactions(ID),
    FOREIGN KEY (ACCOUNT_ID) REFERENCES Accounts(ID),
    CONSTRAINT uq_entry UNIQUE (TRANSACTION_ID, ACCOUNT_ID)
);

-- Create index for fast lookups
CREATE INDEX idx_journal_transaction ON Journal_Entries (TRANSACTION_ID);
CREATE INDEX idx_journal_account ON Journal_Entries (ACCOUNT_ID);
