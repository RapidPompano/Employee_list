import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Emp emp1 =  new Emp();

        Emp emp2 = new Emp();

        List<Emp> myEmplist = new ArrayList<Emp>();

        emp1.setName("name_1");
        emp1.setEmp_id("ab123");

        emp2.setName("name_2");
        emp2.setEmp_id("bc345");

        myEmplist.add(emp1);
        myEmplist.add(emp2);

        for (Emp e : myEmplist)
        {
            System.out.println(e.getName());
            System.out.println(e.getEmp_id());
        }
    }    
}
