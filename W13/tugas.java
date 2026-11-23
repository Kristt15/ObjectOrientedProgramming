class Pegawai {
    protected String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void infoTugas() {
        System.out.println(nama + " mengerjakan tugas umum pegawai");
    }
}

class Manajer extends Pegawai {
    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void infoTugas() {
        System.out.println(nama + " memimpin tim dan membuat laporan");
    }

    public void rapat() {
        System.out.println(nama + " mengadakan rapat tim");
    }
}

class Kurir extends Pegawai {
    public Kurir(String nama) {
        super(nama);
    }

    @Override
    public void infoTugas() {
        System.out.println(nama + " mengantar paket");
    }

    public void antarPaket() {
        System.out.println(nama + " sedang dalam perjalanan mengantar paket");
    }
}

public class Tugas {
    // Polymorphic argument: parameter bertipe Pegawai,
    // bisa menerima Manajer, Kurir, atau Pegawai biasa
    public static void proses(Pegawai peg) {
        peg.infoTugas();                 // VMI: versi subclass yang jalan

        if (peg instanceof Manajer) {
            Manajer man = (Manajer) peg; // casting ke tipe asal
            man.rapat();                 // method khusus Manajer
        } else if (peg instanceof Kurir) {
            Kurir kur = (Kurir) peg;
            kur.antarPaket();            // method khusus Kurir
        } else {
            System.out.println("Tidak ada tugas khusus");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Manajer man = new Manajer("Agus");
        Kurir kur = new Kurir("Budi");
        Pegawai peg = new Pegawai("Citra");

        proses(man);
        proses(kur);
        proses(peg);
    }
}