/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyd.controller;

import pos.lyd.dto.OrderDto;
import pos.lyd.service.ServiceFactory;
import pos.lyd.service.custom.OrderService;

/**
 *
 * @author PrasadiKengalle
 */
public class OrderController {
    
    private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);

    public String placeOrder(OrderDto orderDto) throws Exception{
       return orderService.placeOrder(orderDto);
    }
    
}
 