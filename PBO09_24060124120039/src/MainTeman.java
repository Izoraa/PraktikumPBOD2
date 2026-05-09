public class MainTeman {
    public static void main(String[] args) {
        Teman<String> t = new Teman();

        t.addNama("Hasta");
        t.addNama("Isan");
        t.addNama("Marchel");
        t.addNama("Dinda");
        t.addNama("Elza");
        t.addNama("Ferdy");
        t.addNama("Caesar");
        t.addNama("Ghatfan");
        t.addNama("Devano");
        t.addNama("Lutfi");
        t.addNama("Menza");
        t.addNama("Basil");
        t.addNama("Azka");
        t.addNama("Ali");
        t.addNama("Atta");
        t.addNama("Naufal");
        t.addNama("Bayu");
        t.addNama("Andhika");
        t.addNama("Novelya");

        t.showTeman();

        System.out.println(t.getNbelm());
        System.out.println(t.getNama(1));

        t.setNama(1, "Ijat");
        t.showTeman();

        System.out.println("Apakah nama Hasta ada :");
        System.out.println(t.isMember("Hasta"));
        System.out.println("Ada Berapa Nama Isan : ");
        System.out.println(t.countNama("Isan"));

        t.gantiNama("Hasta", "Wildan");
        t.showTeman();

        System.out.println("Hapus nama : ");
        t.delNama("Isan");
        t.showTeman();
    }
}
