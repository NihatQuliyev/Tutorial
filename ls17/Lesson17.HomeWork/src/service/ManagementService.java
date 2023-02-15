package service;
import static util.MenuUtil.entryApp;
import static service.TranslationService.*;
public class ManagementService {
    public void management(){
        byte option = entryApp();
        switch (option){
            case 1 :
                en();
                break;
            case 2 :
                az();
                break;
            case 3:
                System.exit(-1);
                break;
            default:
                System.out.println("No option");
        }


    }
}
