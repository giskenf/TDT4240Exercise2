## Step 1
In this exercise I've chosen to use task 1 from the previous exercise as my code base.
## Step 2 - Implementation of Singleton pattern
The GameStateManager keeps track of the game states. There will only be one instance if the GameStateManger and thus it is implemented as singleton.
For the other classes to make use of the gsm, the MyGdxGame.java-file had to use the new getInstance() function to get the gsm.
## Step 3
I followed Brent Aurelli's Flappy Bird turtorial in exercise 1. In this turtorial he used both a State pattern, as well as the Template pattern.

#### Template method pattern:
The State class was implemented as an abstract class, and both the PlayState class and MenuState classes inherites variables and overites methods from
the State class.

#### State pattern:
In GameStateManager, the state pattern is used to keep track of the states in the game.

## Step 4
