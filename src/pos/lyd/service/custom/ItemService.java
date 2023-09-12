/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.lyd.service.custom;

import java.util.ArrayList;
import pos.lyd.dto.ItemDto;
import pos.lyd.service.SuperService;

/**
 *
 * @author PrasadiKengalle
 */
public interface ItemService extends SuperService{
    
    String addItem(ItemDto itemDto) throws Exception;

    String updateItem(ItemDto itemDto) throws Exception;

    String deleteItem(String id) throws Exception;

    ItemDto getItem(String id) throws Exception;

    ArrayList<ItemDto> getAllItem() throws Exception;
    
}
