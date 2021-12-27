package exInterfaces;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println("Hello Maman 14 EX1");
        System.out.println("--------------------------------------------------------------------------------");

        Siswa s1 = new Siswa("Srul", "Heiblum", "2", "27.09.88");
        Siswa s2 = new Siswa("Leo", "Igel", "3", "01.10.88");
        Siswa s3 = new Siswa("Inbal", "Oved", "4", "08.01.89");
        Siswa s4 = new Siswa("Dudu", "Topaz", "1", "22.01.75");
        Siswa[] students = {s1, s2, s3, s4};

        String[] phones = {"0525", "0523", "0503", "050555"};

        Association<Siswa, String> associationTable = new Association<>(students, phones);

        Siswa s5 = new Siswa("Tal", "Mosseri", "5", "22.08.81");
        associationTable.add(s5, "0506666666"); 

        for (Siswa student : associationTable) { 
            System.out.println(student);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(associationTable.get(s1));
        associationTable.add(s1, "0525322167");
        System.out.println(associationTable.get(s1));

        associationTable.remove(s2);
        System.out.println("--------------------------------------------------------------------------------");

        for (Siswa student : associationTable) {
            System.out.println(student);
        }
    }
}


