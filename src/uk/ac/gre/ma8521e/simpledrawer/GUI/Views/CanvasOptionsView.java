package uk.ac.gre.ma8521e.simpledrawer.GUI.Views;

import uk.ac.gre.ma8521e.simpledrawer.GUI.View;
import uk.ac.gre.ma8521e.simpledrawer.GUI.Controllers.CanvasOptionsController;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import colormixerbean.ColorMixer;
import drawingpanel.DrawingPanel;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.text.NumberFormatter;

public class CanvasOptionsView extends javax.swing.JFrame implements View {

    private CanvasOptionsController controller;

    public CanvasOptionsView() {
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

    public void addController(CanvasOptionsController c) {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        colorMixer1 = new colormixerbean.ColorMixer();
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
		NumberFormat format = NumberFormat.getInstance();
		NumberFormatter formatter = new NumberFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setMinimum(1);
		formatter.setMaximum(40);
		formatter.setAllowsInvalid(true);
		formatter.setCommitsOnValidEdit(false);
        txtThickness = new javax.swing.JFormattedTextField(formatter);
		txtThickness.setFocusLostBehavior(JFormattedTextField.PERSIST);
        currentColor = new javax.swing.JLabel();
        finalColor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Brush1 = new javax.swing.JPanel();
        betterGraphicsButton = new javax.swing.JCheckBox();
        drawingPanel2 = new drawingpanel.DrawingPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuImport = new javax.swing.JMenu();
        menuImportJSON = new javax.swing.JMenuItem();
        menuExport = new javax.swing.JMenu();
        menuExportJSON = new javax.swing.JMenuItem();
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

        toolbar.setBackground(new java.awt.Color(204, 204, 204));
        toolbar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        toolbar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        java.awt.GridBagLayout toolbarLayout = new java.awt.GridBagLayout();
        toolbarLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        toolbarLayout.rowHeights = new int[] {0};
        toolbar.setLayout(toolbarLayout);

        Colors.setBackground(new java.awt.Color(204, 204, 204));
        Colors.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), "Pick a colour", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        Colors.setToolTipText("Brush");
        Colors.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Colors.setMaximumSize(new java.awt.Dimension(100, 100));
        Colors.setMinimumSize(new java.awt.Dimension(100, 100));
        Colors.setOpaque(false);
        Colors.setPreferredSize(new java.awt.Dimension(120, 70));

        red.setBackground(new java.awt.Color(255, 0, 0));
        red.setText("      ");
        red.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        red.setOpaque(true);
        Colors.add(red);

        yellow.setBackground(new java.awt.Color(255, 255, 0));
        yellow.setText("      ");
        yellow.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        yellow.setOpaque(true);
        Colors.add(yellow);

        orange.setBackground(new java.awt.Color(255, 102, 0));
        orange.setText("      ");
        orange.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        orange.setOpaque(true);
        Colors.add(orange);

        blue.setBackground(new java.awt.Color(0, 153, 255));
        blue.setText("      ");
        blue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        blue.setOpaque(true);
        Colors.add(blue);

        green.setBackground(new java.awt.Color(0, 204, 0));
        green.setText("      ");
        green.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        green.setOpaque(true);
        Colors.add(green);

        pink.setBackground(new java.awt.Color(255, 51, 204));
        pink.setText("      ");
        pink.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pink.setOpaque(true);
        Colors.add(pink);

        black.setBackground(new java.awt.Color(0, 0, 0));
        black.setText("      ");
        black.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        black.setOpaque(true);
        Colors.add(black);

        white.setBackground(new java.awt.Color(255, 255, 255));
        white.setText("      ");
        white.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        white.setOpaque(true);
        Colors.add(white);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        toolbar.add(Colors, gridBagConstraints);

        Brush.setBackground(new java.awt.Color(204, 204, 204));
        Brush.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), "Brush", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
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
        txtThickness.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtThickness.setMaximumSize(new java.awt.Dimension(20, 16));
        txtThickness.setMinimumSize(new java.awt.Dimension(20, 16));
        txtThickness.setPreferredSize(new java.awt.Dimension(20, 16));
		
		
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
        finalColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        Brush1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), "Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        Brush1.setToolTipText("Brush");
        Brush1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Brush1.setMaximumSize(new java.awt.Dimension(100, 70));
        Brush1.setMinimumSize(new java.awt.Dimension(100, 70));
        Brush1.setOpaque(false);
        Brush1.setPreferredSize(new java.awt.Dimension(100, 70));
        Brush1.setLayout(new java.awt.GridBagLayout());

        betterGraphicsButton.setText("Better Graphics");
        betterGraphicsButton.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        Brush1.add(betterGraphicsButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 52;
        toolbar.add(Brush1, gridBagConstraints);

        getContentPane().add(toolbar, java.awt.BorderLayout.PAGE_START);

        drawingPanel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        drawingPanel2.setMinimumSize(new java.awt.Dimension(1000, 700));
        drawingPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().add(drawingPanel2, java.awt.BorderLayout.CENTER);

        menuFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/file.png"))); // NOI18N
        menuFile.setText("File     ");

        menuImport.setText("Import");

        menuImportJSON.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuImportJSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/json-file.png"))); // NOI18N
        menuImportJSON.setText("JSON");
        menuImport.add(menuImportJSON);

        menuFile.add(menuImport);

        menuExport.setText("Export");

        menuExportJSON.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuExportJSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/json-file.png"))); // NOI18N
        menuExportJSON.setText("JSON");
        menuExport.add(menuExportJSON);

        menuFile.add(menuExport);

        jMenuBar1.add(menuFile);

        menuEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/ruler.png"))); // NOI18N
        menuEdit.setText("Edit     ");
        menuEdit.setActionCommand(" Edit     ");

        menuRotate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/rotate.png"))); // NOI18N
        menuRotate.setText("     Rotate     ");

        menuLeft.setText("Left");
        menuRotate.add(menuLeft);

        menuRight.setText("Right");
        menuRotate.add(menuRight);

        menuEdit.add(menuRotate);

        menuClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/easel.png"))); // NOI18N
        menuClear.setText("Clear Canvas");
        menuEdit.add(menuClear);

        menuReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/settings.png"))); // NOI18N
        menuReset.setText("Reset Settings");
        menuEdit.add(menuReset);

        jMenuBar1.add(menuEdit);

        menuShapes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/Shapes.png"))); // NOI18N
        menuShapes.setText("Shapes");

        menuRectangle.setText("Rectangle");
        menuRectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/square.png"))); // NOI18N
        menuShapes.add(menuRectangle);

        menuOval.setText("Oval");
        menuOval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/oval.png"))); // NOI18N
        menuShapes.add(menuOval);

        menuTriangle.setText("Triangle");
        menuTriangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/triangle.png"))); // NOI18N
        menuShapes.add(menuTriangle);

        menuLine.setText("Line");
        menuLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/spiral.png"))); // NOI18N
        menuShapes.add(menuLine);

        jMenuBar1.add(menuShapes);

        menuColorMixer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/ac/gre/ma8521e/simpledrawer/GUI/Images/paint-palette.png"))); // NOI18N
        menuColorMixer.setText("Colour Mixer     ");
        menuColorMixer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuColorMixer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuColorMixerMouseEntered(evt);
            }
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

    private void menuColorMixerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuColorMixerMouseEntered

    }//GEN-LAST:event_menuColorMixerMouseEntered

    public JMenuBar getmenuBar() {
        return this.jMenuBar1;
    }

    public JFormattedTextField getTxtThickness() {
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

    public JMenuItem getmenuImportJSON() {
        return this.menuImportJSON;
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

    public DrawingPanel getCanvas() {
        return this.drawingPanel2;
    }

    public JMenuItem getmenuReset() {
        return this.menuReset;
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

    public JLabel getFinalColor() {
        return this.finalColor;
    }

    public JCheckBox getBetterGraphicsButton() {
        return this.betterGraphicsButton;
    }

    public JFileChooser getFileChooser() {
        return this.jFileChooser1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Brush;
    private javax.swing.JPanel Brush1;
    private javax.swing.JPanel Colors;
    private javax.swing.JCheckBox betterGraphicsButton;
    private javax.swing.JLabel black;
    private javax.swing.JLabel blue;
    private colormixerbean.ColorMixer colorMixer1;
    private colormixerbean.ColorMixer colorMixerBean1;
    private javax.swing.JLabel currentColor;
    private drawingpanel.DrawingPanel drawingPanel2;
    private javax.swing.JLabel finalColor;
    private javax.swing.JLabel green;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblThickness;
    private javax.swing.JMenuItem menuClear;
    private javax.swing.JMenu menuColorMixer;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuExport;
    private javax.swing.JMenuItem menuExportJSON;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuImport;
    private javax.swing.JMenuItem menuImportJSON;
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
    private javax.swing.JLabel pink;
    private javax.swing.JLabel red;
    private javax.swing.JPanel toolbar;
    private javax.swing.JFormattedTextField txtThickness;
    private javax.swing.JLabel white;
    private javax.swing.JLabel yellow;
    // End of variables declaration//GEN-END:variables

    @Override
    public void refresh() {
        repaint();
        
    }

}
