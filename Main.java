import java.util.Random;
class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    public int tax(int salary) {
        int a;
        if (salary < 1000) {
            a = 0;
        } else {
            a = 1000 * 3 / 100;
        }
        return a;
    }

    public int raiseSalary(int hireYear, int salary) {
        int b = 2022 - hireYear, newsalary = 0;
        if (b <= 9) {
            newsalary = salary * 5 / 100;
        }
        if (b >= 10 && b <= 19) {
            newsalary = salary * 10 / 100;
        }
        if (b >= 20) {
            newsalary = salary * 15 / 100;
        }
        return newsalary;
    }

    public int bonus(int workHours) {
        int bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        } else {
            bonus = 0;
        }
        return bonus;
    }
}

class yazdırma{
    Employee emp;
    public yazdırma(Employee emp)
    {
        this.emp=emp;
    }
    public void tostring()
    {
        System.out.println("Adı : " +emp.name);
        System.out.println("Maaşı : " +emp.salary);
        System.out.println("Çalışma Saati : " +emp.workHours);
        System.out.println("Başlangıç : " +emp.hireYear);
        System.out.println("Vergi : " +emp.tax(emp.salary));
        System.out.println("Maaş Artışı : " +emp.raiseSalary(emp.hireYear,emp.salary));
        System.out.println("Vergi ve Bonuslarla Maaş : " +(emp.salary+emp.bonus(emp.workHours)-emp.tax(emp.salary)));
        System.out.println("Toplam Maaş : " +(emp.salary+emp.raiseSalary(emp.hireYear, emp.salary)));
    }
}

public class Main {
    public static void main(String[] args)
    {
       Employee emp = new Employee("Zeynep" , 2500,38, 2019);
       yazdırma r = new yazdırma(emp);
       r.tostring();
    }
}