/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Views;

import GUI.Controllers.DrawingOptionsController;
import GUI.View;
import colormixerbean.ColorMixer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrawingOptions extends javax.swing.JFrame implements View {

    private Canvas drawingPanel; // the drawing panel
    private DrawingOptionsController controller;

    public DrawingOptions(Canvas dP) {
        drawingPanel = dP;
        initComponents();
        setTitle("Drawinit");
        menuRectangle.setSelected(false);
        menuOval.setSelected(false);
        menuTriangle.setSelected(false);
        menuLine.setSelected(false);

    }

    public View getView() {
        return (View) this;
    }

    public void addController(DrawingOptionsController c) {
        this.controller = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        toolbar = new javax.swing.JPanel();
        Colors = new javax.swing.JPanel();
        red = new javax.swing.JLabel();
        yellow = new javax.swing.JLabel();
        orange = new javax.swing.JLabel();
        blue = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        pink = new javax.swing.JLabel();
        black = new javax.swing.JLabel();
        white = new javax.swing.JLabel();
        Brush = new javax.swing.JPanel();
        lblThickness = new javax.swing.JLabel();
        txtThickness = new javax.swing.JTextField();
        currentColor = new javax.swing.JLabel();
        finalColor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Brush1 = new javax.swing.JPanel();
        btnBackground = new javax.swing.JButton();
        panDrawingArea = this.drawingPanel;
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuImport = new javax.swing.JMenu();
        menuImportJSON = new javax.swing.JMenuItem();
        menuImportXML = new javax.swing.JMenuItem();
        menuExport = new javax.swing.JMenu();
        menuExportJSON = new javax.swing.JMenuItem();
        menuExportXML = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuRotate = new javax.swing.JMenu();
        menuLeft = new javax.swing.JMenuItem();
        menuRight = new javax.swing.JMenuItem();
        menuClear = new javax.swing.JMenuItem();
        menuReset = new javax.swing.JMenuItem();
        menuShapes = new javax.swing.JMenu();
        menuRectangle = new javax.swing.JCheckBoxMenuItem();
        menuOval = new javax.swing.JCheckBoxMenuItem();
        menuTriangle = new javax.swing.JCheckBoxMenuItem();
        menuLine = new javax.swing.JCheckBoxMenuItem();
        menuColorMixer = new javax.swing.JMenu();
        colorMixerBean1 = new colormixerbean.ColorMixer();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        toolbar.setBackground(new java.awt.Color(204, 204, 204));
        toolbar.setBorder(javax.swing.BorderFactory.createBevelBorder(0, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        toolbar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        java.awt.GridBagLayout toolbarLayout = new java.awt.GridBagLayout();
        toolbarLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        toolbarLayout.rowHeights = new int[] {0};
        toolbar.setLayout(toolbarLayout);

        Colors.setBackground(new java.awt.Color(204, 204, 204));
        Colors.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), "Pick a colour", 0, 0, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        Colors.setToolTipText("Brush");
        Colors.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Colors.setMaximumSize(new java.awt.Dimension(100, 100));
        Colors.setMinimumSize(new java.awt.Dimension(100, 100));
        Colors.setOpaque(false);
        Colors.setPreferredSize(new java.awt.Dimension(120, 70));

        red.setBackground(new java.awt.Color(255, 0, 0));
        red.setText("      ");
        red.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        red.setOpaque(true);
        Colors.add(red);

        yellow.setBackground(new java.awt.Color(255, 255, 0));
        yellow.setText("      ");
        yellow.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        yellow.setOpaque(true);
        Colors.add(yellow);

        orange.setBackground(new java.awt.Color(255, 102, 0));
        orange.setText("      ");
        orange.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        orange.setOpaque(true);
        Colors.add(orange);

        blue.setBackground(new java.awt.Color(0, 153, 255));
        blue.setText("      ");
        blue.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        blue.setOpaque(true);
        Colors.add(blue);

        green.setBackground(new java.awt.Color(0, 204, 0));
        green.setText("      ");
        green.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        green.setOpaque(true);
        Colors.add(green);

        pink.setBackground(new java.awt.Color(255, 51, 204));
        pink.setText("      ");
        pink.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        pink.setOpaque(true);
        Colors.add(pink);

        black.setBackground(new java.awt.Color(0, 0, 0));
        black.setText("      ");
        black.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        black.setOpaque(true);
        Colors.add(black);

        white.setBackground(new java.awt.Color(255, 255, 255));
        white.setText("      ");
        white.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        white.setOpaque(true);
        Colors.add(white);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        toolbar.add(Colors, gridBagConstraints);

        Brush.setBackground(new java.awt.Color(204, 204, 204));
        Brush.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), "Brush", 0, 0, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        Brush.setToolTipText("Brush");
        Brush.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Brush.setMaximumSize(new java.awt.Dimension(100, 70));
        Brush.setMinimumSize(new java.awt.Dimension(100, 70));
        Brush.setOpaque(false);
        Brush.setPreferredSize(new java.awt.Dimension(100, 70));
        Brush.setLayout(new java.awt.GridBagLayout());

        lblThickness.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblThickness.setText("Thickness");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Brush.add(lblThickness, gridBagConstraints);

        txtThickness.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtThickness.setText("5");
        txtThickness.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        txtThickness.setMaximumSize(new java.awt.Dimension(20, 16));
        txtThickness.setMinimumSize(new java.awt.Dimension(20, 16));
        txtThickness.setPreferredSize(new java.awt.Dimension(20, 16));
        txtThickness.setRequestFocusEnabled(false);
        txtThickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThicknessActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        Brush.add(txtThickness, gridBagConstraints);

        currentColor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        currentColor.setText("Color");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Brush.add(currentColor, gridBagConstraints);

        finalColor.setBackground(new java.awt.Color(255, 0, 0));
        finalColor.setText("      ");
        finalColor.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        finalColor.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        Brush.add(finalColor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        toolbar.add(Brush, gridBagConstraints);

        jPanel2.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.2;
        toolbar.add(jPanel2, gridBagConstraints);

        Brush1.setBackground(new java.awt.Color(204, 204, 204));
        Brush1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), "Settings", 0, 0, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        Brush1.setToolTipText("Brush");
        Brush1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Brush1.setMaximumSize(new java.awt.Dimension(100, 70));
        Brush1.setMinimumSize(new java.awt.Dimension(100, 70));
        Brush1.setOpaque(false);
        Brush1.setPreferredSize(new java.awt.Dimension(100, 70));
        Brush1.setLayout(new java.awt.GridBagLayout());

        btnBackground.setText("Change Background");
        btnBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackgroundActionPerformed(evt);
            }
        });
        Brush1.add(btnBackground, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 52;
        toolbar.add(Brush1, gridBagConstraints);

        getContentPane().add(toolbar, java.awt.BorderLayout.PAGE_START);

        panDrawingArea.setBackground(new java.awt.Color(255, 255, 255));
        panDrawingArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panDrawingArea.setFocusCycleRoot(true);
        panDrawingArea.setPreferredSize(new java.awt.Dimension(800, 500));
        panDrawingArea.setLayout(new java.awt.CardLayout());
        getContentPane().add(panDrawingArea, java.awt.BorderLayout.CENTER);

        menuFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/file.png"))); // NOI18N
        menuFile.setText("     File     ");

        menuImport.setText("Import");

        menuImportJSON.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuImportJSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/json-file.png"))); // NOI18N
        menuImportJSON.setText("JSON");
        menuImport.add(menuImportJSON);

        menuImportXML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/xml.png"))); // NOI18N
        menuImportXML.setText("XML");
        menuImport.add(menuImportXML);

        menuFile.add(menuImport);

        menuExport.setText("Export");

        menuExportJSON.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuExportJSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/json-file.png"))); // NOI18N
        menuExportJSON.setText("JSON");
        menuExport.add(menuExportJSON);

        menuExportXML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/xml.png"))); // NOI18N
        menuExportXML.setText("XML");
        menuExport.add(menuExportXML);

        menuFile.add(menuExport);

        jMenuBar1.add(menuFile);

        menuEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/ruler.png"))); // NOI18N
        menuEdit.setText("     Edit     ");

        menuRotate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/rotate.png"))); // NOI18N
        menuRotate.setText("     Rotate     ");

        menuLeft.setText("Left");
        menuRotate.add(menuLeft);

        menuRight.setText("Right");
        menuRotate.add(menuRight);

        menuEdit.add(menuRotate);

        menuClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/easel.png"))); // NOI18N
        menuClear.setText("Clear Canvas");
        menuEdit.add(menuClear);

        menuReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/settings.png"))); // NOI18N
        menuReset.setText("Reset Settings");
        menuEdit.add(menuReset);

        jMenuBar1.add(menuEdit);

        menuShapes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Shapes.png"))); // NOI18N
        menuShapes.setText("     Shapes");

        menuRectangle.setText("Rectangle");
        menuRectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/square.png"))); // NOI18N
        menuShapes.add(menuRectangle);

        menuOval.setText("Oval");
        menuOval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/oval.png"))); // NOI18N
        menuShapes.add(menuOval);

        menuTriangle.setText("Triangle");
        menuTriangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/triangle.png"))); // NOI18N
        menuShapes.add(menuTriangle);

        menuLine.setText("Line");
        menuLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/spiral.png"))); // NOI18N
        menuShapes.add(menuLine);

        jMenuBar1.add(menuShapes);

        menuColorMixer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/paint-palette.png"))); // NOI18N
        menuColorMixer.setText("     Colour Mixer     ");
        menuColorMixer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuColorMixerMousePressed(evt);
            }
        });
        menuColorMixer.add(colorMixerBean1);

        jMenuBar1.add(menuColorMixer);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void menuColorMixerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuColorMixerMousePressed

    }//GEN-LAST:event_menuColorMixerMousePressed

    private void txtThicknessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThicknessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThicknessActionPerformed

    private void btnBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackgroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackgroundActionPerformed

    public JMenuBar getmenuBar() {
        return this.jMenuBar1;
    }

    public JTextField getTxtThickness() {
        return this.txtThickness;
    }

    public JMenuItem getmenuClear() {
        return this.menuClear;
    }

    public JMenuItem getmenuShapes() {
        return this.menuShapes;
    }

    public JMenu getmenuColorMixer() {
        return this.menuColorMixer;
    }

    public ColorMixer getColorMixer() {
        return this.colorMixerBean1;
    }

    public JMenu getmenuEdit() {
        return this.menuEdit;
    }

    public JMenu getmenuExport() {
        return this.menuExport;
    }

    public JMenuItem getmenuExportJSON() {
        return this.menuExportJSON;
    }

    public JMenuItem getmenuExportXML() {
        return this.menuExportXML;
    }

    public JMenuItem getmenuImportJSON() {
        return this.menuImportJSON;
    }

    public JMenuItem getmenuImportXML() {
        return this.menuImportXML;
    }

    public JMenuItem getmenuLeft() {
        return this.menuLeft;
    }

    public JMenuItem getmenuRight() {
        return this.menuRight;
    }

    public JMenuItem getmenuLine() {
        return this.menuLine;
    }

    public JMenuItem getmenuOval() {
        return this.menuOval;
    }

    public JMenuItem getmenuRectangle() {
        return this.menuRectangle;
    }

    public JMenuItem getmenuTriangle() {
        return this.menuTriangle;
    }

    public JPanel getCanvas() {
        return this.panDrawingArea;
    }

    public JMenuItem getmenuReset() {
        return this.menuReset;
    }

    public JButton getbtnBackground() {
        return this.btnBackground;
    }

    public JPanel getDrawingPanel() {
        return this.drawingPanel;
    }

    public JLabel getRedLabel() {
        return red;
    }

    public JLabel getYellowLabel() {
        return yellow;
    }

    public JLabel getOrangeLabel() {
        return orange;
    }

    public JLabel getBlueLabel() {
        return blue;
    }

    public JLabel getGreenLabel() {
        return green;
    }

    public JLabel getPinkLabel() {
        return pink;
    }

    public JLabel getBlackLabel() {
        return black;
    }

    public JLabel getWhiteLabel() {
        return white;
    }
   
    public JLabel getFinalColor(){
        return this.finalColor;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Brush;
    private javax.swing.JPanel Brush1;
    private javax.swing.JPanel Colors;
    private javax.swing.JLabel black;
    private javax.swing.JLabel blue;
    private javax.swing.JButton btnBackground;
    private colormixerbean.ColorMixer colorMixerBean1;
    private javax.swing.JLabel currentColor;
    private javax.swing.JLabel finalColor;
    private javax.swing.JLabel green;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblThickness;
    private javax.swing.JMenuItem menuClear;
    private javax.swing.JMenu menuColorMixer;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuExport;
    private javax.swing.JMenuItem menuExportJSON;
    private javax.swing.JMenuItem menuExportXML;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuImport;
    private javax.swing.JMenuItem menuImportJSON;
    private javax.swing.JMenuItem menuImportXML;
    private javax.swing.JMenuItem menuLeft;
    private javax.swing.JCheckBoxMenuItem menuLine;
    private javax.swing.JCheckBoxMenuItem menuOval;
    private javax.swing.JCheckBoxMenuItem menuRectangle;
    private javax.swing.JMenuItem menuReset;
    private javax.swing.JMenuItem menuRight;
    private javax.swing.JMenu menuRotate;
    private javax.swing.JMenu menuShapes;
    private javax.swing.JCheckBoxMenuItem menuTriangle;
    private javax.swing.JLabel orange;
    public javax.swing.JPanel panDrawingArea;
    private javax.swing.JLabel pink;
    private javax.swing.JLabel red;
    private javax.swing.JPanel toolbar;
    private javax.swing.JTextField txtThickness;
    private javax.swing.JLabel white;
    private javax.swing.JLabel yellow;
    // End of variables declaration//GEN-END:variables

    @Override
    public void refresh() {
        repaint();
    }
}
