

package DB;


import Models.Usuario;

public class DataBase {
    
    public  Usuario[]lstUsuarios;
    
    public DataBase(){
    lstUsuarios = new Usuario[10];
    this.InicializarLista();
    }
    
    
    public void InicializarLista(){
    Usuario cliente1 = new Usuario(1,"LUIS");
    Usuario cliente2 = new Usuario(2,"CARLOS");
    Usuario cliente3 = new Usuario(3,"JOSEPH");
    Usuario cliente4 = new Usuario(4,"TOMAS");
    
    lstUsuarios[0]=cliente1;
    lstUsuarios[1]=cliente1;
    lstUsuarios[2]=cliente1;
    lstUsuarios[3]=cliente1;

    }
    
    
}
