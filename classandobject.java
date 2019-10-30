package praktikum.pbo.p1;

public class J01_ClassDanObject {

    String nama[]=new String[2];
    String nim[] =new String[2];
    
    public static void main(String[] args) {
    J01_ClassDanObject a = new J01_ClassDanObject();
    a.nama[0]="alfan suffa pramana : ";
    a.nim[0]="f1b016009";
    a.nama[1]="lalu mashar khairudi: ";
    a.nim[1]="F1B116015";
    System.out.print(a.nama[0]);
        System.out.println(a.nim[0]);
    System.out.print(a.nama[1]);
        System.out.println(a.nim[1]);
    }
}
