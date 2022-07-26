/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * Tipo de sangre, padecimiento, alergia
 * @author alumno
 */
public class Paciente extends Persona {
    
    String TipoSangre;
    String Padecimiento;
    String Alergia;
 
    public Paciente (int code, String name, int age, String city, String contact, String TipoSangre, String Padecimiento, String Alergia){
        super(code, name, age, city, contact);
        this.TipoSangre=TipoSangre;
        this.Padecimiento=Padecimiento;
        this.Alergia=Alergia;
    }
    
    //metodo
    public void AddPaciente(){
        JOptionPane.showMessageDialog(null,
                "Codigo:" + code+ 
                "\nNombre: " + name +
                "\nEdad: " +age +
                "\nCiudad: " +city+ 
                "\nContacto: " +contact+ 
                "\nTipo de Sangre: "+TipoSangre+ 
                "\nPadecimiento: " +Padecimiento+
                "\nAlergia: " +Alergia,        
                "Estudiante",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
