/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.InternetConnectionCheck;

/**
 *
 * @author admin
 */
import java.awt.Color;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.util.*; 
import java.io.*; 
import java.net.InetAddress;
import java.net.URL; 
import java.net.URLConnection; 
import java.net.UnknownHostException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import models.Models;

import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;
import javax.swing.JTextField;

  
public class InternetConnectionCheck extends javax.swing.JFrame {

    /**
     * Creates new form InternetConnectionCheck
     */
    
    Models Models = new Models();
    public volatile boolean isShutingDown; 
    int negativecounter = 0;
    int positivecounter = 0;



    public InternetConnectionCheck() {
        initComponents();
        initJframeproperties();

    }

    private void initJframeproperties(){
    setIconImage(new ImageIcon(getClass().getResource("/images/internet.png")).getImage());
    setResizable(false);
    urlinput.setEditable(false);
    ipaddressinput.setEditable(false);
    ipselectradio.setSelected(true);
    ipaddressinput.setText("4.2.2.2");
    //urlinput.setText("https://www.geeksforgeeks.org/");
    portnumber.setText("5000");
    cycle.setText("3000");
    setdefaults.getString("https://www.geeksforgeeks.org/", urlinput); // Here i am sending reference jTextField2 to Another Class
    
    }


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConnectionOption = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        ipaddressinput = new javax.swing.JTextField();
        ipaddresslabel = new javax.swing.JLabel();
        urllabel = new javax.swing.JLabel();
        urlinput = new javax.swing.JTextField();
        portnumberlabel = new javax.swing.JLabel();
        portnumber = new javax.swing.JTextField();
        Seconds = new javax.swing.JLabel();
        cycle = new javax.swing.JTextField();
        cyclenumberlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ipselectradio = new javax.swing.JRadioButton();
        urlselectradio = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultarea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Internet Connection Check");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        ipaddressinput.setToolTipText("");
        ipaddressinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipaddressinputActionPerformed(evt);
            }
        });

        ipaddresslabel.setText("IP Address:");

        urllabel.setText("URL:");

        portnumberlabel.setText("Port Number:");

        Seconds.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Seconds.setText("Seconds");

        cyclenumberlabel.setText("Cycle:");

        jLabel1.setText("Select Option");

        ConnectionOption.add(ipselectradio);
        ipselectradio.setText("IP");
        ipselectradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipselectradioActionPerformed(evt);
            }
        });

        ConnectionOption.add(urlselectradio);
        urlselectradio.setText("URL");
        urlselectradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlselectradioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ipselectradio)
                        .addGap(18, 18, 18)
                        .addComponent(urlselectradio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portnumberlabel)
                            .addComponent(ipaddresslabel)
                            .addComponent(cyclenumberlabel)
                            .addComponent(urllabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urlinput, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ipaddressinput, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(portnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cycle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seconds))))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ipselectradio)
                    .addComponent(urlselectradio))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipaddresslabel)
                    .addComponent(ipaddressinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(urllabel)
                    .addComponent(urlinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portnumberlabel)
                    .addComponent(portnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cyclenumberlabel)
                    .addComponent(cycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Seconds)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        resultarea.setColumns(20);
        resultarea.setRows(5);
        jScrollPane1.setViewportView(resultarea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Customer Trust Solutions 2020");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStop)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel2)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnStop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu1.setText("File");

        jMenuItem2.setText("Login");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class checkinternent implements Runnable {

        @Override
        public void run() {
            Models.setUrladdress(urlinput.getText().trim());
            Models.setIpaddress(ipaddressinput.getText().trim());
            Models.setPortnumber(Integer.parseInt(portnumber.getText().trim()));
            Models.setCycle(Integer.parseInt(cycle.getText().trim()));
            Models.seturl_Selected(ConnectionOption.getSelection().equals(urlselectradio.getModel()));
            Models.setIp_Selected(ConnectionOption.getSelection().equals(ipselectradio.getModel()));
            
//            String ipaddress = Models.getIpaddress();
//            String urladdress = Models.getUrladdress();
//            int port = Models.getPortnumber();
//            boolean optionurl = Models.isUrl_Selected();
//            boolean optionip = Models.isIp_Selected();
//            int cycle = Models.getCycle();
            
            long startTime = System.currentTimeMillis();
            int i = 0;
            while (isShutingDown) {
                if (i == 10){
                    i = 0;
                    resultarea.setText("");                    
                }
                System.out.println(Thread.currentThread().getName() + ": count..." + i++);
                iptest iptest = new iptest(Models.getIpaddress(), Models.getUrladdress(), Models.getPortnumber(), Models.getCycle(), Models.isUrl_Selected(), Models.isIp_Selected());
                iptest.process();


            }
        }
    }
    
  public class iptest {
  private String ipaddress;
  private String urladdress;
  private int portnumber;
  private int cycle;
  private boolean url_Selected;
  private boolean ip_Selected;
  
  iptest(String ip, String url, int port, int interval, boolean url_selected, boolean ip_selected){
  ipaddress = ip;
  urladdress = url;
  portnumber = port;
  cycle = interval;
  url_Selected = url_selected;
  ip_Selected = ip_selected; 
  }
  
  public void process(){
                  

                try {
                    //Wait for one sec so it doesn't print too fast
                            try {
                                  if (url_Selected){
                                      sendurlPingRequest(urladdress);

                                  }else if(ip_Selected)
                                      {
                                       sendipPingRequest(ipaddress, portnumber); 
                                      }
                            } 
                              catch (Exception e) { 
                                  System.out.println("Internet Not Connected"); 
                            }
                   
                    Thread.sleep(cycle);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
  
  }
  
}
  
    public void sendurlPingRequest(String urladdress){
             
        try{
                  URL url = new URL(urladdress); 
                  URLConnection connection = url.openConnection(); 
                  connection.connect();                   
                  positive_response(urladdress);
                                      
                  }catch (Exception e){
//                          System.out.println("Internet Not Connected");                                                     
                          negative_response(urladdress);
                          
                  }
    
    
    }
    public void positive_response(String ipAddress){
            
            negativecounter = 0;    
//            System.out.println("Host is reachable"); 
            resultarea.append(ipAddress +" : Host is reachable\n");
            resultarea.setBackground(Color.GREEN); 
            if (positivecounter == 0){
                toFront();
                setExtendedState(JFrame.NORMAL);            
                setAlwaysOnTop(true);
            
            }
            positivecounter ++;
            
            if (positivecounter == 4){
            setState(JFrame.ICONIFIED); // To minimize a frame
            }
    }
    
    public void negative_response(String ipAddress){
            positivecounter = 0;
            resultarea.append(ipAddress +" Host is not reachable\n");
            resultarea.setBackground(Color.red);  
           
            negativecounter++;
            
            //
//            System.out.println("negative Counter : " + negativecounter); 
            if (negativecounter == 1){
                toFront();
                setExtendedState(JFrame.NORMAL);            
                setAlwaysOnTop(true);
                try{
                    //Obtain only one instance of the SystemTray object
                    SystemTray tray = SystemTray.getSystemTray();

                    // If you want to create an icon in the system tray to preview
                    Image image = Toolkit.getDefaultToolkit().createImage("/images/warning.png");
                    //Alternative (if the icon is on the classpath):
                    //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

                    TrayIcon trayIcon = new TrayIcon(image, "Connection Notification");
                    //Let the system resize the image if needed
                    trayIcon.setImageAutoSize(true);
                    //Set tooltip text for the tray icon
                    trayIcon.setToolTip("Connection Check Status");
                    tray.add(trayIcon);

                    // Display info notification:
                    trayIcon.displayMessage("Connection Notification", "Connection Lost", MessageType.INFO);
                    // Error:
                    // trayIcon.displayMessage("Hello, World", "Java Notification Demo", MessageType.ERROR);
                    // Warning:
                    // trayIcon.displayMessage("Hello, World", "Java Notification Demo", MessageType.WARNING);
                }catch(Exception ex){
                    System.err.print(ex);
                }
            }
    }
    
    public void sendipPingRequest(String ipAddress, int port) 
              throws UnknownHostException, IOException 
        { 
          
        InetAddress ping = InetAddress.getByName(ipAddress); 
        System.out.println("Sending Ping Request to " + ipAddress); 
          if (ping.isReachable(port)) {
              positive_response(ipAddress);       
          }
          
          else{
            
            negative_response(ipAddress);
            //
          }
        } 
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        //http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html
        //https://www.baeldung.com/java-start-thread

           isShutingDown = true;
           checkinternent myRunnable = new checkinternent();
           Thread pingsession = new Thread(myRunnable);
           pingsession.start();
           System.out.println("Checking Connectivity - Started"); 
           pingsession.setName("Checking Connectivity");
           btnStop.setEnabled(true);
           btnStart.setEnabled(false);
  
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void ipaddressinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipaddressinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipaddressinputActionPerformed

    private void ipselectradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipselectradioActionPerformed
        // TODO add your handling code here:

            Models.setIp_Selected(ConnectionOption.getSelection().equals(ipselectradio.getModel()));
            
            if (Models.isIp_Selected()){
                
                
                ipaddressinput.setEditable(true);
                urlinput.setBackground(Color.YELLOW);
                ipaddressinput.setBackground(Color.WHITE);
                urlinput.setEditable(false);
                urlinput.setOpaque(true);
                ipaddressinput.setOpaque(false); 
            
            }
            
            
        
    }//GEN-LAST:event_ipselectradioActionPerformed

    private void urlselectradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlselectradioActionPerformed
        // TODO add your handling code here:
        Models.seturl_Selected(ConnectionOption.getSelection().equals(urlselectradio.getModel()));
        if (Models.isUrl_Selected()){
            
                ipaddressinput.setEditable(false);
                ipaddressinput.setOpaque(true);
                urlinput.setEditable(true);
                urlinput.setOpaque(false);
                urlinput.setBackground(Color.WHITE);
                ipaddressinput.setBackground(Color.YELLOW);
                
            }
    }//GEN-LAST:event_urlselectradioActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
        
        isShutingDown = false;
        resultarea.setText("");
        resultarea.append("Checking Connectivity - Stopped\n");  
        resultarea.setBackground(Color.WHITE);
        System.out.println("Checking Connectivity - Stopped"); 

        btnStop.setEnabled(false);
        btnStart.setEnabled(true);
    }//GEN-LAST:event_btnStopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnknownHostException, IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InternetConnectionCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InternetConnectionCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InternetConnectionCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InternetConnectionCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InternetConnectionCheck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ConnectionOption;
    private javax.swing.JLabel Seconds;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JTextField cycle;
    private javax.swing.JLabel cyclenumberlabel;
    private javax.swing.JTextField ipaddressinput;
    private javax.swing.JLabel ipaddresslabel;
    private javax.swing.JRadioButton ipselectradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField portnumber;
    private javax.swing.JLabel portnumberlabel;
    private javax.swing.JTextArea resultarea;
    private javax.swing.JTextField urlinput;
    private javax.swing.JLabel urllabel;
    private javax.swing.JRadioButton urlselectradio;
    // End of variables declaration//GEN-END:variables
}
