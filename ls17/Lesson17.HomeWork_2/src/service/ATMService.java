package service;

import globalData.GlobalDATA;
import model.Customer;

import java.util.HashMap;
import java.util.Map;
import static util.InputUtil.*;
public class ATMService{
    int count = 1;
    public static void atmService(){
        int eskinazSayi = 0;
        ATMService atmService = new ATMService();
        Customer Nihat = new Customer("Nihat", 5555, 1000);
        Customer Elchin = new Customer("Elchin", 7777, 1);
        GlobalDATA globalDATA = new GlobalDATA();
        globalDATA.list.add(Nihat);
        globalDATA.list.add(Elchin);

        Map<String, Customer> map = new HashMap<>();
        map.put(Nihat.setIban("123"), Nihat);
        System.out.println(map.entrySet());
        String iban = stringInput("Enter the iban: ");
        int password = intInput("Enter the password: ");
        outerloop:
        for (int i = 0; i < globalDATA.list.size(); i++) {
            if (atmService.count < 3 && iban.equals(Nihat.getIban()) && password == (globalDATA.list.get(i).getPassword())) {
                System.out.println("Welcome - "+ globalDATA.list.get(i).getName());
                System.out.println("Hesabinzda olan mebleg: " + globalDATA.list.get(i).getMoney());
                int money = intInput("Enter the money: ");

                if ( globalDATA.list.get(i).getMoney() < money){
                    System.out.println("Meblegi duzgun daxil et");
                }else {
                    int newMoney = globalDATA.list.get(i).getMoney();
                    globalDATA.list.get(i).setMoney(newMoney-money);
                    System.out.println(globalDATA.list.get(i).getMoney());


                    while (money != 0) {
                        if (money >= 500) {
                            money -= 500;
                            globalDATA.money.add(500);
                            eskinazSayi++;

                        } else if (money >= 200) {
                            money -= 200;
                            globalDATA.money.add(200);
                            eskinazSayi++;

                        } else if (money >= 100) {
                            money -= 100;
                            globalDATA.money.add(100);
                            eskinazSayi++;

                        } else if (money >= 50) {
                            money -= 50;
                            globalDATA.money.add(50);
                            eskinazSayi++;

                        } else if (money >= 20) {
                            money -= 20;
                            globalDATA.money.add(20);
                            eskinazSayi++;

                        } else if (money >= 10) {
                            money -= 10;
                            globalDATA.money.add(10);
                            eskinazSayi++;

                        }else if (money>=10) {
                            money -= 10;
                            globalDATA.money.add(10);
                            eskinazSayi++;

                        }else if (money>=5) {
                            money -= 5;
                            globalDATA.money.add(5);
                            eskinazSayi++;

                        }else if (money>=1) {
                            money -= 1;
                            globalDATA.money.add(1);
                            eskinazSayi++;

                        }
                    }
                    System.out.println(globalDATA.money);
                    System.out.println(eskinazSayi);
                }
                break;
            } else {
                System.out.println("Wrong");
                for (int j = 0; j < 2; j++) {
                    atmService.count++;
                    String iban1 = stringInput("Enter the iban: ");
                    int password1 = intInput("Enter the password: ");
                    if (atmService.count <= 3 && iban1.equals(Nihat.getIban()) && password1 == (globalDATA.list.get(i).getPassword())) {
                        System.out.println("Nihat");
                        System.out.println("Welcome - "+ globalDATA.list.get(i).getName());
                        System.out.println("Hesabinzda olan mebleg: " + globalDATA.list.get(i).getMoney());
                        int money = intInput("Enter the money: ");
                        if ( globalDATA.list.get(i).getMoney() < money){
                            System.out.println("Meblegi duzgun daxil et");
                        }else {
                            int newMoney = globalDATA.list.get(i).getMoney();
                            globalDATA.list.get(i).setMoney(newMoney-money);
                            System.out.println(globalDATA.list.get(i).getMoney());
                            while (money != 0) {
                                if (money >= 500) {
                                    money -= 500;
                                    globalDATA.money.add(500);
                                    eskinazSayi++;

                                } else if (money >= 200) {
                                    money -= 200;
                                    globalDATA.money.add(200);
                                    eskinazSayi++;

                                } else if (money >= 100) {
                                    money -= 100;
                                    globalDATA.money.add(100);
                                    eskinazSayi++;

                                } else if (money >= 50) {
                                    money -= 50;
                                    globalDATA.money.add(50);
                                    eskinazSayi++;

                                } else if (money >= 20) {
                                    money -= 20;
                                    globalDATA.money.add(20);
                                    eskinazSayi++;

                                } else if (money >= 10) {
                                    money -= 10;
                                    globalDATA.money.add(10);
                                    eskinazSayi++;

                                }else if (money>=10) {
                                    money -= 10;
                                    globalDATA.money.add(10);
                                    eskinazSayi++;

                                }else if (money>=5) {
                                    money -= 5;
                                    globalDATA.money.add(5);
                                    eskinazSayi++;

                                }else if (money>=1) {
                                    money -= 1;
                                    globalDATA.money.add(1);
                                    eskinazSayi++;

                                }
                            }

                            System.out.println(globalDATA.money);
                            System.out.println(eskinazSayi);
                        }
                        break outerloop;

                    } else if (atmService.count < 3) {
                        System.out.println("Wrong");

                    } else {
                        break outerloop;
                    }
                }
            }
        }

    }
}


