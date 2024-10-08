WITH JULY_SUMMED AS (
	SELECT
		FLAVOR
		, SUM(TOTAL_ORDER) AS JULY_ORDER
	FROM JULY
	GROUP BY FLAVOR
)

SELECT F.FLAVOR
FROM FIRST_HALF F
LEFT JOIN JULY_SUMMED J ON F.FLAVOR = J.FLAVOR
ORDER BY (F.TOTAL_ORDER + IFNULL(J.JULY_ORDER, 0)) DESC
LIMIT 3;