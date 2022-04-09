package day20_Arrays;

public class Task03_Items {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("gloves")){
                System.out.println("it has gloves in the list with " + i + " index number.");
            break;
            }
        }

        boolean ipadExists = true;
        for (String item : items) {
            if(item.equalsIgnoreCase("iPad")){
                System.out.println("Does it contain an \"iPad\" in the list? " + ipadExists);
                break;
            }
        }

        for (int i = 0; i < items.length; i++) {

            String item = items[i];
            double price = prices[i];
            int itemID = itemIDs[i];

            System.out.println(itemID + " - " + item + " - $" +price);
        }
    }
}
/*3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID*/