DROP TABLE IF EXISTS orders;

CREATE TABLE orders (

    id bigserial, -- Идентификатор
    "number" text, -- Номер заказа
    timestamp bigint, -- дата время заказа
    "region_code" text, -- Код региона
    CONSTRAINT orders_key PRIMARY KEY (id)
);

-- Комментарии к таблице и полям
COMMENT ON TABLE orders IS 'Заказы';
COMMENT ON COLUMN orders.id IS 'Идентификатор';
COMMENT ON COLUMN orders."number" IS 'Номер заказа';
COMMENT ON COLUMN orders.timestamp IS 'Дата время заказа';
COMMENT ON COLUMN orders.timestamp IS 'Дата время заказа';
COMMENT ON COLUMN orders.region_code IS 'Код региона'

-- Создание индекса
--CREATE UNIQUE INDEX udx_orders_number ON orders USING btree(number);

---------------------------------------------------------------------


