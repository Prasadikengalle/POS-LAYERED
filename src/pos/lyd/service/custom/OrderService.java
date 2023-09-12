/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.lyd.service.custom;

import pos.lyd.dto.OrderDto;
import pos.lyd.service.SuperService;

/**
 *
 * @author PrasadiKengalle
 */
public interface OrderService extends SuperService {
    
    String placeOrder(OrderDto dto) throws Exception;
    
}
