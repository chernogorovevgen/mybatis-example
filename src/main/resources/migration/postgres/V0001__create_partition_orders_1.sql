
-- Создание партиции
CREATE TABLE orders_1 (
	CHECK (region_code = '77')
)INHERITS (orders);

-- Правила, при добавлении в основную таблицу orders данные будут добавляться в партицию orders_1
CREATE RULE orders_insert_to_77 AS ON INSERT TO orders
WHERE (region_code = '77')
DO INSTEAD INSERT INTO orders_1 VALUES (NEW.*);