/*
 * Ventana grafica de la calculadora a mano x Rainer Arencibia Hernandez.
 * Universidad Rey Juan Carlos. Asignatura de POO y IPO.
 * Profesores: Carlos y 
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * @author Rainer Arencibia Hernandez
 */
public class vCalcMano extends JFrame implements  ActionListener, KeyListener
{
    private Calcular calc;
    private EventosListener event;   
    private String buffer;
    private boolean oper=false;
    
    // 1- Declaracion de los botones que utilizaremos..
    // Numeros, Operaciones, Borrar y la pantalla.
    JButton btnNum0 = new JButton("0");
    JButton btnNum1 = new JButton("1");
    JButton btnNum2 = new JButton("2");
    JButton btnNum3 = new JButton("3");
    JButton btnNum4 = new JButton("4");
    JButton btnNum5 = new JButton("5");
    JButton btnNum6 = new JButton("6");
    JButton btnNum7 = new JButton("7");
    JButton btnNum8 = new JButton("8");
    JButton btnNum9 = new JButton("9");
    JButton btnDot = new JButton(".");
    JButton btnDivX = new JButton("1/X");  
    JButton btnSuma = new JButton("+");
    JButton btnResta = new JButton("-");
    JButton btnMult = new JButton("*");
    JButton btnDiv = new JButton("/");
    JButton btnSqrt = new JButton("√");
    JButton btnExp = new JButton("χ²");    
    JButton btnIgual = new JButton("=");
    JButton btnBorrar = new JButton("C");
    JButton btnReset = new JButton("CE");
    JTextField pantalla = new JTextField(25);

    public String getBuffer() { return buffer; }
    public void setBuffer(String buffer) { this.buffer = buffer; }
    
    public JTextField getPantalla() { return pantalla; }
    public void setPantalla(JTextField pantalla) { this.pantalla = pantalla; }
    
    //pantalla.setHorizontalAlignment(JTextField.RIGHT);
    
    // 2-Contructor de la ventana de la calculadora.
    // Asignar un titulo a la ventana, 
    // crear varios jpanel y el contenido(botones) al panel.
    
