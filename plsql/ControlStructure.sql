declare 
n number:=10;
BEGIN
    if n>0 THEN
    dbms_output.put_Line('The given number is positive');
    elsif n<0 THEN
      dbms_output.put_Line('The given number is negative');
     else 
       dbms_output.put_Line('The given number is Zero'); 
 END  if; 
 end;
 /    
    
