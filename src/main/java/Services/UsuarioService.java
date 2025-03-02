
package Services;

import DB.DataBase;
import Models.Usuario;


public class UsuarioService {
    public DataBase db ;
    
    public UsuarioService(){
    this.db =new DataBase();
    }
    
    public boolean InsertarUsuario(Usuario nuevoUsuario){
    boolean respuesta =false;
    for(int i = 0 ; i< this.db.lstUsuarios.length; i++){
        if(this.db.lstUsuarios[i]==null){
        this.db.lstUsuarios[i]=nuevoUsuario;
        respuesta=true;
        break;
        }
    
    }
    
    return respuesta;

    
    }

    public void Imprimir(){
      
        System.out.println("///////////////////////////////////////////");
        
        
        for(int i=1; i < this.db.lstUsuarios.length ; i++){
        if(this.db.lstUsuarios[i] != null){
            System.out.println("ID CLIENTE :"+this.db.lstUsuarios[i].id);
            System.out.println("NOMBRE CLIENTE :"+ this.db.lstUsuarios[i].getNombre());
        }
        }
        
        System.out.println("-----//-----------------//-----------//-------");
    
    }
       
}
