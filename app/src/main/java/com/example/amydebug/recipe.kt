package com.example.amydebug

import com.example.amydebug.model.recipe

// dummy object
val defaultrecipes = recipe(
    1,"Beefpilau", listOf("250g beef","500g basmati rice", "2 onions","tomato paste", "4 pieces of clove garlic", "salt to taste", "vegetable oil","1/2 teaspoon of ground pepper",
        "1 tablespoon of pilau masala"),R.drawable.beefpilau, listOf("1.Peel the onions and garlic cloves. \n",
        "2.Wash the beef and add into a pan. Slice in one onion and 2 garlic cloves with the ginger.\n",
        "3.Add some water with salt to taste.\n",
        "4.Cook until the beef is tender, then remove from heat. Keep the meet chunks and stock to one side.\n",
        "5.Chop the remaining onion and garlic.\n",
        "6.Wash the rice and repeat until the water runs clear.\n",
        "7.In another pan, heat the oil under low heat. Add the onions into the pot and cook until the onions start to caramelize and become brown. \n",
        "8.Pour in the garlic and the ground spices. Stir for 30 secs.\n",
        "9.Add the rice into the pot. Pour in the stock and meat chunks. Add more water so there is enough to cook the rice (read the rice pack instructions).\n",
    ))
val defaultrecipes2 = recipe(    2,"chapati", listOf("warm water", "salt to taste", "vegetable oil","wheat flour", "sugar to taste"),R.drawable.chapati, listOf("1.Warm some water",
    "2. Boil the vegetable oil(optional) and leave to cool",
    "3. Measure a desirable amount of wheat flour, add salt to taste",
    "4. Add the now cool vegetable oil, add the warm water to your flour and knead the dough",
    "5. Roll then shallow fry while adding some vegetable oil",
    "Your chapatis are now ready to serve"))
val defaultrecipe3= recipe(3,"kukufry", listOf("250g chicken", "2 onions","3 tomatoes", "4 pieces of clove garlic", "salt to taste", "vegetable oil","1/2 teaspoon of ground pepper"),R.drawable.kukufry,
    listOf("1. Wash the chicken",
        "2. Cut into pieces",
        "3. Boil",
        "4. When tender, drain the excess water",
        "5. Add the vegetable oil",
        "6. Add the cut onions then when golden brown add then add cut tomatoes",
        "the chicken is now ready to serve" ))

val Default_recipe= listOf(defaultrecipes, defaultrecipes2, defaultrecipe3)