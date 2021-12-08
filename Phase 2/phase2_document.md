#Specification
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
* "Close" logs out the user
* "Create" creates a new user
* UserConsole Commands:
  * "favourites" lists out the names of the dish the user has added to their favourites
  * "preferences" lists out the user's preferences
  * "add to preferences" adds a preference to the user's preferences
  * "remove from preferences" removes a preference from the user's preferences
* BookConsole Commands:
  * "search" starts a search function with difference search filters
    * -n dishname : returns a list of dishes containing dishname in their names
    * -p : returns a list of dishes matching the user's preferences
    * -t time : returns a list of dishes with cook time less than or equal to time
    * -i ing1/ing2/... : returns a list of dishes with ing1, ing2, ... as their ingredients
    * -a att1/att2/... : returns a list of dishes with att1, att2, ... as their attributes
    * EXAMPLE: search -n burger -t 15 -i lettuce/pickles -a vegan
      * this will return a list of dishes that has "burger" in its name, cook time no more than 15 minutes,
      * lettuce, pickles as ingredients, and the vegan attribute.
  * "view dishes" lists out the dishes in the dish manager
  * "view dish" allows user to input the dish name to view details of the dish
  * "view ingredients" lists out the ingredients in the ingredient manager
  * "view ingredient" allows user to input the ingredient name to view attributes of the ingredient
  * "favourites" lists out the favourite dishes of the user
  * "add to favourites" adds a specified dish to the user's favourites list
  * "remove from favourites" removes a specified dish from the user's favourites list
  * "preferences" shows the user's preferences
  * "create dish" starts the dish creator
  * "create ingredient" starts the ingredient creator

##Design decisions

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

Command design pattern will be implemented to create queues for some functions as well as many commands will use this pattern when expanding our projects scope especially concerning user/admin commands.
Observer design pattern will be implemented in the future for serialization of the managers (User, Dish, Ingredient) so that when they’re created, they’re automatically saved in the .ser*files.
Command design pattern will be implemented to create queues for some functions as well as many commands will use this pattern when expanding our projects scope especially concerning user/admin commands.
We have restructured the search function to follow closely the factory design pattern to enhance clarity and implement a good design strategy for expansion in the future. Search has many flavours associated with it: name, time, etc, and having the factory setup allows for encapsulation of the type of ‘searcher’ being used.
We have also completely redesigned the object creation to use the factory and builder design patterns to allow finer control over how we build the entities we utilize in our program and make the creation of said entities as seamless as possible.

##Progress report
What each member has been working on:

Prabuddha - 
1. Learnt MYSQL fundamentals and initialized a Database using AWS' Relational Database Service
2. Implemented serialization using a database
3. Added some functionality to abstract console to allow parameter overriding
Pull Requests:
https://github.com/CSC207-UofT/course-project-group-067/pull/17
https://github.com/CSC207-UofT/course-project-group-067/pull/23

Jake - 

James - 
1. Implemented difference commands in both UserConsole and BookConsole.
2. Made the program catch some exceptions, so it doesn't crash on an invalid user input command.
3. Made the search function more intuitive.
Pull Requests: 
https://github.com/CSC207-UofT/course-project-group-067/pull/25
https://github.com/CSC207-UofT/course-project-group-067/pull/22

Angelo - 
1. Worked on abstract console implementation
2. Added and edited tests for entities, managers and search classes
3. Fixed code so that tests would pass and worked on catching exception so code didn't crash  
Pull Requests: 
https://github.com/CSC207-UofT/course-project-group-067/pull/20  
   https://github.com/CSC207-UofT/course-project-group-067/pull/24







##Accessibility 
**1. For each Principle of Universal Design, write 2-5 sentences or point form notes explaining which features your program adhere to that principle. If you do not have any such features you can either:
(a) Describe features that you could implement in the future that would adhere to principle or
(b) Explain why the principle does not apply to a program like yours.**

**Equitable Use:** A feature that our program has that adheres to the equitable use principle is that 
we've included attributes as one of the main ways you can filter dishes, so you can
easily find and view relevant Dishes regardless of whatever dietary
restrictions you have. Currently it would be very difficult for those with 
visual / motor impairment to access the features of our program but in the future
we could solve this by adding text-to-speech input and output.

**Flexibility in Use:** The features of our User class adhere to the Flexibility in Use principle.
Users can freely customize their personal preferences and favourites. Users can also choose to do
whatever they want with adding notes to existing recipes. In addition to this, Users can search for dishes
with a variety of filters so they can find dishes relevant to whatever their situation is.    
A feature that we could implement
in the future to make our program further adhere to this principle would be to add a cooking method 
filter to our recipes so that User's can see more relevant dishes. For example, if a user only
wanted to look for baking recipes they could search for only Recipes that use Baking.

**Simple and Intuitive Use:** One way our program adheres to the Simple and Intuitive Use principle is 
by giving very direct prompts to the user. The user is told exactly what they need to do in order
to operate the program. When the user makes an invalid input, feedback is given so the user
can re-try. 

**Perceptible Information:** Elements are sufficiently differentiated. When 
Dish information is viewed by the user, each different section of the dish
is clearly listed. Once our front-end U.I is finished, we will use large font
that will be easily legible and our button elements will be contrasted adequately.

**Tolerance for Error:** Our program adheres to the Tolerance for Error principle as 
exceptions caused by invalid user inputs are caught and the user is allowed to 
re-try. Users will not be able to crash the program by entering mismatched 
inputs. 

**Low Physical Effort:** The program adheres to this principle as it doesn't take
much physical effort to use. The user just needs to enter input on a keyboard, when
our front-end is complete the user will need to exert even less effort as 
we will have a functional U.I.

**Size and Space for Approach and Use:** This principle does not apply to our program,
since the program we have designed does not have a physical component.

**3. Write a paragraph about who you would market your program towards, if you were to sell or license your program to customers. This could be a specific category such as "students" or more vague, such as "people who like games". Try to give a bit more detail along with the category.**       
The type of people we would market our program towards is people who have interest in cooking.
Our program is intended to compile and stream-line finding Dishes relevant to all types of 
Users regardless of what their situation is so this description is vague. For example, students who have
an interest in cooking who are often busy can use the search feature to find Dishes that can be prepared
under a specified cook time, or someone with very specific dietary restrictions can use our program
to find dishes they can make. 

**5. Write a paragraph about whether or not your program is less likely to be used by certain demographics. For example, a program that converts txt files to files that can be printed by a braille printer are less likely to be used by people who do not read braille.**  
Our program is less likely to be used by people who do not usually prepare food or have an interest in it.
This is obvious since they would not be getting any practical use out of our program.
Other than this, our program is meant to be useful to all who have an interest in preparing
food regardless of their cooking abilities.
