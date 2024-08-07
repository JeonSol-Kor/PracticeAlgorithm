WITH Animal_Durations AS (
    SELECT 
        I.ANIMAL_ID, 
        I.NAME, 
        I.DATETIME AS INTAKE_DATE,
        O.DATETIME AS OUTTAKE_DATE,
        DATEDIFF(O.DATETIME, I.DATETIME) AS DURATION
    FROM ANIMAL_INS I
    JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
)
SELECT 
    ANIMAL_ID, 
    NAME
FROM Animal_Durations
ORDER BY DURATION DESC
LIMIT 2;