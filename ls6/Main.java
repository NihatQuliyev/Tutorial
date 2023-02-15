
public class Main {

    public  static void main(String[] args) {
        //Employee

        Employee emp = new Employee();
        emp.id = 1;
        emp.fullName = "Nihat";
        emp.position = "Devoloper";
        emp.company = "Div academy";
        emp.salary = 1000;
        emp.department = "A";
        //System.out.println(emp.emplo());

        // Circl

        Circle circ = new Circle();
        circ.radius = 5 ;
        //System.out.println(circ.circle());

        //Area
        Area ar = new Area();
        //System.out.println(ar.area(5,6));

        //Math
        Math topla = new Math();
        System.out.println(topla.topla(5,10));

        Math cixma = new Math();
        System.out.println(cixma.cixma(10,5));

        Math vurma = new Math();
        System.out.println(vurma.vur(5,10));

        Math bolme = new Math();
        System.out.println(bolme.bolme(8,4));

        Math ustluQuvet = new Math();
        System.out.println(ustluQuvet.ustluQuvet(2,3));

        Math factorial = new Math();
        System.out.println(factorial.factorial(5));

        Array max = new Array();
        System.out.println(max.max(50,20,30));

        Array min = new Array();
        System.out.println( min.min(5,0,1));

        Array element =new Array();
        System.out.println(element.element(3));

        Array index = new Array();
        System.out.println(index.index(15));

        Array remove = new Array();
        System.out.println(remove.removed(1));

        Array contains =new Array();
        System.out.println(contains.axarisContains());






    }




}
