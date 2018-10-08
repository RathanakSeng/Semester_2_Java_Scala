import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Set batch4 = new TreeSet<Student>();

        batch4.add(new Student(1113, "Nyratt", 4));
        batch4.add(new Student(1115, "Luhen", 4));
        batch4.add(new Student(1112, "Dara", 4));
        batch4.add(new Student(1111, "Rathanak", 4));
        batch4.add(new Student(1114, "Monyvorn", 4));

        List batch3 = new LinkedList<Student>();

        batch3.add(new Student(1102, "Rithsak", 3));
        batch3.add(new Student(1105, "Soksan", 3));
        batch3.add(new Student(1101, "Saman", 3));
        batch3.add(new Student(1104, "Danei", 3));
        batch3.add(new Student(1103, "Lyhov", 3));

        Collections.sort(batch3, new Sorting());

        Map school = new HashMap<Integer, Object>();

        school.put(1, batch3);
        school.put(2, batch4);

        batch4.forEach(student -> System.out.println(student));

        school.forEach
                (
                (key, value) ->
                    System.out.println(key + " : " + value)
        );
    }
}
