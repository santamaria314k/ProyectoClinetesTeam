
package Controllers;

import Models.Usuario;
import Services.UsuarioService;

public class UsuarioController {
    
    public UsuarioService usuarioService;
    
    public UsuarioController(){
    this.usuarioService=new UsuarioService();
     }
    
    
    public void InsetarUsuario(Usuario usuarioNuevo){
    boolean respuesta = usuarioService.InsertarUsuario(usuarioNuevo);
    
    if(respuesta){
    System.out.println("Ha sido Ingresado un nuevo cliente");
    }else{
    System.out.println("Lamentablemente algo salio Mal"
    + "xxxxxerrorxxxxxx"  );
    
    }
    
    
    }

    public void Imprimir() {
        usuarioService.Imprimir();
    }
    
    
    
}
