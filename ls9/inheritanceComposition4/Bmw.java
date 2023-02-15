package inheritanceComposition4;

public class Bmw extends Car{

    String modifie;





    public Bmw(String name, String years, String mator, String modifie, Detallar detallar,String bmwmator) {
        super(name, years, mator,detallar);
        this.modifie = modifie;
        this.detallar.bmwMator = bmwmator;
        //cllas daxiline clasi extent etdikde mecburuq ki extend elediyimiz clasin canstraktrin bu clasdada yazaq ,
        // ama clas ici clas olduqda yanliq konstraktora clas adini tip   kimi daxil edirik verilen canstraktirdan asili olmur

    }
}

