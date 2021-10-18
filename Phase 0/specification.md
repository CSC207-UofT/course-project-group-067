#Specification

This Project provides an implementation for a *Recipe Book* in Java. This *Recipe Book* allows for a *User* to have functionality such as:

* Reading *Dish* information from a specifically formatted file and adding to the *Recipe Book*
* Manually adding a new *Dish* to the *Recipe Book* from within the program. For example, adding 'Pepperoni Pizza' to the *Recipe Book* during runtime.
* Searching for a *Dish* or Dishes in the *Recipe Book* by name, favourites, cook time, user preferences, certain attributes (Vegetarian, Non-Vegetarian, Kosher)
  and whether it contains certain *Ingredient*(s) (eg: Searching for dishes that contain *Potato*)
* Generation of a shopping list based on the *Dish*(s) favourite by the *User*

Each *Dish* in the *Recipe Book* must store information such as name, *Ingredient*(s), cook time, attributes (Veg, Non-Veg, etc.) and
cooking instructions.

Each *Ingredient* used in a *Dish* must store information such as name and its attributes (Veg, Non-Veg, Vegan, etc.)

Each *User* will have their own instance of a *Recipe Book* and will be able to mark their favourite dishes,
add notes to a *Dish* and have a list of preferences which can be used to search for dishes in the *Recipe Book*.
When a new User is created, default dishes will be read from a file and added to the User's
Recipe Book.

Users will be shown a list of existing
users and will be given a prompt to type commands in. Signing in will automatically
display recommended dishes for the user based on their preferences (if any) and
they will be able to access all of the recipe book's functionality.

Commands:

* CLOSE logs out the user
* Create User creates a new user
* Create Dish allows the user to create their own dish
* Search accesses the search functionality, where users can pick their search filters
* Create Ingredient allows the user to add their own ingredients
* View Dishes Allows viewing of all dishes in RecipeBook
* Preferences outputs all the Users Preferences
* Favourite outputs all the Users Favourites
* DISHNAME allows user to view the information regarding the Dish with name DISHNAME