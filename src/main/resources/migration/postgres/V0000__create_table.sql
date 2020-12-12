DROP TABLE IF EXISTS orders;

CREATE TABLE orders (

    id bigserial, -- Идентификатор
    "number" text, -- Номер заказа
    timestamp bigint, -- дата время заказа
    "prefix" text,
    CONSTRAINT orders_key PRIMARY KEY (id)
);

-- Комментарии к таблице и полям
COMMENT ON TABLE orders IS 'Заказы';
COMMENT ON COLUMN orders.id IS 'Идентификатор';
COMMENT ON COLUMN orders."number" IS 'Номер заказа';
COMMENT ON COLUMN orders.timestamp IS 'Дата время заказа';

-- Создание индекса
-- не надо создавать индекс по id, это поле у тебя помечено как PRIMARY KEY, соответственно оно уже является уникальным индексом
--CREATE UNIQUE INDEX udx_orders_id ON orders USING btree(id);