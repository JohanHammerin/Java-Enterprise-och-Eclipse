package se.johan.JDK21;

public class Main {
    public static void main(String[] args) {
        RecordName recordName = new RecordName("Hej");
        // Har endast 'getters'
        System.out.println(recordName.name());
        // Går ej att ändra på värdet då en record är 'static & final'
        //recordName.name("hej");


        int num = 1;
        switch (num) {
            case 1 -> System.out.println(1);
            case 10 -> System.out.println(10);
        }
    }
}
