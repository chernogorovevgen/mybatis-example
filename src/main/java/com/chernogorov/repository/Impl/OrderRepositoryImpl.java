package com.chernogorov.repository.Impl;

import com.chernogorov.model.OrderModel;
import com.chernogorov.repository.OrderRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {


    @Autowired
    private final SqlSessionFactory sqlSessionFactory;

    public OrderRepositoryImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }


    @Override
    public void save(OrderModel orderModel) {

        SqlSession session = sqlSessionFactory.openSession();
        session.update("save", orderModel);
        session.commit();
        session.close();

    }

    @Override
    public OrderModel findById(Long id) {

        SqlSession session = sqlSessionFactory.openSession();
        OrderModel orderModel = session.selectOne("findById", id);
        session.close();

        return orderModel;

    }

    @Override
    public List<OrderModel> getAll() {
        SqlSession session = sqlSessionFactory.openSession();
        List<OrderModel> orderModels = session.selectList("getAll");
        session.close();

        return orderModels;
    }
}
