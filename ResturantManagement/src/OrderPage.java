
import java.awt.Desktop;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.*;
import java.lang.*;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows !0
 */
public class OrderPage extends javax.swing.JFrame {

    private javax.swing.JCheckBox[] checkBoxes;
    private DefaultTableModel model;

    String emailOfUser, phoneNUmberOfUser, addressOfUser;

    public OrderPage() {

        initComponents();

        sendOrders.setVisible(false);

        initCheckBoxes();
        initTextFields();
        initLabels();
    }

    public OrderPage(String emailaddress, String phoneNumber, String address) {

        initComponents();
        sendOrders.setVisible(true);
        emailOfUser = emailaddress;
        phoneNUmberOfUser = phoneNumber;
        addressOfUser = address;
        printBill.setText("Download Bill");
        initCheckBoxes();
        initTextFields();
        initLabels();
    }

    private void initCheckBoxes() {

        CheckBoxes = new JCheckBox[]{
            item1, item2, item3, item4, item5, item6, item7, item8, item9, item10,
            item11, item12, item13, item14, item15, item16, item17, item18, item19, item20,
            item21, item22, item23, item24, item25, item26, item27, item28, item29, item30,
            item31, item32, item33, item34, item35, item36, item37, item38, item39, item40,
            item41, item42, item43, item44, item45
        };
    }

    private void initTextFields() {
        TextFields = new JTextField[]{
            text1, text2, text3, text4, text5, text6, text7, text8, text9, text10,
            text11, text12, text13, text14, text15, text16, text17, text18, text19, text20,
            text21, text22, text23, text24, text25, text26, text27, text28, text29, text30,
            text31, text32, text33, text34, text35, text36, text37, text38, text39, text40,
            text41, text42, text43, text44, text45
        };
    }

