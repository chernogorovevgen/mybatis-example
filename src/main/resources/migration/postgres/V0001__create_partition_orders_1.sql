
-- Создание партиции
CREATE TABLE orders_1 (
	CHECK (prefix like 'TR%')
)INHERITS (orders);

-- Правила, при добавлении в основную таблицу orders данные будут добавляться в партицию orders_1
CREATE RULE orders_insert_to_more_10 AS ON INSERT TO orders
WHERE (prefix like 'TR%')
DO INSTEAD INSERT INTO orders_1 VALUES (NEW.*);