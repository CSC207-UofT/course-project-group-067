When we run the program, Launch First determines whether Users exist and if not, creates a new User, After which it enquires the Username
of the User currently accessing it.
Once the Username is determined, Launch Opens the RecipeBook of the user associated with the Username.

RecipeBook's Open method prints to the command line the list of all dishes in the RecipeBook initially, then requests user input for
which command they may wish to run.

Once the User wishes to log-out, they may input CLOSE, and they will be returned to Launch.

Example:
Execute Launch
Create New User TEST
Input nothing for Preferences
Input Username TEST
Command Create Ingredient: 
Name - Egg
Attribute- Non-Veg
Command Create Dish:
Name - Boiled Egg
Ingredient - Egg
Cooking Instructions - Put egg in water
Cook Time - 5
Command View Dishes
Command Boiled Egg
Command CLOSE
