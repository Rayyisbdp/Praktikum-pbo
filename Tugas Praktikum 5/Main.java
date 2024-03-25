/*Nama    : Muhammad Rayyis Budi Prasetyo
Deskripsi : Program untuk menjalankan Abstraksi dan Interface
Nim       : 24060122140112 */

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan
        Registration accountRegistration = new AccountRegistration();
        accountRegistration.registerAccount("john_doe", "John Doe", "123456789", "john@example.com", "password123");

        Registration googleRegistration = new GoogleRegistration();
        googleRegistration.registerAccount("", "", "", "pboa1@gmail.com", "");

        Registration facebookRegistration = new FacebookRegistration();
        facebookRegistration.registerAccount("", "", "", "", "");

        Registration appleRegistration = new AppleRegistration();
        appleRegistration.registerAccount("", "", "", "", "");
    }
}
