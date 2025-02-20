-- 코드를 입력하세요
SELECT A_I.ANIMAL_ID, A_I.NAME
    FROM ANIMAL_INS A_I
    INNER JOIN ANIMAL_OUTS A_O
    ON A_I.ANIMAL_ID = A_O.ANIMAL_ID 
    WHERE A_I.DATETIME > A_O.DATETIME
    ORDER BY A_I.DATETIME