package calculadora;

public class Main 
{
    public static void main(String[] args) 
    {        
        // Se declara y crea el objeto de la venta de la calculadora 
        // y se le pasa un nuevo objeto creado de la clase calcular.
        vCalcMano vCalc = new vCalcMano(new Calcular());
    }   
}
// Calculadora hecha por Rainer Arencibia.
// Solo le faltaria trabajar con excepciones en otra clase.