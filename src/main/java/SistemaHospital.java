/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class SistemaHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Datos estaticos
         //PACIENTE:code, name,age,city, contact, TipoSangre,Padecimeinto,Alergia
        
        Paciente e1= new Paciente(001, "Raquel", 25, "Sanarate", "55555555", "A+", "Resfriado", "Mani");
        
        e1.AddPaciente();
        //MEDICO: code, name, age, city, contact, especialidad, hospital, area
        Medico e2= new Medico(001, "Donald", 24, "Sanarate", "50505050", "Patologia", "XD", "Patologia");
        
        e2.AddMedico();
        
    }
    
}