    private void initLabels() {
        Labels = new JLabel[]{
            value1, value2, value3, value4, value5, value6, value7, value8, value9, value10,
            value11, value12, value13, value14, value15, value16, value17, value18, value19, value20,
            value21, value22, value23, value24, value25, value26, value27, value28, value29, value30,
            value31, value32, value33, value34, value35, value36, value37, value38, value39, value40,
            value41, value42, value43, value44, value45
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        breakfastButton = new javax.swing.JButton();
        soupButton = new javax.swing.JButton();
        dinnetButton = new javax.swing.JButton();
        dessertButton = new javax.swing.JButton();
        beverageButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JPanel();
        bvrgMenu = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        item41 = new javax.swing.JCheckBox();
        value41 = new javax.swing.JLabel();
        text41 = new javax.swing.JTextField();
        item42 = new javax.swing.JCheckBox();
        value42 = new javax.swing.JLabel();
        text42 = new javax.swing.JTextField();
        text43 = new javax.swing.JTextField();
        value43 = new javax.swing.JLabel();
        item43 = new javax.swing.JCheckBox();
        text44 = new javax.swing.JTextField();
        value44 = new javax.swing.JLabel();
        item44 = new javax.swing.JCheckBox();
        text45 = new javax.swing.JTextField();
        item45 = new javax.swing.JCheckBox();
        value45 = new javax.swing.JLabel();
        dsrtMenu = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        item31 = new javax.swing.JCheckBox();
        value31 = new javax.swing.JLabel();
        text31 = new javax.swing.JTextField();
        item32 = new javax.swing.JCheckBox();
        value32 = new javax.swing.JLabel();
        text32 = new javax.swing.JTextField();
        text33 = new javax.swing.JTextField();
        value33 = new javax.swing.JLabel();
        item33 = new javax.swing.JCheckBox();
        text34 = new javax.swing.JTextField();
        value34 = new javax.swing.JLabel();
        item34 = new javax.swing.JCheckBox();
        text35 = new javax.swing.JTextField();
        item35 = new javax.swing.JCheckBox();
        value35 = new javax.swing.JLabel();
        item36 = new javax.swing.JCheckBox();
        value36 = new javax.swing.JLabel();
        text36 = new javax.swing.JTextField();
        text37 = new javax.swing.JTextField();
        value37 = new javax.swing.JLabel();
        item37 = new javax.swing.JCheckBox();
        item38 = new javax.swing.JCheckBox();
        text38 = new javax.swing.JTextField();
        value38 = new javax.swing.JLabel();
        item39 = new javax.swing.JCheckBox();
        value39 = new javax.swing.JLabel();
        text39 = new javax.swing.JTextField();
        text40 = new javax.swing.JTextField();
        item40 = new javax.swing.JCheckBox();
        value40 = new javax.swing.JLabel();
        dnrMenu = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        item21 = new javax.swing.JCheckBox();
        value21 = new javax.swing.JLabel();
        text21 = new javax.swing.JTextField();
        item22 = new javax.swing.JCheckBox();
        value22 = new javax.swing.JLabel();
        text22 = new javax.swing.JTextField();
        text23 = new javax.swing.JTextField();
        value23 = new javax.swing.JLabel();
        item23 = new javax.swing.JCheckBox();
        text24 = new javax.swing.JTextField();
        value24 = new javax.swing.JLabel();
        item24 = new javax.swing.JCheckBox();
        text25 = new javax.swing.JTextField();
        item25 = new javax.swing.JCheckBox();
        value25 = new javax.swing.JLabel();
        item26 = new javax.swing.JCheckBox();
        value26 = new javax.swing.JLabel();
        text26 = new javax.swing.JTextField();
        text27 = new javax.swing.JTextField();
        value27 = new javax.swing.JLabel();
        item27 = new javax.swing.JCheckBox();
        item28 = new javax.swing.JCheckBox();
        text28 = new javax.swing.JTextField();
        value28 = new javax.swing.JLabel();
        item29 = new javax.swing.JCheckBox();
        value29 = new javax.swing.JLabel();
        text29 = new javax.swing.JTextField();
        text30 = new javax.swing.JTextField();
        item30 = new javax.swing.JCheckBox();
        value30 = new javax.swing.JLabel();
        supMenu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        item11 = new javax.swing.JCheckBox();
        value11 = new javax.swing.JLabel();
        text11 = new javax.swing.JTextField();
        item12 = new javax.swing.JCheckBox();
        value12 = new javax.swing.JLabel();
        text12 = new javax.swing.JTextField();
        text13 = new javax.swing.JTextField();
        value13 = new javax.swing.JLabel();
        item13 = new javax.swing.JCheckBox();
        text14 = new javax.swing.JTextField();
        value14 = new javax.swing.JLabel();
        item14 = new javax.swing.JCheckBox();
        text15 = new javax.swing.JTextField();
        item15 = new javax.swing.JCheckBox();
        value15 = new javax.swing.JLabel();
        item16 = new javax.swing.JCheckBox();
        value16 = new javax.swing.JLabel();
        text16 = new javax.swing.JTextField();
        text17 = new javax.swing.JTextField();
        value17 = new javax.swing.JLabel();
        item17 = new javax.swing.JCheckBox();
        item18 = new javax.swing.JCheckBox();
        text18 = new javax.swing.JTextField();
        value18 = new javax.swing.JLabel();
        item19 = new javax.swing.JCheckBox();
        value19 = new javax.swing.JLabel();
        text19 = new javax.swing.JTextField();
        text20 = new javax.swing.JTextField();
        item20 = new javax.swing.JCheckBox();
        value20 = new javax.swing.JLabel();
        orderPage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        printBill = new javax.swing.JButton();
        sendOrders = new javax.swing.JButton();
        brkfastMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        item1 = new javax.swing.JCheckBox();
        value1 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        item2 = new javax.swing.JCheckBox();
        value2 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        value3 = new javax.swing.JLabel();
        item3 = new javax.swing.JCheckBox();
        text4 = new javax.swing.JTextField();
        value4 = new javax.swing.JLabel();
        item4 = new javax.swing.JCheckBox();
        text5 = new javax.swing.JTextField();
        item5 = new javax.swing.JCheckBox();
        value5 = new javax.swing.JLabel();
        item6 = new javax.swing.JCheckBox();
        value6 = new javax.swing.JLabel();
        text6 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        value7 = new javax.swing.JLabel();
        item7 = new javax.swing.JCheckBox();
        item8 = new javax.swing.JCheckBox();
        text8 = new javax.swing.JTextField();
        value8 = new javax.swing.JLabel();
        item9 = new javax.swing.JCheckBox();
        value9 = new javax.swing.JLabel();
        text9 = new javax.swing.JTextField();
        text10 = new javax.swing.JTextField();
        item10 = new javax.swing.JCheckBox();
        value10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resutrant Management ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(450, 250));

        jPanel4.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        breakfastButton.setText("Breakfast");
        breakfastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastButtonActionPerformed(evt);
            }
        });

        soupButton.setText("Soups");
        soupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soupButtonActionPerformed(evt);
            }
        });

        dinnetButton.setText(" Dinner & Lunch");
        dinnetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinnetButtonActionPerformed(evt);
            }
        });

        dessertButton.setText("Dessert");
        dessertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dessertButtonActionPerformed(evt);
            }
        });

        beverageButton.setText("Beverage");
        beverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beverageButtonActionPerformed(evt);
            }
        });

        orderButton.setText("Take Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dessertButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dinnetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soupButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(breakfastButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beverageButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(orderButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(breakfastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(soupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dinnetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dessertButton)
                .addGap(18, 18, 18)
                .addComponent(beverageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderButton)
                .addGap(70, 70, 70))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menu.setLayout(new java.awt.BorderLayout());

        jLabel25.setFont(new java.awt.Font("Ink Free", 1, 25)); // NOI18N
        jLabel25.setText("Beverage");

        jLabel26.setText("Name");

        jLabel27.setText("Price");

        jLabel28.setText("Quantity");

        item41.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item41.setText("Coffee");

        value41.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value41.setText("\tTk. 25/-");

        item42.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item42.setText(" Tea");

        value42.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value42.setText("Tk. 10/-");

        value43.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value43.setText("Tk. 70/-");

        item43.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item43.setText("Soft Drinks – Litre Bottle");

        value44.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value44.setText("Tk. 40/-");

        item44.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item44.setText("Soft Drinks – 250 ml can");

        item45.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item45.setText("Latte");

        value45.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value45.setText("Tk. 80/-");

        javax.swing.GroupLayout bvrgMenuLayout = new javax.swing.GroupLayout(bvrgMenu);
        bvrgMenu.setLayout(bvrgMenuLayout);
        bvrgMenuLayout.setHorizontalGroup(
            bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bvrgMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(216, 216, 216))
            .addGroup(bvrgMenuLayout.createSequentialGroup()
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bvrgMenuLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel26))
                    .addGroup(bvrgMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item41))
                    .addGroup(bvrgMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item42))
                    .addGroup(bvrgMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item43))
                    .addGroup(bvrgMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item44))
                    .addGroup(bvrgMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item45)))
                .addGap(53, 53, 53)
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(value41)
                    .addComponent(value42)
                    .addComponent(value43)
                    .addComponent(value44)
                    .addComponent(value45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(text41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text44, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        bvrgMenuLayout.setVerticalGroup(
            bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bvrgMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item41)
                    .addComponent(value41)
                    .addComponent(text41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item42)
                    .addComponent(value42)
                    .addComponent(text42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item43)
                    .addComponent(value43)
                    .addComponent(text43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item44)
                    .addComponent(value44)
                    .addComponent(text44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bvrgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item45)
                    .addComponent(value45)
                    .addComponent(text45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(bvrgMenu, java.awt.BorderLayout.CENTER);

        jLabel21.setFont(new java.awt.Font("Ink Free", 1, 25)); // NOI18N
        jLabel21.setText("Dessert");

        jLabel22.setText("Name");

        jLabel23.setText("Price");

        jLabel24.setText("Quantity");

        item31.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item31.setText(" Firni");

        value31.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value31.setText("\tTk. 65/-");

        item32.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item32.setText("Gurer Payesh");

        value32.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value32.setText("\tTk. 50/-");

        value33.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value33.setText("Tk. 40/-");

        item33.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item33.setText("Brownie");

        value34.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value34.setText("Tk. 260/-");

        item34.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item34.setText("Caramel Pudding (serves 6)");

        item35.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item35.setText("Caramel Pudding (serves 12)");

        value35.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value35.setText("\tTk. 540/-");

        item36.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item36.setText("Georgia Peach Pie");

        value36.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value36.setText("Tk. 50/-");

        value37.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value37.setText("\tTk. 350/-");

        item37.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item37.setText("Nutella-Swirl Pound Cake");

        item38.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item38.setText("Apple pie");

        value38.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value38.setText("Tk. 250/-");

        item39.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item39.setText("Baked custard");

        value39.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value39.setText("Tk. 200/-");

        item40.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item40.setText("The spread of sugarcane");

        value40.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value40.setText("Tk. 380/-");

        javax.swing.GroupLayout dsrtMenuLayout = new javax.swing.GroupLayout(dsrtMenu);
        dsrtMenu.setLayout(dsrtMenuLayout);
        dsrtMenuLayout.setHorizontalGroup(
            dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dsrtMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(216, 216, 216))
            .addGroup(dsrtMenuLayout.createSequentialGroup()
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel22))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(item31))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item32))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item33))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item34))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item35))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item36))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item37))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item38))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item39))
                    .addGroup(dsrtMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item40)))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(value31)
                    .addComponent(value32)
                    .addComponent(value33)
                    .addComponent(value34)
                    .addComponent(value35)
                    .addComponent(value36)
                    .addComponent(value37)
                    .addComponent(value38)
                    .addComponent(value39)
                    .addComponent(value40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(text31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text39, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        dsrtMenuLayout.setVerticalGroup(
            dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dsrtMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item31)
                    .addComponent(value31)
                    .addComponent(text31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item32)
                    .addComponent(value32)
                    .addComponent(text32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item33)
                    .addComponent(value33)
                    .addComponent(text33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item34)
                    .addComponent(value34)
                    .addComponent(text34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item35)
                    .addComponent(value35)
                    .addComponent(text35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item36)
                    .addComponent(value36)
                    .addComponent(text36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item37)
                    .addComponent(value37)
                    .addComponent(text37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item38)
                    .addComponent(value38)
                    .addComponent(text38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item39)
                    .addComponent(value39)
                    .addComponent(text39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dsrtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item40)
                    .addComponent(value40)
                    .addComponent(text40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(dsrtMenu, java.awt.BorderLayout.CENTER);

        jLabel17.setFont(new java.awt.Font("Ink Free", 1, 25)); // NOI18N
        jLabel17.setText("Dinner & Lunch");

        jLabel18.setText("Name");

        jLabel19.setText("Price");

        jLabel20.setText("Quantity");

        item21.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item21.setText("BBQ Chicken 1 Pc");

        value21.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value21.setText("\tTk. 165/-");

        item22.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item22.setText("Chicken Bhuna");

        value22.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value22.setText("Tk. 500/-");

        value23.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value23.setText("Tk. 500/-");

        item23.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item23.setText("Chicken Rezala");

        value24.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value24.setText("Tk. 500/-");

        item24.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item24.setText("Butter Chicken");

        item25.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item25.setText("Shorshe Chicken");

        value25.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value25.setText("Tk. 500/-");

        item26.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item26.setText("Beef Korma");

        value26.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value26.setText("Tk. 550/-");

        value27.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value27.setText("Tk. 600/-");

        item27.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item27.setText("Mutton Rezala");

        item28.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item28.setText("Fish Curry 4pcs");

        value28.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value28.setText("Tk. 500/-");

        item29.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item29.setText("Prawn Bhuna");

        value29.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value29.setText("Tk. 350/-");

        item30.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item30.setText("Fish Bhuna");

        value30.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value30.setText("Tk. 320/-");

        javax.swing.GroupLayout dnrMenuLayout = new javax.swing.GroupLayout(dnrMenu);
        dnrMenu.setLayout(dnrMenuLayout);
        dnrMenuLayout.setHorizontalGroup(
            dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dnrMenuLayout.createSequentialGroup()
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel18))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item21))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item22))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item23))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item24))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item25))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item26))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item27))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item28))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item29))
                    .addGroup(dnrMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item30)))
                .addGap(53, 53, 53)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(value21)
                    .addComponent(value22)
                    .addComponent(value23)
                    .addComponent(value24)
                    .addComponent(value25)
                    .addComponent(value26)
                    .addComponent(value27)
                    .addComponent(value28)
                    .addComponent(value29)
                    .addComponent(value30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(text21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dnrMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(185, 185, 185))
        );
        dnrMenuLayout.setVerticalGroup(
            dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dnrMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item21)
                    .addComponent(value21)
                    .addComponent(text21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item22)
                    .addComponent(value22)
                    .addComponent(text22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item23)
                    .addComponent(value23)
                    .addComponent(text23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item24)
                    .addComponent(value24)
                    .addComponent(text24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item25)
                    .addComponent(value25)
                    .addComponent(text25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item26)
                    .addComponent(value26)
                    .addComponent(text26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item27)
                    .addComponent(value27)
                    .addComponent(text27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item28)
                    .addComponent(value28)
                    .addComponent(text28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item29)
                    .addComponent(value29)
                    .addComponent(text29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dnrMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item30)
                    .addComponent(value30)
                    .addComponent(text30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(dnrMenu, java.awt.BorderLayout.CENTER);

        jLabel13.setFont(new java.awt.Font("Ink Free", 1, 25)); // NOI18N
        jLabel13.setText("Soup");

        jLabel14.setText("Name");

        jLabel15.setText("Price");

        jLabel16.setText("Quantity");

        item11.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item11.setText("Chicken Noodle Soup");

        value11.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value11.setText("\tTk. 65/-");

        item12.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item12.setText("Tortilla Soup");

        value12.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value12.setText("\tTk. 150/-");

        value13.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value13.setText("Tk. 140/-");

        item13.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item13.setText("Cream Soups");

        value14.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value14.setText("Tk. 160/-");

        item14.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item14.setText("Chowder");

        item15.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item15.setText("Slow Cooker Soup Recipes");

        value15.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value15.setText("\tTk. 140/-");

        item16.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item16.setText("Bean and Pea Soups");

        value16.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value16.setText("Tk. 50/-");

        value17.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value17.setText("\tTk. 150/-");

        item17.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item17.setText("Beef Soup");

        item18.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item18.setText("Chicken Soup");

        value18.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value18.setText("Tk. 150/-");

        item19.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item19.setText("Thai Soup");

        value19.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value19.setText("Tk. 200/-");

        item20.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item20.setText("English Special Soup");

        value20.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value20.setText("Tk. 320/-");

        javax.swing.GroupLayout supMenuLayout = new javax.swing.GroupLayout(supMenu);
        supMenu.setLayout(supMenuLayout);
        supMenuLayout.setHorizontalGroup(
            supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supMenuLayout.createSequentialGroup()
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel14))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item11))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item12))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item13))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item14))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item15))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item16))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item17))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item18))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item19))
                    .addGroup(supMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item20)))
                .addGap(53, 53, 53)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(value11)
                    .addComponent(value12)
                    .addComponent(value13)
                    .addComponent(value14)
                    .addComponent(value15)
                    .addComponent(value16)
                    .addComponent(value17)
                    .addComponent(value18)
                    .addComponent(value19)
                    .addComponent(value20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(text11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(240, 240, 240))
        );
        supMenuLayout.setVerticalGroup(
            supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item11)
                    .addComponent(value11)
                    .addComponent(text11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item12)
                    .addComponent(value12)
                    .addComponent(text12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item13)
                    .addComponent(value13)
                    .addComponent(text13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item14)
                    .addComponent(value14)
                    .addComponent(text14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item15)
                    .addComponent(value15)
                    .addComponent(text15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item16)
                    .addComponent(value16)
                    .addComponent(text16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item17)
                    .addComponent(value17)
                    .addComponent(text17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item18)
                    .addComponent(value18)
                    .addComponent(text18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item19)
                    .addComponent(value19)
                    .addComponent(text19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item20)
                    .addComponent(value20)
                    .addComponent(text20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(supMenu, java.awt.BorderLayout.CENTER);

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity", "Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jTable1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable1VetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        printBill.setText("Print Bill");
        printBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBillActionPerformed(evt);
            }
        });

        sendOrders.setText("Send");
        sendOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderPageLayout = new javax.swing.GroupLayout(orderPage);
        orderPage.setLayout(orderPageLayout);
        orderPageLayout.setHorizontalGroup(
            orderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendOrders)
                .addGap(85, 85, 85)
                .addComponent(printBill)
                .addContainerGap())
        );
        orderPageLayout.setVerticalGroup(
            orderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPageLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(orderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printBill)
                    .addComponent(sendOrders))
                .addContainerGap())
        );

        menu.add(orderPage, java.awt.BorderLayout.CENTER);

        brkfastMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Ink Free", 1, 25)); // NOI18N
        jLabel9.setText("BreakFast");

        jLabel10.setText("Name");

        jLabel11.setText("Price");

        jLabel12.setText("Quantity");

        item1.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item1.setText("Sausage");

        value1.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value1.setText("\tTk. 65/-");

        item2.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item2.setText("French Fries");

        value2.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value2.setText("\tTk. 50/-");

        value3.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value3.setText("Tk. 40/-");

        item3.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item3.setText("Toast- 2 Slices");

        value4.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value4.setText("Tk. 60/-");

        item4.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item4.setText("Parata- 2 Pcs");

        item5.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item5.setText("Chapatti- 2 pcs");

        value5.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value5.setText("\tTk. 40/-");

        item6.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item6.setText("Bhaji");

        value6.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value6.setText("Tk. 50/-");

        value7.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value7.setText("\tTk. 50/-");

        item7.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item7.setText("Aloo dum");

        item8.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item8.setText("Sujir Halwa");

        value8.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value8.setText("Tk. 50/-");

        item9.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item9.setText("Bangladeshi Menu");

        value9.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value9.setText("Tk. 200/-");

        item10.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        item10.setText("English Breakfast");

        value10.setFont(new java.awt.Font("Ink Free", 0, 20)); // NOI18N
        value10.setText("Tk. 320/-");

        javax.swing.GroupLayout brkfastMenuLayout = new javax.swing.GroupLayout(brkfastMenu);
        brkfastMenu.setLayout(brkfastMenuLayout);
        brkfastMenuLayout.setHorizontalGroup(
            brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brkfastMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(216, 216, 216))
            .addGroup(brkfastMenuLayout.createSequentialGroup()
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel10))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item1))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item2))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item3))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item4))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item5))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item6))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item7))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item8))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item9))
                    .addGroup(brkfastMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(item10)))
                .addGap(53, 53, 53)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(value1)
                    .addComponent(value2)
                    .addComponent(value3)
                    .addComponent(value4)
                    .addComponent(value5)
                    .addComponent(value6)
                    .addComponent(value7)
                    .addComponent(value8)
                    .addComponent(value9)
                    .addComponent(value10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        brkfastMenuLayout.setVerticalGroup(
            brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brkfastMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item1)
                    .addComponent(value1)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item2)
                    .addComponent(value2)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item3)
                    .addComponent(value3)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item4)
                    .addComponent(value4)
                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item5)
                    .addComponent(value5)
                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item6)
                    .addComponent(value6)
                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item7)
                    .addComponent(value7)
                    .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item8)
                    .addComponent(value8)
                    .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item9)
                    .addComponent(value9)
                    .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(brkfastMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item10)
                    .addComponent(value10)
                    .addComponent(text10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(brkfastMenu, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(menu);

        jSplitPane1.setRightComponent(jScrollPane1);

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 25)); // NOI18N
        jLabel2.setText("CUET CAFE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(552, 552, 552))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ///for clear the panel
    public void clearPanelOfMenu(javax.swing.JPanel panel) {

        menu.removeAll();
        menu.add(panel);
        menu.repaint();
        menu.revalidate();
    }

    private void removeAllrows() {
        //remove all elements from table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

    }

    private void breakfastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastButtonActionPerformed
        // TODO add your handling code here:

        removeAllrows();
        clearPanelOfMenu(brkfastMenu);
    }//GEN-LAST:event_breakfastButtonActionPerformed

    private void dinnetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinnetButtonActionPerformed
        // TODO add your handling code here:

        removeAllrows();
        clearPanelOfMenu(dnrMenu);
    }//GEN-LAST:event_dinnetButtonActionPerformed

    private void dessertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dessertButtonActionPerformed
        // TODO add your handling code here:

        removeAllrows();
        clearPanelOfMenu(dsrtMenu);
    }//GEN-LAST:event_dessertButtonActionPerformed

    private void beverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beverageButtonActionPerformed
        // TODO add your handling code here:

        removeAllrows();
        clearPanelOfMenu(bvrgMenu);
    }//GEN-LAST:event_beverageButtonActionPerformed

    private void soupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soupButtonActionPerformed
        // TODO add your handling code here:

        removeAllrows();
        clearPanelOfMenu(supMenu);
    }//GEN-LAST:event_soupButtonActionPerformed

    private int stringToInteger(String s) {
        int number = 0, digitNumber = 1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {

                number *= 10;
                number = number + (ch - '0');

            }
        }
        return number;
    }

    private void printThoseBox() {

        model = (DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < CheckBoxes.length; i++) {
            JCheckBox check = CheckBoxes[i];
            JLabel label = Labels[i];
            JTextField text = TextFields[i];
            if (check.isSelected()) {
                Vector v = new Vector();
                int quantity = Integer.parseInt(text.getText());
                int price = stringToInteger(label.getText());

                v.add(check.getText());
                v.add(quantity);
                v.add(price);
                v.add(quantity * price);
                model.addRow(v);
            }
        }

    }

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        removeAllrows();
        printThoseBox();
        clearPanelOfMenu(orderPage);

    }//GEN-LAST:event_orderButtonActionPerformed

    private void printBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBillActionPerformed

        
        if(jTable1.getRowCount() == 0)return;
        
        Formatter x;

        try {
            x = new Formatter("Rat.txt");

            x.format("--------------------CUET CAFE---------------\n\n\n\n");

            x.format("-----------------**************---------------\n\n\n\n");
            x.format("-------------Your ordered food items---------------\n\n");
            x.format("---------Item Names\t Quatity\t Price\t        Total--\n\n");

            String s1, s2, s3, s4;
            int total = 0;
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                s1 = jTable1.getModel().getValueAt(i, 0).toString();
                s2 = jTable1.getModel().getValueAt(i, 1).toString();
                s3 = jTable1.getModel().getValueAt(i, 2).toString();
                s4 = jTable1.getModel().getValueAt(i, 3).toString();
                total += Integer.parseInt(s4);
                x.format("\t%s \t %s \t\t%s \t\t%s\n", s1, s2, s3, s4);
            }
            x.format("--------------------------------------------------------\n\n\n\n");
            x.format("\t\t\t\t\t\tTotal = %d\n\n", total);
            x.format("--------------------------------------------------------\n\n\n\n");
            x.format("--------------------------------------------------------\n\n\n\n");
            x.format("-----------------Please Come Again----------------------\n\n\n\n");
            x.close();

            Desktop.getDesktop().open(new File("Rat.txt"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(OrderPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OrderPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_printBillActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked

    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void updateTable() {

        for (int i = 0; i < jTable1.getRowCount(); i++) {

            int quantity = Integer.parseInt(jTable1.getValueAt(i, 1).toString());
            int price = Integer.parseInt(jTable1.getValueAt(i, 2).toString());

            jTable1.setValueAt(quantity * price, i, 3);
        }

    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int col = jTable1.getSelectedColumn();
        int row = jTable1.getSelectedRow();
        System.out.println(jTable1.getValueAt(0, 1));
        int quantity = Integer.parseInt(jTable1.getValueAt(row, 1).toString());
        int price = Integer.parseInt(jTable1.getValueAt(row, 2).toString());

        model.setValueAt(quantity * price, row, 3);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged

    }//GEN-LAST:event_jTable1InputMethodTextChanged

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped

    }//GEN-LAST:event_jTable1KeyTyped

    private void jTable1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable1VetoableChange

    }//GEN-LAST:event_jTable1VetoableChange

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded

    }//GEN-LAST:event_jTable1AncestorAdded

    private void sendOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendOrdersActionPerformed

        if(jTable1.getRowCount() == 0)return;
        
        String s1, s2, s3, s4;
        String total = "Item List-----Quantity";
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            s1 = jTable1.getModel().getValueAt(i, 0).toString();
            s2 = jTable1.getModel().getValueAt(i, 1).toString();
            s3 = jTable1.getModel().getValueAt(i, 2).toString();
            s4 = jTable1.getModel().getValueAt(i, 3).toString();
            total += s1 + "-----" + s2 + "\n";
        }
        System.out.println(total);
        
        try {
            insertdata(total);
            JOptionPane.showMessageDialog(null, "Successfully Ordered", "Status", JOptionPane.INFORMATION_MESSAGE);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_sendOrdersActionPerformed

    public void insertdata(String total) throws ClassNotFoundException, SQLException{
        DatabaseData data = new DatabaseData();
        
        data.insertHomeDelivery(emailOfUser, phoneNUmberOfUser, addressOfUser, total);
        
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beverageButton;
    private javax.swing.JButton breakfastButton;
    private javax.swing.JPanel brkfastMenu;
    private javax.swing.JPanel bvrgMenu;
    private javax.swing.JButton dessertButton;
    private javax.swing.JButton dinnetButton;
    private javax.swing.JPanel dnrMenu;
    private javax.swing.JPanel dsrtMenu;
    private javax.swing.JCheckBox item1;
    private javax.swing.JCheckBox item10;
    private javax.swing.JCheckBox item11;
    private javax.swing.JCheckBox item12;
    private javax.swing.JCheckBox item13;
    private javax.swing.JCheckBox item14;
    private javax.swing.JCheckBox item15;
    private javax.swing.JCheckBox item16;
    private javax.swing.JCheckBox item17;
    private javax.swing.JCheckBox item18;
    private javax.swing.JCheckBox item19;
    private javax.swing.JCheckBox item2;
    private javax.swing.JCheckBox item20;
    private javax.swing.JCheckBox item21;
    private javax.swing.JCheckBox item22;
    private javax.swing.JCheckBox item23;
    private javax.swing.JCheckBox item24;
    private javax.swing.JCheckBox item25;
    private javax.swing.JCheckBox item26;
    private javax.swing.JCheckBox item27;
    private javax.swing.JCheckBox item28;
    private javax.swing.JCheckBox item29;
    private javax.swing.JCheckBox item3;
    private javax.swing.JCheckBox item30;
    private javax.swing.JCheckBox item31;
    private javax.swing.JCheckBox item32;
    private javax.swing.JCheckBox item33;
    private javax.swing.JCheckBox item34;
    private javax.swing.JCheckBox item35;
    private javax.swing.JCheckBox item36;
    private javax.swing.JCheckBox item37;
    private javax.swing.JCheckBox item38;
    private javax.swing.JCheckBox item39;
    private javax.swing.JCheckBox item4;
    private javax.swing.JCheckBox item40;
    private javax.swing.JCheckBox item41;
    private javax.swing.JCheckBox item42;
    private javax.swing.JCheckBox item43;
    private javax.swing.JCheckBox item44;
    private javax.swing.JCheckBox item45;
    private javax.swing.JCheckBox item5;
    private javax.swing.JCheckBox item6;
    private javax.swing.JCheckBox item7;
    private javax.swing.JCheckBox item8;
    private javax.swing.JCheckBox item9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton orderButton;
    private javax.swing.JPanel orderPage;
    private javax.swing.JButton printBill;
    private javax.swing.JButton sendOrders;
    private javax.swing.JButton soupButton;
    private javax.swing.JPanel supMenu;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text10;
    private javax.swing.JTextField text11;
    private javax.swing.JTextField text12;
    private javax.swing.JTextField text13;
    private javax.swing.JTextField text14;
    private javax.swing.JTextField text15;
    private javax.swing.JTextField text16;
    private javax.swing.JTextField text17;
    private javax.swing.JTextField text18;
    private javax.swing.JTextField text19;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text20;
    private javax.swing.JTextField text21;
    private javax.swing.JTextField text22;
    private javax.swing.JTextField text23;
    private javax.swing.JTextField text24;
    private javax.swing.JTextField text25;
    private javax.swing.JTextField text26;
    private javax.swing.JTextField text27;
    private javax.swing.JTextField text28;
    private javax.swing.JTextField text29;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text30;
    private javax.swing.JTextField text31;
    private javax.swing.JTextField text32;
    private javax.swing.JTextField text33;
    private javax.swing.JTextField text34;
    private javax.swing.JTextField text35;
    private javax.swing.JTextField text36;
    private javax.swing.JTextField text37;
    private javax.swing.JTextField text38;
    private javax.swing.JTextField text39;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text40;
    private javax.swing.JTextField text41;
    private javax.swing.JTextField text42;
    private javax.swing.JTextField text43;
    private javax.swing.JTextField text44;
    private javax.swing.JTextField text45;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    private javax.swing.JTextField text8;
    private javax.swing.JTextField text9;
    private javax.swing.JLabel value1;
    private javax.swing.JLabel value10;
    private javax.swing.JLabel value11;
    private javax.swing.JLabel value12;
    private javax.swing.JLabel value13;
    private javax.swing.JLabel value14;
    private javax.swing.JLabel value15;
    private javax.swing.JLabel value16;
    private javax.swing.JLabel value17;
    private javax.swing.JLabel value18;
    private javax.swing.JLabel value19;
    private javax.swing.JLabel value2;
    private javax.swing.JLabel value20;
    private javax.swing.JLabel value21;
    private javax.swing.JLabel value22;
    private javax.swing.JLabel value23;
    private javax.swing.JLabel value24;
    private javax.swing.JLabel value25;
    private javax.swing.JLabel value26;
    private javax.swing.JLabel value27;
    private javax.swing.JLabel value28;
    private javax.swing.JLabel value29;
    private javax.swing.JLabel value3;
    private javax.swing.JLabel value30;
    private javax.swing.JLabel value31;
    private javax.swing.JLabel value32;
    private javax.swing.JLabel value33;
    private javax.swing.JLabel value34;
    private javax.swing.JLabel value35;
    private javax.swing.JLabel value36;
    private javax.swing.JLabel value37;
    private javax.swing.JLabel value38;
    private javax.swing.JLabel value39;
    private javax.swing.JLabel value4;
    private javax.swing.JLabel value40;
    private javax.swing.JLabel value41;
    private javax.swing.JLabel value42;
    private javax.swing.JLabel value43;
    private javax.swing.JLabel value44;
    private javax.swing.JLabel value45;
    private javax.swing.JLabel value5;
    private javax.swing.JLabel value6;
    private javax.swing.JLabel value7;
    private javax.swing.JLabel value8;
    private javax.swing.JLabel value9;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JCheckBox[] CheckBoxes;
    private javax.swing.JTextField[] TextFields;
    private javax.swing.JLabel[] Labels;
    private Set<String> hash_Set = new HashSet<String>();

}
