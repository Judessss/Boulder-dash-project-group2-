# Boulder Dash

  

## MODULE POO AVEC JAVA

## X1 ULC-Icam Kinshasa group 2
Novembre 2023
  

__Authors:__

* Samuel BIRAHEKA

* Jude KASONGO

* Francis NYIMI

Here's the git of our Java Project, *Boulder Dash*.

>The goal of the project was to rewrite the old game *Boulder Dash* (1984), created by *Peter Liepa* and *Chris Gray*. In the game, the player has to collect a number of diamond to open a door to the next level. He can dig through the dirt, but he can be killed by falling rocks or diamonds. There are also some monsters in the levels, that can kill the player if they touch him. The player can make a rock fall on a monster. It will kill it, and generate diamond on and around the dead monster. The diamonds can be generated on walls or dirt. By this way, the player can break walls he can't dig himself.

Here's a link to play the original game:
http://www.retrogames.cz/play_232-NES.php

>We didn't had to recreate the whole game. We just had to implement the player, the dirt he dig, the walls, the diamonds and the monsters. The levels had to be stored in a Database. 

The project follows the Maven architecture. Here's the directories organization:

* **/contract**
	*  Contains the interfaces and the enumerations of the package `contract`
* **/controller** 
	* Contains the classes of the package `enumeration`
* **/entity** 
	* Contains the classes and the enumerations of the package `entity`
* **/main** 
	* Contains the main class
* **/model** 
	* Contains the classes of the package `model`
* **/sprites** 
	* Contains all the sprites used in the game
* **/target/site/xref**
	* Contains the JXR report of the project.
* **/view** 
	* Contains the classes of the package `view`
