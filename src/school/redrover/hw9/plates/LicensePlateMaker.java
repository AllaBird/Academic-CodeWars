package school.redrover.hw9.plates;

public class LicensePlateMaker {
    private String prefix;

    public LicensePlateMaker(String prefix,int lastUsedNumber) {
        this.prefix = prefix;
        this.lastUsedNumber= lastUsedNumber;
    }

    private int lastUsedNumber;
    public LicensePlate makeNextPlate(){
        int nextNumber = lastUsedNumber+1;
        lastUsedNumber=nextNumber;
        return new LicensePlate(prefix + "-" + nextNumber);
    }
}
