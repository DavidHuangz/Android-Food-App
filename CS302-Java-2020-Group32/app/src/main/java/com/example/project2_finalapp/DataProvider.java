package com.example.project2_finalapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DataProvider {
    private static ArrayList<Food> Sweets = new ArrayList<>();
    private static ArrayList<Food> Savoury = new ArrayList<>();
    private static ArrayList<Food> Drinks = new ArrayList<>();

    // -------- Sweets ---------
    public static void setSweets() {
        if (Sweets.isEmpty()) {
            Sweets.add(new Food.Sweets("Marmalade", R.drawable.sweets1, R.drawable.sweets1_1, R.drawable.sweets1_2, R.drawable.sweets1_3, 2.50, "Marmalade is a fruit preserve made from the juice and peel of citrus fruits boiled with sugar and water. The well-known version is made from bitter orange, but it is also made from lemons, limes, grapefruits, mandarins, sweet oranges, bergamots, and other citrus fruits, or a combination."));
            Sweets.add(new Food.Sweets("ChocolateCoin", R.drawable.sweets2, R.drawable.sweets2_1, R.drawable.sweets2_2, R.drawable.sweets2_3, 1.00, "The word “gelt” means “money” in both Hebrew and Yiddish. Chocolate gelt are the chocolate coins that are typically given to children during Hanukkah. Jewish or not, you've probably seen the familiar mesh bags with the shiny wrappers inside. You may have even been given a few over the years."));
            Sweets.add(new Food.Sweets("WineGum", R.drawable.sweets3, R.drawable.sweets3_1, R.drawable.sweets3_2, R.drawable.sweets3_3, 2.00, "Wine gums are chewy, firm pastille-type sweets similar to gumdrops without the sugar coating, originating from the United Kingdom. All brands have their own recipes containing various sweeteners, flavourings, and colourings. "));
            Sweets.add(new Food.Sweets("EasterBunny", R.drawable.sweets4, R.drawable.sweets4_1, R.drawable.sweets4_2, R.drawable.sweets4_3, 5.00, "The Easter Bunny is a folkloric figure and symbol of Easter, depicted as a rabbit bringing Easter eggs. Originating among German Lutherans, the \"Easter Hare\" originally played the role of a judge, evaluating whether children were good or disobedient in behavior at the start of the season of Eastertide."));
            Sweets.add(new Food.Sweets("M&M", R.drawable.sweets5, R.drawable.sweets5_1, R.drawable.sweets5_2, R.drawable.sweets5_3, 1.00, "M&M's are multi-colored button-shaped chocolates, each of which has the letter \"m\" printed in lower case in white on one side, consisting of a candy shell surrounding a filling which varies depending upon the variety of M&M's."));
            Sweets.add(new Food.Sweets("CandyCane", R.drawable.sweets6, R.drawable.sweets6_1, R.drawable.sweets6_2, R.drawable.sweets6_3, 0.50, "A candy cane is a cane-shaped stick candy often associated with Christmastide, as well as Saint Nicholas Day. It is traditionally white with red stripes and flavored with peppermint, but they also come in a variety of other flavors and colors."));
            Sweets.add(new Food.Sweets("SourBelts", R.drawable.sweets7, R.drawable.sweets7_1, R.drawable.sweets7_2, R.drawable.sweets7_3, 2.00, "With thin sour straws and wide, flat sour belts, you can chew on these long and gummy candies that are coated in sour sugar one after the other."));
            Sweets.add(new Food.Sweets("GummyBears", R.drawable.sweets8, R.drawable.sweets8_1, R.drawable.sweets8_2, R.drawable.sweets8_3, 2.00, "Gummy bears are small, fruit gum candies, similar to a jelly baby in some English-speaking countries. The candy is roughly 2 cm long and shaped in the form of a bear. The gummy bear is one of many gummies, popular gelatin-based candies sold in a variety of shapes and colors"));
            Sweets.add(new Food.Sweets("GuylianBelgian", R.drawable.sweets9, R.drawable.sweets9_1, R.drawable.sweets9_2, R.drawable.sweets9_3, 7.00, "Guylian (/ˈɡiːliən/, French: [ɡiljɑ̃]) is a Belgian chocolate brand and manufacturer best known for its seashell shaped pralines. ... Guylian donates to and works with Project Seahorse to help with marine wildlife conservation and raise awareness for the charity."));
            Sweets.add(new Food.Sweets("FerreroRocher", R.drawable.sweets10, R.drawable.sweets10_1, R.drawable.sweets10_2, R.drawable.sweets10_3, 9.00, "So it's not surprising that eating a Ferrero Rocher is almost like a religious experience. Chocolate and crushed hazelnuts give way to a delicate crispy shell, which holds a glob of creamy Nutella-like chocolate."));
        }
    }

    public static ArrayList<Food> getSweets() {
        return Sweets;
    }

    // -------- Savoury ---------
    public static void setSavoury() {
        if (Savoury.isEmpty()) {
            Savoury.add(new Food.Savoury("SausageRoll", R.drawable.savoury1, R.drawable.savoury1_1, R.drawable.savoury1_2, R.drawable.savoury1_3, 1.50, "A sausage roll is a savoury pastry snack, popular in Commonwealth nations. They are sold at retail outlets and are also available from bakeries as a take-away food. A miniature version can be served as buffet or party food."));
            Savoury.add(new Food.Savoury("Pie", R.drawable.savoury2, R.drawable.savoury2_1, R.drawable.savoury2_2, R.drawable.savoury2_3, 3.00, "A pie is a baked dish which is usually made of a pastry dough casing that contains a filling of various sweet or savoury ingredients. Sweet pies may be filled with fruit, nuts, brown sugar or sweetened vegetables. Savoury pies may be filled with meat, eggs and cheese or a mixture of meat and vegetables."));
            Savoury.add(new Food.Savoury("Sandwich", R.drawable.savoury3, R.drawable.savoury3_1, R.drawable.savoury3_2, R.drawable.savoury3_3, 4.00, "A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type."));
            Savoury.add(new Food.Savoury("HamBurger", R.drawable.savoury4, R.drawable.savoury4_1, R.drawable.savoury4_2, R.drawable.savoury4_3, 8.00, "A hamburger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled."));
            Savoury.add(new Food.Savoury("HashBrown", R.drawable.savoury5, R.drawable.savoury5_1, R.drawable.savoury5_2, R.drawable.savoury5_3, 1.00, "Hash browns or hashed browns or hashbrown are a simple and popular American breakfast dish in which potatoes are pan-fried after being shredded, diced, julienned or riced, in the style of a Swiss Rösti."));
            Savoury.add(new Food.Savoury("ChickenNugget", R.drawable.savoury6, R.drawable.savoury6_1, R.drawable.savoury6_2, R.drawable.savoury6_3, 3.00, "A chicken nugget is a chicken product made from chicken meat that is breaded or battered, then deep-fried or baked. Invented in the 1950s, chicken nuggets have become a popular fast food restaurant item, as well as widely sold frozen for home use."));
            Savoury.add(new Food.Savoury("Pizza", R.drawable.savoury7, R.drawable.savoury7_1, R.drawable.savoury7_2, R.drawable.savoury7_3, 7.00, "Pizza is a savory dish of Italian origin consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients which is then baked at a high temperature, traditionally in a wood-fired oven. A small pizza is sometimes called a pizzetta."));
            Savoury.add(new Food.Savoury("MashedPotato", R.drawable.savoury8, R.drawable.savoury8_1, R.drawable.savoury8_2, R.drawable.savoury8_3, 3.50, "Mashed potato or mashed potatoes, colloquially known as mash, is a dish prepared by mashing boiled potatoes. Milk, butter, salt and pepper are frequently used in preparation. The dish is usually a side dish to meat or vegetables. A similar dish not mashed to total smoothness is known as smashed potatoes."));
            Savoury.add(new Food.Savoury("FriedNoodles", R.drawable.savoury9, R.drawable.savoury9_1, R.drawable.savoury9_2, R.drawable.savoury9_3, 9.00, "Fried noodles are common throughout East Asia, Southeast Asia and South Asia. Many varieties, cooking styles, and ingredients exist. "));
            Savoury.add(new Food.Savoury("Croissant", R.drawable.savoury10, R.drawable.savoury10_1, R.drawable.savoury10_2, R.drawable.savoury10_3, 3.00, "A croissant is a buttery, flaky, viennoiserie pastry of Austrian origin, named for its historical crescent shape. Croissants and other viennoiserie are made of a layered yeast-leavened dough."));
        }
    }

    public static ArrayList<Food> getSavoury() {
        return Savoury;
    }

    // -------- Drinks ---------
    public static void setDrinks() {
        if (Drinks.isEmpty()) {
            Drinks.add(new Food.Drinks("BubbleTea", R.drawable.drinks1, R.drawable.drinks1_1, R.drawable.drinks1_2, R.drawable.drinks1_3, 6.00, "Bubble tea is a Taiwanese tea-based drink invented in the 1980s, which is shaken with ice to create the bubbles, a foamy layer on top of the drink; chewy tapioca balls are added as well. Ice-blended versions are frozen and put into a blender, resulting in a slushy consistency."));
            Drinks.add(new Food.Drinks("Coffee", R.drawable.drinks2, R.drawable.drinks2_1, R.drawable.drinks2_2, R.drawable.drinks2_3, 5.00, "Coffee is a brewed drink prepared from roasted coffee beans, the seeds of berries from certain Coffea species. Once ripe, coffee berries are picked, processed, and dried. Dried coffee seeds are roasted to varying degrees, depending on the desired flavor."));
            Drinks.add(new Food.Drinks("Tea", R.drawable.drinks3, R.drawable.drinks3_1, R.drawable.drinks3_2, R.drawable.drinks3_3, 1.00, "Tea is an aromatic beverage commonly prepared by pouring hot or boiling water over cured leaves of the Camellia sinensis, an evergreen shrub native to East Asia. After water, it is the most widely consumed drink in the world."));
            Drinks.add(new Food.Drinks("MangoJuice", R.drawable.drinks4, R.drawable.drinks4_1, R.drawable.drinks4_2, R.drawable.drinks4_3, 6.90, "A mango is a juicy stone fruit produced from numerous species of tropical trees belonging to the flowering plant genus Mangifera, cultivated mostly for their edible fruit. Most of these species are found in nature as wild mangoes. The genus belongs to the cashew family Anacardiaceae."));
            Drinks.add(new Food.Drinks("CoronaBeer", R.drawable.drinks5, R.drawable.drinks5_1, R.drawable.drinks5_2, R.drawable.drinks5_3, 4.20, "Corona Extra is a pale lager produced by Mexican brewery Cervecería Modelo and owned by Belgian company AB InBev. It is commonly served with a wedge of lime or lemon in the neck of the bottle to add tartness and flavour."));
            Drinks.add(new Food.Drinks("Soju", R.drawable.drinks6, R.drawable.drinks6_1, R.drawable.drinks6_2, R.drawable.drinks6_3, 3.00, "Soju is a clear, colorless distilled beverage of Korean origin. It is usually consumed neat, and its alcohol content varies from about 16.8% to 53% alcohol by volume. Most brands of soju are made in South Korea."));
            Drinks.add(new Food.Drinks("Coca-Cola", R.drawable.drinks7, R.drawable.drinks7_1, R.drawable.drinks7_2, R.drawable.drinks7_3, 2.00, "Coca-Cola, or Coke, is a carbonated soft drink manufactured by The Coca-Cola Company. Originally marketed as a temperance drink and intended as a patent medicine, it was invented in the late 19th century ."));
            Drinks.add(new Food.Drinks("L&P", R.drawable.drinks8, R.drawable.drinks8_1, R.drawable.drinks8_2, R.drawable.drinks8_3, 2.00, "Lemon & Paeroa, also known as L&P, is a sweet soft drink manufactured in New Zealand. Created in 1907, it was traditionally made by combining lemon juice with carbonated mineral water from the town of Paeroa, but is now owned and manufactured by multi-national Coca-Cola. "));
            Drinks.add(new Food.Drinks("Sake", R.drawable.drinks9, R.drawable.drinks9_1, R.drawable.drinks9_2, R.drawable.drinks9_3, 8.00, "Sake, also spelled saké, is an alcoholic beverage made by fermenting rice that has been polished to remove the bran."));
            Drinks.add(new Food.Drinks("Water", R.drawable.drinks10, R.drawable.drinks10_1, R.drawable.drinks10_2, R.drawable.drinks10_3, 0.50, "Water is an inorganic, transparent, tasteless, odorless, and nearly colorless chemical substance, which is the main constituent of Earth's hydrosphere and the fluids of most living organisms. It is vital for all known forms of life, even though it provides no calories or organic nutrients."));
        }
    }

    public static ArrayList<Food> getDrinks() {
        return Drinks;
    }

    // -------- Food General ---------
    // combines all types of Food into one ArrayList
    public static ArrayList<Food> getFoods() {
        ArrayList<Food> Foods = new ArrayList<>();
        Foods.addAll(Sweets);
        Foods.addAll(Savoury);
        Foods.addAll(Drinks);
        return Foods;
    }

    public static ArrayList<Food> getTopPicks() {
        ArrayList<Food> allFoods = getFoods();
        Collections.sort(allFoods, new Comparator<Food>() {
            @Override
            public int compare(Food item1, Food item2) {
                return item2.count - item1.count; // descending order
            }
        });
        // get the top 10 most viewed
        ArrayList<Food> TopPicks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TopPicks.add(allFoods.get(i));
        }
        return TopPicks;
    }


}
