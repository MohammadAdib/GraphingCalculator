//GraphingCalculatorGUI object Version 1
//Created on Jun 11 2011 10:20:42 PM
//Finished Jun 14 2011 2:07:34 AM
import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame
{
    //Initializes GUI
    public GUI()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e)
        {}
        initComponents();
        setType(true);        
        setCenterScreen();
    }    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        ControlPanel = new javax.swing.JPanel();
        Radian = new javax.swing.JRadioButton();
        Degree = new javax.swing.JRadioButton();
        display = new javax.swing.JTextField();
        divider1 = new javax.swing.JSeparator();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        log = new javax.swing.JButton();
        logBaseLabel = new javax.swing.JLabel();
        asin = new javax.swing.JButton();
        acos = new javax.swing.JButton();
        atan = new javax.swing.JButton();
        abs = new javax.swing.JButton();
        sec = new javax.swing.JButton();
        csc = new javax.swing.JButton();
        cot = new javax.swing.JButton();
        sqr = new javax.swing.JButton();
        beginPars = new javax.swing.JButton();
        endPars = new javax.swing.JButton();
        LogBase = new javax.swing.JComboBox();
        pi = new javax.swing.JButton();
        e = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        X = new javax.swing.JButton();
        graph = new javax.swing.JButton();
        XminPanel = new javax.swing.JPanel();
        Xmin = new javax.swing.JTextField();
        XmaxPanel = new javax.swing.JPanel();
        Xmax = new javax.swing.JTextField();
        YminPanel = new javax.swing.JPanel();
        Ymin = new javax.swing.JTextField();
        YmaxPanel = new javax.swing.JPanel();
        Ymax = new javax.swing.JTextField();
        divider2 = new javax.swing.JSeparator();
        Equation = new javax.swing.JComboBox();
        divider3 = new javax.swing.JSeparator();
        drawFuncCheckBox = new javax.swing.JCheckBox();
        GraphPanel = new javax.swing.JPanel();
        graph_screen = new javax.swing.JPanel();
        cColor = new javax.swing.JLabel();
        fColor = new javax.swing.JLabel();
        gColor = new javax.swing.JLabel();
        aColor = new javax.swing.JLabel();
        bColor = new javax.swing.JLabel();
        dColor = new javax.swing.JLabel();
        eColor = new javax.swing.JLabel();
        drawAxis = new javax.swing.JRadioButton();
        drawGrid = new javax.swing.JRadioButton();
        TablePanel = new javax.swing.JPanel();
        StartPanel = new javax.swing.JPanel();
        Start = new javax.swing.JTextField();
        IncrementPanel = new javax.swing.JPanel();
        Increment = new javax.swing.JTextField();
        EndPanel = new javax.swing.JPanel();
        End = new javax.swing.JTextField();
        TableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tableSeperator = new javax.swing.JSeparator();
        CalculatorPanel = new javax.swing.JPanel();
        Calcppi = new javax.swing.JButton();
        Calc2 = new javax.swing.JButton();
        Calce = new javax.swing.JButton();
        Calc1 = new javax.swing.JButton();
        CalcEndpars = new javax.swing.JButton();
        Calcminus = new javax.swing.JButton();
        Calc3 = new javax.swing.JButton();
        Calcequals = new javax.swing.JButton();
        Calc0 = new javax.swing.JButton();
        Calcpower = new javax.swing.JButton();
        Calcdecimal = new javax.swing.JButton();
        Calcx = new javax.swing.JButton();
        Calcplus = new javax.swing.JButton();
        Calcsin = new javax.swing.JButton();
        Calccos = new javax.swing.JButton();
        Calc4 = new javax.swing.JButton();
        Calc5 = new javax.swing.JButton();
        Calc6 = new javax.swing.JButton();
        CalcMultip = new javax.swing.JButton();
        divide1 = new javax.swing.JButton();
        Calc9 = new javax.swing.JButton();
        Calc8 = new javax.swing.JButton();
        CalcBeginpars = new javax.swing.JButton();
        Calc7 = new javax.swing.JButton();
        Calcsqrt = new javax.swing.JButton();
        Calcatan = new javax.swing.JButton();
        Calcabs = new javax.swing.JButton();
        Calcsec = new javax.swing.JButton();
        Calccsc = new javax.swing.JButton();
        Calclog = new javax.swing.JButton();
        Calcasin = new javax.swing.JButton();
        Calcacos = new javax.swing.JButton();
        Calccot = new javax.swing.JButton();
        Calctan = new javax.swing.JButton();
        Calcbin = new javax.swing.JRadioButton();
        Calchex = new javax.swing.JRadioButton();
        Calcoct = new javax.swing.JRadioButton();
        Calcdec = new javax.swing.JRadioButton();
        Calcdisplay = new javax.swing.JTextField();
        CalcA = new javax.swing.JButton();
        CalcB = new javax.swing.JButton();
        CalcC = new javax.swing.JButton();
        CalcD = new javax.swing.JButton();
        CalcE = new javax.swing.JButton();
        Calcrad = new javax.swing.JRadioButton();
        Calcdeg = new javax.swing.JRadioButton();
        CalcF = new javax.swing.JButton();
        Calcclear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Precision = new javax.swing.JMenu();
        SetPrecision = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        GraphColorMenu = new javax.swing.JMenu();
        GraphColor = new javax.swing.JMenuItem();
        AxisColor = new javax.swing.JMenuItem();
        GridColor = new javax.swing.JMenuItem();
        TableColor = new javax.swing.JMenuItem();
        BackgroundColor = new javax.swing.JMenuItem();
        GraphicsMenu = new javax.swing.JMenu();
        GraphWidth = new javax.swing.JMenuItem();
        AxisWidth = new javax.swing.JMenuItem();
        GridWidth = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        instantDraw = new javax.swing.JMenuItem();
        slowDraw = new javax.swing.JMenuItem();
        ZoomMenu = new javax.swing.JMenu();
        ZoomIn = new javax.swing.JMenuItem();
        ZoomOut = new javax.swing.JMenuItem();
        Standard = new javax.swing.JMenuItem();
        Trigonometric = new javax.swing.JMenuItem();
        Statistic = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        graphingButton = new javax.swing.JMenuItem();
        scientificButton = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graphing Calculator v1");
        setLocationByPlatform(true);
        setName("GraphingCalculatorMainFrame"); // NOI18N
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ControlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Control Panel"));
        ControlPanel.setPreferredSize(new java.awt.Dimension(300, 300));

        Radian.setSelected(true);
        Radian.setText("Radian");
        Radian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Radian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadianActionPerformed(evt);
            }
        });

        Degree.setText("Degree");
        Degree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DegreeActionPerformed(evt);
            }
        });

        display.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        display.setToolTipText("");
        display.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                displayKeyReleased(evt);
            }
        });

        Button7.setFont(new java.awt.Font("Arial", 1, 12));
        Button7.setText("7");
        Button7.setPreferredSize(new java.awt.Dimension(42, 10));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Arial", 1, 12));
        Button8.setText("8");
        Button8.setPreferredSize(new java.awt.Dimension(42, 10));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setFont(new java.awt.Font("Arial", 1, 12));
        Button9.setText("9");
        Button9.setPreferredSize(new java.awt.Dimension(42, 10));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Arial", 1, 12));
        divide.setText("÷");
        divide.setPreferredSize(new java.awt.Dimension(42, 10));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Arial", 1, 12));
        multiply.setText("*");
        multiply.setPreferredSize(new java.awt.Dimension(42, 10));
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Arial", 1, 12));
        Button6.setText("6");
        Button6.setPreferredSize(new java.awt.Dimension(42, 10));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Arial", 1, 12));
        Button5.setText("5");
        Button5.setPreferredSize(new java.awt.Dimension(42, 10));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Arial", 1, 12));
        Button4.setText("4");
        Button4.setPreferredSize(new java.awt.Dimension(42, 10));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        decimal.setFont(new java.awt.Font("Arial", 1, 12));
        decimal.setText(".");
        decimal.setPreferredSize(new java.awt.Dimension(42, 10));
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Arial", 1, 12));
        plus.setText("+");
        plus.setPreferredSize(new java.awt.Dimension(42, 10));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        Button0.setFont(new java.awt.Font("Arial", 1, 12));
        Button0.setText("0");
        Button0.setPreferredSize(new java.awt.Dimension(42, 10));
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Arial", 1, 12));
        clear.setText("C");
        clear.setToolTipText("Clear");
        clear.setPreferredSize(new java.awt.Dimension(42, 10));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Proxy 9", 1, 10));
        minus.setText("-");
        minus.setPreferredSize(new java.awt.Dimension(42, 10));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Arial", 1, 12));
        Button3.setText("3");
        Button3.setPreferredSize(new java.awt.Dimension(42, 10));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Arial", 1, 12));
        Button2.setText("2");
        Button2.setPreferredSize(new java.awt.Dimension(42, 10));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Arial", 1, 12));
        Button1.setText("1");
        Button1.setPreferredSize(new java.awt.Dimension(42, 10));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Arial", 1, 12));
        sin.setText("SIN");
        sin.setPreferredSize(new java.awt.Dimension(42, 10));
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Arial", 1, 12));
        cos.setText("COS");
        cos.setPreferredSize(new java.awt.Dimension(42, 10));
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Arial", 1, 12));
        tan.setText("TAN");
        tan.setPreferredSize(new java.awt.Dimension(42, 10));
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Arial", 1, 12));
        log.setText("LOG");
        log.setPreferredSize(new java.awt.Dimension(42, 10));
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        logBaseLabel.setText("LOG Base:");

        asin.setFont(new java.awt.Font("Arial", 1, 12));
        asin.setText("ASIN");
        asin.setPreferredSize(new java.awt.Dimension(42, 10));
        asin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asinActionPerformed(evt);
            }
        });

        acos.setFont(new java.awt.Font("Arial", 1, 12));
        acos.setText("ACOS");
        acos.setPreferredSize(new java.awt.Dimension(42, 10));
        acos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acosActionPerformed(evt);
            }
        });

        atan.setFont(new java.awt.Font("Arial", 1, 12));
        atan.setText("ATAN");
        atan.setPreferredSize(new java.awt.Dimension(42, 10));
        atan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atanActionPerformed(evt);
            }
        });

        abs.setFont(new java.awt.Font("Arial", 1, 12));
        abs.setText("ABS");
        abs.setPreferredSize(new java.awt.Dimension(42, 10));
        abs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absActionPerformed(evt);
            }
        });

        sec.setFont(new java.awt.Font("Arial", 1, 12));
        sec.setText("SEC");
        sec.setPreferredSize(new java.awt.Dimension(42, 10));
        sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secActionPerformed(evt);
            }
        });

        csc.setFont(new java.awt.Font("Arial", 1, 12));
        csc.setText("CSC");
        csc.setPreferredSize(new java.awt.Dimension(42, 10));
        csc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cscActionPerformed(evt);
            }
        });

        cot.setFont(new java.awt.Font("Arial", 1, 12));
        cot.setText("COT");
        cot.setPreferredSize(new java.awt.Dimension(42, 10));
        cot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotActionPerformed(evt);
            }
        });

        sqr.setFont(new java.awt.Font("Arial", 1, 12));
        sqr.setText("√");
        sqr.setPreferredSize(new java.awt.Dimension(42, 10));
        sqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrActionPerformed(evt);
            }
        });

        beginPars.setFont(new java.awt.Font("Arial", 1, 12));
        beginPars.setText("(");
        beginPars.setPreferredSize(new java.awt.Dimension(42, 10));
        beginPars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginParsActionPerformed(evt);
            }
        });

        endPars.setFont(new java.awt.Font("Arial", 1, 12));
        endPars.setText(")");
        endPars.setPreferredSize(new java.awt.Dimension(42, 10));
        endPars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endParsActionPerformed(evt);
            }
        });

        LogBase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "e", "Other" }));
        LogBase.setToolTipText("Choose log base");
        LogBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogBaseActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Arial", 1, 12));
        pi.setText("π");
        pi.setPreferredSize(new java.awt.Dimension(42, 10));
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        e.setFont(new java.awt.Font("Arial", 1, 12));
        e.setText("e");
        e.setPreferredSize(new java.awt.Dimension(42, 10));
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        exp.setFont(new java.awt.Font("Arial", 1, 12));
        exp.setText("^");
        exp.setPreferredSize(new java.awt.Dimension(42, 10));
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        X.setFont(new java.awt.Font("Arial", 1, 12));
        X.setText("X");
        X.setPreferredSize(new java.awt.Dimension(42, 10));
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        graph.setFont(new java.awt.Font("Arial", 1, 12));
        graph.setText("GRAPH");
        graph.setToolTipText("Plot the function");
        graph.setPreferredSize(new java.awt.Dimension(42, 10));
        graph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphActionPerformed(evt);
            }
        });

        XminPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Xmin"));
        XminPanel.setToolTipText("Graph bounds");

        Xmin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Xmin.setText("-10");
        Xmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                XminKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout XminPanelLayout = new javax.swing.GroupLayout(XminPanel);
        XminPanel.setLayout(XminPanelLayout);
        XminPanelLayout.setHorizontalGroup(
            XminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Xmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        XminPanelLayout.setVerticalGroup(
            XminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XminPanelLayout.createSequentialGroup()
                .addComponent(Xmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        XmaxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Xmax"));
        XmaxPanel.setToolTipText("Graph bounds");

        Xmax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Xmax.setText("10");
        Xmax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                XmaxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout XmaxPanelLayout = new javax.swing.GroupLayout(XmaxPanel);
        XmaxPanel.setLayout(XmaxPanelLayout);
        XmaxPanelLayout.setHorizontalGroup(
            XmaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XmaxPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Xmax, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        XmaxPanelLayout.setVerticalGroup(
            XmaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XmaxPanelLayout.createSequentialGroup()
                .addComponent(Xmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        YminPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ymin"));
        YminPanel.setToolTipText("Graph bounds");

        Ymin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Ymin.setText("-10");
        Ymin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                YminKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout YminPanelLayout = new javax.swing.GroupLayout(YminPanel);
        YminPanel.setLayout(YminPanelLayout);
        YminPanelLayout.setHorizontalGroup(
            YminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ymin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        YminPanelLayout.setVerticalGroup(
            YminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YminPanelLayout.createSequentialGroup()
                .addComponent(Ymin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        YmaxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ymax"));
        YmaxPanel.setToolTipText("Graph bounds");

        Ymax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Ymax.setText("10");
        Ymax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                YmaxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout YmaxPanelLayout = new javax.swing.GroupLayout(YmaxPanel);
        YmaxPanel.setLayout(YmaxPanelLayout);
        YmaxPanelLayout.setHorizontalGroup(
            YmaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YmaxPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ymax, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        YmaxPanelLayout.setVerticalGroup(
            YmaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YmaxPanelLayout.createSequentialGroup()
                .addComponent(Ymax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Equation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "f(x)", "g(x)", "a(x)", "b(x)", "c(x)", "d(x)", "e(x)" }));
        Equation.setToolTipText("Choose a function");
        Equation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquationActionPerformed(evt);
            }
        });

        drawFuncCheckBox.setSelected(true);
        drawFuncCheckBox.setToolTipText("Draw this function");
        drawFuncCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawFuncCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(divider2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divider1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(divider3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addComponent(Radian)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Degree)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logBaseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogBase, 0, 182, Short.MAX_VALUE))
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addComponent(drawFuncCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Equation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(asin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ControlPanelLayout.createSequentialGroup()
                                    .addComponent(sqr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ControlPanelLayout.createSequentialGroup()
                                    .addComponent(csc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cot, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(beginPars, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(endPars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ControlPanelLayout.createSequentialGroup()
                                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(abs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ControlPanelLayout.createSequentialGroup()
                                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(atan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(XminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(XmaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YmaxPanel, 0, 82, Short.MAX_VALUE)
                        .addGap(11, 11, 11))))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Degree)
                        .addComponent(logBaseLabel)
                        .addComponent(LogBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Radian))
                .addGap(6, 6, 6)
                .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Equation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drawFuncCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divider1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abs, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(csc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beginPars, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endPars, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sqr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graph, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(divider2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(YminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(XmaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(YmaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(XminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Equation.getAccessibleContext().setAccessibleDescription("");
        drawFuncCheckBox.getAccessibleContext().setAccessibleDescription("");

        GraphPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Graph"));
        GraphPanel.setPreferredSize(new java.awt.Dimension(356, 356));

        graph_screen.setBackground(new java.awt.Color(255, 255, 255));
        graph_screen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        graph_screen.setToolTipText("");
        graph_screen.setPreferredSize(new java.awt.Dimension(392, 392));
        graph_screen.setRequestFocusEnabled(false);
        graph_screen.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                graph_screenMouseWheelMoved(evt);
            }
        });
        graph_screen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                graph_screenMouseReleased(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                graph_screenMousePressed(evt);
            }
        });
        graph_screen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                graph_screenMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                graph_screenMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout graph_screenLayout = new javax.swing.GroupLayout(graph_screen);
        graph_screen.setLayout(graph_screenLayout);
        graph_screenLayout.setHorizontalGroup(
            graph_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        graph_screenLayout.setVerticalGroup(
            graph_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        cColor.setFont(new java.awt.Font("Arial", 1, 12));
        cColor.setText("c(x):");

        fColor.setFont(new java.awt.Font("Arial", 1, 12));
        fColor.setText("f(x):");

        gColor.setFont(new java.awt.Font("Arial", 1, 12));
        gColor.setText("g(x):");

        aColor.setFont(new java.awt.Font("Arial", 1, 12));
        aColor.setText("a(x):");

        bColor.setFont(new java.awt.Font("Arial", 1, 12));
        bColor.setText("b(x):");

        dColor.setFont(new java.awt.Font("Arial", 1, 12));
        dColor.setText("d(x):");

        eColor.setFont(new java.awt.Font("Arial", 1, 12));
        eColor.setText("e(x):");

        drawAxis.setSelected(true);
        drawAxis.setText("Draw Axes");
        drawAxis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawAxisActionPerformed(evt);
            }
        });

        drawGrid.setSelected(true);
        drawGrid.setText("Draw Grid");
        drawGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawGridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GraphPanelLayout = new javax.swing.GroupLayout(GraphPanel);
        GraphPanel.setLayout(GraphPanelLayout);
        GraphPanelLayout.setHorizontalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraphPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cColor, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(eColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawGrid)
                    .addComponent(drawAxis)
                    .addComponent(fColor, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(gColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(graph_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        GraphPanelLayout.setVerticalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraphPanelLayout.createSequentialGroup()
                .addGroup(GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GraphPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(drawAxis)
                        .addGap(8, 8, 8)
                        .addComponent(drawGrid)
                        .addGap(18, 18, 18)
                        .addComponent(fColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(graph_screen, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addContainerGap())
        );

        TablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Table"));

        StartPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Start"));

        Start.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Start.setText("0");
        Start.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                StartKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout StartPanelLayout = new javax.swing.GroupLayout(StartPanel);
        StartPanel.setLayout(StartPanelLayout);
        StartPanelLayout.setHorizontalGroup(
            StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StartPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        StartPanelLayout.setVerticalGroup(
            StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartPanelLayout.createSequentialGroup()
                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IncrementPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Increment"));

        Increment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Increment.setText("1");
        Increment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IncrementKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout IncrementPanelLayout = new javax.swing.GroupLayout(IncrementPanel);
        IncrementPanel.setLayout(IncrementPanelLayout);
        IncrementPanelLayout.setHorizontalGroup(
            IncrementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncrementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Increment, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IncrementPanelLayout.setVerticalGroup(
            IncrementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncrementPanelLayout.createSequentialGroup()
                .addComponent(Increment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EndPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("End"));

        End.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        End.setText("15");
        End.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EndKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout EndPanelLayout = new javax.swing.GroupLayout(EndPanel);
        EndPanel.setLayout(EndPanelLayout);
        EndPanelLayout.setHorizontalGroup(
            EndPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EndPanelLayout.setVerticalGroup(
            EndPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndPanelLayout.createSequentialGroup()
                .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TableScrollPane.setMinimumSize(new java.awt.Dimension(23, 25));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "X", "f(x)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(18);
        TableScrollPane.setViewportView(table);
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(1).setResizable(false);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableSeperator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TablePanelLayout.createSequentialGroup()
                        .addComponent(StartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IncrementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TableScrollPane, 0, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncrementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EndPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        CalculatorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Scientific Calculator"));

        Calcppi.setFont(new java.awt.Font("Arial", 1, 12));
        Calcppi.setText("π");
        Calcppi.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcppi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcppiActionPerformed(evt);
            }
        });

        Calc2.setFont(new java.awt.Font("Arial", 1, 12));
        Calc2.setText("2");
        Calc2.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc2ActionPerformed(evt);
            }
        });

        Calce.setFont(new java.awt.Font("Arial", 1, 12));
        Calce.setText("e");
        Calce.setPreferredSize(new java.awt.Dimension(42, 10));
        Calce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalceActionPerformed(evt);
            }
        });

        Calc1.setFont(new java.awt.Font("Arial", 1, 12));
        Calc1.setText("1");
        Calc1.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc1ActionPerformed(evt);
            }
        });

        CalcEndpars.setFont(new java.awt.Font("Arial", 1, 12));
        CalcEndpars.setText(")");
        CalcEndpars.setPreferredSize(new java.awt.Dimension(70, 10));
        CalcEndpars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcEndparsActionPerformed(evt);
            }
        });

        Calcminus.setFont(new java.awt.Font("Proxy 9", 1, 10));
        Calcminus.setText("-");
        Calcminus.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcminusActionPerformed(evt);
            }
        });

        Calc3.setFont(new java.awt.Font("Arial", 1, 12));
        Calc3.setText("3");
        Calc3.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc3ActionPerformed(evt);
            }
        });

        Calcequals.setFont(new java.awt.Font("Arial", 1, 14));
        Calcequals.setText("=");
        Calcequals.setToolTipText("Solve");
        Calcequals.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcequalsActionPerformed(evt);
            }
        });

        Calc0.setFont(new java.awt.Font("Arial", 1, 12));
        Calc0.setText("0");
        Calc0.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc0ActionPerformed(evt);
            }
        });

        Calcpower.setFont(new java.awt.Font("Arial", 1, 12));
        Calcpower.setText("^");
        Calcpower.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcpowerActionPerformed(evt);
            }
        });

        Calcdecimal.setFont(new java.awt.Font("Arial", 1, 12));
        Calcdecimal.setText(".");
        Calcdecimal.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcdecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcdecimalActionPerformed(evt);
            }
        });

        Calcx.setFont(new java.awt.Font("Arial", 1, 12));
        Calcx.setText("X");
        Calcx.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcxActionPerformed(evt);
            }
        });

        Calcplus.setFont(new java.awt.Font("Arial", 1, 12));
        Calcplus.setText("+");
        Calcplus.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcplusActionPerformed(evt);
            }
        });

        Calcsin.setFont(new java.awt.Font("Arial", 1, 12));
        Calcsin.setText("SIN");
        Calcsin.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcsinActionPerformed(evt);
            }
        });

        Calccos.setFont(new java.awt.Font("Arial", 1, 12));
        Calccos.setText("COS");
        Calccos.setPreferredSize(new java.awt.Dimension(42, 10));
        Calccos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalccosActionPerformed(evt);
            }
        });

        Calc4.setFont(new java.awt.Font("Arial", 1, 12));
        Calc4.setText("4");
        Calc4.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc4ActionPerformed(evt);
            }
        });

        Calc5.setFont(new java.awt.Font("Arial", 1, 12));
        Calc5.setText("5");
        Calc5.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc5ActionPerformed(evt);
            }
        });

        Calc6.setFont(new java.awt.Font("Arial", 1, 12));
        Calc6.setText("6");
        Calc6.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc6ActionPerformed(evt);
            }
        });

        CalcMultip.setFont(new java.awt.Font("Arial", 1, 12));
        CalcMultip.setText("*");
        CalcMultip.setPreferredSize(new java.awt.Dimension(42, 10));
        CalcMultip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcMultipActionPerformed(evt);
            }
        });

        divide1.setFont(new java.awt.Font("Arial", 1, 12));
        divide1.setText("÷");
        divide1.setPreferredSize(new java.awt.Dimension(42, 10));
        divide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divide1ActionPerformed(evt);
            }
        });

        Calc9.setFont(new java.awt.Font("Arial", 1, 12));
        Calc9.setText("9");
        Calc9.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc9ActionPerformed(evt);
            }
        });

        Calc8.setFont(new java.awt.Font("Arial", 1, 12));
        Calc8.setText("8");
        Calc8.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc8ActionPerformed(evt);
            }
        });

        CalcBeginpars.setFont(new java.awt.Font("Arial", 1, 12));
        CalcBeginpars.setText("(");
        CalcBeginpars.setPreferredSize(new java.awt.Dimension(70, 10));
        CalcBeginpars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcBeginparsActionPerformed(evt);
            }
        });

        Calc7.setFont(new java.awt.Font("Arial", 1, 12));
        Calc7.setText("7");
        Calc7.setPreferredSize(new java.awt.Dimension(42, 10));
        Calc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc7ActionPerformed(evt);
            }
        });

        Calcsqrt.setFont(new java.awt.Font("Arial", 1, 12));
        Calcsqrt.setText("√");
        Calcsqrt.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcsqrtActionPerformed(evt);
            }
        });

        Calcatan.setFont(new java.awt.Font("Arial", 1, 12));
        Calcatan.setText("ATAN");
        Calcatan.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcatanActionPerformed(evt);
            }
        });

        Calcabs.setFont(new java.awt.Font("Arial", 1, 12));
        Calcabs.setText("ABS");
        Calcabs.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcabsActionPerformed(evt);
            }
        });

        Calcsec.setFont(new java.awt.Font("Arial", 1, 12));
        Calcsec.setText("SEC");
        Calcsec.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcsecActionPerformed(evt);
            }
        });

        Calccsc.setFont(new java.awt.Font("Arial", 1, 12));
        Calccsc.setText("CSC");
        Calccsc.setPreferredSize(new java.awt.Dimension(42, 10));
        Calccsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalccscActionPerformed(evt);
            }
        });

        Calclog.setFont(new java.awt.Font("Arial", 1, 12));
        Calclog.setText("LOG");
        Calclog.setPreferredSize(new java.awt.Dimension(42, 10));
        Calclog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalclogActionPerformed(evt);
            }
        });

        Calcasin.setFont(new java.awt.Font("Arial", 1, 12));
        Calcasin.setText("ASIN");
        Calcasin.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcasin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcasinActionPerformed(evt);
            }
        });

        Calcacos.setFont(new java.awt.Font("Arial", 1, 12));
        Calcacos.setText("ACOS");
        Calcacos.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcacosActionPerformed(evt);
            }
        });

        Calccot.setFont(new java.awt.Font("Arial", 1, 12));
        Calccot.setText("COT");
        Calccot.setPreferredSize(new java.awt.Dimension(42, 10));
        Calccot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalccotActionPerformed(evt);
            }
        });

        Calctan.setFont(new java.awt.Font("Arial", 1, 12));
        Calctan.setText("TAN");
        Calctan.setPreferredSize(new java.awt.Dimension(42, 10));
        Calctan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalctanActionPerformed(evt);
            }
        });

        Calcbin.setFont(new java.awt.Font("Arial", 1, 12));
        Calcbin.setText("Bin");

        Calchex.setFont(new java.awt.Font("Arial", 1, 12));
        Calchex.setText("Hex");

        Calcoct.setFont(new java.awt.Font("Arial", 1, 12));
        Calcoct.setText("Oct");

        Calcdec.setFont(new java.awt.Font("Arial", 1, 12));
        Calcdec.setSelected(true);
        Calcdec.setText("Dec");

        Calcdisplay.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Calcdisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Calcdisplay.setToolTipText("");
        Calcdisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CalcA.setFont(new java.awt.Font("Arial", 1, 12));
        CalcA.setText("A");
        CalcA.setEnabled(false);
        CalcA.setPreferredSize(new java.awt.Dimension(42, 10));
        CalcA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcAActionPerformed(evt);
            }
        });

        CalcB.setFont(new java.awt.Font("Arial", 1, 12));
        CalcB.setText("B");
        CalcB.setEnabled(false);
        CalcB.setPreferredSize(new java.awt.Dimension(42, 10));
        CalcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcBActionPerformed(evt);
            }
        });

        CalcC.setFont(new java.awt.Font("Arial", 1, 12));
        CalcC.setText("C");
        CalcC.setEnabled(false);
        CalcC.setPreferredSize(new java.awt.Dimension(42, 10));
        CalcC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcCActionPerformed(evt);
            }
        });

        CalcD.setFont(new java.awt.Font("Arial", 1, 12));
        CalcD.setText("D");
        CalcD.setEnabled(false);
        CalcD.setPreferredSize(new java.awt.Dimension(42, 10));
        CalcD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcDActionPerformed(evt);
            }
        });

        CalcE.setFont(new java.awt.Font("Arial", 1, 12));
        CalcE.setText("E");
        CalcE.setEnabled(false);
        CalcE.setPreferredSize(new java.awt.Dimension(42, 10));
        CalcE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcEActionPerformed(evt);
            }
        });

        Calcrad.setFont(new java.awt.Font("Arial", 1, 12));
        Calcrad.setText("Rad");

        Calcdeg.setFont(new java.awt.Font("Arial", 1, 12));
        Calcdeg.setSelected(true);
        Calcdeg.setText("Deg");

        CalcF.setFont(new java.awt.Font("Arial", 1, 12));
        CalcF.setText("F");
        CalcF.setEnabled(false);
        CalcF.setPreferredSize(new java.awt.Dimension(42, 10));
        CalcF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcFActionPerformed(evt);
            }
        });

        Calcclear.setFont(new java.awt.Font("Arial", 1, 12));
        Calcclear.setText("CE");
        Calcclear.setToolTipText("Clear");
        Calcclear.setPreferredSize(new java.awt.Dimension(42, 10));
        Calcclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CalculatorPanelLayout = new javax.swing.GroupLayout(CalculatorPanel);
        CalculatorPanel.setLayout(CalculatorPanelLayout);
        CalculatorPanelLayout.setHorizontalGroup(
            CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calcdisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CalculatorPanelLayout.createSequentialGroup()
                                .addComponent(Calccsc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calcsec, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calccot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CalcBeginpars, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CalcEndpars, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CalculatorPanelLayout.createSequentialGroup()
                                .addComponent(Calcsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calcppi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calce, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calcpower, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calcx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcequals, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addComponent(Calc0, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcdecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcplus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calclog, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcabs, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addComponent(Calc1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calc2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calc3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcminus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calctan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcatan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addComponent(Calc7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calc8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Calc9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divide1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcsin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcasin, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addComponent(Calc4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calc5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calc6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalcMultip, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calccos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcacos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addComponent(CalcA, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalcB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalcC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalcD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalcE, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalcF, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addComponent(Calcbin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calchex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcoct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Calcdec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcrad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcdeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcclear, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CalculatorPanelLayout.setVerticalGroup(
            CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Calcdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calcbin)
                    .addComponent(Calchex)
                    .addComponent(Calcoct)
                    .addComponent(Calcdec)
                    .addComponent(Calcrad)
                    .addComponent(Calcdeg)
                    .addComponent(Calcclear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalcA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calc7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcsin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcasin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calc4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcMultip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calccos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcacos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calc1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcminus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calctan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcatan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calc0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcplus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calclog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcabs, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Calcdecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calccsc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calcsec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calccot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalcBeginpars, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalcEndpars, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calcsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calcppi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calce, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calcpower, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calcx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Calcequals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        CalcEndpars.getAccessibleContext().setAccessibleName("");
        CalcBeginpars.getAccessibleContext().setAccessibleName("");

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setToolTipText("Menu");
        jMenuBar1.setDoubleBuffered(true);

        Precision.setText("Preferences");
        Precision.setToolTipText("");
        Precision.setDelay(0);
        Precision.setFocusable(false);

        SetPrecision.setText("Precision");
        SetPrecision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetPrecisionActionPerformed(evt);
            }
        });
        Precision.add(SetPrecision);

        jMenu3.setText("Colors");

        GraphColorMenu.setText("Graph");

        GraphColor.setText("Graph");
        GraphColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphColorActionPerformed(evt);
            }
        });
        GraphColorMenu.add(GraphColor);

        AxisColor.setText("Axes");
        AxisColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AxisColorActionPerformed(evt);
            }
        });
        GraphColorMenu.add(AxisColor);

        GridColor.setText("Grids");
        GridColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GridColorActionPerformed(evt);
            }
        });
        GraphColorMenu.add(GridColor);

        jMenu3.add(GraphColorMenu);

        TableColor.setText("Table");
        TableColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableColorActionPerformed(evt);
            }
        });
        jMenu3.add(TableColor);

        BackgroundColor.setText("Background");
        BackgroundColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackgroundColorActionPerformed(evt);
            }
        });
        jMenu3.add(BackgroundColor);

        Precision.add(jMenu3);

        GraphicsMenu.setText("Graphics");
        GraphicsMenu.setText("Graphics");

        GraphWidth.setText("Graph width");
        GraphWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphWidthActionPerformed(evt);
            }
        });
        GraphicsMenu.add(GraphWidth);

        AxisWidth.setText("Axis width");
        AxisWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AxisWidthActionPerformed(evt);
            }
        });
        GraphicsMenu.add(AxisWidth);

        GridWidth.setText("Grid width");
        GridWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GridWidthActionPerformed(evt);
            }
        });
        GraphicsMenu.add(GridWidth);

        jMenu1.setText("Draw Speed");

        instantDraw.setText("Instant");
        instantDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instantDrawActionPerformed(evt);
            }
        });
        jMenu1.add(instantDraw);

        slowDraw.setText("Gradual");
        slowDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slowDrawActionPerformed(evt);
            }
        });
        jMenu1.add(slowDraw);

        GraphicsMenu.add(jMenu1);

        Precision.add(GraphicsMenu);

        ZoomMenu.setText("Zoom");

        ZoomIn.setText("Zoom in");
        ZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomInActionPerformed(evt);
            }
        });
        ZoomMenu.add(ZoomIn);

        ZoomOut.setText("Zoom out");
        ZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomOutActionPerformed(evt);
            }
        });
        ZoomMenu.add(ZoomOut);

        Standard.setText("Standard");
        Standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StandardActionPerformed(evt);
            }
        });
        ZoomMenu.add(Standard);

        Trigonometric.setText("Trigonometric");
        Trigonometric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrigonometricActionPerformed(evt);
            }
        });
        ZoomMenu.add(Trigonometric);

        Statistic.setText("Statistic");
        Statistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticActionPerformed(evt);
            }
        });
        ZoomMenu.add(Statistic);

        Precision.add(ZoomMenu);

        jMenu2.setText("Type");

        graphingButton.setText("Graphing");
        graphingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphingButtonActionPerformed(evt);
            }
        });
        jMenu2.add(graphingButton);

        scientificButton.setText("Scientific");
        scientificButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientificButtonActionPerformed(evt);
            }
        });
        jMenu2.add(scientificButton);

        Precision.add(jMenu2);

        jMenuBar1.add(Precision);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalculatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalculatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                        .addComponent(GraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                        .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Coding for all the buttons
     */
    //radian button
    private void DegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DegreeActionPerformed
        Radian.setSelected(false);        
        Degree.setSelected(true);        
        mode=2;
        expression.setMode(mode);
        plot();
}//GEN-LAST:event_DegreeActionPerformed

    //degree button
    private void RadianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadianActionPerformed
        Radian.setSelected(true);        
        Degree.setSelected(false);        
        mode=1;
        expression.setMode(mode);
        plot();
    }//GEN-LAST:event_RadianActionPerformed

    //log base chooser
    private void LogBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogBaseActionPerformed
        switch(LogBase.getSelectedIndex()+1)
        {
            case 1:
                logBase=10;
                expression.setLogBase(logBase);
                break;
            case 2:
                logBase=Math.E;
                expression.setLogBase(logBase);
                break;
            case 3:
                logBase=Double.parseDouble(new Parser().solve(JOptionPane.showInputDialog("Log Base:"),0.0));
                expression.setLogBase(logBase);
                JComboBox dummy = new JComboBox(new String[]{"10","e","Other",Double.toString(logBase)});
                LogBase.setModel(dummy.getModel());
                LogBase.setSelectedIndex(3);
                break;
        }
    }//GEN-LAST:event_LogBaseActionPerformed

    //Number Buttons
    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        display.setText(display.getText()+"0");        
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        display.setText(display.getText()+"1");        
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        display.setText(display.getText()+"2");        
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        display.setText(display.getText()+"3");      
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        display.setText(display.getText()+"4");        
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        display.setText(display.getText()+"5");        
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        display.setText(display.getText()+"6");        
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        display.setText(display.getText()+"7");        
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        display.setText(display.getText()+"8");        
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        display.setText(display.getText()+"9");        
    }//GEN-LAST:event_Button9ActionPerformed

    //Operator Buttons
    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        display.setText(display.getText()+"/");        
}//GEN-LAST:event_divideActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        display.setText(display.getText()+"*");        
}//GEN-LAST:event_multiplyActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        display.setText(display.getText()+"-");        
}//GEN-LAST:event_minusActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        display.setText(display.getText()+"+");        
}//GEN-LAST:event_plusActionPerformed
    
    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        display.setText(display.getText()+"^");        
    }//GEN-LAST:event_expActionPerformed

    //Function Buttons
    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        display.setText(display.getText()+"sin(");
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        display.setText(display.getText()+"cos(");
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        display.setText(display.getText()+"tan(");
    }//GEN-LAST:event_tanActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        display.setText(display.getText()+"log(");
    }//GEN-LAST:event_logActionPerformed

    private void asinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asinActionPerformed
        display.setText(display.getText()+"asin(");
    }//GEN-LAST:event_asinActionPerformed

    private void acosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acosActionPerformed
        display.setText(display.getText()+"acos(");
    }//GEN-LAST:event_acosActionPerformed

    private void atanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atanActionPerformed
        display.setText(display.getText()+"atan(");
    }//GEN-LAST:event_atanActionPerformed

    private void cscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cscActionPerformed
        display.setText(display.getText()+"csc(");
    }//GEN-LAST:event_cscActionPerformed

    private void secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secActionPerformed
        display.setText(display.getText()+"sec(");
    }//GEN-LAST:event_secActionPerformed

    private void cotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotActionPerformed
        display.setText(display.getText()+"cot(");
    }//GEN-LAST:event_cotActionPerformed

    private void sqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrActionPerformed
        display.setText(display.getText()+"√(");
    }//GEN-LAST:event_sqrActionPerformed

    //Constant Buttons
    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        display.setText(display.getText()+"π");
}//GEN-LAST:event_piActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        display.setText(display.getText()+"e");
}//GEN-LAST:event_eActionPerformed

    //X Variable Button
    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        display.setText(display.getText()+"x");
        //Make sure "xxx...x" is not typed. It should be "x*x*x...x"
        checkExpression();
}//GEN-LAST:event_XActionPerformed

    //Parentheses Buttons
    private void beginParsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginParsActionPerformed
        display.setText(display.getText()+"(");
    }//GEN-LAST:event_beginParsActionPerformed

    private void endParsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endParsActionPerformed
        display.setText(display.getText()+")");
    }//GEN-LAST:event_endParsActionPerformed

    //Decimal Place Button
    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        display.setText(display.getText()+".");
    }//GEN-LAST:event_decimalActionPerformed

    //Clear Button
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();        
        plot();
    }//GEN-LAST:event_clearActionPerformed

    //Graph Button
    private void graphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphActionPerformed
        if(display.getText().length()==0){
            clear();
            plot();
        }else{
            plot();
            drawTable();
        }            
}//GEN-LAST:event_graphActionPerformed

    //Absolute function
    private void absActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absActionPerformed
        display.setText(display.getText()+"abs(");
}//GEN-LAST:event_absActionPerformed

    //change equation
    private void EquationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquationActionPerformed
        display.setText(getSelectedExpression());        
    }//GEN-LAST:event_EquationActionPerformed

    //Opening actions: currently nothing.
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    //Check if expression makes sense
    //Set color buttons
    private void BackgroundColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackgroundColorActionPerformed
        setBackgroundColor();
    }//GEN-LAST:event_BackgroundColorActionPerformed

    private void TableColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableColorActionPerformed
        setTableColor();
    }//GEN-LAST:event_TableColorActionPerformed

    private void GraphColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphColorActionPerformed
        setGraphColor();
    }//GEN-LAST:event_GraphColorActionPerformed

    private void AxisColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AxisColorActionPerformed
        setAxisColor();
    }//GEN-LAST:event_AxisColorActionPerformed

    private void GridColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GridColorActionPerformed
        setGridColor();
    }//GEN-LAST:event_GridColorActionPerformed

    //Set Precision
    private void SetPrecisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetPrecisionActionPerformed
        setPrecision();
    }//GEN-LAST:event_SetPrecisionActionPerformed

    //Graph Bounds assertions
    private void XminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_XminKeyReleased
        if(checkNumber(Xmin.getText())&&checkWindowBounds())
        {
            Xmin.setBackground(Color.white);
            if(Xmin.getText().charAt(Xmin.getText().length()-1)!='.')
            Xmin.setText(expression.solve(Xmin.getText(),0.0));
            plot();
        }else{
            Xmin.setBackground(Color.red);
        }
    }//GEN-LAST:event_XminKeyReleased

    private void XmaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_XmaxKeyReleased
        if(checkNumber(Xmax.getText())&&checkWindowBounds())
        {
            Xmax.setBackground(Color.white);
            if(Xmax.getText().charAt(Xmax.getText().length()-1)!='.')
            Xmax.setText(expression.solve(Xmax.getText(),0.0));
            plot();
        }else{
            Xmax.setBackground(Color.red);
        }
    }//GEN-LAST:event_XmaxKeyReleased

    private void YminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YminKeyReleased
        if(checkNumber(Ymin.getText())&&checkWindowBounds())
        {
            Ymin.setBackground(Color.white);
            if(Ymin.getText().charAt(Ymin.getText().length()-1)!='.')
            Ymin.setText(expression.solve(Ymin.getText(),0.0));
            plot();
        }else{
            Ymin.setBackground(Color.red);
        }
    }//GEN-LAST:event_YminKeyReleased

    private void YmaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YmaxKeyReleased
        if(checkNumber(Ymax.getText())&&checkWindowBounds())
        {
            Ymax.setBackground(Color.white);
            if(Ymax.getText().charAt(Ymax.getText().length()-1)!='.')
            Ymax.setText(expression.solve(Ymax.getText(),0.0));
            plot();
        }else{
            Ymax.setBackground(Color.red);
        }
    }//GEN-LAST:event_YmaxKeyReleased

    //Show coordinates with mouse movement
    private void graph_screenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph_screenMouseMoved
        drawCoordinates(evt);
    }//GEN-LAST:event_graph_screenMouseMoved

    //Check Table parameters
    private void StartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StartKeyReleased
        if(checkNumber(Start.getText()))
        {
            Start.setBackground(Color.white);
            if(Start.getText().charAt(Start.getText().length()-1)!='.')
            Start.setText(expression.solve(Start.getText(),0.0));
            drawTable();
        }else{
            Start.setBackground(Color.red);
        }
    }//GEN-LAST:event_StartKeyReleased

    private void EndKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EndKeyReleased
        if(checkNumber(End.getText()))
        {
            End.setBackground(Color.white);
            if(End.getText().charAt(End.getText().length()-1)!='.')
            End.setText(expression.solve(End.getText(),0.0));
            drawTable();
        }else{
            End.setBackground(Color.red);
        }        
    }//GEN-LAST:event_EndKeyReleased

    private void IncrementKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IncrementKeyReleased
        if(checkNumber(Increment.getText()))
        {
            Increment.setBackground(Color.white);
            if(Increment.getText().charAt(Increment.getText().length()-1)!='.')
            Increment.setText(expression.solve(Increment.getText(),0.0));
            drawTable();
        }else{
            Increment.setBackground(Color.red);
        }
    }//GEN-LAST:event_IncrementKeyReleased

    //Zoom in/out with mouse wheel
    private void graph_screenMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_graph_screenMouseWheelMoved
        zoom(evt);
    }//GEN-LAST:event_graph_screenMouseWheelMoved

    //Draw Axis/Grid buttons
    private void drawAxisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawAxisActionPerformed
        if(Axis){
            Axis=false;
        }else{
            Axis=true;
        }
        isZooming=true;
        plot();
        isZooming=false;
}//GEN-LAST:event_drawAxisActionPerformed

    private void drawGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawGridActionPerformed
        if(Grid) {
            Grid=false;
        }else{
            Grid=true;
        }
        isZooming=true;
        plot();
        isZooming=false;
}//GEN-LAST:event_drawGridActionPerformed

    //Redraw if mouse exits the graph
    //Let user drag the graph around
    private void graph_screenMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph_screenMouseDragged
        translateGraph(evt);
    }//GEN-LAST:event_graph_screenMouseDragged

    private void graph_screenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph_screenMousePressed
        isTranslating=true;
        x1=evt.getX();
        y1=evt.getY();
        xminClicked=Double.parseDouble(Xmin.getText());
        xmaxClicked=Double.parseDouble(Xmax.getText());
        yminClicked=Double.parseDouble(Ymin.getText());
        ymaxClicked=Double.parseDouble(Ymax.getText());
    }//GEN-LAST:event_graph_screenMousePressed

    private void graph_screenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph_screenMouseReleased
        isTranslating=false;
    }//GEN-LAST:event_graph_screenMouseReleased

    private void GraphWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphWidthActionPerformed
        setGraphWidth();
    }//GEN-LAST:event_GraphWidthActionPerformed

    private void AxisWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AxisWidthActionPerformed
        setAxisWidth();
    }//GEN-LAST:event_AxisWidthActionPerformed

    private void GridWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GridWidthActionPerformed
        setGridWidth();
    }//GEN-LAST:event_GridWidthActionPerformed

    private void ZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomInActionPerformed
        try{
        setZoomType(Double.parseDouble(JOptionPane.showInputDialog("Magnitude:")),'+');
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error occured while attempting to set magnitude");
        }
    }//GEN-LAST:event_ZoomInActionPerformed

    private void ZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomOutActionPerformed
        try{
        setZoomType(Double.parseDouble(JOptionPane.showInputDialog("Magnitude:")),'-');
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error occured while attempting to set magnitude");
        }
    }//GEN-LAST:event_ZoomOutActionPerformed

    private void StandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StandardActionPerformed
        setZoomType(0,'s');
    }//GEN-LAST:event_StandardActionPerformed

    private void TrigonometricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrigonometricActionPerformed
        setZoomType(0,'t');
    }//GEN-LAST:event_TrigonometricActionPerformed

    private void StatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticActionPerformed
        setZoomType(0,'#');
    }//GEN-LAST:event_StatisticActionPerformed

    private void displayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_displayKeyReleased
        checkExpression();
        saveExpression();
    }//GEN-LAST:event_displayKeyReleased

    private void slowDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slowDrawActionPerformed
        drawInstantly = false;
    }//GEN-LAST:event_slowDrawActionPerformed

    private void instantDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instantDrawActionPerformed
        drawInstantly = true;
    }//GEN-LAST:event_instantDrawActionPerformed

    private void graphingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphingButtonActionPerformed
        setType(true);
        Ghost.delayInt=128;
    }//GEN-LAST:event_graphingButtonActionPerformed

    private void scientificButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scientificButtonActionPerformed
        setType(false);
    }//GEN-LAST:event_scientificButtonActionPerformed

    private void CalcclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcclearActionPerformed
        Calcdisplay.setText("");
    }//GEN-LAST:event_CalcclearActionPerformed

    private void Calc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc7ActionPerformed
        tack("7");
    }//GEN-LAST:event_Calc7ActionPerformed

    private void Calc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc8ActionPerformed
        tack("8");
    }//GEN-LAST:event_Calc8ActionPerformed

    private void Calc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc9ActionPerformed
        tack("9");
    }//GEN-LAST:event_Calc9ActionPerformed

    private void Calc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc4ActionPerformed
        tack("4");
    }//GEN-LAST:event_Calc4ActionPerformed

    private void Calc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc5ActionPerformed
        tack("5");
    }//GEN-LAST:event_Calc5ActionPerformed

    private void Calc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc6ActionPerformed
        tack("6");
    }//GEN-LAST:event_Calc6ActionPerformed

    private void Calc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc1ActionPerformed
        tack("1");
    }//GEN-LAST:event_Calc1ActionPerformed

    private void Calc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc2ActionPerformed
        tack("2");
    }//GEN-LAST:event_Calc2ActionPerformed

    private void Calc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc3ActionPerformed
        tack("3");
    }//GEN-LAST:event_Calc3ActionPerformed

    private void Calc0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc0ActionPerformed
        tack("0");
    }//GEN-LAST:event_Calc0ActionPerformed

    private void CalcdecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcdecimalActionPerformed
        tack(".");
    }//GEN-LAST:event_CalcdecimalActionPerformed

    private void divide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divide1ActionPerformed
        tack("/");
    }//GEN-LAST:event_divide1ActionPerformed

    private void CalcMultipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcMultipActionPerformed
        tack("*");
    }//GEN-LAST:event_CalcMultipActionPerformed

    private void CalcminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcminusActionPerformed
        tack("-");
    }//GEN-LAST:event_CalcminusActionPerformed

    private void CalcplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcplusActionPerformed
        tack("+");
    }//GEN-LAST:event_CalcplusActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Ghost.delayInt=128;
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        Ghost.delayInt=128;
    }//GEN-LAST:event_formWindowLostFocus

    private void CalcsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcsinActionPerformed
        tack("sin(");
    }//GEN-LAST:event_CalcsinActionPerformed

    private void CalcasinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcasinActionPerformed
        tack("asin(");
    }//GEN-LAST:event_CalcasinActionPerformed

    private void CalccosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalccosActionPerformed
        tack("cos(");
    }//GEN-LAST:event_CalccosActionPerformed

    private void CalcacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcacosActionPerformed
        tack("acos(");
    }//GEN-LAST:event_CalcacosActionPerformed

    private void CalctanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalctanActionPerformed
        tack("tan");
    }//GEN-LAST:event_CalctanActionPerformed

    private void CalcatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcatanActionPerformed
        tack("atan(");
    }//GEN-LAST:event_CalcatanActionPerformed

    private void CalclogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalclogActionPerformed
        tack("log(");
    }//GEN-LAST:event_CalclogActionPerformed

    private void CalcabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcabsActionPerformed
        tack("abs(");
    }//GEN-LAST:event_CalcabsActionPerformed

    private void CalccscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalccscActionPerformed
        tack("csc(");
    }//GEN-LAST:event_CalccscActionPerformed

    private void CalcsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcsecActionPerformed
        tack("sec(");
    }//GEN-LAST:event_CalcsecActionPerformed

    private void CalccotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalccotActionPerformed
        tack("cot(");
    }//GEN-LAST:event_CalccotActionPerformed

    private void CalcBeginparsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcBeginparsActionPerformed
        tack("(");
    }//GEN-LAST:event_CalcBeginparsActionPerformed

    private void CalcEndparsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcEndparsActionPerformed
        tack(")");
    }//GEN-LAST:event_CalcEndparsActionPerformed

    private void CalcsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcsqrtActionPerformed
        tack("√");
    }//GEN-LAST:event_CalcsqrtActionPerformed

    private void CalcppiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcppiActionPerformed
        tack("π");
    }//GEN-LAST:event_CalcppiActionPerformed

    private void CalceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalceActionPerformed
        tack("e");
    }//GEN-LAST:event_CalceActionPerformed

    private void CalcpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcpowerActionPerformed
        tack("^");
    }//GEN-LAST:event_CalcpowerActionPerformed

    private void CalcxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcxActionPerformed
        tack("X");
    }//GEN-LAST:event_CalcxActionPerformed

    private void CalcequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcequalsActionPerformed
        Calcdisplay.setText(new Parser().solve(Calcdisplay.getText(), 0.0));
    }//GEN-LAST:event_CalcequalsActionPerformed

    private void CalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcBActionPerformed
        tack("B");
    }//GEN-LAST:event_CalcBActionPerformed

    private void CalcCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcCActionPerformed
        tack("C");
    }//GEN-LAST:event_CalcCActionPerformed

    private void CalcDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcDActionPerformed
        tack("D");
    }//GEN-LAST:event_CalcDActionPerformed

    private void CalcEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcEActionPerformed
        tack("E");
    }//GEN-LAST:event_CalcEActionPerformed

    private void CalcFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcFActionPerformed
        tack("F");
    }//GEN-LAST:event_CalcFActionPerformed

    private void CalcAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcAActionPerformed
        tack("A");
    }//GEN-LAST:event_CalcAActionPerformed

    private void drawFuncCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawFuncCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drawFuncCheckBoxActionPerformed

    //Morph into non-graphing/vice-versa
    private void setType(boolean graphing) {
        if(!graphing) {
            GraphPanel.setVisible(false);
            TablePanel.setVisible(false);
            ControlPanel.setVisible(false);
            CalculatorPanel.setVisible(true);
            setSize(415,465);
        }else{
            GraphPanel.setVisible(true);
            TablePanel.setVisible(true);
            ControlPanel.setVisible(true);
            CalculatorPanel.setVisible(false);
            setSize(1250,500);            
        }
        setCenterScreen();
    }
    //Center on the screen
    private void setCenterScreen(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int locX = dim.width/2 - this.getWidth()/2;
        int locY = dim.height/2 - this.getHeight()/2;
        this.setLocation(locX,locY);
    }
    private void tack(String s) {
        Calcdisplay.setText(Calcdisplay.getText()+s);
    }
    private void setZoomType(double magnitude, char zoomType)
    {
        //zoomType
        //+ = zoom in
        //- is zoom out
        //s is standard
        //t is trigonometric
        //# is statistic
        xmin=Double.parseDouble(Xmin.getText());
        xmax=Double.parseDouble(Xmax.getText());
        ymin=Double.parseDouble(Ymin.getText());
        ymax=Double.parseDouble(Ymax.getText());
        Ghost.delayInt=128;
        switch(zoomType)
        {
            case '+':
                xmin/=magnitude;
                xmax/=magnitude;
                ymin/=magnitude;
                ymax/=magnitude;
                break;
            case '-':
                xmin*=magnitude;
                xmax*=magnitude;
                ymin*=magnitude;
                ymax*=magnitude;
                break;
            case 's':
                xmin=-10;
                xmax=10;
                ymin=-10;
                ymax=10;
                break;
            case 't':
                xmin=Math.PI*-2;
                xmax=Math.PI*2;
                ymin=-2;
                ymax=2;
                break;
            case '#':
                xmin=0;
                xmax=10;
                ymin=0;
                ymax=10;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error occured while attempting to zoom");
        }
        
        //write to bounds text fields
        DecimalFormat DForm = new DecimalFormat("#.##");
        xmin=Double.valueOf(DForm.format(xmin));
        xmax=Double.valueOf(DForm.format(xmax));
        ymin=Double.valueOf(DForm.format(ymin));
        ymax=Double.valueOf(DForm.format(ymax));
        Xmin.setText(Double.toString(xmin));
        Xmax.setText(Double.toString(xmax));
        Ymin.setText(Double.toString(ymin));
        Ymax.setText(Double.toString(ymax));
        //graph with new window bounds
        plot();
    }
    
    private void setGraphWidth()
    {
        String widthSTR = JOptionPane.showInputDialog("Enter graph width (1-10):");
        try
        {
            int width = Integer.parseInt(widthSTR);
            if(width>0&&width<11)
            {
                graphWidth=width;
            }else{
                throw new Exception();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error! Only integers between 1 and 10 are valid");
        }
        plot();
    }

    private void setAxisWidth()
    {
        String widthSTR = JOptionPane.showInputDialog("Enter axis width (1-10):");
        try
        {
            int width = Integer.parseInt(widthSTR);
            if(width>0&&width<11)
            {
                axisWidth=width;
            }else{
                throw new Exception();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error! Only integers between 1 and 10 are valid");
        }
        plot();
    }

    private void setGridWidth()
    {
        String widthSTR = JOptionPane.showInputDialog("Enter grid width (1-10):");
        try
        {
            int width = Integer.parseInt(widthSTR);
            if(width>0&&width<11)
            {
                gridWidth=width;
            }else{
                throw new Exception();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error! Only integers between 1 and 10 are valid");
        }
        plot();
    }

    private void setBackgroundColor()
    {        
        backGround = JColorChooser.showDialog(null, "Choose Background Color", backGround);
        if(backGround!=null){
        GraphPanel.setBackground(backGround);
        ControlPanel.setBackground(backGround);
        TablePanel.setBackground(backGround);
        Radian.setBackground(backGround);
        Degree.setBackground(backGround);
        plot();
        }
    }

    private void setGraphColor()
    {
        graphColor = JColorChooser.showDialog(null, "Choose Graph Color", graphColor);
        if(graphColor!=null)
        plot();
    }

    private void setTableColor()
    {
        tableColor = JColorChooser.showDialog(null, "Choose Table Color", tableColor);
        if(tableColor!=null){
        plot();
        table.setBackground(tableColor);
        }
    }
    
    private void setAxisColor()
    {
        axisColor = JColorChooser.showDialog(null, "Choose Axis Color", axisColor);
        if(axisColor!=null)
        plot();
    }

    private void setGridColor()
    {
        gridColor = JColorChooser.showDialog(null, "Choose Axis Color", gridColor);
        if(gridColor!=null)
        plot();
    }

    public void setPrecision()
    {
        try{
            int prec = Integer.parseInt(JOptionPane.showInputDialog("Precision:"));
            if(prec>0&&prec<17)
            {
                precision=prec;
                expression.setPrecision(precision);
            }else{
                throw new Exception();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error! Only integers between 1 and 16 are valid");
        }
        plot();
    }

    private String getExpression()
    {
        return display.getText();
    }

    private String getSelectedExpression()
    {
        String result="";
        switch(Equation.getSelectedIndex()+1)
        {
            case 1:
                result=fx;
                break;
            case 2:
                result=gx;
                break;
            case 3:
                result=ax;
                break;
            case 4:
                result=bx;
                break;
            case 5:
                result=cx;
                break;
            case 6:
                result=dx;
                break;
            case 7:
                result=ex;
                break;
        }
        return result;
    }

    private String getCertainExpression(int exp)
    {
        String result="";
        switch(exp+1)
        {
            case 1:
                result=fx;
                break;
            case 2:
                result=gx;
                break;
            case 3:
                result=ax;
                break;
            case 4:
                result=bx;
                break;
            case 5:
                result=cx;
                break;
            case 6:
                result=dx;
                break;
            case 7:
                result=ex;
                break;
        }
        return result;
    }

    private String getSelectedOption()
    {
        String result="";
        switch(Equation.getSelectedIndex()+1)
        {
            case 1:
                result="f(x)";
                break;
            case 2:
                result="g(x)";
                break;
            case 3:
                result="a(x)";
                break;
            case 4:
                result="b(x)";
                break;
            case 5:
                result="c(x)";
                break;
            case 6:
                result="d(x)";
                break;
            case 7:
                result="e(x)";
                break;
        }
        return result;
    }

    private void saveExpression()
    {
        switch(Equation.getSelectedIndex()+1)
        {
            case 1:
                fx=getExpression();
                break;
            case 2:
                gx=getExpression();
                break;
            case 3:
                ax=getExpression();
                break;
            case 4:
                bx=getExpression();
                break;
            case 5:
                cx=getExpression();
                break;
            case 6:
                dx=getExpression();
                break;
            case 7:
                ex=getExpression();
                break;
        }
    }

    private void graphExpression(String someExpression, Color c)
    {
        setColors(Color.red,Color.blue,Color.green,Color.orange,Color.cyan,Color.magenta,Color.pink);
        switch(Equation.getSelectedIndex()+1)
        {
            case 1:
                fx=getExpression();
                break;
            case 2:
                gx=getExpression();
                break;
            case 3:
                ax=getExpression();
                break;
            case 4:
                bx=getExpression();
                break;
            case 5:
                cx=getExpression();
                break;
            case 6:
                dx=getExpression();
                break;
            case 7:
                ex=getExpression();
                break;
        }
        //Set drawing parameters
        BasicStroke graphStroke=new BasicStroke(graphWidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        Graphics2D graphics = (Graphics2D) graph_screen.getGraphics();        
        double y;double x;int length=graph_screen.getWidth();int Y;String parsedY;               
        graphics.setColor(c);
        graphics.setStroke(graphStroke);
        int[][] Points = new int[length+1][2];
        xmin=Double.parseDouble(Xmin.getText());
        xmax=Double.parseDouble(Xmax.getText());
        //Get all the points on the line into an array
        for (int i=0;i<=length;)
        {
            x=((1.0*i/length)*(xmax-xmin))+xmin;
            parsedY=expression.solve(someExpression,x);
            if (parsedY.equals("Error")==false)
            {
                y=Double.parseDouble(parsedY);            
                Y=getY(y);
                Points[i][0]=i;
                Points[i][1]=Y;
            }
            i++;
        }
        //Draw all the points
        for (int i=3;i<Points.length;i+=1)
        {
            if(Points[i][0]-Points[i-1][0]==1&&Math.abs(Points[i][1]-Points[i-1][1])<graph_screen.getHeight()*3)
            {
                graphics.drawLine(Points[i-1][0],Points[i-1][1],Points[i][0],Points[i][1]);
                if(!drawInstantly && !isZooming && !isTranslating) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {}
                }
            }
        }                     
    }

    private void clearGraph()
    {
        int length=graph_screen.getWidth();
        Graphics2D graphics = (Graphics2D) graph_screen.getGraphics();
        graphics.setColor(graphColor);
        graphics.fillRect(0,0,length,graph_screen.getHeight());
    }

    //get Y on the screen based on y-value of graph
    private int getY(double y)
    {
        int height=graph_screen.getHeight();int result;
        ymin=Double.parseDouble(Ymin.getText());
        ymax=Double.parseDouble(Ymax.getText());
        result=(int)Math.round(height-(((y-ymin)/(ymax-ymin))*height));
        return result;
    }

    private void drawAxis()
    {
        if (Axis)
        {
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        xmin=Double.parseDouble(Xmin.getText());
        xmax=Double.parseDouble(Xmax.getText());
        ymin=Double.parseDouble(Ymin.getText());
        ymax=Double.parseDouble(Ymax.getText());
        BasicStroke Stroke1=new BasicStroke(axisWidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        Graphics graphics = graph_screen.getGraphics();
        Graphics2D g2D = (Graphics2D) graphics;
        g2D.setColor(axisColor);
        g2D.setStroke(Stroke1);
        //Horizontal Bars
        int y;
        double yRange=ymax-ymin;        
        y=(int)Math.round(height-(height*(0.0-ymin)/yRange));
        graphics.drawLine(0,y,length,y);
        //Vertical bars
        int x;
        double xRange=xmax-xmin;        
        x=(int)Math.round((length*(0.0-xmin)/xRange));
        graphics.drawLine(x,0,x,height);
        }
    }

    private void drawGrid()
    {
        if (Grid){
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        Graphics graphics = graph_screen.getGraphics();
        Graphics2D g2D = (Graphics2D) graphics;
        BasicStroke Stroke1=new BasicStroke(gridWidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        g2D.setStroke(Stroke1);
        g2D.setColor(gridColor);
        xmin=Double.parseDouble(Xmin.getText());
        xmax=Double.parseDouble(Xmax.getText());
        ymin=Double.parseDouble(Ymin.getText());
        ymax=Double.parseDouble(Ymax.getText());
        //Vertical bars
        int x;
        double xRange=xmax-xmin;        
        int xminInt=(int)Math.round(xmin);
        int xmaxInt=(int)Math.round(xmax);
        for(int i=xminInt;i<=xmaxInt;i+=Math.round((xRange/100)+.5))
        {
            x=(int)Math.round((length*(i-xmin)/xRange));
            graphics.drawLine(x,0,x,height);
        }
        //Horizontal Bars
        int y;
        double yRange=ymax-ymin;
        int yminInt=(int)Math.round(ymin);
        int ymaxInt=(int)Math.round(ymax);
        for(int i=yminInt;i<=ymaxInt;i+=Math.round((yRange/100)+.5))
        {
            y=(int)Math.round(height-(height*(i-ymin)/yRange));
            graphics.drawLine(0,y,length,y);
        }
        }
    }

    private void drawTable()
    {
        end=Double.parseDouble(End.getText());
        start=Double.parseDouble(Start.getText());
        increment=Double.parseDouble(Increment.getText());
        rows=(int)Math.round(((end-start)/increment)+.5);        
        String[][] g=new String [rows][2];int i=0;
        for (double d=start;i<rows;d+=increment)
        {
            g[i][0]=Double.toString(d);
            i++;
        }
        for (i=0;i<rows;i++)
        {
            g[i][1]=expression.solve(getSelectedExpression(),Double.parseDouble(g[i][0]));
        }
        table.setModel(new javax.swing.table.DefaultTableModel
            (g,new String []{"X", getSelectedOption()}));
    }

    private void clear()
    {
        //refresh display
        int length=graph_screen.getWidth();
        display.setText("");
        //refresh graph
        Graphics graphics = graph_screen.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,length,graph_screen.getHeight());
        //refresh table
        if (rows==0)
        {
            rows=16;
        }else{
            rows=Integer.parseInt(End.getText());
        }
        start=Double.parseDouble(Start.getText());
        increment=Double.parseDouble(Increment.getText());
        String[][] g=new String [rows][2];int i=0;
        for (double d=start;i<rows;d+=increment)
        {
            g[i][0]="";
            i++;
        }
        for (i=0;i<rows;i++)
        {
            g[i][1]="";
        }
        table.setModel(new javax.swing.table.DefaultTableModel
            (g,new String []{"X", getSelectedOption()}));
    }

    //Draw colors of all the expressions
    private void setColors(Color f,Color g,Color a,Color b,Color c,Color d,Color e)
    {
        Color[] colors = {f,g,a,b,c,d,e};
        JLabel[] labels = {fColor,gColor,aColor,bColor,cColor,dColor,eColor};
        BasicStroke Stroke=new BasicStroke(2,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        for(int i=0;i<labels.length;i++)
        {
            Graphics2D Colors = (Graphics2D)labels[i].getGraphics();
            Colors.setColor(colors[i]);
            Colors.setStroke(Stroke);
            Colors.drawLine(28,13,75,13);
        }
    }

    //Plot graph
    public void plot()
    {
        clearGraph();
        Color[] colors ={Color.red,Color.blue,Color.green,Color.orange,Color.cyan,Color.magenta,Color.pink};
        saveExpression();        
        for (int i=0;i<7;i++)
        {
            drawAxis();
            drawGrid();
            if(getCertainExpression(i).length()>0)
            graphExpression(getCertainExpression(i),colors[i]);
        }        
    }

    //Check if expression is valid, if not turn the text feild red until the expression makes sense
    private void checkExpression()
    {
        String Expression=display.getText();
        boolean pass=true;
        for(int i=0;i<Expression.length();i++)
        {           
            if(!(Expression.charAt(i)==
                ' ' || Expression.charAt(i)==
                '0' || Expression.charAt(i)==
                '1' || Expression.charAt(i)==
                '2' || Expression.charAt(i)==
                '3' || Expression.charAt(i)==
                '4' || Expression.charAt(i)==
                '5' || Expression.charAt(i)==
                '6' || Expression.charAt(i)==
                '7' || Expression.charAt(i)==
                '8' || Expression.charAt(i)==
                '9' || Expression.charAt(i)==
                '.' || Expression.charAt(i)==
                's' || Expression.charAt(i)==
                'c' || Expression.charAt(i)==
                't' || Expression.charAt(i)==
                'l' || Expression.charAt(i)==
                '√' || Expression.charAt(i)==
                'a' || Expression.charAt(i)==
                'x' || Expression.charAt(i)==
                'π' || Expression.charAt(i)==
                'n' || Expression.charAt(i)==
                'g' || Expression.charAt(i)==
                'b' || Expression.charAt(i)==
                'i' || Expression.charAt(i)==
                '^' || Expression.charAt(i)==
                'e' || Expression.charAt(i)==
                'o' || Expression.charAt(i)==
                '(' || Expression.charAt(i)==
                ')' || Expression.charAt(i)==
                '+' || Expression.charAt(i)==
                '-' || Expression.charAt(i)==
                '/' || Expression.charAt(i)==
                '*')) {
                pass=false;
            }            
        }
        //disable graph button if expression makes no sense
        graph.setEnabled(pass);
        //color the text field based on expression
        if(!pass)
        {
            display.setBackground(Color.red);
        }else{
            display.setBackground(Color.white);
        }        
    }

    //Check to see if a number makes sense
    private boolean checkNumber(String Number)
    {
        boolean pass=false;
        for(int i=0;i<Number.length();i++)
        {
            switch(Number.charAt(i))
            {
               case ' ':
               case '0':
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
               case '8':
               case '9':
               case '.':
               case '-':
                   if(i==0)
                   {pass=true;}
                   break;
               default:
                   pass=false;
            }
        }
        if (!expression.solve(Number,0.0).equals("Error")&&pass)
        {
            return true;
        }else{
            return false;
        }
    }

    private void drawCoordinates(java.awt.event.MouseEvent evt)
    {
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        xmin=Double.parseDouble(Xmin.getText());
        xmax=Double.parseDouble(Xmax.getText());
        ymin=Double.parseDouble(Ymin.getText());
        ymax=Double.parseDouble(Ymax.getText());        
        double xRange=(xmax-xmin);double yRange=(ymax-ymin);
        Graphics2D g2D = (Graphics2D) graph_screen.getGraphics();
        //get mouse position
        int mouse_x = evt.getX();
        int mouse_y = evt.getY();
        //determine graph coordinates
        String graph_x=Double.toString(xmin+((1.0*mouse_x/length)*xRange));
        String graph_y=Double.toString(ymax-((1.0*mouse_y/height)*yRange));
        if(graph_x.indexOf('.')!=-1&&graph_x.length()>graph_x.indexOf('.')+3)
        graph_x=graph_x.substring(0,graph_x.indexOf('.')+3);
        if(graph_y.indexOf('.')!=-1&&graph_y.length()>graph_y.indexOf('.')+3)
        graph_y=graph_y.substring(0,graph_y.indexOf('.')+3);
        //draw coordinates
        g2D.setColor(graphColor);
        g2D.fillRect(1,1,coords.length()*6,14);
        coords="Coordinates: ("+graph_x+","+graph_y+")";
        g2D.fillRect(1,1,coords.length()*6,14);
        g2D.setColor(Color.black);
        //set font to that of a button, in this case the Radian radio button
        g2D.setFont(Radian.getFont());
        g2D.drawString(coords,2,12);        
    }
  
    private void zoom(java.awt.event.MouseWheelEvent evt)
    {
        isZooming = true;
        double zoomFactor = .2;
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        xmin=Double.parseDouble(Xmin.getText());
        xmax=Double.parseDouble(Xmax.getText());
        ymin=Double.parseDouble(Ymin.getText());
        ymax=Double.parseDouble(Ymax.getText());
        int zoomx=evt.getX();int zoomy=evt.getY();
        double xRange=(xmax-xmin);double yRange=(ymax-ymin);
        int rotation = evt.getWheelRotation();
        double XmaxZoom=(-zoomFactor/length)*zoomx+zoomFactor;
        double XminZoom=Math.abs(XmaxZoom-zoomFactor);
        double YmaxZoom=(-zoomFactor/height)*zoomy+zoomFactor;
        double YminZoom=Math.abs(YmaxZoom-zoomFactor);
        //Zoom in/out
        if(rotation==-1)
        {
            ymin+=YmaxZoom*yRange;
            ymax-=YminZoom*yRange;
            xmin+=XminZoom*xRange;
            xmax-=XmaxZoom*xRange;            
        }else{
            //maximum zoom out range
            if(xRange<1999999*2&&yRange<1999999*2)
            {
            //maximum zoom in range
            if(xRange<=.04&&yRange<=.04)
            {
                xmin-=.02;
                xmax+=.02;
                ymin-=.02;
                ymax+=.02;
            }
            ymin-=YmaxZoom*yRange;
            ymax+=YminZoom*yRange;
            xmin-=XminZoom*xRange;
            xmax+=XmaxZoom*xRange;
            }
        }
        //write to bounds text fields
        DecimalFormat DForm = new DecimalFormat("#.##");
        xmin=Double.valueOf(DForm.format(xmin));
        xmax=Double.valueOf(DForm.format(xmax));
        ymin=Double.valueOf(DForm.format(ymin));
        ymax=Double.valueOf(DForm.format(ymax));
        Xmin.setText(Double.toString(xmin));
        Xmax.setText(Double.toString(xmax));
        Ymin.setText(Double.toString(ymin));
        Ymax.setText(Double.toString(ymax));
        //plot the zoomed graph
        plot();
        isZooming = false;
    }

    private void translateGraph(java.awt.event.MouseEvent evt)
    {
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        xmin=Double.parseDouble(Xmin.getText());
        xmax=Double.parseDouble(Xmax.getText());
        ymin=Double.parseDouble(Ymin.getText());
        ymax=Double.parseDouble(Ymax.getText());
        int y2=evt.getY();
        int x2=evt.getX();
        int dx=x2-x1;
        int dy=y2-y1;
        xmin=xminClicked-(1.0*dx/length)*(xmax-xmin);
        xmax=xmaxClicked-(1.0*dx/length)*(xmax-xmin);
        ymin=yminClicked+(1.0*dy/height)*(ymax-ymin);
        ymax=ymaxClicked+(1.0*dy/height)*(ymax-ymin);
        //write to bounds text fields
        DecimalFormat DForm = new DecimalFormat("#.##");
        xmin=Double.valueOf(DForm.format(xmin));
        xmax=Double.valueOf(DForm.format(xmax));
        ymin=Double.valueOf(DForm.format(ymin));
        ymax=Double.valueOf(DForm.format(ymax));
        Xmin.setText(Double.toString(xmin));
        Xmax.setText(Double.toString(xmax));
        Ymin.setText(Double.toString(ymin));
        Ymax.setText(Double.toString(ymax));
        plot();
    }

    //Make sure ymax>ymin and xmax>xmin
    private boolean checkWindowBounds()
    {
        xmin=Double.parseDouble(Xmin.getText());
        xmax=Double.parseDouble(Xmax.getText());
        ymin=Double.parseDouble(Ymin.getText());
        ymax=Double.parseDouble(Ymax.getText());
        if(xmin<xmax&&ymin<ymax)
        {
            return true;
        }
        return false;
    }

    //Instance variables
    private Parser expression = new Parser();
    private double logBase=10,xmin,xmax,ymin,ymax,start,end,increment,xminClicked,xmaxClicked,yminClicked,ymaxClicked;
    private int rows,mode,precision,x1,y1,graphWidth=2,axisWidth=2,gridWidth=1;
    private boolean Axis=true,Grid=true,isTranslating,isZooming,drawInstantly = true;
    private String fx="",gx="",ax="",bx="",cx="",dx="",ex="",coords="Coordinates: (0.00,0.00)";
    private Color //default colors
            backGround = Color.white,
            graphColor = Color.white,
            tableColor = Color.white,
            axisColor = Color.black,
            gridColor = Color.gray;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AxisColor;
    private javax.swing.JMenuItem AxisWidth;
    private javax.swing.JMenuItem BackgroundColor;
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton Calc0;
    private javax.swing.JButton Calc1;
    private javax.swing.JButton Calc2;
    private javax.swing.JButton Calc3;
    private javax.swing.JButton Calc4;
    private javax.swing.JButton Calc5;
    private javax.swing.JButton Calc6;
    private javax.swing.JButton Calc7;
    private javax.swing.JButton Calc8;
    private javax.swing.JButton Calc9;
    private javax.swing.JButton CalcA;
    private javax.swing.JButton CalcB;
    private javax.swing.JButton CalcBeginpars;
    private javax.swing.JButton CalcC;
    private javax.swing.JButton CalcD;
    private javax.swing.JButton CalcE;
    private javax.swing.JButton CalcEndpars;
    private javax.swing.JButton CalcF;
    private javax.swing.JButton CalcMultip;
    private javax.swing.JButton Calcabs;
    private javax.swing.JButton Calcacos;
    private javax.swing.JButton Calcasin;
    private javax.swing.JButton Calcatan;
    private javax.swing.JRadioButton Calcbin;
    private javax.swing.JButton Calcclear;
    private javax.swing.JButton Calccos;
    private javax.swing.JButton Calccot;
    private javax.swing.JButton Calccsc;
    private javax.swing.JRadioButton Calcdec;
    private javax.swing.JButton Calcdecimal;
    private javax.swing.JRadioButton Calcdeg;
    private javax.swing.JTextField Calcdisplay;
    private javax.swing.JButton Calce;
    private javax.swing.JButton Calcequals;
    private javax.swing.JRadioButton Calchex;
    private javax.swing.JButton Calclog;
    private javax.swing.JButton Calcminus;
    private javax.swing.JRadioButton Calcoct;
    private javax.swing.JButton Calcplus;
    private javax.swing.JButton Calcpower;
    private javax.swing.JButton Calcppi;
    private javax.swing.JRadioButton Calcrad;
    private javax.swing.JButton Calcsec;
    private javax.swing.JButton Calcsin;
    private javax.swing.JButton Calcsqrt;
    private javax.swing.JButton Calctan;
    private javax.swing.JPanel CalculatorPanel;
    private javax.swing.JButton Calcx;
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JRadioButton Degree;
    private javax.swing.JTextField End;
    private javax.swing.JPanel EndPanel;
    private javax.swing.JComboBox Equation;
    private javax.swing.JMenuItem GraphColor;
    private javax.swing.JMenu GraphColorMenu;
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JMenuItem GraphWidth;
    private javax.swing.JMenu GraphicsMenu;
    private javax.swing.JMenuItem GridColor;
    private javax.swing.JMenuItem GridWidth;
    private javax.swing.JTextField Increment;
    private javax.swing.JPanel IncrementPanel;
    private javax.swing.JComboBox LogBase;
    private javax.swing.JMenu Precision;
    private javax.swing.JRadioButton Radian;
    private javax.swing.JMenuItem SetPrecision;
    private javax.swing.JMenuItem Standard;
    private javax.swing.JTextField Start;
    private javax.swing.JPanel StartPanel;
    private javax.swing.JMenuItem Statistic;
    private javax.swing.JMenuItem TableColor;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JMenuItem Trigonometric;
    private javax.swing.JButton X;
    private javax.swing.JTextField Xmax;
    private javax.swing.JPanel XmaxPanel;
    private javax.swing.JTextField Xmin;
    private javax.swing.JPanel XminPanel;
    private javax.swing.JTextField Ymax;
    private javax.swing.JPanel YmaxPanel;
    private javax.swing.JTextField Ymin;
    private javax.swing.JPanel YminPanel;
    private javax.swing.JMenuItem ZoomIn;
    private javax.swing.JMenu ZoomMenu;
    private javax.swing.JMenuItem ZoomOut;
    private javax.swing.JLabel aColor;
    private javax.swing.JButton abs;
    private javax.swing.JButton acos;
    private javax.swing.JButton asin;
    private javax.swing.JButton atan;
    private javax.swing.JLabel bColor;
    private javax.swing.JButton beginPars;
    private javax.swing.JLabel cColor;
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JButton cot;
    private javax.swing.JButton csc;
    private javax.swing.JLabel dColor;
    private javax.swing.JButton decimal;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton divide1;
    private javax.swing.JSeparator divider1;
    private javax.swing.JSeparator divider2;
    private javax.swing.JSeparator divider3;
    private javax.swing.JRadioButton drawAxis;
    private javax.swing.JCheckBox drawFuncCheckBox;
    private javax.swing.JRadioButton drawGrid;
    private javax.swing.JButton e;
    private javax.swing.JLabel eColor;
    private javax.swing.JButton endPars;
    private javax.swing.JButton exp;
    private javax.swing.JLabel fColor;
    private javax.swing.JLabel gColor;
    private javax.swing.JButton graph;
    private javax.swing.JPanel graph_screen;
    private javax.swing.JMenuItem graphingButton;
    private javax.swing.JMenuItem instantDraw;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton log;
    private javax.swing.JLabel logBaseLabel;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton pi;
    private javax.swing.JButton plus;
    private javax.swing.JMenuItem scientificButton;
    private javax.swing.JButton sec;
    private javax.swing.JButton sin;
    private javax.swing.JMenuItem slowDraw;
    private javax.swing.JButton sqr;
    private javax.swing.JTable table;
    private javax.swing.JSeparator tableSeperator;
    private javax.swing.JButton tan;
    // End of variables declaration//GEN-END:variables

}