package Latihan;

public class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {
        super();
    }

    public Dosen(String username, String password) {
        super(username, password);
    }

    public Dosen(String id, String phone, String username, String password,
                 String pangkat, String golongan, String key) {
        super(id, phone, username, password);
        this.pangkat = pangkat;
        this.golongan = golongan;
        this.key = key;
    }

    // Login dengan username ATAU nomor telepon + key
    public boolean login(String usernameOrPhone, String password, String key) {
        return super.login(usernameOrPhone, password)
                && this.key != null && this.key.equals(key);
    }
}

// package Latihan;

// public class Dosen extends User {
//     private String pangkat;
//     private String golongan;
//     private String key;

//     public Dosen() {
//         super();
//     }

//     public Dosen(String username, String password) {
//         super(username, password);
//     }

//     public String getPangkat() { return pangkat; }
//     public void setPangkat(String pangkat) { this.pangkat = pangkat; }

//     public String getGolongan() { return golongan; }
//     public void setGolongan(String golongan) { this.golongan = golongan; }

//     public String getKey() { return key; }
//     public void setKey(String key) { this.key = key; }

//     // Login dengan username ATAU nomor telepon + key
//     public boolean login(String usernameOrPhone, String password, String key) {
//         return super.login(usernameOrPhone, password)
//                 && this.key != null && this.key.equals(key);
//     }
// }

// // package Latihan;

// // public class Dosen extends User {
// //     private String pangkat;
// //     private String golongan;
// //     private String key;

// //     public Dosen() {
// //         super();
// //     }

// //     public Dosen(String username, String password) {
// //         super(username, password);
// //     }

// //     public String getPangkat() { return pangkat; }
// //     public void setPangkat(String pangkat) { this.pangkat = pangkat; }

// //     public String getGolongan() { return golongan; }
// //     public void setGolongan(String golongan) { this.golongan = golongan; }

// //     public String getKey() { return key; }
// //     public void setKey(String key) { this.key = key; }

// //     // Login dengan username + key
// //     public boolean loginByUsername(String username, String password, String key) {
// //         return super.loginByUsername(username, password)
// //                 && this.key != null && this.key.equals(key);
// //     }

// //     // Login dengan nomor telepon + key
// //     public boolean loginByPhone(String phone, String password, String key) {
// //         return super.loginByPhone(phone, password)
// //                 && this.key != null && this.key.equals(key);
// //     }
// // }