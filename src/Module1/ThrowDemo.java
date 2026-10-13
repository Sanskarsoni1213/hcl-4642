
package Module1;

public class ThrowDemo {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(16);
        System.out.println("Program ended");
    }
}


assignemnet/
  readme,md               (your notes,how to run, test cases)
        .gitignore        (*.class,out/,.idea/,.vscode/)
        src/com/hel/library/
         Main.java
         model/         libraryitem,book,magzine,dvd,memeber,borrowable
         exception/      libraryexception (base),itemnotfoundexception
         repository      repository<T,ID>,Inmemoryreppository
         services/       libraryservice
         util/         serachcaches,collection,utils

part1:java basics oops
1.libraryitem is an abstract class with private fileds id,title,year and vailable. the id is generated from a static counter(starting at 1001). use a constructor with validations the title must not be blank and the year must be bw 1900 abd the current year.Throw IllegalArgumentException otherwise
2.ddeclare abstract double latefree(int dayslate)in lilbraryitem.implemnet subclasses
        -book 2.0 per day
        magazine 1.0 per day
        dvd 5.0 per day
3.create the interface borrowable with boolean isavailable(),void borrow() and void giveback(),librar
yitem implemnts it.
4.override tostring() in every calss using super.tostring() where appropiate and use stringbuilder for any report that loops over items
5. member has id,name,email and a list of borrowed items. validate the emial(contains @) use this in consructor and provide at leat one overloaded constructor.