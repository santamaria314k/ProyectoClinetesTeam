
package Main;

import java.util.Scanner;

import Models.Empresa;
import Controllers.EmpresaController;

public class Main {
    
    
    public static void main (String[]args){
        




   
        Scanner escanear=new Scanner(System.in);
    
        EmpresaController empresaController =new EmpresaController();
        int x=0;
       
        while(x<2){
        
        int nit =0;
        String razonSocial ="";
        String telefono="";
        String actividad="";





        System.out.println("por favor ingresa el nit  de la Empresa :");
        nit=escanear.nextInt();
     
        System.out.println("por favor ingresar razon social de la empresa :");
        razonSocial =escanear.next();
        

        System.out.println("por favor ingresar telefono de la empresa :");
        telefono =escanear.next();
        

        System.out.println("por favor ingresar actividad de la empresa :");
        actividad =escanear.next();
        



        
        
        Usuario empresa =new Usuario(nit,razonSocial,telefono,actividad);
        empresaController.InsetarEmpresa(empresa);
        
        empresaController.Imprimir();
        
        x++;
        }
        




        
    





    }
    
}
