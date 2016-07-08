package interactivestoriescreator;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class StartPage extends javax.swing.JFrame {

    /**
     * Creates new form StartPage
     */
    public ArrayList<StoryPage> storyPages = new ArrayList<StoryPage>();
    
    public ArrayList<File> pages = new ArrayList<File>();
    public ArrayList<File> choices = new ArrayList<File>();
    
    public File wrongChoice = null; public File wrongSound = null;
    public JLabel correctPicture = null; public JLabel wrongPicture = null;
    
    public ArrayList<JLabel> pageLabels = new ArrayList<JLabel>();
    public ArrayList<JButton> pageButtons = new ArrayList<JButton>();
    
    public ArrayList<JLabel> choiceLabels = new ArrayList<JLabel>();
    public ArrayList<JButton> choiceButtons = new ArrayList<JButton>();
    
    final JFileChooser fc = new JFileChooser();
    MediaPlayer mediaPlayer = null;
    JFXPanel fxPanel = new JFXPanel();
    
    public StartPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setText("Import");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Pages", jPanel4);

        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Import");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jLabel2.setText("Wrong answer sound");

        jButton5.setText("Import");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Play");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Wrong answer display");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 44, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addContainerGap())
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton6))
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Settings", jPanel2);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setText("Story Name");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Interactive Stories Setup"));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 10000));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10000, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int returnVal = fc.showOpenDialog(jPanel1); //open file picker
        if(returnVal == JFileChooser.APPROVE_OPTION){ //when a file is selected
            File file = fc.getSelectedFile();
            pages.add(file); //add the file to roles
            Image image = null;
            GridBagConstraints c = new GridBagConstraints(); //used to position image
            c.insets = new Insets(3,3,3,3); //specifies margins around image
            try {
                image = ImageIO.read(pages.get(pages.size()-1)); //convert file to image
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex); //BAD THINGS (can happen if the file is not an image)
                return;
            }
            image = image.getScaledInstance(200, 113, Image.SCALE_DEFAULT); //scale the image down to fit in the window
            ImageIcon icon = new ImageIcon(image); //make an image icon from the image

            if(pages.size() == 1){
                jPanel6.setLayout(new GridBagLayout()); // if this is the first image, set up the image layout
            }

            JLabel picLabel = new JLabel(); //make a new label
            picLabel.setIcon(icon); //add the image icon to the label
            //picLabel.setText(pages.get(pages.size()-1).getName()); //set the label text to the filename of the image

            JButton picButton = new JButton(); //make a new button (for picking an explanation)
            picButton.setText("add");

            picButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ //if the button is clicked, handle in explanationButtonActionPerformed
                    //System.out.println("add button clicked!");
                    pageButtonActionPerformed(e.getSource());
                    //explanationButtonActionPerformed(e.getSource()); //pass the button to explanationButtonActionPerformed
                }
            });

            pageLabels.add(picLabel); //add the new label to the list of labels
            pageButtons.add(picButton); //add the new button to the list of buttons

            //set position of label in grid
            c.gridx = 0;
            c.gridy = (pages.size()-1)*2;
            jPanel6.add(picLabel,c); //draw image

            //set position of button in grid
            c.gridx = 1;
            jPanel6.add(picButton,c); //draw button

            jPanel6.revalidate(); //redraw and scale page
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pageButtonActionPerformed(Object e){
        JButton button = pageButtons.get(pageButtons.indexOf(e)); //get the button that was clicked
        storyPages.add(new StoryPage(pages.get(pageButtons.indexOf(e)),jPanel1,this));
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(pageLabels.size() > 0){ //if there are roles
            jPanel6.remove(pageLabels.get(pageLabels.size()-1)); //undraw the label (image) of the role
            jPanel6.remove(pageButtons.get(pageButtons.size()-1)); //undraw the button of the role

            pages.remove(pages.size()-1); //remove the role from the list of roles
            pageLabels.remove(pageLabels.size()-1); //remove the corresponding label from the list of labels
            pageButtons.remove(pageButtons.size()-1); //remove the corresponding button from the list of buttons

            jPanel6.revalidate(); //redraw the page
            jPanel6.repaint(); //redraw the background of the page
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void snapPages(){
        jPanel1MouseReleased(null);
    }
    
    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        for(int i=0; i<storyPages.size(); i++){
            StoryPage highest = storyPages.get(i);
            for(int j = i+1; j<storyPages.size(); j++){
                //System.out.println("current:" + storyPages.get(j).getY()+" highest: "+highest.getY());
                if(storyPages.get(j).getY() < highest.getY()){
                    highest = storyPages.get(j);
                }
            }
            storyPages.remove(highest);
            storyPages.add(i,highest);
            highest.setOrder(i);
            //highPanel.setBounds(100,i*200+100,300,169);
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean soundsAdded = true;
        for(int i = 0; i < storyPages.size(); i++){
            if(storyPages.get(i).sound == null) soundsAdded = false;
        }
        
        boolean choicesAdded = true;
        for(int i = 0; i < storyPages.size(); i++){
            if(storyPages.get(i).choicePage && (storyPages.get(i).correctPicture == null || storyPages.get(i).wrongPicture1 == null || storyPages.get(i).wrongPicture2 == null))
                choicesAdded = false;
        }
        
        if(!soundsAdded) JOptionPane.showMessageDialog(null, "Please set narration for all pages","pages missing narration",JOptionPane.WARNING_MESSAGE);
        else if(!choicesAdded) JOptionPane.showMessageDialog(null, "Please set all options for choice pages","pages missing options",JOptionPane.WARNING_MESSAGE);
        else{ //if all the checks are passed
            try {
                String current = new java.io.File( "." ).getCanonicalPath(); //find working directory
                
                //make folders for pictures and audio
                File folder = new File(current+"\\"+jTextField1.getText());
                if (!folder.exists()) {
                    if (folder.mkdir()) {
                        System.out.println("Directory is created!");
                    } else {
                        System.out.println("Failed to create directory!");
                    }
                }
                
                folder = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3");
                if (!folder.exists()) {
                    if (folder.mkdir()) {
                        System.out.println("Directory is created!");
                    } else {
                        System.out.println("Failed to create directory!");
                    }
                }
                
                folder = new File(current+"\\"+jTextField1.getText()+"\\Story_Audio");
                if (!folder.exists()) {
                    if (folder.mkdir()) {
                        System.out.println("Directory is created!");
                    } else {
                        System.out.println("Failed to create directory!");
                    }
                }
                
                //copy wrong choice
                File outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Images_3\\oops-01.png");
                copyFile(wrongChoice, outfile);
                
                outfile = new File(current+"\\"+jTextField1.getText()+"\\storystyle.css");
                File infile = new File(current+"\\resources\\storystyle.css");
                copyFile(infile,outfile);
                
                outfile = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3\\left_arrow.png");
                infile = new File(current+"\\resources\\left_arrow.png");
                copyFile(infile,outfile);
                
                outfile = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3\\right_arrow.png");
                infile = new File(current+"\\resources\\right_arrow.png");
                copyFile(infile,outfile);
                
                outfile = new File(current+"\\"+jTextField1.getText()+"\\Story_Audio\\audio-oops.mp3");
                copyFile(wrongSound,outfile);
                
                for(int i = 0; i < storyPages.size(); i++){
                    if(i<10) outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Images_3\\story1-newratio-0"+i+".png");
                    else outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Images_3\\story1-newratio-"+i+".png");
                    copyFile(storyPages.get(i).file,outfile);
                    
                    if(i<10) outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Audio\\audio-0"+i+".mp3");
                    else outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Audio\\audio-"+i+".mp3");
                    copyFile(storyPages.get(i).sound,outfile);
                    
                    if(storyPages.get(i).choicePage){
                        outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Images_3\\correct-choice-"+i+".png");
                        copyFile(storyPages.get(i).correctPicture,outfile);
                        
                        outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Images_3\\wrong-choice1-"+i+".png");
                        copyFile(storyPages.get(i).wrongPicture1,outfile);
                        
                        outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Images_3\\wrong-choice2-"+i+".png");
                        copyFile(storyPages.get(i).wrongPicture2,outfile);
                    }
                }
                
                //import javascript file
                infile = new File(current+"\\resources\\storymain_choices.html");
                outfile = new File(current+"\\"+jTextField1.getText()+"\\storymain_choices.html");
                
                if(!outfile.exists()) { //if the output location doesn't have a javascript file
                    outfile.createNewFile(); //make a new javascript file
                }
                
                //make story page import string
                String storyImports = "";
                for(int i = 0; i < storyPages.size(); i++){
                    if(i<10) storyImports = storyImports + "{id:\'"+i+"\', src: imgPath + \'story1-newratio-0"+i+".png\'},\n";
                    else storyImports = storyImports + "{id:\'"+i+"\', src: imgPath + \'story1-newratio-"+i+".png\'},\n";
                }
                
                //make sound import string
                String soundImports = "";
                for(int i = 0; i < storyPages.size(); i++){
                    if(i<10) soundImports = soundImports + "{id:\'"+i+"\', src: musicPath + \"audio-0"+i+".mp3\"},\n";
                    else soundImports = soundImports + "{id:\'"+i+"\', src: musicPath + \"audio-"+i+".mp3\"},\n";
                }
                
                //make choice import string
                String choiceImports = "";
                for(int i = 0; i < storyPages.size(); i++){
                    if(storyPages.get(i).choicePage){
                        choiceImports = choiceImports + "{id:\'correct-choice-"+i+"\', src: imgPath + \'correct-choice-"+i+".png\'},\n";
                        choiceImports = choiceImports + "{id:\'wrong-choice1-"+i+"\', src: imgPath + \'wrong-choice1-"+i+".png\'},\n";
                        choiceImports = choiceImports + "{id:\'wrong-choice2-"+i+"\', src: imgPath + \'wrong-choice2-"+i+".png\'},\n";
                    }
                }
                
                //make choice button string
                String choiceButtons = "";
                for(int i = 0; i < storyPages.size(); i++){
                    if(storyPages.get(i).choicePage){
                        choiceButtons = choiceButtons + "if (slide =="+i+") {"+
                            "\n"+"addLeftImage(\"wrong-choice1-"+i+"\",300, 250, 0);"+
                            "\n"+"addMiddleImage(\"wrong-choice2-"+i+"\",780, 250, 0);"+
                            "\n"+"addRightImage(\"correct-choice-"+i+"\",1450, 250, 1);"+
                            "\n"+"}"+"\n";
                            
                    }
                }
                
                //make correct choice string
                String correctClick = "";
                for(int i = 0; i < storyPages.size(); i++){
                    if(storyPages.get(i).choicePage){
                        int j = i; while(storyPages.get(j).choicePage) j++;
                        correctClick = correctClick + "if (slide =="+i+") {"+
                        "\n"+"slide ="+(j-1)+";"+
                        "\n"+"song ="+(j-1)+";"+
                        "\n"+"nxtClck();"+
                        "\n"+"}"+"\n";
                    }
                }
                
                try(BufferedReader br = new BufferedReader(new FileReader(infile))) { //open a file reader for the reference javascript file
                    try(FileWriter fw = new FileWriter(outfile)){ //open a file writer for the new javasctipt file
                        for(String line; (line = br.readLine()) != null; ) { //loop through the reference file by line
                            if(line.contains("if (slide > 20)")) line = "if (slide > " + storyPages.size() + "){"; 
                            if(line.contains("slide = 20;")) line = "slide = "+storyPages.size()+";"; 
                            if(line.contains("if (song > 20)")) line = "if (song > " + storyPages.size() + "){";
                            if(line.contains("song = 20;")) line = "song = "+storyPages.size()+";";
                            if(line.contains("//ADD STORY IMPORTS HERE")) line = storyImports;
                            if(line.contains("//ADD CHOICE IMPORTS HERE")) line = choiceImports;
                            if(line.contains("//ADD CHOICE SLIDES HERE")) line = choiceButtons;
                            if(line.contains("//ADD CORRECT ANSWERS HERE")) line = correctClick;
                            if(line.contains("//ADD SOUND IMPORTS HERE")) line = soundImports;
                            fw.write(line+"\n");
                        }
                    }
                }
                
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex); //BAD THINGS (can happen if the save directory can't be made or files can't be saved)
                JOptionPane.showMessageDialog(null, "Save failed"); //tell the user the save didn't work
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public static void copyFile(File sourceFile, File destFile) throws IOException {
        if(!destFile.exists()) {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;

        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        }
        finally {
            if(source != null) {
                source.close();
            }
            if(destination != null) {
                destination.close();
            }
        }
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(wrongPicture != null) jPanel8.remove(wrongPicture);
        wrongPicture = null;
        wrongChoice = null;
        
        jPanel8.revalidate();
        jPanel8.repaint();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int returnVal = fc.showOpenDialog(jPanel1); //open file picker
        if(returnVal == JFileChooser.APPROVE_OPTION){ //when a file is selected
            wrongChoice = fc.getSelectedFile();
            Image image = null;
            try {
                image = ImageIO.read(wrongChoice); //convert file to image
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex); //BAD THINGS (can happen if the file is not an image)
                return;
            }
            image = image.getScaledInstance(260, 147, Image.SCALE_DEFAULT); //scale the image down to fit in the window
            ImageIcon icon = new ImageIcon(image); //make an image icon from the image

            wrongPicture = new JLabel();
            wrongPicture.setIcon(icon);

            jPanel8.setLayout(new FlowLayout()); // if this is the first image, set up the image layout
            jPanel8.add(wrongPicture);
            jPanel8.revalidate();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(wrongSound == null){
            int returnVal = fc.showOpenDialog(jPanel1); //open file picker
            if(returnVal == JFileChooser.APPROVE_OPTION){ //when a file is selected
                wrongSound = fc.getSelectedFile();
                jButton7.setText("Delete");
            }
        }
        else{
            wrongSound = null;
            jButton7.setText("Import");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer = null;
        }
        else{
            if(wrongSound != null){
                try {
                    Media hit = new Media(wrongSound.toURI().toURL().toString());
                    mediaPlayer = new MediaPlayer(hit);
                    mediaPlayer.play();
                } catch (Exception ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
