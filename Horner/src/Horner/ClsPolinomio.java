
package Horner;

/**
 *
 * @author Vinicio
 */
public class ClsPolinomio {
    
    public int _grado;
    public double [] _a;
    
    //Constructores

    public ClsPolinomio(int grado)
    {
        _grado=grado;
        _a=new double [_grado];
    }
    
    public ClsPolinomio(int grado, double[]coef)
    {
        _grado=grado;
        _a=coef;
    }
    
    public ClsPolinomio(ClsPolinomio t)
    {
        _grado=t._grado;
        _a=t._a;
    }
    
    //Métodos Set
    
    public void grado(int valor)
    {
        _grado=valor;
    }
    
    public void a(double[] coef)
    {
        _a=coef;
    }

    public void a(int i, float valor)
    {
        _a[i]=valor;
    }
    
    
    //Métodos Get
    
    public int grado()
    {
        return _grado;
    }
    
    public double[] a()
    {
        return _a;
    }
    
    public double a(int i)
    {
        return _a[i];
    }
    
    
    
    //Método Suma de Potencias
    
    public double SumPotencias(float valx)
    {
        double resultado=0.0, valor=0.0;
        for(int i=0; i<_grado; i++)
        {
            resultado = _a[i]*Math.pow(valx, i);
            valor = resultado + valor;
        }
        return valor;
    }
        
    //Método de Horner
    
    public double Horner(float valx)
    {
        double valor = (_a[_grado-2] + _a[_grado-1])*valx;
        for (int i=_grado-3; i>=0; i--)
        {
            valor = _a[i] + (valor*valx); 
        }
        return valor;

    }

    //Metodo Ver
    
    public String ver()
    {
        String polinomio="";
    
        for(int i=_grado-1;i>0;i--)
        {
            if(_a[i]!=0)
            {
                polinomio+= _a[i]+"*"+"X^"+i+" ";
            }
            if(_a[i-1]>0)
            {
                polinomio+="+";
            }
        }
        polinomio+=_a[0];
        return polinomio;
    }
}
