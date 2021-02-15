package controle;

import objetos.Animais;

public class ControleCadastro {
    
    public boolean cadastrarAnimais (Animais NovoAnimal){
        boolean result = false;
        if (NovoAnimal!=null && NovoAnimal.getDescricao().length()>0 && NovoAnimal.getEspecie().length()>0 
                &&NovoAnimal.getNumId().length()>0 &&NovoAnimal.getPorte().length()>0 ){
            ArmazenamentoDeDados.getInstance().cadastrarAnimal(NovoAnimal);
            result = true;
        }
        
        return result;
    }
    
}
