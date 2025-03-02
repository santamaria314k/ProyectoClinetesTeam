
package Services;
import DB.DataBase;
import Models.Empresa;



public class EmpresaService {
    
    
    
    
    
    
     public DataBase db ;
    
    public  EmpresaService(){
    this.db =new DataBase();
    }
    
    public boolean InsertarEmpresa(Empresa nuevaEmpresa){
    boolean respuesta =false;
    for(int i = 0 ; i< this.db.lstEmpresas.length; i++){
        if(this.db.lstEmpresas[i]==null){
        this.db.lstEmpresas[i]=nuevaEmpresa;
        respuesta=true;
        break;
        }
    
    }
    
    return respuesta;

    
    }

    public void Imprimir(){
      
        System.out.println("///////////////////////////////////////////");
        
        
        for(int i=1; i < this.db.lstEmpresas.length ; i++){
        if(this.db.lstEmpresas[i] != null){
            
            
            
            System.out.println("NIT Empresa :"+this.db.lstEmpresas[i].nit);
            System.out.println("Razon Social Empresa :"+ this.db.lstEmpresas[i].getRazonSocial());
            System.out.println("Telefono  Empresa :"+ this.db.lstEmpresas[i].getTelefono());
            System.out.println("Actividad Empresa :"+ this.db.lstEmpresas[i].getActividad());
        
        }
        }
        
        System.out.println("-----//-----------------//-----------//-------");
    
    }
       
    
    
    
    
    
    
  
    
    
    
    
    
}
