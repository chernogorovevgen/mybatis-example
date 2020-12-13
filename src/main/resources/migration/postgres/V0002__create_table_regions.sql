
DROP TABLE  IF EXISTS regions;

CREATE TABLE regions (

    id bigserial,
    "code" text,
    "name" text,
    CONSTRAINT regions_key PRIMARY KEY(id)
);

-- Комментарии к таблице и полям
COMMENT ON TABLE regions IS 'Региона';
COMMENT ON COLUMN regions.id IS 'Идентификатор';
COMMENT ON COLUMN regions."code" IS 'Код региона';
COMMENT ON COLUMN regions."name" IS 'Наименование региона';

-- Копируем данные из CSV  файла в таблицу regions (не знаю как прочитать файл из ресурсов без указания полного пути)
COPY regions (code, name) FROM 'e:/Java App/mybatis-example/src/main/resources/report_regions.csv' DELIMITER ';' CSV HEADER;

/*
INSERT INTO regions(code, name)
VALUES(1, 'Республика Адыгея (Адыгея)');
*/