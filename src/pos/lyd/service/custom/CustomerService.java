/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.lyd.service.custom;

import pos.lyd.dto.CustomerDto;
import pos.lyd.service.SuperService;

/**
 *
 * @author PrasadiKengalle
 */
public interface CustomerService extends SuperService {
    String addCustomer(CustomerDto customerDto) throws Exception;
}
