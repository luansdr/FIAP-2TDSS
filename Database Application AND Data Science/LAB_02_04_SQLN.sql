set serveroutput on;

BEGIN
    dbms_output.put_line('HELLO WORLD');
END;

DECLARE
    v_today    DATE := sysdate;
    v_tomorrow v_today%TYPE;
BEGIN
    v_tomorrow := v_today + 1;
    dbms_output.put_line('HELLO WORLD');
    dbms_output.put_line('TODAY IS: ' || v_today);
    dbms_output.put_line('tomorrow IS: ' || v_tomorrow);
END;


------------------------------------------------------------------------------------------------------


VARIABLE basic_percent number;
VARIABLE pf_percent number;

DECLARE
    v_today    DATE := sysdate;
    v_tomorrow v_today%TYPE;
BEGIN
    :basic_percent := 45;
    :pf_percent := 12;
    v_tomorrow := v_today + 1;
    dbms_output.put_line('HELLO WORLD');
    dbms_output.put_line('TODAY IS: ' || v_today);
    dbms_output.put_line('tomorrow IS: ' || v_tomorrow);
END;
/

PRINT BASIC_PERCENT;
PRINT PF_PERCENT ;