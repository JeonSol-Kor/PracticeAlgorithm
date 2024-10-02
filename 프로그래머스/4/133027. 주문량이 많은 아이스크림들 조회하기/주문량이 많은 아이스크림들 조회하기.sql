WITH July_Summed AS (
    -- JULY 테이블에서 FLAVOR별 총 주문량을 구함
    SELECT 
        FLAVOR
        , SUM(TOTAL_ORDER) AS JULY_ORDER
    FROM JULY
    GROUP BY FLAVOR
)
-- FIRST_HALF 테이블과 JULY 테이블 조인 및 상반기와 7월 주문량 합계 계산
SELECT F.FLAVOR
FROM FIRST_HALF F
LEFT JOIN July_Summed J ON F.FLAVOR = J.FLAVOR
-- 총 주문량 합계 계산: 상반기 주문량 + 7월 주문량
ORDER BY (F.TOTAL_ORDER + COALESCE(J.JULY_ORDER, 0)) DESC
LIMIT 3;
