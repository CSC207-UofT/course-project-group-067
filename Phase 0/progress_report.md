#Progress Report - Phase 0

by: Angelo Huang, Prabuddha Senapati, Jacob Gilbert

Group 067 - Modular Recipe Book.

Specification: In our specification we describe what the user should see when they run our program. When the program is launched, users will be prompted to enter their usernames
or add a new user to the user list. Next, our specification details how to operate the program as a user and shows a list of commands that the user
can input to interact with the program. These include Create Dish, which allows the user to create their own custom dishes and add them to their Recipe Book.

Create Ingredient, which allow users to add their own ingredients that have specific attributes such as allergens and dietary restrictions.

Search, which opens the search functionality where users can select from a variety of filters including dish names, attributes, cook times and specific ingredients. As
well as commands to miscellaneously view dishes in the Recipe Book, display user preferences and favourites etc.

As we continue to develop our program, we will be looking to implement more ways for users to interact with the program through commands such as a command to return
a shopping list of ingredients based on the user's favourite dishes.


CRC Model: The three entities we've labelled are the User, Ingredient and Dish classes. They all store critical data; Ingredient stores attributes that are important for
filtering dishes, Dish stores ingredients and other variables such as the cooktime and instructions. Users store a Recipe Book which have all their favourite recipes, notes and
preferences inside.

For controllers, we have the classes RecipeBook, Launch and Console. Launch determines which user's RecipeBook to access. Recipe book allows users to enter commands and console makes sense of the input by redirecting to relevant
methods/use cases.

For our presenter classes, we have BookView which is responsible for converting RecipeBook data into a string format that is printed to and viewed by the user.

Our use cases have all our classes responsible for interacting with information that our entities store such as DishManager, UserManager and IngredientManager. We also have
the various methods that can be called from commands by the user which allow the user to interact with the program.



Scenario Walkthrough: The scenario walkthrough we envisioned has the user creating their own dish to their RecipeBook and viewing it's information. When the program is initially
run, 'Launch' calls 'CreateUser' which prompts the user to enter a username. A User class and corresponding RecipeBook instance is then created. 'Launch'
then calls open on the 'RecipeBook' which calls 'BookView', displaying the RecipeBook's contents to the user as well as a prompt to type commands in. The user types
"Create Ingredient" and the command goes through to 'Console'. Console then calls the 'CreateIngredient' class which will prompt the user to enter the ingredient's name and
attributes. The user types in "Egg" then "Non-veg" then END. Next the user types in "Create Dish", 'Console' is used again and 'CreateDish' is called. The user is prompted to enter
the dish name and valid ingredients, so the user enters "Boiled Egg" as the name and "Egg" which was the newly created ingredient, then also types in the cooking instructions
and cook time for the dish. The user then types the command View Dishes and 'BookView' is called again and the user will be able to see their new dish and its details that they just inputted.
The user exits the program by typing in CLOSE.


Skeleton Program: The current skeleton program we have is capable of compiling, running commands and passing a few JUnit tests we created. We're still missing a lot
of functionality in that the User has to manually create all Ingredients and Dishes which can be quite tedious. Our next step here is to be able to create a default
list of ingredients and dishes in a text file and a class that can read that information and store it in each User's Recipe Book.




What has worked so far: The CRC cards we created helped us organize our code and be able to work on separate parts of the code and still have them interact with eachother
properly. We're still figuring out things as we go but it definitely would have been harder without the CRC cards to have an outline of the general structure of the code.




Next steps: Adding functionality such as reading a large amount of dish information from files, generation of recommendations, and additional features for ease of access. Something that we've struggled with as a group is implementing the use of interfaces and other forms of abstraction. We would like to demonstrate
the use of them in our program but we've had a hard time identifying a case for them where it would be beneficial to the structure of the code.  
