-- 코드를 입력하세요
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE)
FROM ANIMAL_INS
group by ANIMAL_TYPE
Order by ANIMAL_TYPE
