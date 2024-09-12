-- 2022년도 평가 점수의 합을 계산합니다.
WITH EmployeeScores AS (
    SELECT
        EMP_NO,
        SUM(SCORE) AS TOTAL_SCORE
    FROM HR_GRADE
    WHERE YEAR = 2022
    GROUP BY EMP_NO
),
-- 가장 높은 평가 점수를 찾습니다.
MaxScore AS (
    SELECT
        MAX(TOTAL_SCORE) AS MAX_SCORE
    FROM EmployeeScores
)
-- 가장 높은 평가 점수를 가진 사원의 정보를 조회합니다.
SELECT
    es.TOTAL_SCORE AS SCORE,
    e.EMP_NO,
    e.EMP_NAME,
    e.POSITION,
    e.EMAIL
FROM EmployeeScores es
JOIN MaxScore ms ON es.TOTAL_SCORE = ms.MAX_SCORE
JOIN HR_EMPLOYEES e ON es.EMP_NO = e.EMP_NO;