    public vCalcMano(Calcular c)
    {
        this.calc = c;
        this.event = new EventosListener(this, this.calc);
        JFrame frame = new JFrame("Calculadora a Mano.. x Rainer Arencibia.");
        
        JPanel panelContenido = new JPanel();
        panelContenido.setLayout(new BorderLayout(4,1)); 
        
        JPanel panelContenido2 = new JPanel();
        panelContenido2.setLayout(new GridLayout(4,4));   
        
        JPanel panelContenido3 = new JPanel();
        panelContenido3.setLayout(new BoxLayout(panelContenido3, BoxLayout.Y_AXIS));
        
        JPanel panelContenido4 = new JPanel();
        panelContenido4.setLayout(new BoxLayout(panelContenido4, BoxLayout.Y_AXIS));
           
        JPanel panelContenido5 = new JPanel();
        panelContenido5.setLayout(new GridLayout(1,1)); 
        
        //3.1 - Anadir los ActionListener de cada boton!
        btnNum0.addActionListener(this);
        btnNum1.addActionListener(this);
        btnNum2.addActionListener(this);
        btnNum3.addActionListener(this);
        btnNum4.addActionListener(this);
        btnNum5.addActionListener(this);
        btnNum6.addActionListener(this);
        btnNum7.addActionListener(this);
        btnNum8.addActionListener(this);
        btnNum9.addActionListener(this);
        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMult.addActionListener(this);
        btnDiv.addActionListener(this);
        btnExp.addActionListener(this);
        btnSqrt.addActionListener(this);
        btnDivX.addActionListener(this);
        btnDot.addActionListener(this);
        btnIgual.addActionListener(this);        
        btnBorrar.addActionListener(this);
        btnReset.addActionListener(this);
        
        //3.2 - Anadir los KeyListener de cada boton!
        btnNum0.addKeyListener(this);
        btnNum1.addKeyListener(this);
        btnNum2.addKeyListener(this);
        btnNum3.addKeyListener(this);
        btnNum4.addKeyListener(this);
        btnNum5.addKeyListener(this);
        btnNum6.addKeyListener(this);
        btnNum7.addKeyListener(this);
        btnNum8.addKeyListener(this);
        btnNum9.addKeyListener(this);
        btnSuma.addKeyListener(this);
        btnResta.addKeyListener(this);
        btnMult.addKeyListener(this);
        btnDiv.addKeyListener(this);
        btnExp.addKeyListener(this);
        btnSqrt.addKeyListener(this);
        btnDivX.addKeyListener(this);
        btnDot.addKeyListener(this);
        btnIgual.addKeyListener(this);        
        btnBorrar.addKeyListener(this);
        btnReset.addKeyListener(this);
        
        //3.2 - Anadir los MouseListener de cada boton! Se pone Azul.
        btnNum0.addMouseListener(event);
        btnNum1.addMouseListener(event);
        btnNum2.addMouseListener(event);
        btnNum3.addMouseListener(event);
        btnNum4.addMouseListener(event);
        btnNum5.addMouseListener(event);
        btnNum6.addMouseListener(event);
        btnNum7.addMouseListener(event);
        btnNum8.addMouseListener(event);
        btnNum9.addMouseListener(event);
        btnSuma.addMouseListener(event);
        btnResta.addMouseListener(event);
        btnMult.addMouseListener(event);
        btnDiv.addMouseListener(event);
        btnExp.addMouseListener(event);
        btnSqrt.addMouseListener(event);
        btnDivX.addMouseListener(event);
        btnDot.addMouseListener(event);
        btnIgual.addMouseListener(event);        
        btnBorrar.addMouseListener(event);
        btnReset.addMouseListener(event);        
        
        this.pantalla.setHorizontalAlignment(JTextField.RIGHT);
        this.pantalla.setEditable(false);
        this.getPantalla().setText("0");
        this.pantalla.setBackground(Color.white);
        this.pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        
        //4-Anadir los botones y el campo de texto al panel de contenidos..        
        panelContenido2.add(btnNum7);
        panelContenido2.add(btnNum8);
        panelContenido2.add(btnNum9);        
        panelContenido2.add(btnNum4);
        panelContenido2.add(btnNum5);
        panelContenido2.add(btnNum6);        
        panelContenido2.add(btnNum1);
        panelContenido2.add(btnNum2);
        panelContenido2.add(btnNum3);        
        panelContenido2.add(btnNum0);        
        panelContenido2.add(btnDot);
        panelContenido2.add(btnDivX);
        
        panelContenido3.add(btnSuma);
        panelContenido3.add(btnResta);
        panelContenido3.add(btnMult);
        panelContenido3.add(btnDiv); 
        
        panelContenido4.add(btnExp);
        panelContenido4.add(btnSqrt);
        panelContenido4.add(btnBorrar);
        panelContenido4.add(btnReset);
        
        panelContenido5.add(btnIgual);
                
        panelContenido.add(pantalla, BorderLayout.NORTH);        
        panelContenido.add(panelContenido2, BorderLayout.CENTER);
        panelContenido.add(panelContenido3, BorderLayout.EAST);
        panelContenido.add(panelContenido4, BorderLayout.WEST);        
        panelContenido.add(panelContenido5, BorderLayout.SOUTH);
        frame.getContentPane().add(panelContenido);
        
        //5- Anadir el tamano de la ventana..hacer visible y cerrar por defecto
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(270, 320);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {// Cuando comienza.. Visualiza a pantalla       
        
        btnNum0.requestFocus();
        btnNum1.requestFocus();
        btnNum2.requestFocus();
        btnNum3.requestFocus();
        btnNum4.requestFocus();
        btnNum5.requestFocus();
        btnNum6.requestFocus();
        btnNum7.requestFocus();
        btnNum8.requestFocus();
        btnNum9.requestFocus();
        btnReset.requestFocus();
        btnIgual.requestFocus();
        
        if (ae.getSource() == btnNum0 || ae.getSource() == btnNum1 || ae.getSource() == btnNum2 || ae.getSource() == btnNum3 || ae.getSource() == btnNum4 || ae.getSource() == btnNum5 || ae.getSource() == btnNum6 || ae.getSource() == btnNum7 || ae.getSource() == btnNum8 || ae.getSource() == btnNum9)
        {
            if (this.getPantalla().getText().equals("0") || oper==true)
                this.getPantalla().setText(" ");            
               
            if (ae.getSource() == btnNum0)
                event.btnNum0actionPerformed(ae);
            else if (ae.getSource() == btnNum1)
                event.btnNum1actionPerformed(ae);
            else if (ae.getSource() == btnNum2)
                event.btnNum2actionPerformed(ae);
            else if (ae.getSource() == btnNum3)
                event.btnNum3actionPerformed(ae);
            else if (ae.getSource() == btnNum4)
                event.btnNum4actionPerformed(ae);
            else if (ae.getSource() == btnNum5)
                event.btnNum5actionPerformed(ae);
            else if (ae.getSource() == btnNum6)
                event.btnNum6actionPerformed(ae);
            else if (ae.getSource() == btnNum7)
                event.btnNum7actionPerformed(ae);
            else if (ae.getSource() == btnNum8)
                event.btnNum8actionPerformed(ae);
            else if (ae.getSource() == btnNum9)
                event.btnNum9actionPerformed(ae);
            
            oper=false;
        }
        
        // OPERACIONES... coje el numero de la pantalla y anade la oper.        
        if (ae.getSource() == btnSuma || ae.getSource() == btnResta || ae.getSource() == btnMult || ae.getSource() == btnDiv || ae.getSource() == btnExp || ae.getSource() == btnSqrt || ae.getSource() == btnDivX ) 
        {    
            calc.setNum1(Double.valueOf(this.getPantalla().getText()));
            this.getPantalla().setText("");
            event.setDot(false);
                
            if (ae.getSource() == btnSuma)
                event.btnSumaactionPerformed(ae);
            else if (ae.getSource() == btnResta)
                event.btnRestaactionPerformed(ae);
            else if (ae.getSource() == btnMult)
                event.btnMultactionPerformed(ae);
            else if (ae.getSource() == btnDiv)
                event.btnDivactionPerformed(ae);
            else if (ae.getSource() == btnExp)
                event.btnExpactionPerformed(ae);
            else if (ae.getSource() == btnSqrt)
                event.btnSqrtactionPerformed(ae);
            else if (ae.getSource() == btnDivX)
                event.btnDivXactionPerformed(ae);
            oper = true;
           
        }
        
        if (ae.getSource() == btnDot)
            event.btnDotactionPerformed(ae);
        else if (ae.getSource() == btnBorrar)
            event.btnBorraractionPerformed(ae);          
        else if (ae.getSource() == btnReset)
            event.btnResetactionPerformed(ae);
                
        if (ae.getSource() == btnIgual)
        {
            calc.setNum2(Double.valueOf(this.getPantalla().getText())); 
            event.setDot(false);                 
            event.btnIgualactionPerformed(ae);
        }        
        // al final se visualiza lo que halla en el buffer.
        this.getPantalla().setText(buffer);
    }
 
    @Override
    public void keyPressed(KeyEvent ke) 
    {
        if (ke.getKeyCode() == KeyEvent.VK_ENTER || ke.getKeyCode() == KeyEvent.VK_EQUALS)
            btnIgual.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_0)
            btnNum0.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_1)
            btnNum1.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_2)
            btnNum2.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_3)
            btnNum3.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_4)
            btnNum4.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_5)
            btnNum5.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_6)
            btnNum6.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_7)
            btnNum7.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_8)
            btnNum8.doClick();
        else if (ke.getKeyCode() == KeyEvent.VK_9)
            btnNum9.doClick(); 
        else if (ke.getKeyCode() == KeyEvent.VK_BACK_SPACE)
            btnReset.doClick(); 
    }

    @Override
    public void keyTyped(KeyEvent ke) 
    {

    }
    
    @Override
    public void keyReleased(KeyEvent ke) 
    {

    }
}