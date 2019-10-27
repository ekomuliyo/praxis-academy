public class MyWildcardEx{
    public static void main(String[] args) {
        MyEmployeeUtil<CompAEmp> empA = new MyEmployeeUtil<CompAEmp>(new CompAEmp("andi", 2000));
        MyEmployeeUtil<CompBEmp> empB = new MyEmployeeUtil<CompBEmp>(new CompBEmp("tifo", 4000));
        MyEmployeeUtil<CompAEmp> empC = new MyEmployeeUtil<CompAEmp>(new CompAEmp("rudi", 2000));
        
        System.out.println("Is salary same? between " + empA.getName() + " with " + empB.getName() + " "  + empA.isSalaryEqual(empB));
        System.out.println("Is salary same? " + empB.getName() + " with " + empA.getName() + " " + empB.isSalaryEqual(empA));
        System.out.println("Is salary same? " + empA.getName() + " with " + empC.getName() + " " + empA.isSalaryEqual(empC));
    }
}

class MyEmployeeUtil<T extends Emp>{
    private T emp;

    public MyEmployeeUtil(T obj){
        emp = obj;
    }

    public int getSalary(){
        return emp.getSalary();
    }

    public String getName(){
        return emp.getName();
    }

    public boolean isSalaryEqual(MyEmployeeUtil<?> otherEmp){
        if(emp.getSalary() == otherEmp.getSalary()){
            return true;
        }
        return false;
    }
}

class Emp{
    private String name;
    private int salary;

    public Emp(String name, int sal){
        this.name = name;
        this.salary = sal;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int sal){
        this.salary = sal;
    }
}

class CompAEmp extends Emp{
    
    public CompAEmp(String nm, int sal){
        super(nm, sal);
    }
}

class CompBEmp extends Emp{

    public CompBEmp(String nm, int sal){
        super(nm, sal);
    }
}