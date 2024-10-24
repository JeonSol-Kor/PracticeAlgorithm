WITH hours AS (
    SELECT LEVEL - 1 AS hour
    FROM dual
    CONNECT BY LEVEL <= 24
)
SELECT
    h.hour AS HOUR,
    COUNT(a.ANIMAL_ID) AS COUNT
FROM hours h
    LEFT JOIN ANIMAL_OUTS a
        ON TO_NUMBER(TO_CHAR(a.DATETIME, 'HH24')) = h.hour
GROUP BY h.hour
ORDER BY h.hour;
