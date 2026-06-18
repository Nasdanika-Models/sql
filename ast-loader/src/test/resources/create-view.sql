-- View with multi-join SELECT for lineage analysis
CREATE VIEW account_balances AS
SELECT
    a.ID AS account_id,
    a.NAME AS account_name,
    a.TYPE AS account_type,
    COALESCE(SUM(je.DEBIT_AMOUNT), 0) AS total_debits,
    COALESCE(SUM(je.CREDIT_AMOUNT), 0) AS total_credits,
    COALESCE(SUM(je.DEBIT_AMOUNT), 0) - COALESCE(SUM(je.CREDIT_AMOUNT), 0) AS balance
FROM Accounts a
LEFT JOIN Journal_Entries je ON a.ID = je.ACCOUNT_ID
INNER JOIN Transactions t ON je.TRANSACTION_ID = t.ID
WHERE t.STATUS = 'POSTED'
GROUP BY a.ID, a.NAME, a.TYPE;

-- View with subselect
CREATE OR REPLACE VIEW recent_transactions AS
SELECT
    t.ID,
    t.TRANSACTION_DATE,
    t.DESCRIPTION,
    (SELECT COUNT(*) FROM Journal_Entries je WHERE je.TRANSACTION_ID = t.ID) AS entry_count
FROM Transactions t
WHERE t.TRANSACTION_DATE >= '2024-01-01'
ORDER BY t.TRANSACTION_DATE DESC;
