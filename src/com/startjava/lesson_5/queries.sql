--Вывести всю таблицу
SELECT * FROM jaegers;

--Показать только рабочих роботов
SELECT * FROM jaegers WHERE status = 'Worker';

--Отобразите роботов нескольких серий
SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';

--Сортировка по убыванию, по типу
SELECT * FROM jaegers ORDER BY mark DESC;

--Самый старый робот
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

--Робот который уничтожил наменьшее количество kaiju
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);

--Робот который уничтожил наибольшее количество kaiju
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

--Отобразить средний вес роботов
SELECT AVG(weight) FROM Jaegers;

--Увеличить на единицу количество уничтоженных kaiju
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Worker';

--после добавления убийств
SELECT * FROM jaegers WHERE status = 'Worker';

--Удаление уничтоженых роботов
DELETE FROM jaegers WHERE status = 'Destroyed';

 --Вся таблица
SELECT * FROM jaegers;
