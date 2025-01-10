package Array;

    public class Items {
        public static void main(String[] args) {
            // Given arrays
            String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
            double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
            int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

            // 5.2 Find the first index number of "Gloves"
            int glovesIndex = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i].equals("Gloves")) {
                    glovesIndex = i;
                    break;
                }
            }
            System.out.println("First index of \"Gloves\": " + glovesIndex);

            // 5.3 Check if "iPad" is contained in the item list
            boolean containsIpad = false;
            for (String item : items) {
                if (item.equals("iPad")) {
                    containsIpad = true;
                    break;
                }
            }
            System.out.println("\"iPad\" is in the item list: " + containsIpad);

            // 5.4 Print the report for each shopping item
            System.out.println("\nItem Report:");
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
            }
        }
    }
