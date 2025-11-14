class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class WrongSonAge extends Exception {
    public WrongSonAge(String message) {
        super(message);
    }
}

class Father {
    int fatherAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        this.fatherAge = age;
        System.out.println("Father's age: " + fatherAge);
    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge, WrongSonAge {
        super(fatherAge);
        
        if (sonAge >= fatherAge) {
            throw new WrongSonAge("Son's age must be less than father's age!");
        }
        if (sonAge < 0) {
            throw new WrongSonAge("Son's age cannot be negative!");
        }

        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}

public class fatherson {
    public static void main(String[] args) {
        try {
            Son s = new Son(40, 15);  // valid example
            // Son s = new Son(40, 45); // would throw WrongSonAge
            // Son s = new Son(-5, 10); // would throw WrongAge
        }
        catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (WrongSonAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
