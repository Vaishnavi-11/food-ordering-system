package my.App;

import javax.swing.JOptionPane;
import java.sql.*;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PaymentFrame extends javax.swing.JFrame implements DocumentListener {

    String email;
    Cart cart;

    public PaymentFrame(String _email, Cart _cart) {
        initComponents();
        email = _email;
        cart = _cart;

        // add the radio buttons to a button group
        javax.swing.ButtonGroup bg = new javax.swing.ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        PaymentDetails();
        PrintReceipt();
    }

    // fill the text fields using the database contents
    public void PaymentDetails() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
            String q = "SELECT * FROM place_order WHERE email = '" + email + "';";
            Statement qS = conn.createStatement();
            ResultSet qrs = qS.executeQuery(q);
            while (qrs.next()) {
                System.out.println(qrs.getInt(1) + " " + qrs.getObject(5) + " " + qrs.getString(6));
                jTextField1.setText(String.valueOf(qrs.getInt(1)));
                jTextField2.setText(String.valueOf(qrs.getObject(5)));
                jTextField5.setText(email);
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jTextField5.setEditable(false);
            }

            String query2 = "SELECT * FROM customer WHERE emailid = '" + email + "';";
            Statement queryStm2 = conn.createStatement();
            ResultSet stm2Set = queryStm2.executeQuery(query2);
            while (stm2Set.next()) {
                jTextField3.setText(stm2Set.getString(1) + " " + stm2Set.getString(2));
                if (stm2Set.getObject(4) != null) {
                    jTextField4.setText(String.valueOf(stm2Set.getObject(4)));
                }
                if (stm2Set.getObject(5) != null) {
                    jTextArea1.append(String.valueOf(stm2Set.getObject(5)));
                }
            }

            jTextArea1.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void removeUpdate(DocumentEvent e) {
                }

                // to update the customer's address onto the databse
                @Override
                public void insertUpdate(DocumentEvent e) {
                    try {
                        String query3 = "UPDATE customer SET address = '" + jTextArea1.getText() + "' WHERE emailid = '"
                                + email + "';";
                        Statement queryStm3 = conn.createStatement();
                        queryStm3.executeUpdate(query3);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }

                @Override
                public void changedUpdate(DocumentEvent arg0) {
                    // nothing to do here
                }
            });

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    // prints the receipt in a text area
    public void PrintReceipt() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
            String q1 = "SELECT purchaseamount,deliverycharge FROM place_order WHERE email = '" + email + "';";
            Statement qs1 = conn.createStatement();
            ResultSet rs1 = qs1.executeQuery(q1);
            while (rs1.next()) {
                String s1 = String.format("  Amount\t\t\t\t%d", rs1.getInt(1));
                String s2 = String.format("  Delivery Charge\t\t\t%d", rs1.getInt(2));
                String s3 = "------------------------------------------------";
                String s4 = String.format("  Total  \t\t\t\t%d", (rs1.getInt(1) + rs1.getInt(2)));
                jTextArea2.append(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s3);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public void close() {
        java.awt.event.WindowEvent closeWindow = new java.awt.event.WindowEvent(this,
                java.awt.event.WindowEvent.WINDOW_CLOSING);
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("repEAT");
        setIconImage(new javax.swing.ImageIcon(
                "D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\icon.png").getImage());
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
        jButton1.setText("Cancel Order");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setMaximumSize(new java.awt.Dimension(115, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 15, 120, 30);

        jLabel1.setBackground(new java.awt.Color(17, 7, 8));
        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText(" Order Summary");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 60));
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 60);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Order ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 57, 20);

        jTextField1.setBackground(new java.awt.Color(240, 204, 141));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 0, 0));
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 70, 100, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 70, 29, 17);

        jTextField2.setBackground(new java.awt.Color(240, 204, 141));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(690, 68, 90, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Customer Name");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 110, 100, 20);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(160, 110, 150, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Phone No.");
        jLabel5.setPreferredSize(new java.awt.Dimension(62, 20));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 110, 62, 20);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(7, 20));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(510, 110, 180, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 150, 49, 17);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 150, 230, 60);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("E-mail");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(430, 150, 40, 17);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(510, 150, 180, 20);
        jTextField5.setText(email);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Reciept");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 230, 49, 17);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(100, 230, 370, 130);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Mode of Payment");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 380, 107, 23);

        jRadioButton1.setBackground(new java.awt.Color(240, 204, 141));
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Card");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(180, 390, 93, 23);

        jRadioButton2.setBackground(new java.awt.Color(240, 204, 141));
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("Cash On Delivery");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(270, 390, 125, 23);

        jButton3.setBackground(new java.awt.Color(51, 136, 21));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Confirm Order");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 560, 140, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Card Number:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 10, 80, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Expires On: ");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 50, 70, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("CVV: ");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(60, 90, 40, 20);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(jTextField6);
        jTextField6.setBounds(110, 10, 130, 21);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(jTextField7);
        jTextField7.setBounds(110, 50, 100, 21);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(110, 90, 100, 21);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(180, 430, 350, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 650);

        pack();
    }

    // check the phone number and update it onto the database
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextField4.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number!", "Error", JOptionPane.ERROR_MESSAGE);
            jTextField4.setText("");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
                String query = "UPDATE customer SET phno = '" + jTextField4.getText() + "';";
                Statement queryStm = conn.createStatement();
                queryStm.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
    }

    // to toggle between cash or card radio buttons
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioButton1.isSelected()) {
            jPanel2.setVisible(true);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
                String query = "UPDATE place_order SET paymentmode = 'card' WHERE email = '" + email + "';";
                Statement queryStm = conn.createStatement();
                queryStm.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
    }

    // to toggle between cash or card radio buttons
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioButton2.isSelected()) {
            jPanel2.setVisible(false);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
                String query = "UPDATE place_order SET paymentmode = 'cod' WHERE email = '" + email + "';";
                Statement queryStm = conn.createStatement();
                queryStm.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
    }

    // to place on order on button click
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
            String query = "UPDATE place_order SET deliverystatus = 'in progress' WHERE email = '" + email + "';";
            Statement queryStm = conn.createStatement();
            queryStm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Order Placed Successfully! Thank you for Purchasing", "Order Status",
                    JOptionPane.PLAIN_MESSAGE);
            Thread.sleep(10000);
            JOptionPane.showMessageDialog(null, "Order Delivered!", "Order Status", JOptionPane.PLAIN_MESSAGE);
            String query1 = "UPDATE place_order SET deliverystatus = 'delivered' WHERE email = '" + email + "';";
            Statement queryStm1 = conn.createStatement();
            queryStm1.executeUpdate(query1);
            close();
            new ProductDashboard(email).setVisible(true);
            String query3 = "DELETE FROM cart WHERE emailid = '" + email + "';";
            Statement queryStm3 = conn.createStatement();
            queryStm3.executeUpdate(query3);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException | InterruptedException ex) {
            System.out.println(ex);
        }
    }

    // to cancel the order
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel the order?", "Cancel Order",
                JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            close();
            new ProductDashboard(email).setVisible(true);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
                String query = "DELETE FROM cart WHERE emailid = '" + email + "';";
                String query1 = "DELETE FROM place_order WHERE email = '" + email + "';";
                Statement queryStm = conn.createStatement();
                queryStm.addBatch(query);
                queryStm.addBatch(query1);
                queryStm.executeBatch();
            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
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
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration

    @Override
    public void insertUpdate(DocumentEvent e) {
        // nothing to do here
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        // nothing to do here
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // nothing to do here
    }
}
