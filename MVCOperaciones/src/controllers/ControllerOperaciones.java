package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelOperaciones;
import views.ViewOperaciones;
public class ControllerOperaciones implements ActionListener
{
    private final ModelOperaciones modelOperaciones;
    private final ViewOperaciones viewOperaciones;
    public ControllerOperaciones(ViewOperaciones viewOperaciones, ModelOperaciones modelOperaciones)
    {
        this.viewOperaciones = viewOperaciones;
        this.modelOperaciones = modelOperaciones;
        
        viewOperaciones.Jb_resta.addActionListener(this);
        viewOperaciones.Jb_suma.addActionListener(this);
        viewOperaciones.Jb_multiplicacion.addActionListener(this);
        viewOperaciones.Jb_divicion.addActionListener(this);
        viewOperaciones.Jb_modulo.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==viewOperaciones.Jb_suma)
       {
           float numero1 = 0.0f;//variable numero1
            float numero2 = 0.0f;//variable numero2
            numero1 = Float.parseFloat(viewOperaciones.Jtf_numero1.getText());//convierte el texto jtf a flotante y lo guarda en numero1
            numero2 = Float.parseFloat(viewOperaciones.Jtf_numero2.getText());//convierte el texto jtf a flotante y lo guarda en numeri2
            float resultado = numero1 + numero2;
            viewOperaciones.Jtf_resultado.setText(String.valueOf(resultado));
       }
       if(e.getSource()==viewOperaciones.Jb_resta)
       {
           float numero1 = 0.0f;
             float numero2 = 0.0f;
             numero1 = Float.parseFloat(viewOperaciones.Jtf_numero1.getText());
             numero2 = Float.parseFloat(viewOperaciones.Jtf_numero2.getText());
             float resultado = numero1 - numero2;
             viewOperaciones.Jtf_resultado.setText(String.valueOf(resultado));
       }
       if(e.getSource()==viewOperaciones.Jb_multiplicacion)
       {
            float numero1 = 0.0f;
            float numero2 = 0.0f;
            numero1 = Float.parseFloat(viewOperaciones.Jtf_numero1.getText());
            numero2 = Float.parseFloat(viewOperaciones.Jtf_numero2.getText());
            float resultado = numero1 * numero2; 
            viewOperaciones.Jtf_resultado.setText(String.valueOf(resultado));
       }
       if(e.getSource()==viewOperaciones.Jb_divicion)
       {
            float numero1 = 0.0f;
            float numero2 = 0.0f;
            numero1 = Float.parseFloat(viewOperaciones.Jtf_numero1.getText());
            numero2 = Float.parseFloat(viewOperaciones.Jtf_numero2.getText());
            float resultado = numero1 / numero2; 
            viewOperaciones.Jtf_resultado.setText(String.valueOf(resultado));
       }
       if(e.getSource()==viewOperaciones.Jb_modulo)
       {
           float numero1 = 0.0f;
             float numero2 = 0.0f;
             numero1 = Float.parseFloat(viewOperaciones.Jtf_numero1.getText());
             numero2 = Float.parseFloat(viewOperaciones.Jtf_numero2.getText());
             float resultado = numero1 % numero2; 
             viewOperaciones.Jtf_resultado.setText(String.valueOf(resultado)); 
       }
    }
    private void initView() 
    {
        viewOperaciones.setTitle("Resolviendo operaciones básicas");
        viewOperaciones.setLocationRelativeTo(null);
        viewOperaciones.Jl_numero1.setText(modelOperaciones.getMessage());
        viewOperaciones.Jl_numero2.setText(modelOperaciones.getMessage());
        viewOperaciones.setVisible(true);
    }
}
