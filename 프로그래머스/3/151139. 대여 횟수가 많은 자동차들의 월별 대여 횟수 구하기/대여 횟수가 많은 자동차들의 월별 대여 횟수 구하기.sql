WITH CarRentalCounts AS (
    -- 각 자동차의 대여 횟수를 구하고, 5회 이상인 자동차만 선택
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
    GROUP BY CAR_ID
    HAVING COUNT(*) >= 5
)
-- 메인 쿼리: 5회 이상 대여한 자동차들의 월별 대여 횟수를 구함
SELECT 
    MONTH(START_DATE) AS MONTH, 
    CAR_ID,
    COUNT(*) AS RECORDS
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE 
    CAR_ID IN (SELECT CAR_ID FROM CarRentalCounts)  -- 5회 이상 대여한 자동차만 선택
    AND START_DATE BETWEEN '2022-08-01' AND '2022-10-31'  -- 2022년 8월부터 10월까지 필터링
GROUP BY MONTH(START_DATE), CAR_ID
ORDER BY MONTH, CAR_ID DESC;