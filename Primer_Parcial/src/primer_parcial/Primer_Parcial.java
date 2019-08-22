package primer_parcial;

import javax.swing.JOptionPane;
public class Primer_Parcial {
    
    int CA[] = new int [4];
    int NO[] = new int [4];
    int aux;
    
    public void ingreso()
    {
        for(int i=0; i<CA.length&&i<NO.length; i++)
        {
            NO[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de carne "+(i+1)));
            CA[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota "+(i+1)));
        }
    }
    public void ordenamiento()
    {
        for(int j=1; j<CA.length; j++)
        {
            if(CA[j-1]<CA[j])
            {
                aux = CA[j-1];
                CA[j-1] = CA[j];
                CA[j] = aux;
            } 
        }
    }
    public void mostrar()
    {
        ordenamiento();
        JOptionPane.showMessageDialog(null, "Ahora ordenemos de Mayor a Menor");
        for(int k=0; k<CA.length&&k<NO.length; k++)
        {
            JOptionPane.showMessageDialog(null, CA[k]);
        }
    }
    
    public static void main(String[] args) {
      Primer_Parcial m = new Primer_Parcial();
      m.ingreso();
      m.mostrar();
    }
    
}