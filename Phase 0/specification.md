#Specification

This Project provides an implementation for a *Recipe Book* in Java. This *Recipe Book* allows for a *User* to have functionality such as:

* Reading *Dish* information from a specifically formatted file and adding to the *Recipe Book*
* Manually adding a new *Dish* to the *Recipe Book* from within the program. For example, adding 'Pepperoni Pizza' to the *Recipe Book* during runtime.
* Searching for a *Dish* or Dishes in the *Recipe Book* by name, favourites, cook time, user preference, certain attributes (Vegetarian, Non-Vegetarian, Kosher)
and whether it contains certain *Ingredient*(s) (eg: Searching for dishes that contain *Potato*)
* Generation of a shopping list based on the *Dish*(s) favourite by the *User*

Each *Dish* in the *Recipe Book* must store information such as name, *Ingredient*(s), cook time, attributes (Veg, Non-Veg, etc.) and
cooking instructions.

Each *Ingredient* used in a *Dish* must store information such as name and its attributes (Veg, Non-Veg, Vegan, etc.)

Each *User* will have their own instance of a *Recipe Book* and will be able to mark their favourite dishes, 
add notes to a *Dish* and have a list of preferences which can be used to search for dishes in the *Recipe Book*.

