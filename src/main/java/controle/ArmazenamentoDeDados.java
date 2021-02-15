package controle;

import objetos.Animais;
import java.util.ArrayList;

public class ArmazenamentoDeDados {
    //singleton:permite criar objetos únicos para os quais há apenas uma instância
    
    private static ArmazenamentoDeDados instance;
    private ArrayList<Animais> animaisCadastrados;
    
    private ArmazenamentoDeDados(){
        animaisCadastrados = new ArrayList<Animais>();
    }
    
    public static ArmazenamentoDeDados getInstance(){
        if (instance==null){
            instance = new ArmazenamentoDeDados();
        }
        return instance;
    }
    
    public void cadastrarAnimal(Animais novoAnimal){
        animaisCadastrados.add(novoAnimal);
    }
    public ArrayList<Animais> animaisCadastrados(){
        return animaisCadastrados;
    }
}
