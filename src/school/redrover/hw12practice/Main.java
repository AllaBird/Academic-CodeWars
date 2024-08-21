package school.redrover.hw12practice;

public class Main {
    public static void main(String[] args) {
     RSA rsa = new RSA();
        System.out.println(rsa.encrypt("alla"));
        System.out.println(rsa.decrypt("&ll&"));

        AES aes = new AES();
        System.out.println(aes.encrypt("alla"));
        System.out.println(aes.decrypt("@ll@"));

    }
}
