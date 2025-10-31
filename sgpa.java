import java.util.*;

class calsgpa {
    public void calculatesgpa() {
        int scg = 0, scr = 0, n;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the total Number of Subjects:");
        n = s.nextInt();

        int cr[] = new int[n];
        int gp[] = new int[n];
        String sub[] = new String[n];

        System.out.println("Enter The Subjects, their Credit and Grade points scored:");
        for (int i = 0; i < n; i++) {
            sub[i] = s.next(); // subject name
            cr[i] = s.nextInt(); // subject credit
            gp[i] = s.nextInt(); // grade point

            scr += cr[i]; // sum of credits
            scg += cr[i] * gp[i]; // sum of (credit × grade point)
        }

        double sgp = (double) scg / scr; 
        System.out.println("Your SGPA = " + sgp);
    }
}

class sgpa {
    public static void main(String[] args) {
        calsgpa b = new calsgpa();
        b.calculatesgpa();
    }
}