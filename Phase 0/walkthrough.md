When we run the program, Controller.Launch First determines whether Users exist and if not, creates a new Entities.User, After which it enquires the Username
of the Entities.User currently accessing it.
Once the Username is determined, Controller.Launch Opens the Controller.RecipeBook of the user associated with the Username.

Controller.RecipeBook's Open method prints to the command line the list of all dishes in the Controller.RecipeBook initially, then requests user input for
which command they may wish to run.

Once the Entities.User wishes to log-out, they may input CLOSE, and they will be returned to Controller.Launch.

Example:\
Execute Controller.Launch\
Create New Entities.User TEST\
Input nothing for Preferences\
Input Username TEST\
Command Create Entities.Ingredient: \
Name - Egg\
Attribute- Non-Veg\
Command Create Entities.Dish:\
Name - Boiled Egg\
Entities.Ingredient - Egg\
Cooking Instructions - Put egg in water\
Cook Time - 5\
Command View Dishes\
Command Boiled Egg\
Command CLOSE
