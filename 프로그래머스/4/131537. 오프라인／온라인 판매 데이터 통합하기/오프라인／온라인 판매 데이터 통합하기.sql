SELECT * FROM(
    SELECT TO_CHAR(SALES_DATE,'YYYY-MM-DD') SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT FROM ONLINE_SALE 
        WHERE TO_CHAR(SALES_DATE,'YYYYMM') = '202203' 
    UNION -- 테이블 UNION 사용
    SELECT TO_CHAR(SALES_DATE,'YYYY-MM-DD') SALES_DATE, PRODUCT_ID, NULL USER_ID, -- USER ID NULL 처리 
    SALES_AMOUNT FROM OFFLINE_SALE 
        WHERE TO_CHAR(SALES_DATE,'YYYYMM') = '202203'
)
ORDER BY SALES_DATE,PRODUCT_ID,USER_ID -- 정렬기준