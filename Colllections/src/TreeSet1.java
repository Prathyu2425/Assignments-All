
     import java.util.*;
import java.util.TreeSet;
     class TreeSet2
    {    int id;
        String name;
        String Department;
        int salary;
        public TreeSet2(int id, String name, String Department, int salary)


        {
            this.id=id;
            this.name=name;
            this.Department=Department;
            this.salary=salary;
        }

        public String toString()
        {
            return "Treeset{" +"id="+id+   ",name='"+name+'\''+  ",salary="+salary+     " , Department='"+Department+  "}";

        }
    }

    class  Sortbyid implements Comparator<TreeSet2>
    {
        public int compare(TreeSet2  a,TreeSet2 b) { return a.id-b.id;}

    }


    class  Sortbysalary implements Comparator<TreeSet2>
    {    public int compare(TreeSet2 a,TreeSet2 b) { return a.salary-b.salary;}

    }
    class sortbyDepartment implements Comparator
    {
        public int compare(Object str1 , Object str2)
        {
            String i1 =str1.toString();
            String i2 =str2.toString();
            return i2.compareTo(i2);
        }

    }
    class Sortbyname implements Comparator

    {    public int compare(Object str1,Object str2)

    {
        String i1=str1.toString();
        String i2=str2.toString();
        return i2.compareTo(i2);

    }
    }


      public class TreeSet1 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            TreeSet2 t1 = new TreeSet2(1, "a", "B", 10000);
            TreeSet2 t2 = new TreeSet2(2, "b", "c", 20000);
            TreeSet2 t3 = new TreeSet2(3, "c", "a", 30000);
            TreeSet2 t4 = new TreeSet2(4, "d", "j", 40000);
            TreeSet2 t5 = new TreeSet2(5, "e", "k", 50000);
            TreeSet2 t6 = new TreeSet2(6, "f", "l", 60000);
            TreeSet2 t7 = new TreeSet2(7, "g", "m", 70000);
            TreeSet2 t8 = new TreeSet2(8, "h", "n", 80000);

            TreeSet2 t9 = new TreeSet2(9, "i", "o", 90000);
            TreeSet2 t10 = new TreeSet2(10, "j", "p", 100000);
            System.out.println("choose 1 for name/n choose 2 for department /n choose 3 for salary/n choose 4 for id");
            int choose = s.nextInt();
            switch (choose) {
                case 1:
                    TreeSet<TreeSet2> s1 = new TreeSet<>(new Sortbyid());
                    s1.add(t1);
                    s1.add(t2);
                    s1.add(t3);
                    s1.add(t4);
                    s1.add(t5);
                    s1.add(t6);
                    s1.add(t7);
                    s1.add(t8);
                    s1.add(t9);
                    s1.add(t10);
                    System.out.println(s1);
                    break;
                    case 2:
                    TreeSet<TreeSet2> s2 = new TreeSet<>(new Sortbysalary());
                    s2.add(t1);

                    s2.add(t2);
                    s2.add(t3);
                    s2.add(t4);
                    s2.add(t5);

                    s2.add(t6);
                    s2.add(t7);
                    s2.add(t8);
                    s2.add(t9);
                    s2.add(t10);
                    System.out.println(s2);
                    break;

                case 3:

                    TreeSet<TreeSet2> s3 = new TreeSet<>(new Sortbyname());
                    s3.add(t1);
                    s3.add(t2);
                    s3.add(t3);
                    s3.add(t4);
                    s3.add(t5);
                    s3.add(t6);
                    s3.add(t7);
                    s3.add(t8);
                    s3.add(t9);
                    s3.add(t10);
                    System.out.println(s3);
                    break;
            }
        }
    }
