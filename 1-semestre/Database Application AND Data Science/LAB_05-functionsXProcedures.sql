----------------------------------------------- EXERCIO 1 -----------------------------------------------
CREATE OR REPLACE FUNCTION get_salary_tax (
    f_id_employee employees.employee_id%TYPE
) RETURN NUMBER IS
    v_salary employees.salary%TYPE;
BEGIN
    SELECT
        salary * 0.8
    INTO v_salary
    FROM
        employees
    WHERE
        employee_id = f_id_employee;

    RETURN v_salary;
END get_salary_tax;
/

SELECT
    employee_id,
    last_name,
    salary,
    get_salary_tax(employee_id)
FROM
    employees
WHERE
    employee_id = 100;
  
  
  
----------------------------------------------- EXERCIO 2 -----------------------------------------------

create or replace function GET_ANNUAL_COMP (
    f_id_employee employees.employee_id%TYPE
) RETURN NUMBER IS
    v_salary_tax employees.salary%TYPE;
BEGIN
    SELECT( salary * 12 ) + ( nvl(commission_pct, 0) * salary * 12 )
    INTO v_salary_tax
    FROM
        employees
    WHERE
        employee_id = f_id_employee;

    RETURN v_salary_tax;
END GET_ANNUAL_COMP;
/
select employee_id,last_name,salary,GET_ANNUAL_COMP(employee_id) 
  from employees where employee_id = 100; 