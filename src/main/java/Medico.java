
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *especialidad, Hospital y área
 * @author alumno
 */
public class Medico extends Persona {
    
    String Especialidad;
    String Hospital;
    String Area;
    
     public Medico (int code, String name, int age, String city, String contact, String Especialidad, String Hospital, String Area){
        super(code, name, age, city, contact);
        this.Especialidad=Especialidad;
        this.Hospital=Hospital;
        this.Area=Area;
    }
    
    //metodo
    public void AddMedico(){
        JOptionPane.showMessageDialog(null,
                "Codigo:" + code+ 
                "\nNombre: " + name +
                "\nEdad: " +age +
                "\nCiudad: " +city+ 
                "\nContacto: " +contact+ 
                "\nEspecialidad: "+Especialidad+ 
                "\nHospital: " +Hospital+
                "\nArea: " +Area,        
                "Medico",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
