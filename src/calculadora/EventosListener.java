package calculadora;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.util.EventListener;

public class EventosListener implements EventListener, MouseListener
{
    private vCalcMano vCalc;
    private Calcular calc;
    private Color colorAnterior;
    private boolean dot=false;

    public boolean getDot() { return dot; }
    public void setDot(boolean dot) { this.dot = dot; }    
    
    public EventosListener(vCalcMano v, Calcular c) 
    {
        this.vCalc = v;
        this.calc = c;
    }
    
    public void btnNum0actionPerformed(ActionEvent ae) 
    {   
        vCalc.setBuffer(vCalc.getPantalla().getText()+"0");
    }
    
    public void btnNum1actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"1");
    }

    public void btnNum2actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"2");
    }
    
    public void btnNum3actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"3");
    }
    
    public void btnNum4actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"4");
    }
    
    public void btnNum5actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"5");
    }
    
    public void btnNum6actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"6");
    }
    
    public void btnNum7actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"7");
    }
    
    public void btnNum8actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"8");
    }
    
    public void btnNum9actionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer(vCalc.getPantalla().getText()+"9");
    }
    
    public void btnSumaactionPerformed(ActionEvent ae) 
    {
        calc.setOperacion('+');
        vCalc.setBuffer("+");
    }
    
    public void btnRestaactionPerformed(ActionEvent ae) 
    {
        calc.setOperacion('-');
        vCalc.setBuffer("-");
    }
    
    public void btnMultactionPerformed(ActionEvent ae) 
    {
        calc.setOperacion('*');
        vCalc.setBuffer("*");
    }
    
    public void btnDivactionPerformed(ActionEvent ae) 
    {
        calc.setOperacion('/');
        vCalc.setBuffer("/");
    }
    
    public void btnExpactionPerformed(ActionEvent ae) 
    {
        //calc.setOperacion('^');
        //vCalc.getPantalla().setText(" ");
        vCalc.setBuffer(Double.toString(calc.exp(calc.getNum1())));
    }
    
    public void btnSqrtactionPerformed(ActionEvent ae) 
    {
        //calc.setOperacion('√');
        //vCalc.getPantalla().setText(" ");
        vCalc.setBuffer(Double.toString(calc.sqrt(calc.getNum1())));
    }
    
    public void btnDivXactionPerformed(ActionEvent ae) 
    {
        //calc.setOperacion('X');
        //vCalc.getPantalla().setText(" ");
        vCalc.setBuffer(Double.toString(calc.divX(calc.getNum1())));
    }
    
    public void btnDotactionPerformed(ActionEvent ae) 
    {
        if (!dot)
        {
            dot=true;
            //calc.setOperacion('.');
            vCalc.setBuffer(vCalc.getBuffer()+".");
        } 
    }
    
    /*
    public void btnNegactionPerformed(ActionEvent ae) 
    {
        if (!neg)
        {
            neg=true;
            calc.setOperacion('-');
            vCalc.setBuffer("-" + vCalc.getBuffer());
        }
        else
            neg=false;
    }
    */
    
    public void btnBorraractionPerformed(ActionEvent ae) 
    {
        vCalc.setBuffer("0");
    }
    
    public void btnResetactionPerformed(ActionEvent ae) 
    {
        calc.setNum1(0);
        calc.setNum2(0);
        calc.setOperacion(' ');
        btnBorraractionPerformed(ae);
    }
    
    public void btnIgualactionPerformed(ActionEvent ae) 
    {
        double total=0;
        DecimalFormat df = new DecimalFormat("####.####");
        
        switch (calc.getOperacion()) 
        {
            case '+':  
                total=calc.suma();
            break;
                
            case '-':  
                total=calc.resta();
            break;
                 
            case '*':  
                total=calc.mult();
            break;
                
            case '/':  
                total=calc.div();
            break;
                                   
            default: 
                throw new UnsupportedOperationException("Oper. NO EXISTE!");
        }
        vCalc.setBuffer(df.format(total));
    }

    @Override
    public void mouseClicked(MouseEvent me) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed(MouseEvent me) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent me) 
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) 
    {
        Component comp = me.getComponent();
        colorAnterior = comp.getForeground();
        comp.setForeground(java.awt.Color.BLUE);
    }

    @Override
    public void mouseExited(MouseEvent me) 
    {
        Component comp = me.getComponent();
        comp.setForeground(colorAnterior);
    }
}