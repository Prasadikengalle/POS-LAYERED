/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.lyd.service.custom.impl;

import java.util.ArrayList;
import pos.lyd.dao.DaoFactory;
import pos.lyd.dao.custom.ItemDao;
import pos.lyd.dto.ItemDto;
import pos.lyd.entity.ItemEntity;
import pos.lyd.service.custom.ItemService;

/**
 *
 * @author PrasadiKengalle
 */
public class ItemServiceImpl implements ItemService {

    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    public String addItem(ItemDto dto) throws Exception {
        if (itemDao.add(new ItemEntity(dto.getId(), dto.getDescription(),
                dto.getPackSize(), dto.getUnitPrice(), dto.getQoh()))) {
            return "Successfully Saved";
        }
        return "Fail";
    }

    public String updateItem(ItemDto dto) throws Exception {
        if (itemDao.update(new ItemEntity(dto.getId(), dto.getDescription(),
                dto.getPackSize(), dto.getUnitPrice(), dto.getQoh()))) {
            return "Successfully Updated";
        }
        return "Fail";
    }

    public String deleteItem(String id) throws Exception {
        if (itemDao.delete(id)) {
            return "Successfully Deleted";
        }
        return "Fail";
    }

    public ItemDto getItem(String id) throws Exception {
        ItemEntity entity = itemDao.get(id);
        return new ItemDto(entity.getId(), entity.getDescription(), entity.getPackSize(),
                entity.getUnitPrice(), entity.getQoh());
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {

        ArrayList<ItemDto> itemDtos = new ArrayList<>();

        ArrayList<ItemEntity> itemEntitys = itemDao.getAll();

        for (ItemEntity entity : itemEntitys) {
            ItemDto itemDto = new ItemDto(entity.getId(), entity.getDescription(), entity.getPackSize(),
                    entity.getUnitPrice(), entity.getQoh());
            itemDtos.add(itemDto);
        }
        return itemDtos;
    }

}
