/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ClasseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Profesor profe = new Profesor("William","El paraiso","14/11/94","M",25,"ING","Programador");
        System.out.println(profe.toString());
        
        Estudiante estu = new Estudiante("Jenny","Chalatenango","14/11/99","F",28,1500,"Ingenieria en Sistemas");
        System.out.println(estu.toString());
        
                
    }
    
}
