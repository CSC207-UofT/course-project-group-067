When we run the program, RecipeBook first determine which User is accessing the program via the UserManager. After determining the User, the associated 
RecipeBook instance is launched. BookView then presents a Recipe via the Command Line and the User is then allowed to input a command.

The user inputs 'Search' and Search is accessed. Within Search, all possible Filters are presented and the User picks one, say Name.
Search passes 'Name' to SearchDistributor and that then calls the search method NameSearch associated with 'Name'. 

Name then allows the User to input the name of the Dish they wish to search for, and NameSearch returns any Dishes in
the Recipe book with that Name. 

The returned Dishes are then presented to the User. The User inputs END and the program ends.
