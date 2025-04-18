SELECT
    D.ID AS ID
    , (
        SELECT COUNT(*)
        FROM ECOLI_DATA E
        WHERE E.PARENT_ID = D.ID
    ) AS CHILD_COUNT
FROM ECOLI_DATA D
ORDER BY ID;
