-- 코드를 입력하세요
SELECT B.CATEGORY AS CATEGORY, SUM(S.SALES) AS TOTAL_SALES
FROM BOOK B, BOOK_SALES S
WHERE SUBSTRING(S.SALES_DATE, 1, 7) = '2022-01'
AND B.BOOK_ID = S.BOOK_ID
GROUP BY B.CATEGORY
ORDER BY B.CATEGORY