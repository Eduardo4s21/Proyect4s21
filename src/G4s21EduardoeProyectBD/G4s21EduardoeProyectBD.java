/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package G4s21EduardoeProyectBD;

import ConexionDAO.Conexion;
import DTO.Datos;
import javax.swing.JOptionPane;


public class G4s21EduardoeProyectBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion = new Conexion();
        conexion.Abrir();
        
        if (conexion.borrar(3)){
            System.out.println("se eliminio correctamente");
        }else{
            System.out.println("no se logro la consulta");
        }          
        
        conexion.cerrar();
    }
    
}
