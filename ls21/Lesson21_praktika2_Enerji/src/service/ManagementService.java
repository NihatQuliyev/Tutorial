package service;
import static util.InputUtil.byteInput;
import static util.MenuUtil.entry;

public class ManagementService {
    public void manage(){
        EnergyService energyService =new EnergyService();

        while (true) {
            byte option  = entry();
            switch (option) {
                case 1:
                    energyService.incrementEnergyByMeet();
                    break;
                case 2:
                    energyService.incrementEnergyByMilk();
                    break;
                case 3:
                    energyService.showEnergy();
                    break;
                default:
                    System.out.println("Invalid option !");

            }
        }
    }
}
