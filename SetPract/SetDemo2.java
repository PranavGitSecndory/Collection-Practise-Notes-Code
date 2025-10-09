package SetPract;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class EmployeeData1 {
    int id;
    String name;
    static boolean useOverride = true; //  toggle this to true/false

    public EmployeeData1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        if (!useOverride) {
            // default behavior: acts like Object.hashCode()
            return System.identityHashCode(this);
        }
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!useOverride) {
            // default behavior: reference equality only
            return this == obj;
        }
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EmployeeData1 that = (EmployeeData1) obj;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "\nID: " + id + ", Name: " + name;
    }
}

public class SetDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Set<EmployeeData1> setWithout = new HashSet<>();
        Set<EmployeeData1> setWith = new HashSet<>();

        //  Thread 1 
        Thread t1 = new Thread(() -> {
            EmployeeData1.useOverride = false;
            for (int i = 0; i < 3; i++) {
                setWithout.add(new EmployeeData1(4, "niraj"));
            }
            System.out.println("Thread 1 done (no override)");
        });

        //  Thread 2 
        Thread t2 = new Thread(() -> {
            EmployeeData1.useOverride = true;
            for (int i = 0; i < 3; i++) {
                setWith.add(new EmployeeData1(4, "niraj"));
            }
            System.out.println("Thread 2 done (with override)");
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\n--- Without equals/hashCode ---");
        System.out.println(setWithout);

        System.out.println("\n--- With equals/hashCode ---");
        System.out.println(setWith);
    }
}

