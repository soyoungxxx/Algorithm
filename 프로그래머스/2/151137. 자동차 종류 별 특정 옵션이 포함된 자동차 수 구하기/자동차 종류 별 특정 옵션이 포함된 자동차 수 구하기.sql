-- 코드를 입력하세요
SELECT CAR_TYPE, COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS REGEXP('가죽시트|열선시트|통풍시트')
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE