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
**Directory/ Recipe book**


**Dish**
* Abstract class 
* Subclasses will need "get" functions
* array list <string> ingredients
**Ingredients**




**Search**
* Search allows the user to enter a list of search terms, then the search looks for dishes that contain
* all elements of the list in the list of getIngredients and getAttributes return type: List of Dishes
* DefaultTerms are determined by the user Class's parameters and are always included in the list of search terms

**Command**

