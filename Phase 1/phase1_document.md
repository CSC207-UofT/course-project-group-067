#Updated Specification
This project provides an implementation using Java of a Recipe book program that can be used and added to by Users.
Users of the program have the following access and capabilities when using the recipe book.\
* $new path/ dp$ Manually adding a new *Entities.Dish* to the *Recipe Book* from within the program. For example, adding 'Pepperoni Pizza' to the *Recipe Book* during runtime.
* View *Dishes* inside the recipe book with search functionality
* $new$ Reading *Entities.Dish* information from a specifically formatted file and adding to the *Recipe Book*\
* $updated with design patterns$ Searching for a *Entities.Dish* or Dishes in the *Recipe Book* by name, favourites, cook time, user preferences, certain attributes (Vegetarian, Non-Vegetarian, Kosher)
 and whether it contains certain *Entities.Ingredient*(s) (eg: Searching for dishes that contain *Potato*)
* Generate favourites and preferences for the *User* within the program which can then be used with search functionality to sort through recipes\
* $new$Save changes to the recipe book to a file format

Each *Entities.Dish* in the *Recipe Book* must store information such as name, *Entities.Ingredient*(s), cook time, attributes (Veg, Non-Veg, etc.) and
cooking instructions.
These can either be input manually during runtime by the user or uploaded through a *new* structures file. The structure splits each dish by the @ symbol in the file.

Each *Entities.User* will be able to add dishes to the communal *Recipe Book* and have their own implementation of *favourites* and *Preferences*
When new *User* constructure will ask for and store *Preferences* and *Favourites* but these can be edited at anytime in the program
These can be saved as well as the current status of the dishes and ingredients known to the recipe book.
Existing Users can be viewed to see collaborators in the Recipe Book
*new* There exists a User Subclass *Admin* which gives such users more capabilities.

Commands:
* CLOSE logs out the user
* Create User creates a new user
* Create Dish allows the user to create their own dish
* Search accesses the search functionality, where users can pick their search filters
* Create Entities.Ingredient allows the user to add their own ingredients
* View Dishes Allows viewing of all dishes in Controller.RecipeBook
* Preferences outputs all the Users Preferences
* Favourite outputs all the Users Favourites
* DISHNAME allows user to view the information regarding the Entities.Dish with name DISHNAME
* Save saves current status of the recipe book by serializing the current dishes, ingredients and users in the program and saving then File form
##Design decisions
* A recent decision we had to make was where to store attributes for our dishes. To avoid having to throw exceptions regularly which crashed our code when ingredients didn’t exist we wanted to lessen the occurrence of this. As well as simplifying ingredient creation which could be very tedious for the user. Hence we have shifted the responsibility of attributes away from the ingredients class. As a result this made our dish creation process far cleaner and far less likely to result in the throwing of exceptions.
* Reorganising our attributes for dishes with a Decorator allowed for our search classes and functionality to run more efficiently and far easier especially concerning the attribute search. This new organisation of Dish, applying interface dish allows for more specificity in our classes especially concerning an increase in complexity that we will achieve over phase 2.

##Clean Architecture
* Previous problems we had encountered was a lack of implementation of Clean architecture in reference to our *Recipe Book* class. As such, we have restructured our files such that there are no dependencies from our entities.
* Through the use of manager classes for our use cases they keep our back end 'structurally’ sound according to clean architecture.
* Entity creation classes have many dependencies and as such this was an area were we had to be very careful when concerning Clean architecture.
* Presentation level of clean architecture provided very few issues especially with our well structured and useful manager classes.
* As we start to move towards the front end of our program we will be focusing on keeping clean architecture with this end and likely applying useful design patterns to achieve this.
##SOLID principles
* *Single Responsibility Principle*: clear examples of this is in our search classes and entity creation classes. Breaking up these responsibilities into individual child classes and the use of interfaces worked to keep classes responsible for individual things.
* *Interface segregation*: Simply put, abstract classes and interfaces have been kept simple, also implementing the Single Responsibility Principle, with many including only one or a handful of methods to be extended/ inherited. This made satisfying this principle very easy.
* *Open/ Close: The decision to implement decorators into the program creates a very open program when concerning expansion of our dishes and their attributes. Further the separation in the “use case” area given by manager classes closes off the very back end of the program. Another aspect of the program that helps close off the back end is the entity creation framework which adds separation between the controllers and the back end of the program to restrict modification.
Packaging strategies
* The most correlated packaging strategy Implemented in the project is packaging according to Clean architecture. Moreover, the construct of our packages is through convenience of coding as grouping by amount of interaction and similarity of functionality is prevalent.
* *Entities* *Controller* *Presenters* are the clear packaging that mimics Clean architecture and is useful to us especially when making changes towards the back end to help follow dependencies and ensure continued following of clean architecture
* Packaging *Entity Creation* classes together and creating sub-packages for each entity proved very efficient and useful as very similar code exists between these classes. Furthermore the sharing of abstract classes within this package made this strategy strong. Making the abstraction clear as well as which classes have dependencies, with all this similar code, this clear grouping has been very important
* As *Object Conversion* and our *serialization* process’ are very unique branch of the program separating these into their packages was a clear strategy. This well become very useful later in the process if we make the design decision to move away from a file based system.
* *Search* is a very specific and large feature of our program and as such packaging our search related classes was obvious. Especially when encountering problems with the search functionality when expanding the code this strategy proved useful.
##Design patterns

We added a decorator design pattern for keeping track of Dish attributes. Our previous program used an ArrayList of strings that the user had to input for each ingredient to keep track of attributes. This was very cumbersome and many unwanted events could occur due to the user being able to input anything that is a string as an attribute without regulation. By adding this design pattern, we have a neat way to keep track of Dishes with any valid combination of attributes and it’s also compatible with our previous search features with some changes we’ve made. Currently, the only attributes supported are Kosher, Vegetarian, Vegan, GlutenFree and NutFree. In the future, we are planning on using another design pattern, the template design for better formatting and making new attribute decorators easy to add to our program.

Command design pattern will be implemented to create queues for some functions as well as many commands will use this pattern when expanding our projects scope especially concerning user/admin commands.
Observer design pattern will be implemented in the future for serialization of the managers (User, Dish, Ingredient) so that when they’re created, they’re automatically saved in the .ser*files.
Command design pattern will be implemented to create queues for some functions as well as many commands will use this pattern when expanding our projects scope especially concerning user/admin commands.
We have restructured the search function to follow closely the factory design pattern to enhance clarity and implement a good design strategy for expansion in the future. Search has many flavours associated with it: name, time, etc, and having the factory setup allows for encapsulation of the type of ‘searcher’ being used.
We have also completely redesigned the object creation to use the factory and builder design patterns to allow finer control over how we build the entities we utilize in our program and make the creation of said entities as seamless as possible.
##Progress report
How much further expansion of the program is necessary before focusing on front end?
How can we apply SOLID principles such as open/close in our program?

www:
* Good use of github to proof check each others work,
* Reading week provided some interruption to collaboration however individually dividing and checking work through github provided a good solution to collaboration
We weren’t able to merge the decorator pattern in time with the other new features in time, we learned a lot from this and in the future we will implement staggered deadlines for new features so we can avoid complex merger conflicts.
* We lacked in testing classes but this is as a result of program working through UI and thus problems were found and tested within the runtime of the program


Next steps:
* apply further design patterns as mentioned above
* working on web app design for our recipe book: start moving away from text based UI. However, it is likely we will keep an implementation of text-based in a branch for safety.
* expand program further by examples: introduce more attributes, add features to dishes, Implement more parameters for searches,
* create a database for serialization
* Expand our testing

