DROP TABLE IF EXISTS orders;

CREATE TABLE orders (

    id bigserial, -- Идентификатор
    "number" text, -- Номер заказа
    timestamp bigint, -- дата время заказа
    CONSTRAINT orders_key PRIMARY KEY (id)
);

-- Комментарии к таблице и полям
COMMENT ON TABLE orders IS 'Заказы';
COMMENT ON COLUMN orders.id IS 'Идентификатор';
COMMENT ON COLUMN orders."number" IS 'Номер заказа';
COMMENT ON COLUMN orders.timestamp IS 'Дата время заказа';

-- Создание индекса
CREATE UNIQUE INDEX udx_orders_id ON orders USING btree(id);