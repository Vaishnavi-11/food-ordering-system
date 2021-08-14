package my.App;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
    public LogIn() {
        initComponents();
    }

    // dispose current frame to open a new frame
    public void close() {
        java.awt.event.WindowEvent closeWindow = new java.awt.event.WindowEvent(this,
                java.awt.event.WindowEvent.WINDOW_CLOSING);
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")

    // frame components
    private void initComponents() {

        loginPage = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginMain = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        emailField = new javax.swing.JTextField();
        registerPage = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        rPasswordField = new javax.swing.JPasswordField();
        rPassword = new javax.swing.JLabel();
        registerMain = new javax.swing.JButton();
        login = new javax.swing.JButton();
        rEmail = new javax.swing.JLabel();
        rEmailField = new javax.swing.JTextField();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("repEAT");
        setIconImage(new javax.swing.ImageIcon("D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\icon.png").getImage());
        setPreferredSize(new java.awt.Dimension(800, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 650));
        getContentPane().setLayout(null);

        loginPage.setPreferredSize(new java.awt.Dimension(350, 400));
        loginPage.setLayout(null);

        loginLabel.setFont(new java.awt.Font("Colonna MT", 1, 28)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(7, 17, 8));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText(" - - - - - - Log In - - - - - - ");
        loginLabel.setPreferredSize(new java.awt.Dimension(350, 60));
        loginPage.add(loginLabel);
        loginLabel.setBounds(0, 0, 350, 60);

        emailLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(7, 17, 8));
        emailLabel.setText("E-mail ID :");
        emailLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        loginPage.add(emailLabel);
        emailLabel.setBounds(30, 100, 80, 30);

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(7, 17, 8));
        passwordLabel.setText("Password :");
        passwordLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        loginPage.add(passwordLabel);
        passwordLabel.setBounds(30, 160, 80, 30);

        loginMain.setBackground(new java.awt.Color(7, 17, 8));
        loginMain.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginMain.setForeground(new java.awt.Color(250, 237, 219));
        loginMain.setText("Log In");
        loginMain.setBorderPainted(false);
        loginMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        loginMain.setFocusable(false);
        loginMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMainActionPerformed(evt);
            }
        });
        loginPage.add(loginMain);
        loginMain.setBounds(170, 220, 73, 30);

        label2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(177, 17, 8));
        label2.setText("Don't have an account?");
        label2.setPreferredSize(new java.awt.Dimension(170, 30));
        loginPage.add(label2);
        label2.setBounds(60, 360, 140, 30);

        register.setBackground(new java.awt.Color(7, 17, 8));
        register.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(250, 237, 219));
        register.setText("Sign Up");
        register.setBorderPainted(false);
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.setFocusable(false);
        register.setPreferredSize(new java.awt.Dimension(100, 30));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        loginPage.add(register);
        register.setBounds(200, 360, 80, 30);

        passwordField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        passwordField.setForeground(new java.awt.Color(7, 17, 8));
        passwordField.setPreferredSize(new java.awt.Dimension(200, 30));
        loginPage.add(passwordField);
        passwordField.setBounds(110, 160, 200, 30);

        emailField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        emailField.setForeground(new java.awt.Color(7, 17, 8));
        emailField.setPreferredSize(new java.awt.Dimension(200, 30));
        loginPage.add(emailField);
        emailField.setBounds(110, 100, 200, 30);

        getContentPane().add(loginPage);
        loginPage.setBounds(220, 110, 350, 400);

        registerPage.setLayout(null);

        registerLabel.setFont(new java.awt.Font("Colonna MT", 1, 28)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(7, 17, 8));
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("- - - - - - Sign Up - - - - - -");
        registerLabel.setPreferredSize(new java.awt.Dimension(350, 60));
        registerPage.add(registerLabel);
        registerLabel.setBounds(0, 0, 350, 60);

        fName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        fName.setForeground(new java.awt.Color(7, 17, 8));
        fName.setText("First Name :");
        fName.setMaximumSize(new java.awt.Dimension(74, 20));
        fName.setPreferredSize(new java.awt.Dimension(80, 30));
        registerPage.add(fName);
        fName.setBounds(20, 80, 90, 30);

        lName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lName.setForeground(new java.awt.Color(7, 17, 8));
        lName.setText("Last Name :");
        registerPage.add(lName);
        lName.setBounds(20, 120, 83, 30);

        label1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(177, 17, 8));
        label1.setText("Already Signed Up?");
        label1.setPreferredSize(new java.awt.Dimension(140, 30));
        registerPage.add(label1);
        label1.setBounds(60, 360, 120, 30);

        fNameField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        fNameField.setForeground(new java.awt.Color(7, 17, 8));
        registerPage.add(fNameField);
        fNameField.setBounds(110, 80, 200, 30);

        lNameField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lNameField.setForeground(new java.awt.Color(7, 17, 8));
        lNameField.setActionCommand("<Not Set>");
        registerPage.add(lNameField);
        lNameField.setBounds(110, 120, 200, 30);

        rPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rPasswordField.setForeground(new java.awt.Color(7, 17, 8));
        rPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPasswordFieldActionPerformed(evt);
            }
        });
        registerPage.add(rPasswordField);
        rPasswordField.setBounds(110, 200, 200, 30);

        rPassword.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        rPassword.setForeground(new java.awt.Color(7, 17, 8));
        rPassword.setText("Password :");
        registerPage.add(rPassword);
        rPassword.setBounds(30, 200, 80, 30);

        registerMain.setBackground(new java.awt.Color(7, 17, 8));
        registerMain.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        registerMain.setForeground(new java.awt.Color(250, 237, 219));
        registerMain.setText("Sign Up");
        registerMain.setBorderPainted(false);
        registerMain.setFocusable(false);
        registerMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMainActionPerformed(evt);
            }
        });
        registerMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerPage.add(registerMain);
        registerMain.setBounds(170, 260, 80, 30);

        login.setBackground(new java.awt.Color(7, 17, 8));
        login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(250, 237, 219));
        login.setText("Log In");
        login.setToolTipText("");
        login.setBorderPainted(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setPreferredSize(new java.awt.Dimension(100, 30));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        registerPage.add(login);
        login.setBounds(180, 360, 80, 30);

        rEmail.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        rEmail.setForeground(new java.awt.Color(7, 17, 8));
        rEmail.setText("E-mail ID :");
        rEmail.setPreferredSize(new java.awt.Dimension(79, 30));
        registerPage.add(rEmail);
        rEmail.setBounds(30, 160, 80, 30);

        rEmailField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rEmailField.setForeground(new java.awt.Color(7, 17, 8));
        rEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmailFieldActionPerformed(evt);
            }
        });
        registerPage.add(rEmailField);
        rEmailField.setBounds(110, 160, 200, 30);

        getContentPane().add(registerPage);
        registerPage.setBounds(220, 110, 350, 400);
        registerPage.setVisible(false);

        bgImage.setIcon(new javax.swing.ImageIcon(
                "D:\\BMSCE\\IV Sem\\JAVA\\Project\\DraftProjectNetbeans\\food_delivery\\images\\login-page-bg_edited.jpg")); // NOI18N
        getContentPane().add(bgImage);
        bgImage.setBounds(0, 0, 800, 650);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }

    // to navigate from sign up panel to login panel on button click
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == login) {
            loginPage.setVisible(true);
            registerPage.setVisible(false);
        }
    }

    // validates email entered by the user
    private void rEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {
        if (!(rEmailField.getText()).matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
            JOptionPane.showMessageDialog(null, "Invalid Email!", "Error", JOptionPane.ERROR_MESSAGE);
        emailField.setText("");
    }

    // validates the user password
    private void rPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
        if (rPasswordField.getPassword().length < 6)
            JOptionPane.showMessageDialog(null, "Password must be greater than 6 characters!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        passwordField.setText("");
    }

    // to log into the application after checking the credentials stored on the database
    private void loginMainActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // connect to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
            
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            PreparedStatement loginsmt = conn.prepareStatement("select * from customer where emailid = ?");
            if (email.length() < 1 || password.length() < 1)
                JOptionPane.showMessageDialog(null, "Enter Email/Password!", "ERROR", JOptionPane.ERROR_MESSAGE);
            else {
                Statement query = conn.createStatement();
                ResultSet result = query
                        .executeQuery("SELECT * FROM user WHERE email='" + email + "'AND password='" + password + "'");
                if (result.next()) {
                    do {
                        String useremail = result.getString(2), fname = "", lname = "", username;
                        loginsmt.setString(1, useremail);
                        ResultSet rsSet = loginsmt.executeQuery();
                        while (rsSet.next()) {
                            fname = rsSet.getString(1);
                            lname = rsSet.getString(2);
                        }
                        username = fname + " " + lname;
                        JOptionPane.showMessageDialog(null, "Welcome '" + username + "'", "Log In Successful",
                                JOptionPane.PLAIN_MESSAGE);
                        close();
                        new ProductDashboard(useremail).setVisible(true);
                    } while (result.next());
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Email/Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (SQLException | ClassNotFoundException | NoClassDefFoundError ex) {
            System.out.println(ex);
        }
    }

    // to navigate from login panel to sign up panel on button click
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == register) {
            loginPage.setVisible(false);
            registerPage.setVisible(true);
        }
    }

    // to sign up the user and store their credentials on the database
    private void registerMainActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
            Statement query = conn.createStatement();
            String first = fNameField.getText();
            String last = lNameField.getText();
            String email = rEmailField.getText();
            String password = new String(rPasswordField.getPassword());
            if (email.length() < 1 || password.length() < 1 || first.length() < 1 || last.length() < 1)
                JOptionPane.showMessageDialog(null, "Enter valid details!", "ERROR", JOptionPane.ERROR_MESSAGE);
            else {
                ResultSet result = query.executeQuery("SELECT * FROM user WHERE email='" + email + "'");
                if (result.next()) {
                    JOptionPane.showMessageDialog(null, "User Already Exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    rEmailField.setText("");
                    rPasswordField.setText("");
                } else {
                    Statement querysmt = conn.createStatement();
                    String query1 = "INSERT into customer (fname,lname,emailid)values ('" + first + "','" + last + "','"
                            + email + "');";
                    String query2 = "INSERT into user (email,password) values ('" + email + "','" + password + "');";
                    querysmt.addBatch(query1);
                    querysmt.addBatch(query2);
                    querysmt.executeBatch();
                    JOptionPane.showMessageDialog(null, "Thank You for Signing Up", "Signed Up Successfully",
                            JOptionPane.PLAIN_MESSAGE);
                    close();
                    new ProductDashboard(email).setVisible(true);
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) throws SQLException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/draftbase", "root", "1220");
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Couldn't connect to Database!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField fNameField;
    private javax.swing.JLabel lName;
    private javax.swing.JTextField lNameField;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton login;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton loginMain;
    private javax.swing.JPanel loginPage;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel rEmail;
    private javax.swing.JTextField rEmailField;
    private javax.swing.JLabel rPassword;
    private javax.swing.JPasswordField rPasswordField;
    private javax.swing.JButton register;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JButton registerMain;
    private javax.swing.JPanel registerPage;
    // End of variables declaration//GEN-END:variables
}
