package Latihan;

public class TestLogin {
    public static void main(String[] args) {
        Dosen fahrul = new Dosen("D001", "081234567890", "fahrul", "123456",
                "Lektor", "III/c", "19990129");

        Mahasiswa fadilah = new Mahasiswa("M001", "083853501388", "fadilah", "123456", fahrul, "2A");

        boolean result = fadilah.login("083853501388", "123456");
        System.out.println(result ? "Login berhasil" : "Login gagal");

        result = fahrul.login("fahrul", "123456", "19990129");
        System.out.println(result ? "Login berhasil" : "Login gagal");
    }
}

// package Latihan;

// public class TestLogin {
//     public static void main(String[] args) {
//         Mahasiswa fadilah = new Mahasiswa();
//         fadilah.setUsername("fadilah");
//         fadilah.setPassword("123456");
//         fadilah.setPhone("083853501388");
//         boolean result = fadilah.login("083853501388", "123456");
//         System.out.println(result ? "Login berhasil" : "Login gagal");

//         Dosen fahrul = new Dosen("fahrul", "123456");
//         fahrul.setKey("19990129");
//         result = fahrul.login("fahrul", "123456", "19990129");
//         System.out.println(result ? "Login berhasil" : "Login gagal");
//     }
// }