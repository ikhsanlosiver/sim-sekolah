package tugasll;

class Node {
    //deklarasi variabel 
    Node next;
    String nama;
    String alamat;
    String nohp;
    float ipk;
    String moto;
}

class linglis{
    //deklarasi node 
    Node head;
    
    //Method untuk memasukkan nilai 
    public void insert(String nama,String alamat,String hp,float ipk,String moto){
    Node node = new Node();
    node.nama=nama;
    node.alamat=alamat;
    node.nohp=hp;
    node.ipk=ipk;
    node.moto=moto;
    //Menunjukkan bahwa head yang lama merupakan nilai
    //next pada head yang baru
    //agar nilai node yang baru memiliki alamat untuk 
    //menunjuk pada node selanjutnya
    node.next=head;
    //Menunjukkan bahwa nilai node sekarang merupakan head
    head=node;
    }
    
    //Method menampilkan data pada masing - masing Node
    public void show(){
    Node node=head; 
    int i=0;
    //Proses perulangan untuk menampilkan nilai data pada masing - masing Node
    while(node.next!=null)
    {
        System.out.println("Mahasiswa ke-"+(i+1)+"\n"+
            "Nama       : "+node.nama+"\nAlamat     : "+node.alamat+"\nNo HP      : "+node.nohp+
            "\nIPK        : "+node.ipk+"\nMoto hidup : "+node.moto);
        node=node.next;
        i++;
    }
    //Khusus untuk menampilkan data pada Node terakhir
    System.out.println("Mahasiswa ke-"+(i+1)+"\n"+
            "Nama       : "+node.nama+"\nAlamat     : "+node.alamat+"\nNo HP      : "+node.nohp+
            "\nIPK        : "+node.ipk+"\nMoto hidup : "+node.moto);
    
    }
} 

public class TugasLL {
    public static void main(String[] args) {
        //membuat object list
        linglis list = new linglis();
        //memasukkan nilai masing - masing node
        list.insert("alfan suffa pramana", "dasan sari", "+6282340887412", 3.2f, "jangan mengulangi kesalahan yang sama karena keslahan lain masih ada");
        list.insert("Ibzani ilham sugianto", "Ampenan", "+6287865965119", 3.4f, "kalau orang lain bisa mengapa harus kita");
        list.insert("satria karara", "karang pule", "+6287865776843", 3.01f, "jangan kebanyakan bacod hidup kalian masih misqueeen");
        list.show();
    }
}
