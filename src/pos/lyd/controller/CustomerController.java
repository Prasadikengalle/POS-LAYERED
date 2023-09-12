/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyd.controller;

import pos.lyd.dto.CustomerDto;
import pos.lyd.service.ServiceFactory;
import pos.lyd.service.custom.CustomerService;

/**
 *
 * @author PrasadiKengalle
 */
public class CustomerController {
    
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception  {
        return customerService.addCustomer(customerDto);
    }
    
}
