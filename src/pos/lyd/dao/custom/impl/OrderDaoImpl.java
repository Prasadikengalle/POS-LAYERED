/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyd.dao.custom.impl;

import java.util.ArrayList;
import pos.lyd.dao.CrudUtil;
import pos.lyd.dao.custom.OrderDao;
import pos.lyd.entity.OrderEntity;

/**
 *
 * @author PrasadiKengalle
 */
public class OrderDaoImpl implements OrderDao  {

    @Override
    public boolean add(OrderEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orders VALUES(?,?,?)", t.getId(), t.getDate(), t.getCustId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return  false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return  false;
    }

    @Override
    public OrderEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        return null;
    }
    
}
