## Step 1
In this exercise I've chosen to use task 1 from the previous exercise as my code base.
## Step 2 - Implementation of Singleton pattern
The GameStateManager keeps track of the game states. There will only be one instance if the GameStateManger and thus it is implemented as singleton.
For the other classes to make use of the gsm, the MyGdxGame.java-file had to use the new getInstance() function to get the gsm.
## Step 3
I followed Brent Aurelli's Flappy Bird tutorial in exercise 1. In this tutorial he used both a State pattern, as well as the Template Method pattern.

#### Template Method pattern:
The State class was implemented as an abstract class, and both the PlayState class and MenuState classes inherits variables and overwrites methods from
the State class. The MenuState class was implemented in this exercise. To further show the Template Method pattern, I implemented an abstract Sprites class. The Heli sprite class was
changed to inherit variables from the Sprites class.

#### State pattern:
In GameStateManager, the state pattern is used to keep track of the states in the game. It holds information about what state that is the active one.

## Step 4
##### a)  For the patterns listing in Step3, which are architectural patterns, and which are design patterns? What are the relationships and differences of architectural patterns and design patterns?
##### b) How is the pattern you chose realized in your code? (Which class(es) works as the pattern you chose?)
##### c)Is there any advantages in using this pattern in this program? (What are the advantages/disadvantages?)

