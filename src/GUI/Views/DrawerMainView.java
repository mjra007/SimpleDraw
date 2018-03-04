/**
 * DrawerMain.java
 *
 * @author Gill Windall
 *
 * A very simple drawing program.
 *
 * The UI for the class has been created using NetBeans GUI Builder.  If you
 * wish to edit the parts generated by the form editor you have two choices:
 * 1) Use a text editor to remove the "editor" comments that NetBeans uses
 * to identify the parts that should not be edited.  This is a one way trip.
 * Once you have done this you won't be able to use the NetBeans GUI editor
 * any more for this class
 * 2) Work out how to use the "Code" feature on the property editor in NetBeans
 * to customise the generated code.  You can do most things by use of properties
 * such as "Pre-Init Code" and "Post-Init Code"
 */
package GUI.Views;

import GUI.Controllers.DrawingOptionsController;
import GUI.View;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class DrawerMainView extends JFrame implements View {

    private Canvas drawingPanel; // the drawing panel
    private DrawingOptionsController controller;

    /**
     * Initialise the components in the screen and then cast a reference to the
     * panel that will be drawn on so it can be used elsewhere.
     *
     * @param dpv
     */
    public DrawerMainView(Canvas dpv) {
        this.drawingPanel = dpv;
        initComponents();
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

        grpShape = new javax.swing.ButtonGroup();
        panControls = new javax.swing.JPanel();
        panScroller = new javax.swing.JPanel();
        panRedScroller = new javax.swing.JPanel();
        lblRed = new javax.swing.JLabel();
        scrRed = new javax.swing.JScrollBar();
        txtRed = new javax.swing.JTextField();
        panGreenScroller = new javax.swing.JPanel();
        lblGreen = new javax.swing.JLabel();
        scrGreen = new javax.swing.JScrollBar();
        txtGreen = new javax.swing.JTextField();
        panBlueScroller = new javax.swing.JPanel();
        lblBlue = new javax.swing.JLabel();
        scrBlue = new javax.swing.JScrollBar();
        txtBlue = new javax.swing.JTextField();
        panBrightness = new javax.swing.JPanel();
        lblBrightness = new javax.swing.JLabel();
        scrBrightness = new javax.swing.JScrollBar();
        labBrightness = new javax.swing.JLabel();
        panBrightness1 = new javax.swing.JPanel();
        lblFinalColor = new javax.swing.JLabel();
        labColor = new javax.swing.JLabel();
        panMoreControls = new javax.swing.JPanel();
        panShape = new javax.swing.JPanel();
        radRectangle = new javax.swing.JRadioButton();
        radLine = new javax.swing.JRadioButton();
        radOval = new javax.swing.JRadioButton();
        radTriangle = new javax.swing.JRadioButton();
        panThickness = new javax.swing.JPanel();
        lblThickness = new javax.swing.JLabel();
        txtThickness = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        panRotate = new javax.swing.JPanel();
        lblRotate = new javax.swing.JLabel();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        panButtons = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        panLoad = new javax.swing.JPanel();
        btnLoadXML = new javax.swing.JButton();
        btnLoadJSON = new javax.swing.JButton();

        panDrawingArea = this.drawingPanel;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Draw");

        panControls.setPreferredSize(new java.awt.Dimension(290, 300));
        panControls.setLayout(new java.awt.BorderLayout());

        panScroller.setPreferredSize(new java.awt.Dimension(200, 100));
        panScroller.setLayout(new java.awt.GridLayout(4, 0));

        panRedScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panRedScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblRed.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblRed.setText("Red");
        lblRed.setPreferredSize(new java.awt.Dimension(35, 14));
        panRedScroller.add(lblRed);

        scrRed.setMaximum(256);
        scrRed.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrRed.setVisibleAmount(1);
        scrRed.setPreferredSize(new java.awt.Dimension(150, 16));

        panRedScroller.add(scrRed);

        txtRed.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRed.setText("0");
        txtRed.setPreferredSize(new java.awt.Dimension(50, 20));
        panRedScroller.add(txtRed);

        panScroller.add(panRedScroller);

        panGreenScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panGreenScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblGreen.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblGreen.setText("Green");
        lblGreen.setPreferredSize(new java.awt.Dimension(35, 14));
        panGreenScroller.add(lblGreen);

        scrGreen.setMaximum(256);
        scrGreen.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrGreen.setVisibleAmount(1);
        scrGreen.setPreferredSize(new java.awt.Dimension(150, 16));

        panGreenScroller.add(scrGreen);

        txtGreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGreen.setText("0");
        txtGreen.setPreferredSize(new java.awt.Dimension(50, 20));
        panGreenScroller.add(txtGreen);

        panScroller.add(panGreenScroller);

        panBlueScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panBlueScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblBlue.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblBlue.setText("Blue");
        lblBlue.setPreferredSize(new java.awt.Dimension(35, 14));
        panBlueScroller.add(lblBlue);

        scrBlue.setMaximum(256);
        scrBlue.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBlue.setVisibleAmount(1);
        scrBlue.setPreferredSize(new java.awt.Dimension(150, 16));

        panBlueScroller.add(scrBlue);

        txtBlue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBlue.setText("0");
        txtBlue.setPreferredSize(new java.awt.Dimension(50, 20));
        panBlueScroller.add(txtBlue);

        panScroller.add(panBlueScroller);

        lblBrightness.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblBrightness.setText("Brightness");
        panBrightness.add(lblBrightness);

        scrBrightness.setMaximum(110);
        scrBrightness.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBrightness.setValue(50);
        scrBrightness.setPreferredSize(new java.awt.Dimension(150, 16));

        panBrightness.add(scrBrightness);

        labBrightness.setBackground(new java.awt.Color(126, 126, 126));
        labBrightness.setText("           ");
        labBrightness.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labBrightness.setOpaque(true);
        panBrightness.add(labBrightness);

        panScroller.add(panBrightness);

        panControls.add(panScroller, java.awt.BorderLayout.NORTH);

        panBrightness1.setMinimumSize(new java.awt.Dimension(117, 30));
        panBrightness1.setPreferredSize(new java.awt.Dimension(117, 32));

        lblFinalColor.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblFinalColor.setText("Final Colour");
        panBrightness1.add(lblFinalColor);

        labColor.setBackground(new java.awt.Color(0, 0, 0));
        labColor.setText("           ");
        labColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labColor.setOpaque(true);
        panBrightness1.add(labColor);

        panControls.add(panBrightness1, java.awt.BorderLayout.CENTER);

        panMoreControls.setLayout(new java.awt.GridLayout(5, 0));

        grpShape.add(radRectangle);
        radRectangle.setSelected(true);
        radRectangle.setText("Rectangle");

        panShape.add(radRectangle);

        grpShape.add(radLine);
        radLine.setText("Line");

        panShape.add(radLine);

        grpShape.add(radOval);
        radOval.setText("Oval");

        panShape.add(radOval);

        grpShape.add(radTriangle);
        radTriangle.setText("Triangle");

        panShape.add(radTriangle);

        panMoreControls.add(panShape);

        panThickness.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblThickness.setText("Thickness");
        panThickness.add(lblThickness);

        txtThickness.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtThickness.setText("5");
        txtThickness.setPreferredSize(new java.awt.Dimension(50, 20));

        panThickness.add(txtThickness);

        lblBackground.setText("Background");
        panThickness.add(lblBackground);

        btnChange.setText("Change");

        panThickness.add(btnChange);

        panMoreControls.add(panThickness);

        panRotate.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblRotate.setText("Rotate");
        panRotate.add(lblRotate);

        btnLeft.setText("Left");

        panRotate.add(btnLeft);

        btnRight.setText("Right");
        panRotate.add(btnRight);

        panMoreControls.add(panRotate);

        btnClear.setText("Clear");

        panButtons.add(btnClear);

        btnReset.setText("Reset");
        panButtons.add(btnReset);

        panMoreControls.add(panButtons);

        btnLoadXML.setText("load XML");
        panLoad.add(btnLoadXML);

        btnLoadJSON.setText("load JSON");

        panLoad.add(btnLoadJSON);

        panMoreControls.add(panLoad);

        panControls.add(panMoreControls, java.awt.BorderLayout.SOUTH);

        getContentPane().add(panControls, java.awt.BorderLayout.WEST);

        panDrawingArea.setBackground(new java.awt.Color(255, 255, 255));
        panDrawingArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panDrawingArea.setFocusCycleRoot(true);
        panDrawingArea.setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().add(panDrawingArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getbtnLoadJSON() {
        return this.btnLoadJSON;
    }

    public JButton getbtnLoadXML() {
        return this.btnLoadXML;
    }

    public JButton getbtnClear() {
        return this.btnClear;
    }

    public JButton getbtnLeft() {
        return this.btnLeft;
    }

    public JButton getbtnRight() {
        return this.btnRight;
    }

    public JButton getbtnReset() {
        return this.btnReset;
    }

    public JButton getbtnChange() {
        return this.btnChange;
    }

    public JRadioButton getRadLineShape() {
        return this.radLine;
    }

    public JRadioButton getRadOvalShape() {
        return this.radOval;
    }

    public JRadioButton getRadRectangleShape() {
        return this.radRectangle;
    }

    public JRadioButton getRadTriangleShape() {
        return this.radTriangle;
    }

    public JTextField getTxtThickness() {
        return this.txtThickness;
    }

    public JScrollBar getScrollBlue() {
        return this.scrBlue;
    }

    public JScrollBar getScrollRed() {
        return this.scrRed;
    }

    public JScrollBar getScrollGreen() {
        return this.scrGreen;
    }

    public JScrollBar getScrollBrightness() {
        return this.scrBrightness;
    }

    public JTextField getTxtBlue() {
        return this.txtBlue;
    }

    public JTextField getTxtRed() {
        return this.txtRed;
    }

    public JTextField getTxtGreen() {
        return this.txtGreen;
    }

    public JLabel getLblBackground() {
        return this.lblBackground;
    }

    public JLabel getLblColor() {
        return this.labColor;
    }

    public JLabel getlblBrightness() {
        return this.lblBrightness;
    }

    public JPanel getDrawingPanel() {
        return this.drawingPanel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnLoadJSON;
    private javax.swing.JButton btnLoadXML;
    private javax.swing.JButton btnRight;
    private javax.swing.ButtonGroup grpShape;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel lblThickness;
    private javax.swing.JLabel lblRotate;
    private javax.swing.JLabel lblBrightness;
    private javax.swing.JLabel lblRed;
    private javax.swing.JLabel lblGreen;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblFinalColor;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel labBrightness;
    private javax.swing.JLabel labColor;
    private javax.swing.JPanel panBlueScroller;
    private javax.swing.JPanel panBrightness;
    private javax.swing.JPanel panBrightness1;
    private javax.swing.JPanel panButtons;
    private javax.swing.JPanel panControls;
    private javax.swing.JPanel panDrawingArea;
    private javax.swing.JPanel panGreenScroller;
    private javax.swing.JPanel panLoad;
    private javax.swing.JPanel panMoreControls;
    private javax.swing.JPanel panRedScroller;
    private javax.swing.JPanel panRotate;
    private javax.swing.JPanel panScroller;
    private javax.swing.JPanel panShape;
    private javax.swing.JPanel panThickness;
    private javax.swing.JRadioButton radLine;
    private javax.swing.JRadioButton radOval;
    private javax.swing.JRadioButton radRectangle;
    private javax.swing.JRadioButton radTriangle;
    private javax.swing.JScrollBar scrBlue;
    private javax.swing.JScrollBar scrBrightness;
    private javax.swing.JScrollBar scrGreen;
    private javax.swing.JScrollBar scrRed;
    private javax.swing.JTextField txtBlue;
    private javax.swing.JTextField txtGreen;
    private javax.swing.JTextField txtRed;
    private javax.swing.JTextField txtThickness;
    // End of variables declaration//GEN-END:variables

    @Override
    public void refresh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
