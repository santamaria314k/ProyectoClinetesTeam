
package Controllers;



import Models.Empresa;
import Services.EmpresaService;



public class EmpresaController {
    
    
     public EmpresaService empresaService;
    
    public EmpresaController(){
    this.empresaService=new EmpresaService();
     }
    
    
    public void InsetarEmpresa(Empresa empresaNueva){
    boolean respuesta = empresaService.InsertarEmpresa(empresaNueva);
    
    if(respuesta){
    System.out.println("Ha sido Ingresada una nueva Empresa :)");
    }else{
    System.out.println("Lamentablemente algo salio Mal"
    + "xxxxx-error-xxxxxx"  );
    
    }
    
    
    }

    public void Imprimir() {
        empresaService.Imprimir();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
