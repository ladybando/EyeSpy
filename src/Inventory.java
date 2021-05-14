public class Inventory {

    public static Phones[] createSmart() {
        //creates new phones
        Phones smart = new Phones("Samsung", "Note 10", "Android",
                10, 8, 949.99, 3500, "4G", "Midnight Black", true, 1);
        Phones basic = new Phones("LG", "Chocolate", 2, 2, 129.99, 1000, true, 4);
        Phones basic_0 = new Phones("Samsung", "The Flip", 3, 2, 179.99, 1000, true, 4);

        //adds phones to stock array
        Phones[] stock;
        for (Phones phones : stock = new Phones[]{smart, basic,basic_0}) {
         return new Phones[]{phones,basic,basic_0,basic_0, basic,phones};
        }
      return stock;
    }
}
