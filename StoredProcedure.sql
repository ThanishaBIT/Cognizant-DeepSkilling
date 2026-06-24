SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE square_number(n NUmber)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Square = ' || (n*n));
END;
/
EXEC square_number(5);