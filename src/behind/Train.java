package behind;

import java.util.ArrayList;
import java.util.List;

public class Train {
    //static List<Wagon> train=new ArrayList<>();
    static List<Wagonn> train=new ArrayList<>();
    //static List<Boogie> train = new ArrayList<>();

    public static void main(String[] args) {
    //Train() {
        Boogie one=new Boogie(18,"2A",0, 3);
        System.out.println(one);
        //one.
        train.add(one);
        train.add(new FirstClass(1));
        train.add(new SecondClass(2));
        train.add(new SecondClass(3));
        train.add(new ThirdClass(4));
        train.add(new ThirdClass(5));
        train.add(new ThirdClass(6));
        train.add(new Sleeper(7));
        train.add(new Sleeper(8));
        train.add(new Sleeper(9));
        train.add(new Sleeper(10));
        train.add(new Sleeper(11));
        System.out.println(train.get(0));
        //train.get(0)
        /*Boogie one=new Boogie( 1,"1A",10,2);
        train.add(one);
        train.add(new Boogie( 2,"2A",10,3));
        train.add(new Boogie( 3,"2A",10,3));
        train.add(new Boogie( 4,"3A",10,4));
        train.add(new Boogie( 5,"3A",10,4));
        train.add(new Boogie( 6,"3A",10,4));
        //train.add(new Pantry());
        train.add(new Boogie( 8,"SL",18,4));
        System.out.println(train.get(1));*/
        //train.get(1);

        /*train.add(new Boogie( 9,"SL",18,4));
        train.add(new Boogie( 10,"SL",18,4));
        train.add(new Boogie( 11,"SL",18,4));
        train.add(new Boogie( 12,"SL",18,4));
        train.add(new Boogie( 13,"SL",18,4));
        train.add(new Boogie( 14,"SL",18,4));
        train.add(new Boogie( 15,"SL",18,4));
        Boogie boogie=new Boogie(1,"2A",18,4);*/
    }
/*
    boolean booking(String tire, int noOfSeats) {
        ListIterator<Boogie> listIterator = train.listIterator();
        try {
            //throw new NetworkIssue();
            while (listIterator.hasNext()) {
                Boogie boogie = listIterator.next();
                if (boogie.availableSeats > noOfSeats) {
                    boogie.bookSeats(noOfSeats);
                    break;
                }
            }
            throw new NetworkIssue();

            //return true;
        } catch (BoogieRemovedDueToMaintenance e) {
            //
        }catch (NetworkIssue e) {
            System.out.println(e.toString());
            return false;
        }
    }*/
}

class Student {
    int roll;

    Student(int roll) {
        this.roll = roll;
    }
}

class Class {
    List<Student> students;

    Class() {
        students = new ArrayList<>();
    }

    void addingStudents() {
        students.add(new Student(1));
        students.add(new Student(2));
    }
}

class College {
    static List<Class> classes = new ArrayList<>();

    public static void main(String[] args) {
        classes.add(new Class());
        classes.add(new Class());
        classes.add(new Class());
        classes.get(1).students.get(1);
    }
}