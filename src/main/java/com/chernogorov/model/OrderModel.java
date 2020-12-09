package com.chernogorov.model;

import java.util.Date;
import java.util.Objects;

public class OrderModel {

    private Long id;
    private String number;
    private Long timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderModel that = (OrderModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(number, that.number) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, timestamp);
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
