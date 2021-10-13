# Specification
Recipe book: capability to add/ edit/ review recipes and search through collection of recipes


Directory of *Dish* in a *recipe Book* \
*Dish* stores recipe information such as: *Ingredients* *utensils* *time* *getveggie* *getallergens* etc.\
*ingredient* implement *GetAttributes*\
Interface *GetAttributes* - used in dish and ingredient for *getallergens* *getveggie* etc\
*User*: has attributes suchas *isveggie* *intolerances/allergies*. interacts with search/command\
*Command*: parent has execute and exception: subclasses would have add/ remove etc. work with *recipe Book*. 
Many SUbClasses\






## Entity classes
**Directory/ Recipe book** \
*Arraylist of recipe 
*Collaboration: 

**Dish**
* Name 
* Subclasses will need "get" functions
* array list <string> ingredients, method, time
* get functions
* ToString
* Collaboration: Recipe Book, Ingredients

**meal: interface**
*for subclasses of dish

**DishManager**
*Create dish, edit dish.
*add dish to recipe book
*Store a list of Dishes
*Collaboration: Recipe book, Dish, search

**Ingredients**
* name
* Attributes: list of attributes
* get functions
* collaboration: Recipe book, Interface, ingredient manager
* 

**IngredientManager** \
*create ingredient: add attributes
* from files
* stores list of ingredients
* Collaboration: Search

**User** 
*Stores user information
* username, Favourites(list dishes), Preferences (attributes),
*Collaborators: Recipe Book

**User/book Manager**\
*Create User, edit user\
*Collaboration User

**loginLogout**


**Search**
* Subclasses: attSearch, namesearch, parameter search.... or instance parameters are att,name,ingredient, time
* Search paramater: child classes changing instance 
* returns List of dish in main method
* all elements of the list in the list of getIngredients and getAttributes return type: List of Dishes
* DefaultTerms are determined by the user Class's parameters and are always included in the list of search terms
* *recipe book, Managers, User
* 
**Command**
Chid: Search, Managers, Login/Logout 
* excecutes command
* raise exception id invalid
