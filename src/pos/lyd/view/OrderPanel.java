/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.lyd.view;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.lyd.controller.CustomerController;
import pos.lyd.controller.ItemController;
import pos.lyd.controller.OrderController;
import pos.lyd.dto.CustomerDto;
import pos.lyd.dto.ItemDto;
import pos.lyd.dto.OrderDetailDto;
import pos.lyd.dto.OrderDto;

/**
 *
 * @author PrasadiKengalle
 */
public class OrderPanel extends javax.swing.JPanel {

    private List<OrderDetailDto> orderDetailDtos = new ArrayList<>();

    private CustomerController customerController;
    private ItemController itemController;
    private OrderController orderController;

    /**
     * Creates new form OrderPanel
     */
    public OrderPanel() {
        customerController = new CustomerController();
        itemController = new ItemController();
        orderController = new OrderController();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel2 = new javax.swing.JPanel();
        headerPanel2 = new javax.swing.JPanel();
        headerlabel2 = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        orderIdLabel = new javax.swing.JLabel();
        orderIdText = new javax.swing.JTextField();
        customerLabel = new javax.swing.JLabel();
        customerIdText = new javax.swing.JTextField();
        searchCustomerButton = new javax.swing.JButton();
        cutDataLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        itemLabel = new javax.swing.JLabel();
        itemIdText = new javax.swing.JTextField();
        searchItemButton = new javax.swing.JButton();
        itemDataLabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        discountLabel = new javax.swing.JLabel();
        discountText = new javax.swing.JTextField();
        addItemButton1 = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        placeOrderButton = new javax.swing.JButton();

        headerlabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        headerlabel2.setText("Order");

        javax.swing.GroupLayout headerPanel2Layout = new javax.swing.GroupLayout(headerPanel2);
        headerPanel2.setLayout(headerPanel2Layout);
        headerPanel2Layout.setHorizontalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanel2Layout.setVerticalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerlabel2))
        );

        orderIdLabel.setText("Order Id");

        customerLabel.setText("Customer");

        searchCustomerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchCustomerButton.setText("Search");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        itemLabel.setText("Item Id");

        searchItemButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchItemButton.setText("Search");
        searchItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemButtonActionPerformed(evt);
            }
        });

        qtyLabel.setText("QTY");

        discountLabel.setText("Discount");

        addItemButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addItemButton1.setText("Add Item");
        addItemButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addItemButton1)
                        .addGap(0, 184, Short.MAX_VALUE))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(orderIdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(customerIdText, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(orderIdText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchCustomerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cutDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(itemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(itemIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderIdLabel)
                    .addComponent(orderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cutDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerLabel)
                        .addComponent(customerIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchCustomerButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemLabel)
                        .addComponent(itemIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchItemButton))
                    .addComponent(itemDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(discountLabel)
                        .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addItemButton1))
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qtyLabel)
                        .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(itemTable);

        placeOrderButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeOrderButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout basePanel2Layout = new javax.swing.GroupLayout(basePanel2);
        basePanel2.setLayout(basePanel2Layout);
        basePanel2Layout.setHorizontalGroup(
            basePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(headerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        basePanel2Layout.setVerticalGroup(
            basePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanel2Layout.createSequentialGroup()
                .addComponent(headerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
        searchCustomer();
    }//GEN-LAST:event_searchCustomerButtonActionPerformed

    private void searchItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemButtonActionPerformed
        searchItem();
    }//GEN-LAST:event_searchItemButtonActionPerformed

    private void addItemButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButton1ActionPerformed
        addToTable();
    }//GEN-LAST:event_addItemButton1ActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        placeOrder();
    }//GEN-LAST:event_placeOrderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton1;
    private javax.swing.JPanel basePanel2;
    private javax.swing.JTextField customerIdText;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel cutDataLabel;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JTextField discountText;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel2;
    private javax.swing.JLabel headerlabel2;
    private javax.swing.JLabel itemDataLabel;
    private javax.swing.JTextField itemIdText;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JTable itemTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel orderIdLabel;
    private javax.swing.JTextField orderIdText;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton searchItemButton;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        String[] collumns = {"Item Code", "Qty", "Discount"};
        DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        itemTable.setModel(dtm);
    }

    private void searchCustomer() {

        try {
            String custId = customerIdText.getText();
            CustomerDto cust = customerController.getCustomer(custId);
            if (cust != null) {
                cutDataLabel.setText(cust.getName() + ", " + cust.getAddress());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void searchItem() {
        try {
            String itemId = itemIdText.getText();
            ItemDto item = itemController.getItem(itemId);
            if (item != null) {
                itemDataLabel.setText(item.getDescription() + ", " + item.getUnitPrice() + ", " + item.getQoh());
            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void addToTable() {
        OrderDetailDto od = new OrderDetailDto(itemIdText.getText(), Integer.parseInt(qtyText.getText()), Double.parseDouble(discountText.getText()));
        orderDetailDtos.add(od);

        Object[] rowData = {od.getItemId(), od.getQty(), od.getDiscount()};

        DefaultTableModel dtm = (DefaultTableModel) itemTable.getModel();
        dtm.addRow(rowData);

        cleanItemData();

    }

    private void cleanItemData() {
        itemIdText.setText("");
        discountText.setText("");
        qtyText.setText("");
        itemDataLabel.setText("");
    }

    private void placeOrder() {
        try {
            OrderDto orderDto = new OrderDto(orderIdText.getText(), customerIdText.getText(), orderDetailDtos);

            String result = orderController.placeOrder(orderDto);
            JOptionPane.showMessageDialog(this, result);
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
