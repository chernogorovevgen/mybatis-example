DROP TABLE IF EXISTS orders;

CREATE TABLE orders (

    id bigserial, -- Идентификатор
    number varchar(255) NOT NULL, -- Номер заказа
    timestamp timestamp NOT NULL, -- дата время заказа
    region_id bigint NOT NULL , -- Код региона
    CONSTRAINT pk_orders PRIMARY KEY (id),
    CONSTRAINT fk_region_id FOREIGN KEY (region_id) REFERENCES regions(id) ON UPDATE RESTRICT ON DELETE RESTRICT
);

-- Комментарии к таблице и полям
COMMENT ON TABLE orders IS 'Заказы';
COMMENT ON COLUMN orders.id IS 'Идентификатор';
COMMENT ON COLUMN orders.number IS 'Номер заказа';
COMMENT ON COLUMN orders.timestamp IS 'Дата время заказа';
COMMENT ON COLUMN orders.region_id IS 'Код региона'

-- Создание индекса
--CREATE INDEX udx_orders_number ON orders USING btree(number);

---------------------------------------------------------------------


