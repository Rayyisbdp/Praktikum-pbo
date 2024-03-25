/*Nama    : Muhammad Rayyis Budi Prasetyo
Deskripsi : Program untuk menjalankan Abstraksi dan Interface
Nim       : 24060122140112 */

class AppleRegistration implements Registration {
    @Override
    public void registerAccount(String username, String name, String phone_number, String email, String password) {
        System.out.println("Registrasi melalui Apple berhasil!");
    }
}
