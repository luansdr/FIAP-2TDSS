SET SERVEROUTPUT ON;
DECLARE
v_row_counts number;

BEGIN
SELECT MAX(DEPARTMENT_ID) INTO V_ROW_COUNTS FROM DEPARTMENTS;
DBMS_OUTPUT.PUT_LINE ('BLOCO ANONIMO CONCLUIDO');
DBMS_OUTPUT.PUT_LINE('numero departamento maximo' || v_row_counts);
END;
/