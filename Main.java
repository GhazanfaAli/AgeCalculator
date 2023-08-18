import java.time.Period;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Person{
    String name;
    Period age;
    Person(String name, Period age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;
    }
    Period getAge(){
        return age;
    }

}

class Main{
    public static void main(String[] args) {
        ArrayList<Person> person_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter your name or type to exit:\n");
            String name = sc.next();
            if(name.equals("exit")){
                break;
            }
            System.out.println("Enter your birth year: ");
            int year = sc.nextInt();
            System.out.println("Enter your birth month: ");
            int month = sc.nextInt();
            System.out.println("Enter your birth day: ");
            int day = sc.nextInt();
            LocalDate current_date = LocalDate.now();
            LocalDate birth_date = LocalDate.of(year, month, day);
            Period calc_age = Period.between(birth_date, current_date);
            Person person = new Person(name, calc_age);
            person_list.add(person);

        }
        System.out.println("\n--------------------------------");
        System.out.println("Age entered:");

        for (int i = 0; i<person_list.size(); i++){
            Person person = person_list.get(i);

            System.out.println("Name : "+person.getName());
            System.out.println("Years : "+person.getAge().getYears());
            System.out.println("Months : "+person.getAge().getMonths());
            System.out.println("Days : "+person.getAge().getDays());
            System.out.println("--------------------------------");
        }

    }
}