
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("US", "XUN 5472");
        LicensePlate li5 = new LicensePlate("US", "XUV 6487");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        //System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list again
        
        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        //System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        //System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found

        VehicleRegistry registry = new VehicleRegistry();
        System.out.println("====================================");
        System.out.println(registry.get(li1)); // null
        System.out.println(registry.add(li1, "Arto")); // true
        System.out.println(registry.get(li1)); // Arto
        System.out.println(registry.add(li2, "Jürgen")); // true
        System.out.println(registry.get(li2)); // Jürgen
        System.out.println(registry.remove(li2)); // true
        System.out.println(registry.remove(li2)); // false
        System.out.println(registry.add(li3, "Jürgen")); // true
        System.out.println(registry.add(li4, "James")); // true
        System.out.println(registry.add(li5, "James")); // true
        System.out.println("====================================");
        registry.printLicensePlates();
        registry.printOwners();
    }
}