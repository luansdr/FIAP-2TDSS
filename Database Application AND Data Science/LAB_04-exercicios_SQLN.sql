SET SERVEROUTPUT ON;

DECLARE
    v_row_counts NUMBER;
BEGIN
    SELECT
        MAX(department_id)
    INTO v_row_counts
    FROM
        departments;

    dbms_output.put_line('BLOCO ANONIMO CONCLUIDO');
    dbms_output.put_line('the maximum department_id is: ' || v_row_counts);
END;


--------------------------------------------------------------------------------

SET SERVEROUTPUT ON;

VARIABLE v_new_colum NUMBER;

DECLARE
    v_row_counts departments.department_id%TYPE;
BEGIN
    SELECT
        MAX(department_id)
    INTO v_row_counts
    FROM
        departments;

    :v_new_colum := 10 + v_row_counts;
    INSERT INTO departments VALUES (
        :v_new_colum,
        'Education',
        NULL,
        NULL
    );

    dbms_output.put_line('CONCLUIDO');
    dbms_output.put_line('Linhas modificadas: ' || SQL%rowcount);
END;

--------------------------------------------------------------------------------

SELECT
    *
FROM
    departments
WHERE
    department_id = 280;
    
    
    
--------------------------------------------------------------------------------

describe departments;