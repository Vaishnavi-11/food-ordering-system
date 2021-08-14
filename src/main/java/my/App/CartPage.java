package my.App;

import java.awt.Toolkit;
import java.sql.*;

public class CartPage extends javax.swing.JFrame {

    Cart cart;
    String email;
    javax.swing.JLabel itemLabels[], amountLabels[];    // array of JLabels 
    javax.swing.JSpinner quantitySpinners[];    // array of JSpinners
    javax.swing.JLabel totalLabel, totalValue;

    public CartPage(String _email, Cart _cart) {
        initComponents();
        cart = _cart;
        email = _email;
        CreateCart();
        
    }

    public void close() {
        java.awt.event.WindowEvent closeWindow = new java.awt.event.WindowEvent(this,
                java.awt.event.WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("repEAT");
        setIconImage(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\icon.png").getImage());
        setMinimumSize(new java.awt.Dimension(800, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 650));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(240, 204, 141));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(133, 109, 82));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Proceed to Checkout");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 20, 161, 30);

        jButton2.setBackground(new java.awt.Color(133, 109, 82));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(710, 20, 63, 30);

        jLabel1.setBackground(new java.awt.Color(17, 7, 8));
        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("  Items in Cart");
        jLabel1.setAlignmentX(1.0F);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(10);
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(670, 1200));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 130, 670, 1200);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(jPanel2);
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 670, 460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // to go to PaymentFeame and add total amount details to database
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
            int total = 0;
            java.util.Date date = new java.util.Date();
            Date orderDate = new Date(date.getTime());
            String query1 = "SELECT SUM(totalprice) FROM cart WHERE emailid = '" + email + "';";
            Statement queryStm1 = conn.createStatement();
            ResultSet rsPrice = queryStm1.executeQuery(query1);
            while (rsPrice.next()) {
                total = rsPrice.getInt(1);
                String query2 = "INSERT INTO place_order (purchaseamount,deliverycharge,totalamount,orderdate,email) VALUES ('"+ total + "','" + 50 + "','" + (total + 50) + "','" + orderDate + "','" + email + "');";
                Statement queryStm2 = conn.createStatement();
                queryStm2.executeUpdate(query2);
            }
            close();
            new PaymentFrame(email, cart).setVisible(true);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    // go back to ProductDashboard and remove items from cart
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        close();
        new ProductDashboard(email).setVisible(true);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
            String query = "DELETE FROM cart WHERE emailid = '" + email + "';";
            Statement queryStm = conn.createStatement();
            queryStm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    // to dynamically create labels and spinners according to the number of items in the cart
    public void CreateCart() {
        if (cart.size() == 0) {
            javax.swing.JLabel jLabel2 = new javax.swing.JLabel("No Items in Cart. Go 'Back' to order");
            jButton1.setVisible(false);
            jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(17, 7, 8));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setBounds(30, 20, 610, 40);
            jPanel2.add(jLabel2);
        } else {
            javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
            javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
            javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
            jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(17, 7, 8));
            jLabel2.setText("Item Name");
            jPanel2.add(jLabel2);
            jLabel2.setBounds(30, 20, 90, 30);

            jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(17, 7, 8));
            jLabel3.setText("Quantity");
            jLabel3.setToolTipText("");
            jPanel2.add(jLabel3);
            jLabel3.setBounds(290, 20, 80, 30);

            jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(17, 7, 8));
            jLabel4.setText("Amount");
            jPanel2.add(jLabel4);
            jLabel4.setBounds(530, 20, 110, 30);

            itemLabels = new javax.swing.JLabel[cart.size()];
            quantitySpinners = new javax.swing.JSpinner[cart.size()];
            amountLabels = new javax.swing.JLabel[cart.size()];

            int x = 30;
            int y = 70;

            for (int i = 0; i < cart.size(); i++) {
                // create item labels
                itemLabels[i] = new javax.swing.JLabel(cart.getName(i));
                itemLabels[i].setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                itemLabels[i].setForeground(new java.awt.Color(17, 7, 8));
                jPanel2.add(itemLabels[i]);
                itemLabels[i].setBounds(x, y + (y - 10) * i, 110, 25);

                // create item spinners
                quantitySpinners[i] = new javax.swing.JSpinner();
                quantitySpinners[i].setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                quantitySpinners[i].setValue(cart.getQuantity(i));
                quantitySpinners[i].addChangeListener(new javax.swing.event.ChangeListener() {
                    @Override
                    public void stateChanged(javax.swing.event.ChangeEvent evt) {
                        javax.swing.JSpinner spinner = (javax.swing.JSpinner) evt.getSource();
                        if ((int) spinner.getValue() < 1) {
                            spinner.setValue(1);
                        }
                        updateCart(spinner);
                        // cart.setQuantity(i,(int)spinner.getValue());
                    }
                });
                jPanel2.add(quantitySpinners[i]);
                quantitySpinners[i].setBounds(x + 260, y + (y - 10) * i, 50, 20);

                // create item amounts
                double amount = cart.getQuantity(i) * cart.getPrice(i);
                amountLabels[i] = new javax.swing.JLabel(String.valueOf(amount));
                amountLabels[i].setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                amountLabels[i].setForeground(new java.awt.Color(17, 7, 8));
                jPanel2.add(amountLabels[i]);
                amountLabels[i].setBounds(x + 500, y + (y - 10) * i, 110, 25);
            }
            totalLabel = new javax.swing.JLabel("Total (Rs.)");
            totalLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            totalLabel.setForeground(new java.awt.Color(17, 7, 8));
            totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            totalLabel.setBounds(x + 250, y + (y - 10) * cart.size(), 70, 30);
            jPanel2.add(totalLabel);
            totalValue = new javax.swing.JLabel(String.valueOf(cart.getTotal()));
            totalValue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            totalValue.setForeground(new java.awt.Color(17, 7, 8));
            totalValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            totalValue.setBounds(x + 325, y + (y - 10) * cart.size(), 50, 30);
            jPanel2.add(totalValue);
        }
    }

    // update quantity of cart products on increasing/decreasing the spinner value
    void updateCart(javax.swing.JSpinner spinner) {
        int index, quantity;
        for (int i = 0; i < quantitySpinners.length; i++) {
            if (quantitySpinners[i] == spinner) {
                index = i;
                quantity = (int) spinner.getValue();
                cart.setQuantity(index, quantity);
                amountLabels[i].setText(String.valueOf(cart.getQuantity(i) * cart.getPrice(i)));
                totalValue.setText(String.valueOf(cart.getTotal()));
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
                    String query = "SELECT foodid,typeid,foodprice FROM food WHERE foodname = '" + cart.getName(i).toLowerCase()
                            + "';";
                    Statement queryStm = conn.createStatement();
                    ResultSet foodSet = queryStm.executeQuery(query);
                    while (foodSet.next()) {
                        String query2 = "UPDATE cart SET quantity = '" + quantity + "',totalprice = '"
                                + foodSet.getInt(3) * quantity + "' WHERE foodid = '" + foodSet.getInt(1)
                                + "' AND typeid = '" + foodSet.getInt(2) + "';";
                        Statement queryStm2 = conn.createStatement();
                        queryStm2.executeUpdate(query2);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                } catch (ClassNotFoundException ex) {
                    System.out.println(ex);
                }
                break;
            }
        }

    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
