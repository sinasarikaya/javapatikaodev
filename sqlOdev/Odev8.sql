-- 1 

CREATE TABLE employee (
	id INTEGER,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(50)
);

-- 2

done

-- 3

UPDATE employee 
SET name='Sina',
	birthday='1997.03.20',
	email='sinasarikaya@gmail.com'
	WHERE id=6;
  
  -- 4 
  se
  DELETE FROM employee
WHERE name='ruy';
