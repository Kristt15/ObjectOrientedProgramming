package Latihan;

public class Mahasiswa extends User {
    private Dosen dosenWali;
    private String kelas;

    public Mahasiswa() {
        super();
    }

    public Mahasiswa(String username, String password) {
        super(username, password);
    }

    public Mahasiswa(String id, String phone, String username, String password,
                     Dosen dosenWali, String kelas) {
        super(id, phone, username, password);
        this.dosenWali = dosenWali;
        this.kelas = kelas;
    }
}

// package Latihan;

// public class Mahasiswa extends User {
//     private Dosen dosenWali;
//     private String kelas;

//     public Mahasiswa() {
//         super();
//     }

//     public Mahasiswa(String username, String password) {
//         super(username, password);
//     }

//     public Dosen getDosenWali() { return dosenWali; }
//     public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }

//     public String getKelas() { return kelas; }
//     public void setKelas(String kelas) { this.kelas = kelas; }
// }

// // package Latihan;

// // public class Mahasiswa extends User {
// //     private Dosen dosenWali;
// //     private String kelas;

// //     public Mahasiswa() {
// //         super();
// //     }

// //     public Mahasiswa(String username, String password) {
// //         super(username, password);
// //     }

// //     public Dosen getDosenWali() { return dosenWali; }
// //     public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }

// //     public String getKelas() { return kelas; }
// //     public void setKelas(String kelas) { this.kelas = kelas; }
// // }