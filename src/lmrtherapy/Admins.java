
package lmrtherapy;

import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public final class Admins extends javax.swing.JFrame {

    
    public Admins() {
        initComponents();
       loadTableData();
    }
    
public void loadTableData() {
    String SUrl = "jdbc:mysql://localhost:3306/lmrtherapycenter";
    String SUser = "root";
    String SPass = "";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        Statement st = con.createStatement();
        String query = "SELECT client_id, clientname, gender, dateofbirth, diagnosis, enrolled FROM clientinformation";
        ResultSet rs = st.executeQuery(query);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] row = {
                rs.getString("client_id"),
                rs.getString("clientname"),
                rs.getString("gender"),
                rs.getString("dateofbirth"),
                rs.getString("diagnosis"),
                rs.getString("enrolled"),
            };
            model.addRow(row);
        }

        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
    }
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        enrolled = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Form = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nn = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        d = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        tn = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        year2 = new javax.swing.JTextField();
        year1 = new javax.swing.JTextField();
        year3 = new javax.swing.JTextField();
        year4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ns = new javax.swing.JTextField();
        yl = new javax.swing.JTextField();
        hs = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        me25 = new javax.swing.JTextField();
        me26 = new javax.swing.JTextField();
        me27 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        me2 = new javax.swing.JTextField();
        me28 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        me3 = new javax.swing.JTextField();
        me4 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        me5 = new javax.swing.JTextField();
        me6 = new javax.swing.JTextField();
        me7 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        me8 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        me15 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        me16 = new javax.swing.JTextField();
        me17 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        me9 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        me10 = new javax.swing.JTextField();
        me11 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        me1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        me18 = new javax.swing.JTextField();
        me19 = new javax.swing.JTextField();
        me20 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        me12 = new javax.swing.JTextField();
        me13 = new javax.swing.JTextField();
        me14 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        me21 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        me22 = new javax.swing.JTextField();
        me23 = new javax.swing.JTextField();
        me24 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        me29 = new javax.swing.JTextField();
        me30 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel80 = new javax.swing.JLabel();
        me31 = new javax.swing.JTextField();
        me32 = new javax.swing.JTextField();
        me33 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        me34 = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel95 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        methro = new javax.swing.JTextField();
        me36 = new javax.swing.JTextField();
        me35 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        me37 = new javax.swing.JTextField();
        mekick = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        me39 = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        me38 = new javax.swing.JTextField();
        me40 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        me43 = new javax.swing.JTextField();
        me42 = new javax.swing.JTextField();
        me41 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        me44 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jPanel20 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        me47 = new javax.swing.JTextField();
        me45 = new javax.swing.JTextField();
        me46 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        me53 = new javax.swing.JTextField();
        me52 = new javax.swing.JTextField();
        me51 = new javax.swing.JTextField();
        me50 = new javax.swing.JTextField();
        me49 = new javax.swing.JTextField();
        me48 = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        me58 = new javax.swing.JTextField();
        me57 = new javax.swing.JTextField();
        me56 = new javax.swing.JTextField();
        me55 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        me54 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel133 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 32767));
        db = new com.toedter.calendar.JDateChooser();
        g = new javax.swing.JComboBox<>();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        re1 = new javax.swing.JComboBox<>();
        re2 = new javax.swing.JComboBox<>();
        re3 = new javax.swing.JComboBox<>();
        re4 = new javax.swing.JComboBox<>();
        re5 = new javax.swing.JComboBox<>();
        re6 = new javax.swing.JComboBox<>();
        re7 = new javax.swing.JComboBox<>();
        re8 = new javax.swing.JComboBox<>();
        re9 = new javax.swing.JComboBox<>();
        re10 = new javax.swing.JComboBox<>();
        re11 = new javax.swing.JComboBox<>();
        re12 = new javax.swing.JComboBox<>();
        re13 = new javax.swing.JComboBox<>();
        re14 = new javax.swing.JComboBox<>();
        re15 = new javax.swing.JComboBox<>();
        re16 = new javax.swing.JComboBox<>();
        re17 = new javax.swing.JComboBox<>();
        re18 = new javax.swing.JComboBox<>();
        re19 = new javax.swing.JComboBox<>();
        re20 = new javax.swing.JComboBox<>();
        re21 = new javax.swing.JComboBox<>();
        re22 = new javax.swing.JComboBox<>();
        re23 = new javax.swing.JComboBox<>();
        re24 = new javax.swing.JComboBox<>();
        re25 = new javax.swing.JComboBox<>();
        re26 = new javax.swing.JComboBox<>();
        re27 = new javax.swing.JComboBox<>();
        re28 = new javax.swing.JComboBox<>();
        re29 = new javax.swing.JComboBox<>();
        re30 = new javax.swing.JComboBox<>();
        re31 = new javax.swing.JComboBox<>();
        re32 = new javax.swing.JComboBox<>();
        re33 = new javax.swing.JComboBox<>();
        re34 = new javax.swing.JComboBox<>();
        re35 = new javax.swing.JComboBox<>();
        re36 = new javax.swing.JComboBox<>();
        rethro = new javax.swing.JComboBox<>();
        rekick = new javax.swing.JComboBox<>();
        re37 = new javax.swing.JComboBox<>();
        re38 = new javax.swing.JComboBox<>();
        re39 = new javax.swing.JComboBox<>();
        re40 = new javax.swing.JComboBox<>();
        re41 = new javax.swing.JComboBox<>();
        re42 = new javax.swing.JComboBox<>();
        re43 = new javax.swing.JComboBox<>();
        re44 = new javax.swing.JComboBox<>();
        re45 = new javax.swing.JComboBox<>();
        re46 = new javax.swing.JComboBox<>();
        re47 = new javax.swing.JComboBox<>();
        re48 = new javax.swing.JComboBox<>();
        re49 = new javax.swing.JComboBox<>();
        re50 = new javax.swing.JComboBox<>();
        re51 = new javax.swing.JComboBox<>();
        re52 = new javax.swing.JComboBox<>();
        re53 = new javax.swing.JComboBox<>();
        re54 = new javax.swing.JComboBox<>();
        re55 = new javax.swing.JComboBox<>();
        re56 = new javax.swing.JComboBox<>();
        re57 = new javax.swing.JComboBox<>();
        re58 = new javax.swing.JComboBox<>();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));
        l = new javax.swing.JComboBox<>();
        loc1 = new javax.swing.JComboBox<>();
        loc2 = new javax.swing.JComboBox<>();
        loc3 = new javax.swing.JComboBox<>();
        loc4 = new javax.swing.JComboBox<>();
        col1 = new javax.swing.JComboBox<>();
        col2 = new javax.swing.JComboBox<>();
        col3 = new javax.swing.JComboBox<>();
        col4 = new javax.swing.JComboBox<>();
        day1 = new javax.swing.JComboBox<>();
        day2 = new javax.swing.JComboBox<>();
        day3 = new javax.swing.JComboBox<>();
        day4 = new javax.swing.JComboBox<>();
        as = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dates = new com.toedter.calendar.JDateChooser();
        searchfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        selectedDate = new com.toedter.calendar.JDateChooser();
        Check1 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        appoint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Gender", "Date of Birth", "Diagnosis", "Enrolled"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(30);
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(0).setMaxWidth(30);
            table.getColumnModel().getColumn(1).setMinWidth(150);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(1).setMaxWidth(150);
            table.getColumnModel().getColumn(2).setMinWidth(50);
            table.getColumnModel().getColumn(2).setPreferredWidth(50);
            table.getColumnModel().getColumn(2).setMaxWidth(50);
            table.getColumnModel().getColumn(3).setMinWidth(100);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
            table.getColumnModel().getColumn(3).setMaxWidth(100);
            table.getColumnModel().getColumn(5).setMinWidth(75);
            table.getColumnModel().getColumn(5).setPreferredWidth(50);
            table.getColumnModel().getColumn(5).setMaxWidth(75);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Client ID:");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LOVE MEMOIRS RECOVERY THERAPY CENTER ADMIN");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        enrolled.setText("Enrolled");
        enrolled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrolledActionPerformed(evt);
            }
        });

        SearchField.setMinimumSize(new java.awt.Dimension(200, 30));

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Patient Form");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Patient Name:");

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Preferred/Nickname:");

        nn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Date of Birth:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Gender:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Address:");

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Diagnosis:");

        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("If ASD, Level: ");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Physician: ");

        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Clinic Name:");

        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Other Therapy Provider:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Type of Therapy");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Years in Treatment");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Day");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Location");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Open for Collaboration");

        jLabel12.setText("Occupational Therapy");

        jLabel16.setText("<html><center>Speech and Language <br>Therapy</center></html>");

        jLabel17.setText("Other Therapy ");

        jLabel25.setText("Psychotherapy");

        year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1ActionPerformed(evt);
            }
        });

        year3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year3ActionPerformed(evt);
            }
        });

        year4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year4ActionPerformed(evt);
            }
        });

        jLabel26.setText("Therapy Name:");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("Education History");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Does the client is currently attending school?");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Name of School:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Year Level: ");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("School Hours: ");

        ns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsActionPerformed(evt);
            }
        });

        yl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ylActionPerformed(evt);
            }
        });

        hs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsActionPerformed(evt);
            }
        });

        jLabel74.setText("10. Stays in place with peers? ");

        jLabel75.setText("11. Accepts invitation of peers? ");

        jLabel76.setText("12. Cooperate in group play? ");

        jLabel77.setText("13. Take turns in a game? ");

        me25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                me25ActionPerformed(evt);
            }
        });

        me27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                me27ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 255, 255));
        jLabel31.setText("Intake Skill Assessment Checklist");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel31))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 255, 255));
        jLabel35.setText("Language Skills");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel35))
        );

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setText("1. Does your child imitates actions of others.");

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel78.setText("14. Following changes in the game? ");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("2. Copy sounds or words others make? ");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("3. Indicates what he/she wants? ");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setText("4. Use words to ask for things? ");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setText("5. Labels items they see or hear? ");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setText("6. Ask \"Wh\" questions? ");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setText("7. Responds to \"Wh\" questions? ");

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 255, 255));
        jLabel58.setText("Social Skills");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel58))
        );

        jLabel59.setText("1. Responds to their names when called by looking? ");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 255, 255));
        jLabel46.setText("Play Skills");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel46))
        );

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setText("1. Reading books? ");

        jLabel62.setText("2. Looks at you when talking to you? ");

        jLabel63.setText("3. Greets family members when arrive home?");

        me11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                me11ActionPerformed(evt);
            }
        });

        jLabel65.setText("4. Show emotion when someone is happy or sad?");

        jLabel48.setText("2. Play with cause and effects toys? (e.g.,  ");

        jLabel66.setText("5. Look at peers when talking? ");

        jLabel49.setText("blowing and popping bubbles)");

        jLabel67.setText("6. Playing with peers? ");

        jLabel50.setText("3. Complete task completion tasks? (e.g., ");

        jLabel51.setText("4. Plays with toys functionally? (e.g., driving cars ");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel52.setText("on ramp, putting the play pot in the toy stove)");

        jLabel53.setText("5. Engages to pretend play (e.g.,");

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel57.setText("puzzles, shape sorters, etc.)");

        jLabel60.setText("pretends to cook with the kitchen set toy");

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel61.setText("6. Prefer to play alone? ");

        jLabel64.setText("7. Prefer to play with others?  ");

        jLabel71.setText("7. Initiating conversation? ");

        jLabel72.setText("8. Responding to the questions properly? ");

        jLabel73.setText("9. Sharing toys with peers/siblings? ");

        me29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                me29ActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(204, 255, 255));
        jLabel69.setText("Fine Motor Skills");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel69))
        );

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel80.setText("1. Can hold the spoon and fork while eating?");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel81.setText("2. Can hold the cup when drinking water? ");

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel82.setText("3. Can write independently? ");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel83.setText("4. Can pick up coin on the floor? ");

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel84.setText("5. Can twist the water bottle cap? ");

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel85.setText("6. Can button buttoned shirt? ");

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel95.setText("c. Can kick the ball? ");

        jLabel94.setText("b. Can throw the ball? ");

        jLabel93.setText("2. Play ball game activity: a. Can catch the ball? ");

        me35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                me35ActionPerformed(evt);
            }
        });

        jLabel92.setText("1. Climb up stairs? ");

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel97.setText("4. Balance with 1 foot? ");

        jLabel96.setText("3. Can ride a bike? ");

        me39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                me39ActionPerformed(evt);
            }
        });

        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator23.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(204, 255, 255));
        jLabel101.setText("Gross Motor Skills");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel101)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel101))
        );

        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel103.setText("5. Finish an obstacle course? ");

        jLabel102.setText("6. Jump ");

        jLabel105.setText("2. Smooth Texture?");

        me41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                me41ActionPerformed(evt);
            }
        });

        jLabel104.setText("1. Rough Texture?");

        jSeparator26.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel107.setText("4. Spinning");

        jLabel106.setText("3. Slimy Texture?");

        jSeparator27.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator28.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));

        jLabel114.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(204, 255, 255));
        jLabel114.setText("Sensory Input");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel114)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel114))
        );

        jSeparator29.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel98.setText("Skill Question");

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel99.setText("Remarks");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel100.setText("Comments");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setText("Remarks");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel86.setText("Skill Question");

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel88.setText("Comments");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setText("Skill Question");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel79.setText("Remarks");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setText("Comments");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Skill Question");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("Remarks");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Comments");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Skill Question");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Remarks");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Comments");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel113.setText("Comments");

        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel112.setText("Remarks");

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel111.setText("Skill Question");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel124.setText("1. Alphabets?");

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));

        jLabel123.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(204, 255, 255));
        jLabel123.setText("Academic Task");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel123)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel123))
        );

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel133.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel133.setText("Remarks");

        jLabel132.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel132.setText("Comments");

        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel131.setText("2. Numbers? ");

        jLabel130.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel130.setText("3. 2 to 3 letter word? ");

        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel129.setText("4. Sentences? ");

        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel128.setText("5. Write own name? ");

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel127.setText("6. Solving simple math problems? ");

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel126.setText("7. Spell words? ");

        jLabel125.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel125.setText("Skill Question");

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(204, 255, 255));
        jLabel115.setText("Daily Task");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel115)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel115))
        );

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel116.setText("1. Can eat independently? ");

        jLabel120.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel120.setText("Skill Question");

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel119.setText("7. Can go to the toilet alone? ");

        jLabel118.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel118.setText("6. Can independently take a bath? ");

        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel117.setText("5. Can independently wash hands? ");

        jLabel121.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel121.setText("4.Can independently puts clothes off? ");

        jLabel122.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel122.setText("3. Can independently puts clothes on? ");

        jLabel134.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel134.setText("2. Can chew food? ");

        jLabel135.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel135.setText("Comments");

        jLabel136.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel136.setText("Remarks");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("SOMETIMES: For skills the client can do occasionally. ");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("NO: For skills the client cannot do.");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("YES: For skills the client can do.");

        g.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Male", "Female" }));

        re1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        rethro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        rekick.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re37.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re38.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re39.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re40.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re42.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re43.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re44.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re45.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re46.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re47.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re48.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re49.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re50.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re51.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re52.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re53.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re54.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re55.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re56.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re57.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        re58.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No", "Sometimes" }));

        l.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "NA" }));

        loc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Homebased", "Centerbased" }));

        loc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Homebased", "Centerbased" }));

        loc3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Homebased", "Centerbased" }));

        loc4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Homebased", "Centerbased" }));

        col1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Yes", "No" }));

        col2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Yes", "No" }));

        col3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Yes", "No" }));

        col4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Yes", "No" }));

        day1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        day2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        day3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        day4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        as.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Yes", "No" }));

        jLabel4.setText("Date Today:");

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                        .addGap(955, 955, 955)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303)
                        .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(FormLayout.createSequentialGroup()
                                                                    .addGap(234, 234, 234)
                                                                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(FormLayout.createSequentialGroup()
                                                                    .addComponent(jLabel30)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(hs))
                                                                .addGroup(FormLayout.createSequentialGroup()
                                                                    .addComponent(jLabel29)
                                                                    .addGap(36, 36, 36)
                                                                    .addComponent(yl))
                                                                .addGroup(FormLayout.createSequentialGroup()
                                                                    .addComponent(jLabel28)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(ns, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(FormLayout.createSequentialGroup()
                                                                    .addComponent(jLabel27)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel34)
                                                                    .addComponent(jLabel33)
                                                                    .addComponent(jLabel32)
                                                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGroup(FormLayout.createSequentialGroup()
                                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel47)
                                                                            .addComponent(jLabel48)
                                                                            .addComponent(jLabel50)
                                                                            .addComponent(jLabel53)
                                                                            .addComponent(jLabel64)
                                                                            .addComponent(jLabel54)
                                                                            .addComponent(jLabel51)
                                                                            .addComponent(jLabel61)
                                                                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(jLabel49)
                                                                                    .addComponent(jLabel57)
                                                                                    .addComponent(jLabel52)
                                                                                    .addComponent(jLabel60))))
                                                                        .addGap(152, 152, 152)
                                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(me14, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(jLabel56)
                                                                            .addComponent(me9, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(me8, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(me10, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(me11, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(me12, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(me13, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addGroup(FormLayout.createSequentialGroup()
                                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(jLabel38)
                                                                                    .addComponent(jLabel39)
                                                                                    .addComponent(jLabel37)
                                                                                    .addComponent(jLabel41)
                                                                                    .addComponent(jLabel43)
                                                                                    .addComponent(jLabel42)
                                                                                    .addComponent(jLabel36)
                                                                                    .addComponent(jLabel40))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(re5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(jLabel44)
                                                                                    .addComponent(re1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(jLabel55)
                                                                                    .addComponent(re8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(re14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(21, 21, 21)))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(jLabel45)
                                                                            .addComponent(me7, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                                                            .addComponent(me6)
                                                                            .addComponent(me5)
                                                                            .addComponent(me4)
                                                                            .addComponent(me3)
                                                                            .addComponent(me2)
                                                                            .addComponent(me1))))))
                                                        .addGap(82, 82, 82)
                                                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel78)
                                                            .addComponent(jLabel77)
                                                            .addComponent(jLabel76)
                                                            .addComponent(jLabel75)
                                                            .addComponent(jLabel74)
                                                            .addComponent(jLabel73)
                                                            .addComponent(jLabel71)
                                                            .addComponent(jLabel67)
                                                            .addComponent(jLabel66)
                                                            .addComponent(jLabel63)
                                                            .addComponent(jLabel62)
                                                            .addComponent(jLabel59)
                                                            .addComponent(jLabel68)
                                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(20, 20, 20)
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(FormLayout.createSequentialGroup()
                                                                        .addComponent(re45, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(me45, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGroup(FormLayout.createSequentialGroup()
                                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel87)
                                                                            .addComponent(jLabel79)
                                                                            .addComponent(re15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re19, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re20, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re18, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re24, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re23, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re22, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re21, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re27, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re28, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re26, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(re25, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(me24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                                                                        .addComponent(me25, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me26, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me27, javax.swing.GroupLayout.Alignment.LEADING))
                                                                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(me23, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me28, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me20, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me19, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me18, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me17, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me16, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me22, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(me15, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                                                                        .addComponent(me21))
                                                                                    .addComponent(jLabel70)
                                                                                    .addComponent(jLabel88))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addComponent(me34, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(me31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                                                                        .addComponent(me32, javax.swing.GroupLayout.Alignment.LEADING))))
                                                                            .addComponent(me33, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(me29, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(me30, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(97, 97, 97))
                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(jLabel136, javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel133, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(re50, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re51, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re49, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re48, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re47, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re46, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re52, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re53, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re54, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re55, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re56, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re57, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(re58, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                .addGap(311, 311, 311))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createSequentialGroup()
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel85)
                                                            .addComponent(jLabel84)
                                                            .addComponent(jLabel83)
                                                            .addComponent(jLabel82)
                                                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel80)
                                                            .addComponent(jLabel86)
                                                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel102)
                                                            .addComponent(jLabel103)
                                                            .addComponent(jLabel97)
                                                            .addComponent(jLabel96)
                                                            .addComponent(jLabel92)
                                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel94)
                                                                .addComponent(jLabel93)
                                                                .addComponent(jLabel95))
                                                            .addComponent(jLabel98)
                                                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(27, 27, 27)
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(re31, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re29, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re30, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re32, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re33, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re34, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel99)
                                                            .addComponent(re35, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re36, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rethro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rekick, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re37, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re38, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re39, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re40, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(me58, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(me57, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(me47, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(me46, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(me50, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(me51, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(me49, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(me48, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel132))
                                                            .addComponent(me53, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(me54, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(me52, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(me56, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(me55, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(2, 2, 2))
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel111)
                                                            .addComponent(jLabel104)
                                                            .addComponent(jLabel107)
                                                            .addComponent(jLabel106))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(111, 111, 111)
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(me41)
                                                            .addComponent(me42, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(me43, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(me44)
                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                    .addComponent(me40, javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(me39, javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(me38, javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel135)
                                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(mekick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                                                            .addComponent(methro, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(me36, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(jLabel100)
                                                                            .addComponent(me35)
                                                                            .addComponent(me37))
                                                                        .addComponent(jLabel113)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                .addGap(88, 88, 88)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(filler6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(filler7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(308, 308, 308)))
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGap(520, 520, 520)
                                                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(101, 101, 101)
                                                        .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(835, 835, 835))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(115, 115, 115)
                                                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(921, 921, 921))
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGap(289, 289, 289)
                                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(142, 142, 142)
                                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGap(257, 257, 257)
                                                        .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(100, 100, 100)
                                                        .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel125)
                                                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel130)
                                                    .addComponent(jLabel129)
                                                    .addComponent(jLabel128)
                                                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                                                    .addGap(100, 100, 100)
                                                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(188, 188, 188))
                                                                .addGroup(FormLayout.createSequentialGroup()
                                                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel127)
                                                                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(82, 82, 82)))
                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(188, 188, 188)))
                                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGap(291, 291, 291)
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(re42, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re41, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re43, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(re44, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel112)))))
                                            .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel122)
                                            .addComponent(jLabel120)
                                            .addComponent(jLabel121)
                                            .addComponent(jLabel118)
                                            .addComponent(jLabel117)
                                            .addComponent(jLabel119)
                                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addGap(327, 327, 327)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel26)
                                                        .addComponent(jLabel17)))
                                                .addGap(16, 16, 16)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(day4, 0, 83, Short.MAX_VALUE)
                                                        .addComponent(day3, 0, 1, Short.MAX_VALUE)
                                                        .addComponent(day2, 0, 1, Short.MAX_VALUE)
                                                        .addComponent(day1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE))
                                                    .addComponent(tn, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGap(24, 24, 24)
                                                        .addComponent(jLabel7)
                                                        .addGap(30, 30, 30)
                                                        .addComponent(jLabel9)
                                                        .addGap(45, 45, 45))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addGap(113, 113, 113)))
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(year4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(year1)
                                                                .addComponent(year2)
                                                                .addComponent(year3)
                                                                .addComponent(jLabel8)))
                                                        .addGap(69, 69, 69)
                                                        .addComponent(jLabel10)
                                                        .addGap(69, 69, 69)
                                                        .addComponent(jLabel11))
                                                    .addGroup(FormLayout.createSequentialGroup()
                                                        .addGap(162, 162, 162)
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(loc1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(loc2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(loc3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(loc4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(36, 36, 36)
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(col4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(col3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(col2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(col1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(FormLayout.createSequentialGroup()
                                                    .addComponent(jLabel18)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel19)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(36, 36, 36)
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(dates, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cn))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(nn))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createSequentialGroup()
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                .addComponent(jLabel21)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel22))
                                                            .addGroup(FormLayout.createSequentialGroup()
                                                                .addComponent(jLabel23)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createSequentialGroup()
                                                        .addComponent(jLabel20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGap(1901, 1901, 1901))
                            .addComponent(jSeparator2)))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(528, 528, 528))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator10)
                                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(625, 625, 625)))
                        .addGap(10, 10, 10))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filler4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(nn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel19)
                                                .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                            .addComponent(dates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel20)
                                            .addComponent(a))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel21)
                                            .addComponent(d)
                                            .addComponent(jLabel22)
                                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel23)
                                            .addComponent(p)
                                            .addComponent(jLabel24)
                                            .addComponent(c))
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel9))
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(138, 138, 138)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel27)
                                                    .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel28)
                                                    .addComponent(ns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel29)
                                                    .addComponent(yl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel30)
                                                    .addComponent(hs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel32)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel34)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel43)
                                                    .addComponent(jLabel44)
                                                    .addComponent(jLabel45))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel36)
                                                    .addComponent(me1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(re1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel37)
                                                    .addComponent(me2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(re2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel38)
                                                    .addComponent(me3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(re3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel39)
                                                    .addComponent(me4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(re4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel40)
                                                    .addComponent(me5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(re5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel41)
                                                    .addComponent(me6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(re6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(me7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(re7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(loc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(col1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(loc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(col2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(year3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(loc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(col3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(day3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel25))
                                                .addGap(15, 15, 15)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(year4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(loc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(col4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(day4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel17))
                                                .addGap(13, 13, 13)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel26)
                                                    .addComponent(tn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel47)
                                    .addComponent(me8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(me9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48)
                                    .addComponent(re9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel50)
                                    .addComponent(me10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(me11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel53)
                                    .addComponent(me12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(me13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61)
                                    .addComponent(re13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(me14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64)
                                    .addComponent(re14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel79)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59)
                            .addComponent(re15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(me15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel62)
                                .addComponent(re16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)
                            .addComponent(re17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65)
                            .addComponent(re18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)
                            .addComponent(re20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(re19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me20)
                            .addComponent(jLabel71)
                            .addComponent(re21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72)
                            .addComponent(re22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73)
                            .addComponent(re23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74)
                            .addComponent(re24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75)
                            .addComponent(re25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(me25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(re26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77)
                            .addComponent(re28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(me27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(re27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(filler5, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(me34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(re29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(me31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(re30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(me32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(re31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(me33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(re32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84)
                            .addComponent(re33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85)
                            .addComponent(re34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator23))
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(113, 113, 113)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator21)
                                    .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator19)
                                    .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(292, 292, 292)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel113)
                                    .addComponent(jLabel112)
                                    .addComponent(jLabel111))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(re41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(me41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel104))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel105)
                                    .addComponent(re42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(me42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel106)
                                    .addComponent(re43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(me43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel107)
                                    .addComponent(re44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(me44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel100))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(me35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel92)
                                    .addComponent(re35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(me36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel93)
                                    .addComponent(re36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(methro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel94)
                                    .addComponent(rethro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mekick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel95)
                                    .addComponent(rekick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(me37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel96)
                                    .addComponent(re37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(me38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(me39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel103)
                                    .addComponent(re39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addComponent(re40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(me40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addComponent(filler6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel120)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel136)
                                    .addComponent(jLabel135))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel116)
                                    .addComponent(me45)
                                    .addComponent(re45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel134)
                                    .addComponent(me46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel122)
                                    .addComponent(me47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel121)
                                    .addComponent(me48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel117)
                                    .addComponent(me49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel118)
                                    .addComponent(me50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(me51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel133)
                            .addComponent(jLabel132)
                            .addComponent(jLabel125))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me53)
                            .addComponent(jLabel124)
                            .addComponent(re52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel131)
                            .addComponent(re53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel130)
                            .addComponent(re54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel129)
                            .addComponent(re55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel128)
                            .addComponent(re56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel127)
                            .addComponent(re57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(me55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(re58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator5)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                .addComponent(filler7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(86, 86, 86)))
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator8)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator28)
                        .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGap(44, 44, 44)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator26)
                    .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(Form);

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Therapist");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Therapist List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Check1.setText("Check");
        Check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check1ActionPerformed(evt);
            }
        });

        add.setText("Submit");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        appoint.setText("Appointments");
        appoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(4, 4, 4)
                                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(Check1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enrolled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appoint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(search)
                        .addGap(6, 6, 6)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enrolled)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appoint)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refresh)
                        .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(Check1))
                    .addComponent(add))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
    String SUrl = "jdbc:mysql://localhost:3306/lmrtherapycenter";
    String SUser = "root";
    String SPass = "";

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        String searchValue = SearchField.getText().trim(); 

        if (searchValue.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a search value!");
            return;
        }

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(SUrl, SUser, SPass);

        
        String query = "SELECT c.client_id, c.clientname, c.nickname, c.dateofbirth, c.gender, c.address, c.submit," +
               "c.diagnosis, c.ifasdlevel, c.physician, c.clinicname," +
               "o.d1, o.d2, o.d3, o.d4, o.y1, o.y2, o.y3, o.y4, " +
               "o.l1, o.l2, o.l3, o.l4, o.c1, o.c2, o.c3, o.c4, o.therapyname, " +
               "e.sa, e.sn, e.ly, e.sh, " +   
               "a.r1, a.r2, a.r3, a.r4, a.r5, a.r6, a.r7, a.r8, a.r9, a.r10, a.r11, a.r12, a.r13, a.r14, a.r15, a.r16, " +
               "a.r17, a.r18, a.r19, a.r20, a.r21, a.r22, a.r23, a.r24, a.r25, a.r26, a.r27, a.r28, " +
               "a.m1, a.m2, a.m3, a.m4, a.m5, a.m6, a.m7, a.m8, a.m9, a.m10, a.m11, a.m12, a.m13, a.m14, a.m15, a.m16, " +
               "a.m17, a.m18, a.m19, a.m20, a.m21, a.m22, a.m23, a.m24, a.m25, a.m26, a.m27, a.m28, " +
               "b.r29, b.r30, b.r31, b.r32, b.r33, b.r34, b.r35, b.r36, b.r37, b.r38, b.r39, b.r40, b.r41, b.r42, b.r43, b.r44,"+ 
               "d.r45,d.r46,d.r47,d.r48,d.r49,d.r50,d.r51,d.r52,d.r53,d.r54,d.r55,d.r56,d.r57,d.r58, " +
               "b.rthrow, b.rkick, " +
               "b.m29, b.m30, b.m31, b.m32, b.m33, b.m34, b.m35, b.m36, b.m37, b.m38, b.m39, b.m40, b.m41, b.m42, b.m43, b.m44, " +
               "d.m45,d.m46,d.m47,d.m48,d.m49,d.m50,d.m51,d.m52,d.m53,d.m54,d.m55,d.m56,d.m57,d.m58, " +
               "b.mthrow, b.mkick " +  
               "FROM clientinformation c " +  
               "LEFT JOIN othertherapyprovider o ON c.client_id = o.client_id " +
               "LEFT JOIN educationhistory e ON c.client_id = e.client_id " +  
               "LEFT JOIN aintakeskillassessmentchecklist a ON c.client_id = a.client_id " + 
               "LEFT JOIN bintakeskillassessmentchecklist b ON c.client_id = b.client_id " + 
               "LEFT JOIN dintakeskillassessmentchecklist d ON c.client_id = d.client_id " + 
               "WHERE c.client_id LIKE ? OR c.clientname LIKE ? OR c.physician LIKE ? OR e.sa LIKE ?";

        pst = con.prepareStatement(query);
        pst.setString(1, "%" + searchValue + "%");  
        pst.setString(2, "%" + searchValue + "%");  
        pst.setString(3, "%" + searchValue + "%");  
        pst.setString(4, "%" + searchValue + "%");  

        rs = pst.executeQuery();

        if (rs.next()) {
            
            cn.setText(rs.getString("clientname") != null ? rs.getString("clientname") : "");
            nn.setText(rs.getString("nickname") != null ? rs.getString("nickname") : "");
            if (rs.getString("dateofbirth") != null) {
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("dateofbirth"));
                db.setDate(date);
            } else {
                db.setDate(null); 
            }
            if (rs.getString("submit") != null) {
                java.util.Date submitDate = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("submit"));
                dates.setDate(submitDate); 
            } else {
                dates.setDate(null);
            }
    
            g.setSelectedItem(rs.getString("gender") != null ? rs.getString("gender") : "");
            a.setText(rs.getString("address") != null ? rs.getString("address") : "");
            d.setText(rs.getString("diagnosis") != null ? rs.getString("diagnosis") : "");
            l.setSelectedItem(rs.getString("ifasdlevel") != null ? rs.getString("ifasdlevel") : "");  
            p.setText(rs.getString("physician") != null ? rs.getString("physician") : "");
            c.setText(rs.getString("clinicname") != null ? rs.getString("clinicname") : "");
            
            day1.setSelectedItem(rs.getString("d1") != null ? rs.getString("d1") : "");
            day2.setSelectedItem(rs.getString("d2") != null ? rs.getString("d2") : "");
            day3.setSelectedItem(rs.getString("d3") != null ? rs.getString("d3") : "");
            day4.setSelectedItem(rs.getString("d4") != null ? rs.getString("d4") : "");

            year1.setText(rs.getString("y1") != null ? rs.getString("y1") : "");
            year2.setText(rs.getString("y2") != null ? rs.getString("y2") : "");
            year3.setText(rs.getString("y3") != null ? rs.getString("y3") : "");
            year4.setText(rs.getString("y4") != null ? rs.getString("y4") : "");

            loc1.setSelectedItem(rs.getString("l1") != null ? rs.getString("l1") : "");
            loc2.setSelectedItem(rs.getString("l2") != null ? rs.getString("l2") : "");
            loc3.setSelectedItem(rs.getString("l3") != null ? rs.getString("l3") : "");
            loc4.setSelectedItem(rs.getString("l4") != null ? rs.getString("l4") : "");

            col1.setSelectedItem(rs.getString("c1") != null ? rs.getString("c1") : "");
            col2.setSelectedItem(rs.getString("c2") != null ? rs.getString("c2") : "");
            col3.setSelectedItem(rs.getString("c3") != null ? rs.getString("c3") : "");
            col4.setSelectedItem(rs.getString("c4") != null ? rs.getString("c4") : "");

            tn.setText(rs.getString("therapyname") != null ? rs.getString("therapyname") : "");

            
            as.setSelectedItem(rs.getString("sa") != null ? rs.getString("sa") : "");
            ns.setText(rs.getString("sn") != null ? rs.getString("sn") : "");
            yl.setText(rs.getString("ly") != null ? rs.getString("ly") : "");
            hs.setText(rs.getString("sh") != null ? rs.getString("sh") : "");
            
            re1.setSelectedItem(rs.getString("r1") != null ? rs.getString("r1") : "");  
            re2.setSelectedItem(rs.getString("r2") != null ? rs.getString("r2") : "");  
            re3.setSelectedItem(rs.getString("r3") != null ? rs.getString("r3") : "");  
            re4.setSelectedItem(rs.getString("r4") != null ? rs.getString("r4") : "");  
            re5.setSelectedItem(rs.getString("r5") != null ? rs.getString("r5") : "");  
            re6.setSelectedItem(rs.getString("r6") != null ? rs.getString("r6") : "");  
            re7.setSelectedItem(rs.getString("r7") != null ? rs.getString("r7") : "");  
            re8.setSelectedItem(rs.getString("r8") != null ? rs.getString("r8") : "");  
            re9.setSelectedItem(rs.getString("r9") != null ? rs.getString("r9") : "");  
            re10.setSelectedItem(rs.getString("r10") != null ? rs.getString("r10") : "");  

            re11.setSelectedItem(rs.getString("r11") != null ? rs.getString("r11") : "");  
            re12.setSelectedItem(rs.getString("r12") != null ? rs.getString("r12") : "");  
            re13.setSelectedItem(rs.getString("r13") != null ? rs.getString("r13") : "");  
            re14.setSelectedItem(rs.getString("r14") != null ? rs.getString("r14") : "");  
            re15.setSelectedItem(rs.getString("r15") != null ? rs.getString("r15") : "");  
            re16.setSelectedItem(rs.getString("r16") != null ? rs.getString("r16") : "");  
            re17.setSelectedItem(rs.getString("r17") != null ? rs.getString("r17") : "");  
            re18.setSelectedItem(rs.getString("r18") != null ? rs.getString("r18") : "");  
            re19.setSelectedItem(rs.getString("r19") != null ? rs.getString("r19") : "");  
            re20.setSelectedItem(rs.getString("r20") != null ? rs.getString("r20") : "");  

            re21.setSelectedItem(rs.getString("r21") != null ? rs.getString("r21") : "");  
            re22.setSelectedItem(rs.getString("r22") != null ? rs.getString("r22") : "");  
            re23.setSelectedItem(rs.getString("r23") != null ? rs.getString("r23") : "");  
            re24.setSelectedItem(rs.getString("r24") != null ? rs.getString("r24") : "");  
            re25.setSelectedItem(rs.getString("r25") != null ? rs.getString("r25") : "");  
            re26.setSelectedItem(rs.getString("r26") != null ? rs.getString("r26") : "");  
            re27.setSelectedItem(rs.getString("r27") != null ? rs.getString("r27") : "");  
            re28.setSelectedItem(rs.getString("r28") != null ? rs.getString("r28") : "");  
            re29.setSelectedItem(rs.getString("r29") != null ? rs.getString("r29") : "");  
            re30.setSelectedItem(rs.getString("r30") != null ? rs.getString("r30") : "");  

            re31.setSelectedItem(rs.getString("r31") != null ? rs.getString("r31") : "");  
            re32.setSelectedItem(rs.getString("r32") != null ? rs.getString("r32") : "");  
            re33.setSelectedItem(rs.getString("r33") != null ? rs.getString("r33") : "");  
            re34.setSelectedItem(rs.getString("r34") != null ? rs.getString("r34") : "");  
            re35.setSelectedItem(rs.getString("r35") != null ? rs.getString("r35") : "");  
            re36.setSelectedItem(rs.getString("r36") != null ? rs.getString("r36") : "");  
            re37.setSelectedItem(rs.getString("r37") != null ? rs.getString("r37") : "");  
            re38.setSelectedItem(rs.getString("r38") != null ? rs.getString("r38") : "");  
            re39.setSelectedItem(rs.getString("r39") != null ? rs.getString("r39") : "");  
            re40.setSelectedItem(rs.getString("r40") != null ? rs.getString("r40") : "");  

            re41.setSelectedItem(rs.getString("r41") != null ? rs.getString("r41") : "");  
            re42.setSelectedItem(rs.getString("r42") != null ? rs.getString("r42") : "");  
            re43.setSelectedItem(rs.getString("r43") != null ? rs.getString("r43") : "");  
            re44.setSelectedItem(rs.getString("r44") != null ? rs.getString("r44") : "");  
            re45.setSelectedItem(rs.getString("r45") != null ? rs.getString("r45") : "");  
            re46.setSelectedItem(rs.getString("r46") != null ? rs.getString("r46") : "");  
            re47.setSelectedItem(rs.getString("r47") != null ? rs.getString("r47") : "");  
            re48.setSelectedItem(rs.getString("r48") != null ? rs.getString("r48") : "");  
            re49.setSelectedItem(rs.getString("r49") != null ? rs.getString("r49") : "");  
            re50.setSelectedItem(rs.getString("r50") != null ? rs.getString("r50") : "");  

            re51.setSelectedItem(rs.getString("r51") != null ? rs.getString("r51") : "");
            re52.setSelectedItem(rs.getString("r52") != null ? rs.getString("r52") : "");  
            re53.setSelectedItem(rs.getString("r53") != null ? rs.getString("r53") : "");  
            re54.setSelectedItem(rs.getString("r54") != null ? rs.getString("r54") : "");  
            re55.setSelectedItem(rs.getString("r55") != null ? rs.getString("r55") : "");  
            re56.setSelectedItem(rs.getString("r56") != null ? rs.getString("r56") : "");  
            re57.setSelectedItem(rs.getString("r57") != null ? rs.getString("r57") : "");  
            re58.setSelectedItem(rs.getString("r58") != null ? rs.getString("r58") : "");  

            rethro.setSelectedItem(rs.getString("rthrow") != null ? rs.getString("rthrow") : "");  
            rekick.setSelectedItem(rs.getString("rkick") != null ? rs.getString("rkick") : "");  

            me1.setText(rs.getString("m1") != null ? rs.getString("m1") : "");  
            me2.setText(rs.getString("m2") != null ? rs.getString("m2") : "");  
            me3.setText(rs.getString("m3") != null ? rs.getString("m3") : "");  
            me4.setText(rs.getString("m4") != null ? rs.getString("m4") : "");  
            me5.setText(rs.getString("m5") != null ? rs.getString("m5") : "");  
            me6.setText(rs.getString("m6") != null ? rs.getString("m6") : "");  
            me7.setText(rs.getString("m7") != null ? rs.getString("m7") : "");  
            me8.setText(rs.getString("m8") != null ? rs.getString("m8") : "");  
            me9.setText(rs.getString("m9") != null ? rs.getString("m9") : "");  
            me10.setText(rs.getString("m10") != null ? rs.getString("m10") : "");  

            me11.setText(rs.getString("m11") != null ? rs.getString("m11") : "");  
            me12.setText(rs.getString("m12") != null ? rs.getString("m12") : "");  
            me13.setText(rs.getString("m13") != null ? rs.getString("m13") : "");  
            me14.setText(rs.getString("m14") != null ? rs.getString("m14") : "");  
            me15.setText(rs.getString("m15") != null ? rs.getString("m15") : "");  
            me16.setText(rs.getString("m16") != null ? rs.getString("m16") : "");  
            me17.setText(rs.getString("m17") != null ? rs.getString("m17") : "");  
            me18.setText(rs.getString("m18") != null ? rs.getString("m18") : "");  
            me19.setText(rs.getString("m19") != null ? rs.getString("m19") : "");  
            
            me21.setText(rs.getString("m21") != null ? rs.getString("m21") : "");  
            me22.setText(rs.getString("m22") != null ? rs.getString("m22") : "");  
            me23.setText(rs.getString("m23") != null ? rs.getString("m23") : "");  
            me24.setText(rs.getString("m24") != null ? rs.getString("m24") : "");  
            me25.setText(rs.getString("m25") != null ? rs.getString("m25") : "");  
            me26.setText(rs.getString("m26") != null ? rs.getString("m26") : "");  
            me28.setText(rs.getString("m28") != null ? rs.getString("m28") : "");  
            me29.setText(rs.getString("m29") != null ? rs.getString("m29") : "");  
            me30.setText(rs.getString("m30") != null ? rs.getString("m30") : "");  

            me31.setText(rs.getString("m31") != null ? rs.getString("m31") : "");  
            me32.setText(rs.getString("m32") != null ? rs.getString("m32") : "");  
            me33.setText(rs.getString("m33") != null ? rs.getString("m33") : "");  
            me34.setText(rs.getString("m34") != null ? rs.getString("m34") : "");  
            me35.setText(rs.getString("m35") != null ? rs.getString("m35") : "");  
            me36.setText(rs.getString("m36") != null ? rs.getString("m36") : "");  
            me37.setText(rs.getString("m37") != null ? rs.getString("m37") : "");  
            me38.setText(rs.getString("m38") != null ? rs.getString("m38") : "");  
            me39.setText(rs.getString("m39") != null ? rs.getString("m39") : "");
            me40.setText(rs.getString("m40") != null ? rs.getString("m40") : "");  

            me41.setText(rs.getString("m41") != null ? rs.getString("m41") : "");  
            me42.setText(rs.getString("m42") != null ? rs.getString("m42") : "");  
            me43.setText(rs.getString("m43") != null ? rs.getString("m43") : "");  
            me44.setText(rs.getString("m44") != null ? rs.getString("m44") : "");  
            me45.setText(rs.getString("m45") != null ? rs.getString("m45") : "");  
            me46.setText(rs.getString("m46") != null ? rs.getString("m46") : "");  
            me47.setText(rs.getString("m47") != null ? rs.getString("m47") : "");  
            me48.setText(rs.getString("m48") != null ? rs.getString("m48") : "");  
            me49.setText(rs.getString("m49") != null ? rs.getString("m49") : "");  
            me50.setText(rs.getString("m50") != null ? rs.getString("m50") : "");  

            me51.setText(rs.getString("m51") != null ? rs.getString("m51") : "");  
            me52.setText(rs.getString("m52") != null ? rs.getString("m52") : "");  
            me53.setText(rs.getString("m53") != null ? rs.getString("m53") : "");  
            me54.setText(rs.getString("m54") != null ? rs.getString("m54") : "");  
            me55.setText(rs.getString("m55") != null ? rs.getString("m55") : "");  
            me56.setText(rs.getString("m56") != null ? rs.getString("m56") : "");  
            me57.setText(rs.getString("m57") != null ? rs.getString("m57") : "");  
            me58.setText(rs.getString("m58") != null ? rs.getString("m58") : "");  

            methro.setText(rs.getString("mthrow") != null ? rs.getString("mthrow") : "");  
            mekick.setText(rs.getString("mkick") != null ? rs.getString("mkick") : ""); 
        } else {
            JOptionPane.showMessageDialog(null, "No matching records found.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + ex.getMessage());
        }
    }

    }//GEN-LAST:event_searchActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
       loadTableData();
    }//GEN-LAST:event_refreshActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
                                           
    String clientname = cn.getText();
    String nickname = nn.getText();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String birth = (db.getDate() != null) ? sdf.format(db.getDate()) : "";
    String gender = (String) g.getSelectedItem();
    String address = a.getText();
    String diagnosis = d.getText();
    String level = (String) l.getSelectedItem();
    String physician = p.getText();
    String clinic = c.getText();

    String da1 = (String) day1.getSelectedItem();
    String da2 = (String) day2.getSelectedItem();
    String da3 = (String) day3.getSelectedItem();
    String da4 = (String) day4.getSelectedItem();
    String ye1 = year1.getText();
    String ye2 = year2.getText();
    String ye3 = year3.getText();
    String ye4 = year4.getText();
    String lo1 = (String) loc1.getSelectedItem();
    String lo2 = (String) loc2.getSelectedItem();
    String lo3 = (String) loc3.getSelectedItem();
    String lo4 = (String) loc4.getSelectedItem();
    String co1 = (String) col1.getSelectedItem();
    String co2 = (String) col2.getSelectedItem();
    String co3 = (String) col3.getSelectedItem();
    String co4 = (String) col4.getSelectedItem();
    String thn = tn.getText();
    
    String att = (String) as.getSelectedItem();
    String school = ns.getText();
    String year = yl.getText();
    String hours = hs.getText();
    
    String rem1 = re1.getSelectedItem().toString();  String rem2 = re2.getSelectedItem().toString();
    String rem3 = re3.getSelectedItem().toString();  String rem4 = re4.getSelectedItem().toString();
    String rem5 = re5.getSelectedItem().toString();  String rem6 = re6.getSelectedItem().toString();
    String rem7 = re7.getSelectedItem().toString();  String rem8 = re8.getSelectedItem().toString();
    String rem9 = re9.getSelectedItem().toString();  String rem10 = re10.getSelectedItem().toString();

    String rem11 = re11.getSelectedItem().toString();  String rem12 = re12.getSelectedItem().toString();
    String rem13 = re13.getSelectedItem().toString();  String rem14 = re14.getSelectedItem().toString();
    String rem15 = re15.getSelectedItem().toString();  String rem16 = re16.getSelectedItem().toString();
    String rem17 = re17.getSelectedItem().toString();  String rem18 = re18.getSelectedItem().toString();
    String rem19 = re19.getSelectedItem().toString();  String rem20 = re20.getSelectedItem().toString();

    String rem21 = re21.getSelectedItem().toString();  String rem22 = re22.getSelectedItem().toString();
    String rem23 = re23.getSelectedItem().toString();  String rem24 = re24.getSelectedItem().toString();
    String rem25 = re25.getSelectedItem().toString();  String rem26 = re26.getSelectedItem().toString();
    String rem27 = re27.getSelectedItem().toString();  String rem28 = re28.getSelectedItem().toString();
    String rem29 = re29.getSelectedItem().toString();  String rem30 = re30.getSelectedItem().toString();

    String rem31 = re31.getSelectedItem().toString();  String rem32 = re32.getSelectedItem().toString();
    String rem33 = re33.getSelectedItem().toString();  String rem34 = re34.getSelectedItem().toString();
    String rem35 = re35.getSelectedItem().toString();  String rem36 = re36.getSelectedItem().toString();
    String rem37 = rethro.getSelectedItem().toString();  String rem38 = rekick.getSelectedItem().toString();
    String rem39 = re39.getSelectedItem().toString();  String rem40 = re40.getSelectedItem().toString();

    String rem41 = re41.getSelectedItem().toString();  String rem42 = re42.getSelectedItem().toString();
    String rem43 = re43.getSelectedItem().toString();  String rem44 = re44.getSelectedItem().toString();
    String rem45 = re45.getSelectedItem().toString();  String rem46 = re46.getSelectedItem().toString();
    String rem47 = re47.getSelectedItem().toString();  String rem48 = re48.getSelectedItem().toString();
    String rem49 = re49.getSelectedItem().toString();  String rem50 = re50.getSelectedItem().toString();

    String rem51 = re51.getSelectedItem().toString();  String rem52 = re52.getSelectedItem().toString();
    String rem53 = re53.getSelectedItem().toString();  String rem54 = re54.getSelectedItem().toString();
    String rem55 = re55.getSelectedItem().toString();  String rem56 = re56.getSelectedItem().toString();
    String rem57 = re57.getSelectedItem().toString();  String rem58 = re58.getSelectedItem().toString();
    String rthrow = rethro.getSelectedItem().toString();  String rkick = rekick.getSelectedItem().toString();


    String men1 = ""; String men7 = ""; String men13 = ""; String men19 = ""; String men25 = "";
    String men2 = ""; String men8 = ""; String men14 = ""; String men20 = ""; String men26 = "";
    String men3 = ""; String men9 = ""; String men15 = ""; String men21 = ""; String men27 = "";
    String men4 = ""; String men10 = ""; String men16 = ""; String men22 = ""; String men28 = "";
    String men5 = ""; String men11 = ""; String men17 = ""; String men23 = ""; String men29 = "";
    String men6 = ""; String men12 = ""; String men18 = ""; String men24 = ""; String men30 = "";
    String men31 = ""; String men32 = ""; String men33 = ""; String men34 = ""; String men35 = "";
    String men36 = ""; String men37 = ""; String men38 = ""; String men39 = ""; String men40 = "";
    String men41 = ""; String men42 = ""; String men43 = ""; String men44 = ""; String men45 = "";
    String men46 = ""; String men47 = ""; String men48 = ""; String men49 = ""; String men50 = "";
    String men51 = ""; String men52 = ""; String men53 = ""; String men54 = ""; String men55 = "";
    String men56 = ""; String men57 = ""; String men58 = "";
    String mthrow = ""; String mkick = "";
    
    if (clientname.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please search a client first!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        
        String SUrl = "jdbc:mysql://localhost:3306/lmrtherapycenter";
        String SUser = "root";
        String SPass = "";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

        
        String query1 = "SELECT client_id FROM clientinformation WHERE clientname = ?";
        PreparedStatement pst1 = con.prepareStatement(query1);
        pst1.setString(1, clientname);
        ResultSet rs = pst1.executeQuery();
        
        int clientId = -1;
        if (rs.next()) {
            clientId = rs.getInt("client_id");
        } else {
            JOptionPane.showMessageDialog(this, "Client not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        String query2 = "UPDATE clientinformation SET nickname=?, dateofbirth=?, gender=?, address=?, diagnosis=?, ifasdlevel=?, physician=?, clinicname=? WHERE client_id=?";
        PreparedStatement pst2 = con.prepareStatement(query2);
        pst2.setString(1, nickname);
        pst2.setString(2, birth);
        pst2.setString(3, gender);
        pst2.setString(4, address);
        pst2.setString(5, diagnosis);
        pst2.setString(6, level);  
        pst2.setString(7, physician);
        pst2.setString(8, clinic);
        pst2.setInt(9, clientId); 
        pst2.executeUpdate();

        // Update othertherapyprovider
        String query3 = "UPDATE othertherapyprovider SET d1=?, d2=?, d3=?, d4=?, y1=?, y2=?, y3=?, y4=?, l1=?, l2=?, l3=?, l4=?, c1=?, c2=?, c3=?, c4=?, therapyname=?       WHERE client_id=?";
        PreparedStatement pst3 = con.prepareStatement(query3);
        pst3.setString(1, da1);
        pst3.setString(2, da2);
        pst3.setString(3, da3);
        pst3.setString(4, da4);
        pst3.setString(5, ye1);
        pst3.setString(6, ye2);
        pst3.setString(7, ye3);
        pst3.setString(8, ye4);
        pst3.setString(9, lo1);
        pst3.setString(10, lo2);
        pst3.setString(11, lo3);
        pst3.setString(12, lo4);
        pst3.setString(13, co1);
        pst3.setString(14, co2);
        pst3.setString(15, co3);
        pst3.setString(16, co4);
        pst3.setString(17, thn);
        pst3.setInt(18, clientId);
        pst3.executeUpdate();
        
        String query4 = "UPDATE educationhistory SET sa=?,sn=?,ly=?,sh=? WHERE client_id=?";
        PreparedStatement pst4 = con.prepareStatement(query4);
        pst4.setString(1, att);pst4.setString(2, school);pst4.setString(3, year);
        pst4.setString(4, hours);pst4.setInt(5, clientId);
        pst4.executeUpdate();
        
        String query5 = "UPDATE aintakeskillassessmentchecklist SET " +
                     "r1 = ?, r2 = ?, r3 = ?, r4 = ?, r5 = ?, r6 = ?, r7 = ?, r8 = ?, r9 = ?, r10 = ?, " +
                     "r11 = ?, r12 = ?, r13 = ?, r14 = ?, r15 = ?, r16 = ?, r17 = ?, r18 = ?, r19 = ?, r20 = ?, " +
                     "r21 = ?, r22 = ?, r23 = ?, r24 = ?, r25 = ?, r26 = ?, r27 = ?, r28 = ?, " +
                     "m1 = ?, m2 = ?, m3 = ?, m4 = ?, m5 = ?, m6 = ?, m7 = ?, m8 = ?, m9 = ?, m10 = ?, " +
                     "m11 = ?, m12 = ?, m13 = ?, m14 = ?, m15 = ?, m16 = ?, m17 = ?, m18 = ?, m19 = ?, m20 = ?, " +
                     "m21 = ?, m22 = ?, m23 = ?, m24 = ?, m25 = ?, m26 = ?, m27 = ?, m28 = ? " + 
                     "WHERE client_id = ?";
        PreparedStatement pst5 = con.prepareStatement(query5);
        pst5.setString(1, rem1);   pst5.setString(2, rem2);   pst5.setString(3, rem3);   pst5.setString(4, rem4);   pst5.setString(5, rem5);  
        pst5.setString(6, rem6);   pst5.setString(7, rem7);   pst5.setString(8, rem8);   pst5.setString(9, rem9);   pst5.setString(10, rem10);  
        pst5.setString(11, rem11); pst5.setString(12, rem12); pst5.setString(13, rem13); pst5.setString(14, rem14); pst5.setString(15, rem15);  
        pst5.setString(16, rem16); pst5.setString(17, rem17); pst5.setString(18, rem18); pst5.setString(19, rem19); pst5.setString(20, rem20);  
        pst5.setString(21, rem21); pst5.setString(22, rem22); pst5.setString(23, rem23); pst5.setString(24, rem24); pst5.setString(25, rem25);  
        pst5.setString(26, rem26); pst5.setString(27, rem27); pst5.setString(28, rem28);
        
        pst5.setString(29, men1);pst5.setString(35, men7);pst5.setString(41, men13);pst5.setString(47, men19);pst5.setString(52, men24);
        pst5.setString(30, men2);pst5.setString(36, men8);pst5.setString(42, men14);pst5.setString(48, men20);pst5.setString(53, men25);
        pst5.setString(31, men3);pst5.setString(37, men9);pst5.setString(43, men15);pst5.setString(49, men21);pst5.setString(54, men26);
        pst5.setString(32, men4);pst5.setString(38, men10);pst5.setString(44, men16);pst5.setString(50, men22);pst5.setString(55, men27);
        pst5.setString(33, men5);pst5.setString(39, men11);pst5.setString(45, men17);pst5.setString(51, men23);pst5.setString(56, men28);
        pst5.setString(34, men6);pst5.setString(40, men12);pst5.setString(46, men18);pst5.setInt(57, clientId);
        pst5.executeUpdate();
        
        String query6 = "UPDATE bintakeskillassessmentchecklist SET" +
                " r29 = ?, r30 = ?, r31 = ?, r32 = ?, r33 = ?, r34 = ?, r35 = ?, r36 = ?, r37 = ?, r38 = ?, r39 = ?, r40 = ?, " +
                "r41 = ?, r42 = ?, r43 = ?, r44 = ?, rthrow = ?, rkick = ?, " +
                "m29 = ?, m30 = ?, m31 = ?, m32 = ?, m33 = ?, m34 = ?, m35 = ?, m36 = ?, m37 = ?, m38 = ?, m39 = ?, m40 = ?, " +
                "m41 = ?, m42 = ?, m43 = ?, m44 = ?, mthrow = ?, mkick = ? WHERE client_id = ?";

        PreparedStatement pst6 = con.prepareStatement(query6);

        pst6.setString(1, rem29); pst6.setString(2, rem30); pst6.setString(3, rem31); pst6.setString(4, rem32);
        pst6.setString(5, rem33); pst6.setString(6, rem34); pst6.setString(7, rem35); pst6.setString(8, rem36);
        pst6.setString(9, rem37); pst6.setString(10, rem38); pst6.setString(11, rem39); pst6.setString(12, rem40);
        pst6.setString(13, rem41); pst6.setString(14, rem42); pst6.setString(15, rem43); pst6.setString(16, rem44);

        pst6.setString(17, rthrow); pst6.setString(18, rkick);

        pst6.setString(19, men29); pst6.setString(20, men30); pst6.setString(21, men31); pst6.setString(22, men32);
        pst6.setString(26, men33); pst6.setString(25, men34); pst6.setString(24, men35); pst6.setString(23, men36);
        pst6.setString(27, men37); pst6.setString(28, men38); pst6.setString(29, men39); pst6.setString(30, men40);
        pst6.setString(34, men41); pst6.setString(33, men42); pst6.setString(32, men43); pst6.setString(31, men44);

        pst6.setString(35, mthrow); pst6.setString(36, mkick);pst6.setInt(37, clientId);
        pst6.executeUpdate();  
        
        String query7 = "UPDATE dintakeskillassessmentchecklist SET "
                + "r45=?, r46=?, r47=?, r48=?, r49=?, r50=?, r51=?, r52=?, r53=?, r54=?, r55=?, r56=?, r57=?, r58=?, "
                + "m45=?, m46=?, m47=?, m48=?, m49=?, m50=?, m51=?, m52=?, m53=?, m54=?, m55=?, m56=?, m57=?, m58=? "
                + "WHERE client_id=?";

        PreparedStatement pst7 = con.prepareStatement(query7);

        pst7.setString(1, rem45); pst7.setString(2, rem46); pst7.setString(3, rem47);
        pst7.setString(4, rem48); pst7.setString(5, rem49); pst7.setString(6, rem50);
        pst7.setString(7, rem51); pst7.setString(8, rem52); pst7.setString(9, rem53);
        pst7.setString(10, rem54); pst7.setString(11, rem55); pst7.setString(12, rem56);
        pst7.setString(13, rem57); pst7.setString(14, rem58);

        pst7.setString(15, men45); pst7.setString(16, men46); pst7.setString(17, men47);
        pst7.setString(18, men48); pst7.setString(19, men49); pst7.setString(20, men50);
        pst7.setString(21, men51); pst7.setString(22, men52); pst7.setString(23, men53);
        pst7.setString(24, men54); pst7.setString(25, men55); pst7.setString(26, men56);
        pst7.setString(27, men57); pst7.setString(28, men58);pst7.setInt(29, clientId);
        pst7.executeUpdate(); 

        JOptionPane.showMessageDialog(this, "Client information updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hsActionPerformed

    private void ylActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ylActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ylActionPerformed

    private void nsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nsActionPerformed

    private void year4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year4ActionPerformed

    private void year3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year3ActionPerformed

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year1ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void nnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nnActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void me41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_me41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_me41ActionPerformed

    private void me39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_me39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_me39ActionPerformed

    private void me35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_me35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_me35ActionPerformed

    private void me29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_me29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_me29ActionPerformed

    private void me11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_me11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_me11ActionPerformed

    private void me25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_me25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_me25ActionPerformed

    private void me27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_me27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_me27ActionPerformed

    private void enrolledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrolledActionPerformed

        
       
    Connection con = null;
    PreparedStatement pst = null;
    
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmrtherapycenter", "root", "");

        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a client first!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String clientId = table.getValueAt(selectedRow, 0).toString();

        String query = "UPDATE clientinformation SET enrolled = 'Yes' WHERE client_id = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, clientId);
        int rowsUpdated = pst.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Client marked as enrolled successfully!");
            loadTableData();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update enrollment status!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error closing connection: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_enrolledActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmrtherapycenter", "root", "");

            String searchText = searchfield.getText().trim();

            String query = "SELECT client_id, clientname, gender, dateofbirth, diagnosis, enrolled FROM clientinformation " +
            "WHERE client_id LIKE ? OR clientname LIKE ? OR gender LIKE ? OR dateofbirth LIKE ? OR diagnosis LIKE ? OR enrolled LIKE ?";

            pst = con.prepareStatement(query);


            for (int i = 1; i <= 6; i++) {
                pst.setString(i, "%" + searchText + "%");
            }

            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("client_id"),
                    rs.getString("clientname"),
                    rs.getString("gender"),
                    rs.getString("dateofbirth"),
                    rs.getString("diagnosis"),
                    rs.getString("enrolled")
                };
                model.addRow(row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error closing connection: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Teacherlist list = new Teacherlist();
        list.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddTeacher add = new AddTeacher();
        add.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check1ActionPerformed
        if (selectedDate.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Please select a date.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        java.util.Date utilDate = selectedDate.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmrtherapycenter", "root", "");

        String query = "SELECT COUNT(submitdate) AS total FROM appointment WHERE DATE(submitdate) = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setDate(1, sqlDate);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int count = rs.getInt("total");
            JOptionPane.showMessageDialog(this, "Total enrollees on " + sqlDate + ": " + count);
        }

        rs.close();
        pst.close();
        conn.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_Check1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String ye1, ye2, ye3, ye4, thn;
        String school, year, hours;
        
        
        String men1,men2,men3,men4,men5,men6,men7,men8,men9,men10,men11,men12,men13,men14,men15,men16,men17,men18,men19,men20,men21,men22,men23,men24,men25,men26,men27,men28;
        String men29, men30, men31, men32, men33, men34, men35, men36, men37, men38, men39, men40, men41, men42, men43, men44;
        String men45,men46,men47,men48,men49,men50,men51,men52,men53,men54,men55,men56,men57,men58;
        String mthrow,mkick;
        String SUrl = "jdbc:mysql://localhost:3306/lmrtherapycenter";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            if (cn.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Client name is required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (nn.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Nickname is required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }  else if (g.getSelectedItem() == null || g.getSelectedItem().toString().trim().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Gender is required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (a.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Address is required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (d.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Diagnosis is required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (p.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Physician is required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (c.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Clinic name is required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (dates.getDate() == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Date is required.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (db.getDate() == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Date is required.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String clientname = cn.getText();
            String nickname = nn.getText();
            String gender = g.getSelectedItem().toString();
            String address = a.getText();
            String diagnosis = d.getText();
            String level = l.getSelectedItem().toString();
            String physician = p.getText();
            String clinic = c.getText();
            
            

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String birth = (db.getDate() != null) ? sdf.format(db.getDate()) : null;
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String dc = (dates.getDate() != null) ? sdf1.format(dates.getDate()) : null;
            String da1 = day1.getSelectedItem().toString();
            String da2 = day2.getSelectedItem().toString();
            String da3 = day3.getSelectedItem().toString();
            String da4 = day4.getSelectedItem().toString();
            ye1 = year1.getText();
            ye2 = year2.getText();
            ye3 = year3.getText();
            ye4 = year4.getText();
            String lo1 = loc1.getSelectedItem().toString();
            String lo2 = loc2.getSelectedItem().toString();
            String lo3 = loc3.getSelectedItem().toString();
            String lo4 = loc4.getSelectedItem().toString();
            String co1 = col1.getSelectedItem().toString();
            String co2 = col2.getSelectedItem().toString();
            String co3 = col3.getSelectedItem().toString();
            String co4 = col4.getSelectedItem().toString();
            String att = as.getSelectedItem().toString();
            thn = tn.getText();school = ns.getText();year = yl.getText();hours = hs.getText();

            String rem1 = re1.getSelectedItem().toString();  String rem2 = re2.getSelectedItem().toString();
String rem3 = re3.getSelectedItem().toString();  String rem4 = re4.getSelectedItem().toString();
String rem5 = re5.getSelectedItem().toString();  String rem6 = re6.getSelectedItem().toString();
String rem7 = re7.getSelectedItem().toString();  String rem8 = re8.getSelectedItem().toString();
String rem9 = re9.getSelectedItem().toString();  String rem10 = re10.getSelectedItem().toString();

String rem11 = re11.getSelectedItem().toString();  String rem12 = re12.getSelectedItem().toString();
String rem13 = re13.getSelectedItem().toString();  String rem14 = re14.getSelectedItem().toString();
String rem15 = re15.getSelectedItem().toString();  String rem16 = re16.getSelectedItem().toString();
String rem17 = re17.getSelectedItem().toString();  String rem18 = re18.getSelectedItem().toString();
String rem19 = re19.getSelectedItem().toString();  String rem20 = re20.getSelectedItem().toString();

String rem21 = re21.getSelectedItem().toString();  String rem22 = re22.getSelectedItem().toString();
String rem23 = re23.getSelectedItem().toString();  String rem24 = re24.getSelectedItem().toString();
String rem25 = re25.getSelectedItem().toString();  String rem26 = re26.getSelectedItem().toString();
String rem27 = re27.getSelectedItem().toString();  String rem28 = re28.getSelectedItem().toString();
String rem29 = re29.getSelectedItem().toString();  String rem30 = re30.getSelectedItem().toString();

String rem31 = re31.getSelectedItem().toString();  String rem32 = re32.getSelectedItem().toString();
String rem33 = re33.getSelectedItem().toString();  String rem34 = re34.getSelectedItem().toString();
String rem35 = re35.getSelectedItem().toString();  String rem36 = re36.getSelectedItem().toString();
String rem37 = rethro.getSelectedItem().toString();  String rem38 = rekick.getSelectedItem().toString();
String rem39 = re39.getSelectedItem().toString();  String rem40 = re40.getSelectedItem().toString();

String rem41 = re41.getSelectedItem().toString();  String rem42 = re42.getSelectedItem().toString();
String rem43 = re43.getSelectedItem().toString();  String rem44 = re44.getSelectedItem().toString();
String rem45 = re45.getSelectedItem().toString();  String rem46 = re46.getSelectedItem().toString();
String rem47 = re47.getSelectedItem().toString();  String rem48 = re48.getSelectedItem().toString();
String rem49 = re49.getSelectedItem().toString();  String rem50 = re50.getSelectedItem().toString();

String rem51 = re51.getSelectedItem().toString();  String rem52 = re52.getSelectedItem().toString();
String rem53 = re53.getSelectedItem().toString();  String rem54 = re54.getSelectedItem().toString();
String rem55 = re55.getSelectedItem().toString();  String rem56 = re56.getSelectedItem().toString();
String rem57 = re57.getSelectedItem().toString();  String rem58 = re58.getSelectedItem().toString();
String rthrow = rethro.getSelectedItem().toString();  String rkick = rekick.getSelectedItem().toString();

            men1= me1.getText();men2= me2.getText();men3= me3.getText();men4= me4.getText();men5= me5.getText();
            men6= me6.getText();men7= me7.getText();men8= me8.getText();men9= me9.getText();men10= me10.getText();
            men11= me11.getText();men12= me12.getText();men13= me13.getText();men14= me14.getText();men15= me15.getText();
            men16= me16.getText();men17= me17.getText();men18= me18.getText();men19= me19.getText();men20= me20.getText();
            men21= me21.getText();men22= me22.getText();men23= me23.getText();men24= me24.getText();men25= me25.getText();
            men26= me26.getText();men27= me27.getText();men28= me28.getText();men29= me29.getText();men30= me30.getText();
            men31= me31.getText();men32= me32.getText();men33= me33.getText();men34= me34.getText();men35= me35.getText();
            men36= me36.getText();men37= me37.getText();men38= me38.getText();men39= me39.getText();men40= me40.getText();
            men41= me41.getText();men42= me42.getText();men43= me43.getText();men44= me44.getText();men45= me45.getText();
            men46= me46.getText();men47= me47.getText();men48= me48.getText();men49= me49.getText();men50= me50.getText();
            men51= me51.getText();men52= me52.getText();men53= me53.getText();men54= me54.getText();men55= me55.getText();
            men56= me56.getText();men57= me57.getText();men58= me58.getText();
            mthrow= methro.getText();mkick= mekick.getText();


            String query1 = "INSERT INTO clientinformation (clientname, nickname, gender, dateofbirth, address, diagnosis, ifasdlevel, physician, clinicname, submit) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement pst1 = con.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);
            
            pst1.setString(1, clientname);
            pst1.setString(2, nickname);
            pst1.setString(3, gender);
            pst1.setString(4, birth);
            pst1.setString(5, address);
            pst1.setString(6, diagnosis);
            pst1.setString(7, level);
            pst1.setString(8, physician);
            pst1.setString(9, clinic);
            pst1.setString(10, dc);
            
            pst1.executeUpdate();

            ResultSet rs1 = pst1.getGeneratedKeys();
            int clientId = 0;
            if (rs1.next()) {
                clientId = rs1.getInt(1);
            }

            String query2 = "INSERT INTO othertherapyprovider (client_id, d1, d2, d3, d4, y1, y2, y3, y4, l1, l2, l3, l4, c1, c2, c3, c4, therapyname)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst2 = con.prepareStatement(query2, Statement.RETURN_GENERATED_KEYS);
            pst2.setInt(1, clientId);
            pst2.setString(2, da1);
            pst2.setString(3, da2);pst2.setString(4, da3);pst2.setString(5, da4);pst2.setString(6, ye1);
            pst2.setString(7, ye2);pst2.setString(8, ye3);pst2.setString(9, ye4);pst2.setString(10, lo1);
            pst2.setString(11, lo2);pst2.setString(12, lo3);pst2.setString(13, lo4);pst2.setString(14, co1);
            pst2.setString(15, co2);pst2.setString(16, co3);pst2.setString(17, co4);pst2.setString(18, thn);
            pst2.executeUpdate();

            ResultSet rs2 = pst2.getGeneratedKeys();
            int therapyId = 0;
            if (rs2.next()) {
                therapyId = rs2.getInt(1);
            }

            String query3 = "INSERT INTO educationhistory (client_id, therapy_id, sa, sn, ly, sh) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst3 = con.prepareStatement(query3, Statement.RETURN_GENERATED_KEYS);
            pst3.setInt(1, clientId);pst3.setInt(2, therapyId);pst3.setString(3, att);
            pst3.setString(4, school);pst3.setString(5, year);pst3.setString(6, hours);pst3.executeUpdate();

            ResultSet rs3 = pst3.getGeneratedKeys();
            int educationId = 0;
            if (rs3.next()) {
                educationId = rs3.getInt(1);
            }

            String query4 = "INSERT INTO aintakeskillassessmentchecklist "
            + "(client_id, therapy_id, education_id, "
            + "r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, "
            + "m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22, m23, m24, m25, m26, m27, m28) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst4 = con.prepareStatement(query4, Statement.RETURN_GENERATED_KEYS);

            pst4.setInt(1, clientId);
            pst4.setInt(2, therapyId);
            pst4.setInt(3, educationId);
            pst4.setString(4, rem1);  pst4.setString(5, rem2);  pst4.setString(6, rem3);  pst4.setString(7, rem4);  pst4.setString(8, rem5);
            pst4.setString(9, rem6);  pst4.setString(10, rem7); pst4.setString(11, rem8); pst4.setString(12, rem9); pst4.setString(13, rem10);
            pst4.setString(14, rem11); pst4.setString(15, rem12); pst4.setString(16, rem13); pst4.setString(17, rem14); pst4.setString(18, rem15);
            pst4.setString(19, rem16); pst4.setString(20, rem17); pst4.setString(21, rem18); pst4.setString(22, rem19); pst4.setString(23, rem20);
            pst4.setString(24, rem21); pst4.setString(25, rem22); pst4.setString(26, rem23); pst4.setString(27, rem24); pst4.setString(28, rem25);
            pst4.setString(29, rem26); pst4.setString(30, rem27); pst4.setString(31, rem28);

            pst4.setString(32, men1);  pst4.setString(33, men2);  pst4.setString(34, men3);  pst4.setString(35, men4);  pst4.setString(36, men5);
            pst4.setString(37, men6);  pst4.setString(38, men7);  pst4.setString(39, men8);  pst4.setString(40, men9);  pst4.setString(41, men10);
            pst4.setString(42, men11); pst4.setString(43, men12); pst4.setString(44, men13); pst4.setString(45, men14); pst4.setString(46, men15);
            pst4.setString(47, men16); pst4.setString(48, men17); pst4.setString(49, men18); pst4.setString(50, men19); pst4.setString(51, men20);
            pst4.setString(52, men21); pst4.setString(53, men22); pst4.setString(54, men23); pst4.setString(55, men24); pst4.setString(56, men25);
            pst4.setString(57, men26); pst4.setString(58, men27); pst4.setString(59, men28);

            pst4.executeUpdate();

            ResultSet rs4 = pst4.getGeneratedKeys();
            int askillId = 0;
            if (rs4.next()) {
                askillId = rs4.getInt(1);
            }

            String query5 = "INSERT INTO bintakeskillassessmentchecklist (client_id, therapy_id, education_id, askill_id, " +
            "r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, rthrow, rkick, " +
            "m29, m30, m31, m32, m33, m34, m35, m36, m37, m38, m39, m40, m41, m42, m43, m44, mthrow, mkick) " +
            "VALUES (?,?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst5 = con.prepareStatement(query5, Statement.RETURN_GENERATED_KEYS);

            pst5.setInt(1, clientId);
            pst5.setInt(2, therapyId);
            pst5.setInt(3, educationId);
            pst5.setInt(4, askillId);

            pst5.setString(5, rem29); pst5.setString(6, rem30); pst5.setString(7, rem31); pst5.setString(8, rem32); pst5.setString(9, rem33);
            pst5.setString(10, rem34); pst5.setString(11, rem35); pst5.setString(12, rem36); pst5.setString(13, rem37); pst5.setString(14, rem38);
            pst5.setString(15, rem39); pst5.setString(16, rem40); pst5.setString(17, rem41); pst5.setString(18, rem42); pst5.setString(19, rem43);
            pst5.setString(20, rem44); pst5.setString(21, rthrow); pst5.setString(22, rkick);

            pst5.setString(23, men29); pst5.setString(24, men30); pst5.setString(25, men31); pst5.setString(26, men32); pst5.setString(27, men33);
            pst5.setString(28, men34); pst5.setString(29, men35); pst5.setString(30, men36); pst5.setString(31, men37); pst5.setString(32, men38);
            pst5.setString(33, men39); pst5.setString(34, men40); pst5.setString(35, men41); pst5.setString(36, men42); pst5.setString(37, men43);
            pst5.setString(38, men44); pst5.setString(39, mthrow); pst5.setString(40, mkick);

            pst5.executeUpdate();

            ResultSet rs5 = pst5.getGeneratedKeys();
            int bskillId = 0;
            if (rs5.next()) {
                bskillId = rs5.getInt(1);
            }
            String query6 = "INSERT INTO dintakeskillassessmentchecklist (client_id, therapy_id, education_id, askill_id, bskill_id, "
            + "r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, m45, m46, "
            + "m47, m48, m49, m50, m51, m52, m53, m54, m55, m56, m57, m58) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?, ?,?)";
            PreparedStatement pst6 = con.prepareStatement(query6, Statement.RETURN_GENERATED_KEYS);
            pst6.setInt(1, clientId);pst6.setInt(2, therapyId);pst6.setInt(3, educationId);pst6.setInt(4, askillId);pst6.setInt(5, bskillId);
            pst6.setString(6, rem45);pst6.setString(7, rem46);pst6.setString(8, rem47);pst6.setString(9, rem48);
            pst6.setString(10, rem49);pst6.setString(11, rem50);pst6.setString(12, rem51);pst6.setString(13, rem52);
            pst6.setString(14, rem53);pst6.setString(15, rem54);pst6.setString(16, rem55);pst6.setString(17, rem56);
            pst6.setString(18, rem57);pst6.setString(19, rem58);pst6.setString(20, men45);pst6.setString(21, men46);
            pst6.setString(22, men47);pst6.setString(23, men48);pst6.setString(24, men49);pst6.setString(25, men50);
            pst6.setString(26, men51);pst6.setString(27, men52);pst6.setString(28, men53);pst6.setString(29, men54);
            pst6.setString(30, men55);pst6.setString(31, men56);pst6.setString(32, men57);pst6.setString(33, men58);

            pst6.executeUpdate();

            cn.setText("");nn.setText("");g.setSelectedIndex(0);
            a.setText("");db.setDate(null);d.setText("");l.setSelectedIndex(0);p.setText("");c.setText("");dates.setDate(null);
            day1.setSelectedIndex(0);day2.setSelectedIndex(0);day3.setSelectedIndex(0);day4.setSelectedIndex(0);
            year1.setText("");year2.setText("");year3.setText("");year4.setText("");
            loc1.setSelectedIndex(0);loc2.setSelectedIndex(0);loc3.setSelectedIndex(0);loc4.setSelectedIndex(0);
            col1.setSelectedIndex(0);col2.setSelectedIndex(0);col3.setSelectedIndex(0);col4.setSelectedIndex(0);
            tn.setText("");as.setSelectedIndex(0);ns.setText("");yl.setText("");hs.setText("");

            for (int i = 1; i <= 58; i++) {
    JComboBox<?> comboBox = (JComboBox<?>) getClass().getDeclaredField("re" + i).get(this);
    for (ActionListener al : comboBox.getActionListeners()) {
        comboBox.removeActionListener(al);
    }
}


for (int i = 1; i <= 58; i++) {
    JComboBox<?> comboBox = (JComboBox<?>) getClass().getDeclaredField("re" + i).get(this);
    comboBox.setSelectedIndex(0);
}


rethro.setSelectedIndex(0);
rekick.setSelectedIndex(0);


for (int i = 1; i <= 58; i++) {
    JTextField textField = (JTextField) getClass().getDeclaredField("me" + i).get(this);
    textField.setText("");
}


methro.setText("");
mekick.setText("");


for (int i = 1; i <= 58; i++) {
    JComboBox<?> comboBox = (JComboBox<?>) getClass().getDeclaredField("re" + i).get(this);
    for (ActionListener al : comboBox.getActionListeners()) {
        comboBox.addActionListener(al);
    }
}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(new JFrame(), "Successfully submitted!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_addActionPerformed

    private void appointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointActionPerformed
                                     
    Appointments add = new Appointments();
    add.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_appointActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed
    
    
    
    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check1;
    private javax.swing.JPanel Form;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTextField a;
    private javax.swing.JButton add;
    private javax.swing.JButton appoint;
    private javax.swing.JComboBox<String> as;
    private javax.swing.JTextField c;
    private javax.swing.JTextField cn;
    private javax.swing.JComboBox<String> col1;
    private javax.swing.JComboBox<String> col2;
    private javax.swing.JComboBox<String> col3;
    private javax.swing.JComboBox<String> col4;
    private javax.swing.JTextField d;
    private com.toedter.calendar.JDateChooser dates;
    private javax.swing.JComboBox<String> day1;
    private javax.swing.JComboBox<String> day2;
    private javax.swing.JComboBox<String> day3;
    private javax.swing.JComboBox<String> day4;
    private com.toedter.calendar.JDateChooser db;
    private javax.swing.JButton enrolled;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JComboBox<String> g;
    private javax.swing.JTextField hs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JComboBox<String> l;
    private javax.swing.JComboBox<String> loc1;
    private javax.swing.JComboBox<String> loc2;
    private javax.swing.JComboBox<String> loc3;
    private javax.swing.JComboBox<String> loc4;
    private javax.swing.JTextField me1;
    private javax.swing.JTextField me10;
    private javax.swing.JTextField me11;
    private javax.swing.JTextField me12;
    private javax.swing.JTextField me13;
    private javax.swing.JTextField me14;
    private javax.swing.JTextField me15;
    private javax.swing.JTextField me16;
    private javax.swing.JTextField me17;
    private javax.swing.JTextField me18;
    private javax.swing.JTextField me19;
    private javax.swing.JTextField me2;
    private javax.swing.JTextField me20;
    private javax.swing.JTextField me21;
    private javax.swing.JTextField me22;
    private javax.swing.JTextField me23;
    private javax.swing.JTextField me24;
    private javax.swing.JTextField me25;
    private javax.swing.JTextField me26;
    private javax.swing.JTextField me27;
    private javax.swing.JTextField me28;
    private javax.swing.JTextField me29;
    private javax.swing.JTextField me3;
    private javax.swing.JTextField me30;
    private javax.swing.JTextField me31;
    private javax.swing.JTextField me32;
    private javax.swing.JTextField me33;
    private javax.swing.JTextField me34;
    private javax.swing.JTextField me35;
    private javax.swing.JTextField me36;
    private javax.swing.JTextField me37;
    private javax.swing.JTextField me38;
    private javax.swing.JTextField me39;
    private javax.swing.JTextField me4;
    private javax.swing.JTextField me40;
    private javax.swing.JTextField me41;
    private javax.swing.JTextField me42;
    private javax.swing.JTextField me43;
    private javax.swing.JTextField me44;
    private javax.swing.JTextField me45;
    private javax.swing.JTextField me46;
    private javax.swing.JTextField me47;
    private javax.swing.JTextField me48;
    private javax.swing.JTextField me49;
    private javax.swing.JTextField me5;
    private javax.swing.JTextField me50;
    private javax.swing.JTextField me51;
    private javax.swing.JTextField me52;
    private javax.swing.JTextField me53;
    private javax.swing.JTextField me54;
    private javax.swing.JTextField me55;
    private javax.swing.JTextField me56;
    private javax.swing.JTextField me57;
    private javax.swing.JTextField me58;
    private javax.swing.JTextField me6;
    private javax.swing.JTextField me7;
    private javax.swing.JTextField me8;
    private javax.swing.JTextField me9;
    private javax.swing.JTextField mekick;
    private javax.swing.JTextField methro;
    private javax.swing.JTextField nn;
    private javax.swing.JTextField ns;
    private javax.swing.JTextField p;
    private javax.swing.JComboBox<String> re1;
    private javax.swing.JComboBox<String> re10;
    private javax.swing.JComboBox<String> re11;
    private javax.swing.JComboBox<String> re12;
    private javax.swing.JComboBox<String> re13;
    private javax.swing.JComboBox<String> re14;
    private javax.swing.JComboBox<String> re15;
    private javax.swing.JComboBox<String> re16;
    private javax.swing.JComboBox<String> re17;
    private javax.swing.JComboBox<String> re18;
    private javax.swing.JComboBox<String> re19;
    private javax.swing.JComboBox<String> re2;
    private javax.swing.JComboBox<String> re20;
    private javax.swing.JComboBox<String> re21;
    private javax.swing.JComboBox<String> re22;
    private javax.swing.JComboBox<String> re23;
    private javax.swing.JComboBox<String> re24;
    private javax.swing.JComboBox<String> re25;
    private javax.swing.JComboBox<String> re26;
    private javax.swing.JComboBox<String> re27;
    private javax.swing.JComboBox<String> re28;
    private javax.swing.JComboBox<String> re29;
    private javax.swing.JComboBox<String> re3;
    private javax.swing.JComboBox<String> re30;
    private javax.swing.JComboBox<String> re31;
    private javax.swing.JComboBox<String> re32;
    private javax.swing.JComboBox<String> re33;
    private javax.swing.JComboBox<String> re34;
    private javax.swing.JComboBox<String> re35;
    private javax.swing.JComboBox<String> re36;
    private javax.swing.JComboBox<String> re37;
    private javax.swing.JComboBox<String> re38;
    private javax.swing.JComboBox<String> re39;
    private javax.swing.JComboBox<String> re4;
    private javax.swing.JComboBox<String> re40;
    private javax.swing.JComboBox<String> re41;
    private javax.swing.JComboBox<String> re42;
    private javax.swing.JComboBox<String> re43;
    private javax.swing.JComboBox<String> re44;
    private javax.swing.JComboBox<String> re45;
    private javax.swing.JComboBox<String> re46;
    private javax.swing.JComboBox<String> re47;
    private javax.swing.JComboBox<String> re48;
    private javax.swing.JComboBox<String> re49;
    private javax.swing.JComboBox<String> re5;
    private javax.swing.JComboBox<String> re50;
    private javax.swing.JComboBox<String> re51;
    private javax.swing.JComboBox<String> re52;
    private javax.swing.JComboBox<String> re53;
    private javax.swing.JComboBox<String> re54;
    private javax.swing.JComboBox<String> re55;
    private javax.swing.JComboBox<String> re56;
    private javax.swing.JComboBox<String> re57;
    private javax.swing.JComboBox<String> re58;
    private javax.swing.JComboBox<String> re6;
    private javax.swing.JComboBox<String> re7;
    private javax.swing.JComboBox<String> re8;
    private javax.swing.JComboBox<String> re9;
    private javax.swing.JButton refresh;
    private javax.swing.JComboBox<String> rekick;
    private javax.swing.JComboBox<String> rethro;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchfield;
    private com.toedter.calendar.JDateChooser selectedDate;
    private javax.swing.JTable table;
    private javax.swing.JTextField tn;
    private javax.swing.JButton update;
    private javax.swing.JTextField year1;
    private javax.swing.JTextField year2;
    private javax.swing.JTextField year3;
    private javax.swing.JTextField year4;
    private javax.swing.JTextField yl;
    // End of variables declaration//GEN-END:variables
}
