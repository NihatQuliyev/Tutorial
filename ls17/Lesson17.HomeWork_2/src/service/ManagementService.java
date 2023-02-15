package service;
import static util.MenuUtil.entry;
import static service.ATMService.atmService;
public class ManagementService {
    public void management() {
        while (true) {
            int option = entry();
            switch (option) {
                case 1:
                    atmService();
                    break;
                case 2:
                    System.exit(-1);
            }
        }
    }
}
