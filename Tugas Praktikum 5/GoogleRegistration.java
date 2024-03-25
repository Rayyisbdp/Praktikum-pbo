/*Nama    : Muhammad Rayyis Budi Prasetyo
Deskripsi : Program untuk menjalankan Abstraksi dan Interface
Nim       : 24060122140112 */

class GoogleRegistration implements Registration {
    @Override
    public void registerAccount(String username, String name, String phone_number, String email, String password) {
        if (email.equals("pboa1@gmail.com")) {
            System.out.println("Registrasi melalui Google berhasil!");
        } else {
            System.out.println("Registrasi melalui Google gagal! Email tidak valid.");
        }
    }
}
