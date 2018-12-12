public class Student {
    public int IDnumber;
    public String name;
    Student (int id, String n) {
        IDnumber = id;
        name = n;
    }
    public String toString() {
        return IDnumber + " " + name;
    }
}


public class Main {
    public static void Sort(Student[] id, int left, int right){
        int l = left;
        int r = right;
        int piv = id[(l + r) / 2].IDnumber;
        while (l <= r)
        {
            while (id[l].IDnumber < piv)
                l++;
            while (id[r].IDnumber > piv)
                r--;
            if (l <= r) {
                int a = id[l].IDnumber;
                id[l].IDnumber = id[r].IDnumber;
                id[r].IDnumber = a;
                 l++;
                 r--;
            }
        }
        if (left < r)
            Sort (id, left, r);
        if (right > l)
            Sort (id, l, right);
    }

    public static void main(String[] args) {
        Student mass[] = new Student [8];
        mass[0] = new Student(5, "Peter");
        mass[1] = new Student(6, "Charlie");
        mass[2] = new Student(1, "John");
        mass[3] = new Student(8, "Garry");
        mass[4] = new Student(7, "Genry");
        mass[5] = new Student(4, "Dan");
        mass[6] = new Student(2, "Bob");
        mass[7] = new Student(3, "Dwite");
        for (int i = 0;i < 8;i++) {
            System.out.println(mass[i] + " ");
        }
        System.out.println;
        Sort (mass, 0, 7);
        for (int i = 0; i<10; i++) {
            System.out.println(mass[i] + " ");
        }
    }
}
