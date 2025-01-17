WITH MAXLENGTH AS (
    SELECT FISH_TYPE, MAX(LENGTH) AS LENGTH
    FROM FISH_INFO
    GROUP BY FISH_TYPE
)
SELECT i.ID, n.FISH_NAME, m.LENGTH
FROM FISH_INFO i
    JOIN FISH_NAME_INFO n ON i.FISH_TYPE = n.FISH_TYPE
    JOIN MAXLENGTH m ON i.FISH_TYPE = m.FISH_TYPE
WHERE i.LENGTH = m.LENGTH
ORDER BY i.ID;