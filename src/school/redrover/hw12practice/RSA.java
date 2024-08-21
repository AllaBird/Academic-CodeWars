package school.redrover.hw12practice;

public class RSA implements Encryptable{
    @Override
    public String encrypt(String data) {
        String encryptedData =data;
        encryptedData = encryptedData.replace("a", "&");


        return encryptedData;
    }

    @Override
    public String decrypt(String encryptedData) {
        String descryptedData=encryptedData;

        descryptedData=descryptedData.replace("&","a");

            return descryptedData;

        }
    }

