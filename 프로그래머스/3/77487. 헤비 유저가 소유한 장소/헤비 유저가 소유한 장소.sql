SELECT 
    p.ID 
    , p.NAME
    , p.HOST_ID
FROM PLACES p
WHERE 
    p.HOST_ID IN (
        SELECT 
            HOST_ID
        FROM 
            PLACES
        GROUP BY 
            HOST_ID
        HAVING 
            COUNT(*) >= 2
    )
ORDER BY p.ID;