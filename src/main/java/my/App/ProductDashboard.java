
package my.App;

import java.sql.*;

public class ProductDashboard extends javax.swing.JFrame {
    
    Cart cart;
    Catalouge catalouge;
    String email;

    public ProductDashboard(String _email) {
        initComponents();
        email = _email;
        cart = new Cart();
        catalouge = new Catalouge();
        
        catalouge.add(new Item("Veg Salad",50));
        catalouge.add(new Item("Tomato Soup",50));
        catalouge.add(new Item("Veg Papad",50));
        catalouge.add(new Item("Butter Kulcha",35));
        catalouge.add(new Item("Butter Naan",30));
        catalouge.add(new Item("Kaju Masala",180));
        catalouge.add(new Item("Gulab Jamun",20));
        catalouge.add(new Item("Rasgulla",20));
        catalouge.add(new Item("Cheese Cake",40));
        catalouge.add(new Item("Coffee",10));
        catalouge.add(new Item("Lemon Tea",15));
        catalouge.add(new Item("Coke",20));
    }
    
    public void close() {
        java.awt.event.WindowEvent closeWindow = new java.awt.event.WindowEvent(this,
                java.awt.event.WindowEvent.WINDOW_CLOSING);
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    void displayCart(){
        System.out.println("Display Cart");
        for(int i=0;i<cart.size();i++){
            cart.print(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        checkout = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        appetizerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        mainCoursePanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        dessertPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        beveragePanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("repEAT");
        setIconImage(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\icon.png").getImage());
        setPreferredSize(new java.awt.Dimension(815, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 650));
        getContentPane().setLayout(null);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 650));

        jPanel1.setBackground(new java.awt.Color(240, 204, 141));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 1175));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(17, 7, 8));
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));
        jPanel2.setMinimumSize(new java.awt.Dimension(700, 60));
        jPanel2.setPreferredSize(new java.awt.Dimension(780, 60));
        jPanel2.setLayout(null);

        jLabel41.setFont(new java.awt.Font("Colonna MT", 1, 28)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(240, 240, 240));
        jLabel41.setText("Select Your Items");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(20, 0, 260, 70);

        checkout.setBackground(new java.awt.Color(133, 109, 82));
        checkout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 255, 255));
        checkout.setText("Go to Cart");
        checkout.setBorderPainted(false);
        checkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkout.setFocusable(false);
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        jPanel2.add(checkout);
        checkout.setBounds(490, 20, 100, 30);

        logout.setBackground(new java.awt.Color(133, 109, 82));
        logout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.setBorderPainted(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setFocusable(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout);
        logout.setBounds(650, 20, 90, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 780, 70);

        appetizerPanel.setBackground(new java.awt.Color(240, 204, 141));
        appetizerPanel.setPreferredSize(new java.awt.Dimension(780, 260));
        appetizerPanel.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 17, 8));
        jLabel1.setText("Appetizers");
        appetizerPanel.add(jLabel1);
        jLabel1.setBounds(10, 0, 160, 40);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\vegsalad.jpg")); // NOI18N
        jPanel12.add(jLabel2);
        jLabel2.setBounds(40, 10, 180, 160);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 17, 8));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Veg Salad");
        jPanel12.add(jLabel3);
        jLabel3.setBounds(10, 180, 80, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 17, 8));
        jLabel4.setText("Rs.50 ");
        jPanel12.add(jLabel4);
        jLabel4.setBounds(120, 180, 50, 20);

        jButton1.setBackground(new java.awt.Color(51, 136, 21));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1);
        jButton1.setBounds(170, 180, 80, 25);

        jPanel9.add(jPanel12);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel10.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 17, 8));
        jLabel5.setText("Rs. 40");
        jPanel10.add(jLabel5);
        jLabel5.setBounds(110, 180, 40, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 17, 8));
        jLabel6.setText("Tomato Soup");
        jPanel10.add(jLabel6);
        jLabel6.setBounds(20, 180, 90, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\tomato-soup.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel10.add(jLabel7);
        jLabel7.setBounds(40, 10, 180, 160);

        jButton2.setBackground(new java.awt.Color(51, 136, 21));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2);
        jButton2.setBounds(170, 180, 80, 25);

        jPanel9.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel11.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\vegpapad.jpg")); // NOI18N
        jPanel11.add(jLabel8);
        jLabel8.setBounds(40, 10, 180, 160);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 7, 8));
        jLabel9.setText("Veg Papad");
        jPanel11.add(jLabel9);
        jLabel9.setBounds(30, 180, 70, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 7, 8));
        jLabel10.setText("Rs. 30");
        jPanel11.add(jLabel10);
        jLabel10.setBounds(120, 180, 38, 17);

        jButton3.setBackground(new java.awt.Color(51, 136, 21));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton3.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton3);
        jButton3.setBounds(170, 178, 80, 25);

        jPanel9.add(jPanel11);

        appetizerPanel.add(jPanel9);
        jPanel9.setBounds(0, 40, 780, 220);

        jPanel1.add(appetizerPanel);
        appetizerPanel.setBounds(0, 70, 780, 260);

        mainCoursePanel.setBackground(new java.awt.Color(240, 204, 141));
        mainCoursePanel.setPreferredSize(new java.awt.Dimension(780, 260));
        mainCoursePanel.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 7, 8));
        jLabel11.setText("Main Course");
        mainCoursePanel.add(jLabel11);
        jLabel11.setBounds(10, 0, 130, 40);

        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel14.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\butter-kulcha.jpg")); // NOI18N
        jPanel14.add(jLabel12);
        jLabel12.setBounds(40, 10, 180, 160);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 7, 8));
        jLabel15.setText("Butter Kulcha");
        jPanel14.add(jLabel15);
        jLabel15.setBounds(20, 180, 90, 17);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(17, 7, 8));
        jLabel16.setText("Rs. 35");
        jPanel14.add(jLabel16);
        jLabel16.setBounds(120, 180, 38, 17);

        jButton4.setBackground(new java.awt.Color(51, 136, 21));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Add");
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton4.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton4);
        jButton4.setBounds(170, 180, 80, 25);

        jPanel13.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel15.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\butter-naan.jpg")); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel15.add(jLabel13);
        jLabel13.setBounds(40, 10, 180, 160);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(17, 7, 8));
        jLabel17.setText("Butter Naan");
        jPanel15.add(jLabel17);
        jLabel17.setBounds(20, 180, 80, 14);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(17, 7, 8));
        jLabel18.setText("Rs. 30");
        jPanel15.add(jLabel18);
        jLabel18.setBounds(110, 180, 38, 17);

        jButton5.setBackground(new java.awt.Color(51, 136, 21));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add");
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton5.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton5);
        jButton5.setBounds(170, 180, 80, 25);

        jPanel13.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel16.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\veg-kaju-masala.jpg")); // NOI18N
        jPanel16.add(jLabel14);
        jLabel14.setBounds(40, 10, 180, 160);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(17, 7, 8));
        jLabel19.setText("Kaju Masala");
        jPanel16.add(jLabel19);
        jLabel19.setBounds(20, 180, 80, 17);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(17, 7, 8));
        jLabel20.setText("Rs. 180");
        jPanel16.add(jLabel20);
        jLabel20.setBounds(110, 180, 45, 17);

        jButton6.setBackground(new java.awt.Color(51, 136, 21));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add");
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton6.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton6);
        jButton6.setBounds(170, 180, 80, 25);

        jPanel13.add(jPanel16);

        mainCoursePanel.add(jPanel13);
        jPanel13.setBounds(0, 40, 780, 220);

        jPanel1.add(mainCoursePanel);
        mainCoursePanel.setBounds(0, 340, 780, 260);

        dessertPanel.setBackground(new java.awt.Color(240, 204, 141));
        dessertPanel.setPreferredSize(new java.awt.Dimension(700, 260));
        dessertPanel.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(17, 7, 8));
        jLabel21.setText("Desserts");
        dessertPanel.add(jLabel21);
        jLabel21.setBounds(10, 0, 120, 40);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(null);

        jLabel22.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\jamun.jpg")); // NOI18N
        jPanel4.add(jLabel22);
        jLabel22.setBounds(40, 10, 180, 150);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(17, 7, 8));
        jLabel23.setText("Gulab Jamun");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(10, 180, 90, 17);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(17, 7, 8));
        jLabel24.setText("Rs. 20");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(110, 180, 38, 17);

        jButton7.setBackground(new java.awt.Color(51, 136, 21));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Add");
        jButton7.setBorderPainted(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton7.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(170, 178, 80, 25);

        jPanel3.add(jPanel4);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel17.setLayout(null);

        jLabel25.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\rasgulla.jpg")); // NOI18N
        jPanel17.add(jLabel25);
        jLabel25.setBounds(40, 10, 180, 150);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(17, 7, 8));
        jLabel26.setText("Rasgulla");
        jPanel17.add(jLabel26);
        jLabel26.setBounds(20, 180, 60, 17);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(17, 7, 8));
        jLabel27.setText("Rs. 20");
        jPanel17.add(jLabel27);
        jLabel27.setBounds(110, 180, 38, 17);

        jButton8.setBackground(new java.awt.Color(51, 136, 21));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add");
        jButton8.setBorderPainted(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusable(false);
        jButton8.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton8.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton8);
        jButton8.setBounds(170, 178, 80, 25);

        jPanel3.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel18.setLayout(null);

        jLabel28.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\cheesecake.jpg")); // NOI18N
        jPanel18.add(jLabel28);
        jLabel28.setBounds(40, 10, 180, 150);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(17, 7, 8));
        jLabel29.setText("Cheese Cake");
        jPanel18.add(jLabel29);
        jLabel29.setBounds(10, 180, 90, 17);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(17, 7, 8));
        jLabel30.setText("Rs. 40");
        jPanel18.add(jLabel30);
        jLabel30.setBounds(110, 180, 40, 17);

        jButton9.setBackground(new java.awt.Color(51, 136, 21));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Add");
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusable(false);
        jButton9.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton9.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton9);
        jButton9.setBounds(170, 178, 80, 25);

        jPanel3.add(jPanel18);

        dessertPanel.add(jPanel3);
        jPanel3.setBounds(0, 40, 780, 220);

        jPanel1.add(dessertPanel);
        dessertPanel.setBounds(0, 610, 780, 260);

        beveragePanel.setBackground(new java.awt.Color(240, 204, 141));
        beveragePanel.setPreferredSize(new java.awt.Dimension(780, 260));
        beveragePanel.setLayout(null);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(17, 7, 8));
        jLabel31.setText("Beverages & Drinks");
        beveragePanel.add(jLabel31);
        jLabel31.setBounds(10, 0, 220, 40);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel6.setLayout(null);

        jLabel32.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\coffee.jpg")); // NOI18N
        jPanel6.add(jLabel32);
        jLabel32.setBounds(40, 10, 180, 160);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(17, 7, 8));
        jLabel33.setText("Coffee");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(30, 180, 41, 17);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(17, 7, 8));
        jLabel34.setText("Rs. 10");
        jPanel6.add(jLabel34);
        jLabel34.setBounds(110, 180, 38, 17);

        jButton10.setBackground(new java.awt.Color(51, 136, 21));
        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Add");
        jButton10.setBorderPainted(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusable(false);
        jButton10.setMaximumSize(new java.awt.Dimension(63, 25));
        jButton10.setPreferredSize(new java.awt.Dimension(63, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(170, 178, 80, 25);

        jPanel5.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.setLayout(null);

        jLabel35.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\lemon-tea.jpg")); // NOI18N
        jPanel7.add(jLabel35);
        jLabel35.setBounds(40, 10, 180, 160);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(17, 7, 8));
        jLabel36.setText("Lemon Tea");
        jPanel7.add(jLabel36);
        jLabel36.setBounds(30, 180, 69, 17);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(17, 7, 8));
        jLabel37.setText("Rs. 15");
        jPanel7.add(jLabel37);
        jLabel37.setBounds(120, 180, 38, 17);

        jButton11.setBackground(new java.awt.Color(51, 136, 21));
        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Add");
        jButton11.setBorderPainted(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusable(false);
        jButton11.setMaximumSize(new java.awt.Dimension(63, 25));
        jButton11.setPreferredSize(new java.awt.Dimension(63, 25));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11);
        jButton11.setBounds(170, 178, 80, 25);

        jPanel5.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel8.setLayout(null);

        jLabel38.setIcon(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\coke.jpg")); // NOI18N
        jPanel8.add(jLabel38);
        jLabel38.setBounds(40, 10, 180, 160);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(17, 7, 8));
        jLabel39.setText("Coke");
        jPanel8.add(jLabel39);
        jLabel39.setBounds(40, 180, 33, 17);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(17, 7, 8));
        jLabel40.setText("Rs. 20");
        jPanel8.add(jLabel40);
        jLabel40.setBounds(110, 180, 38, 17);

        jButton12.setBackground(new java.awt.Color(51, 136, 21));
        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Add");
        jButton12.setBorderPainted(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusable(false);
        jButton12.setMaximumSize(new java.awt.Dimension(63, 25));
        jButton12.setPreferredSize(new java.awt.Dimension(63, 25));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton12);
        jButton12.setBounds(160, 178, 80, 25);

        jPanel5.add(jPanel8);

        beveragePanel.add(jPanel5);
        jPanel5.setBounds(0, 40, 780, 220);

        jPanel1.add(beveragePanel);
        beveragePanel.setBounds(0, 880, 780, 260);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 800, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // go back to LogIn Frame on clicking Logout Button
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new LogIn().setVisible(true);
        close();
    }//GEN-LAST:event_logoutActionPerformed

    // go to CartFrame on clicking Go to Cart Button and also add the products selected on to the cart table in the database
    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        
        new CartPage(email,cart).setVisible(true);
        close();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
            if(cart.size()!=0){
                int food_id=0,type_id=0,food_price=0;
                PreparedStatement addCartStm = conn.prepareStatement("INSERT INTO cart VALUES ('"+email+"',?,?,?,?);");
                PreparedStatement getFoodStm = conn.prepareStatement("SELECT foodid,typeid,foodprice FROM food WHERE foodname = ?;");
                for(int i=0; i<cart.size(); i++){
                    System.out.println(cart.getName(i).toLowerCase());
                    getFoodStm.setString(1,cart.getName(i).toLowerCase());
                    ResultSet foodSet = getFoodStm.executeQuery();
                    while(foodSet.next()){
                        food_price = foodSet.getInt(3);
                        System.out.println(food_id + " " + type_id + " " + food_price);
                        addCartStm.setInt(1,foodSet.getInt(1));
                        addCartStm.setInt(2,foodSet.getInt(2));
                        addCartStm.setInt(3,cart.getQuantity(i));
                        addCartStm.setInt(4,cart.getQuantity(i)*food_price);
                        System.out.println(addCartStm.executeUpdate());
                    }
                } 
            }
        }catch(SQLException | ClassNotFoundException | NoClassDefFoundError ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_checkoutActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jButton1.getText().equals("Add")){
            cart.add(catalouge.get(0));
            jButton1.setText("Remove");
        }
        else if(jButton1.getText().equals("Remove")){
            cart.remove(catalouge.get(0));
            jButton1.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton1ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jButton2.getText().equals("Add")){
            cart.add(catalouge.get(1));
            jButton2.setText("Remove");
        }
        else if(jButton2.getText().equals("Remove")){
            cart.remove(catalouge.get(1));
            jButton2.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton2ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(jButton5.getText().equals("Add")){
            cart.add(catalouge.get(4));
            jButton5.setText("Remove");
        }
        else if(jButton5.getText().equals("Remove")){
            cart.remove(catalouge.get(4));
            jButton5.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton5ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jButton3.getText().equals("Add")){
            cart.add(catalouge.get(2));
            jButton3.setText("Remove");
        }
        else if(jButton3.getText().equals("Remove")){
            cart.remove(catalouge.get(2));
            jButton3.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton3ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jButton4.getText().equals("Add")){
            cart.add(catalouge.get(3));
            jButton4.setText("Remove");
        }
        else if(jButton4.getText().equals("Remove")){
            cart.remove(catalouge.get(3));
            jButton4.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton4ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(jButton6.getText().equals("Add")){
            cart.add(catalouge.get(5));
            jButton6.setText("Remove");
        }
        else if(jButton6.getText().equals("Remove")){
            cart.remove(catalouge.get(5));
            jButton6.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton6ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(jButton7.getText().equals("Add")){
            cart.add(catalouge.get(6));
            jButton7.setText("Remove");
        }
        else if(jButton7.getText().equals("Remove")){
            cart.remove(catalouge.get(6));
            jButton7.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton7ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(jButton8.getText().equals("Add")){
            cart.add(catalouge.get(7));
            jButton8.setText("Remove");
        }
        else if(jButton8.getText().equals("Remove")){
            cart.remove(catalouge.get(7));
            jButton8.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton8ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(jButton9.getText().equals("Add")){
            cart.add(catalouge.get(8));
            jButton9.setText("Remove");
        }
        else if(jButton9.getText().equals("Remove")){
            cart.remove(catalouge.get(8));
            jButton9.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton9ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(jButton10.getText().equals("Add")){
            cart.add(catalouge.get(9));
            jButton10.setText("Remove");
        }
        else if(jButton10.getText().equals("Remove")){
            cart.remove(catalouge.get(9));
            jButton10.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton10ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(jButton11.getText().equals("Add")){
            cart.add(catalouge.get(10));
            jButton11.setText("Remove");
        }
        else if(jButton11.getText().equals("Remove")){
            cart.remove(catalouge.get(10));
            jButton11.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton11ActionPerformed

    // to toggle between Adding and Removing food items on the cart 
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(jButton12.getText().equals("Add")){
            cart.add(catalouge.get(11));
            jButton12.setText("Remove");
        }
        else if(jButton12.getText().equals("Remove")){
            cart.remove(catalouge.get(11));
            jButton12.setText("Add");
        }
        displayCart();
    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
            java.util.logging.Logger.getLogger(ProductDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appetizerPanel;
    private javax.swing.JPanel beveragePanel;
    private javax.swing.JButton checkout;
    private javax.swing.JPanel dessertPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainCoursePanel;
    // End of variables declaration//GEN-END:variables
}
