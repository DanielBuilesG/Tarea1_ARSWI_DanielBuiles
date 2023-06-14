# Project Title

LOC counter

## Description

This is a simple program used to measure LOC's (Lines of Code) or phy (physical 
lines), the only return parameter will be an int, wich will  indicate the cuantitie 
of lines the program has, depending on the first parameter "phy" or "loc", followed
by the PATH of the code

This is the class diagram of the program
![image](https://github.com/DanielBuilesG/Tarea1_ARSWI_DanielBuiles/assets/73034258/4376d1c3-a2ec-4820-ae19-5402dd3e4ea2)

## Getting Started

In order to use it, you just have to do it from the command prompt of your computer
write the next lines of code, indicating the program to run followed by the loc//phy indicative and
the path to the code youre targeting to, as an example im using the main class of the
program

"im leaving the example code below"

![image](https://github.com/DanielBuilesG/Tarea1_ARSWI_DanielBuiles/assets/73034258/8c6df5e2-0e34-4519-a15a-88f94e2c9dd2)

### Dependencies

* Maven 17
* junit 3.8.1
* ex. Windows 10
("specs on pom.xml")

### Installing

* just download it, and run it as told before

### Executing program


* For LOC uses
```
java -cp "./target/classes" com.mycompany.primera_tarea_danielbuiles.Counter loc C:\Users\daniel.builes\Documents\Primera_tarea_DanielBuiles\src\main\java\com\mycompany\primera_tarea_danielbuiles\Counter.java
```

* For PHY uses
```
java -cp "./target/classes" com.mycompany.primera_tarea_danielbuiles.Counter phy C:\Users\daniel.builes\Documents\Primera_tarea_DanielBuiles\src\main\java\com\mycompany\primera_tarea_danielbuiles\Counter.java
```

## Authors

Contributors names and contact info

Daniel Builes


## Version History

* 0.1
    * Initial Release
    * may ignore very specific characters and count them as loc
   


## License

This project is licensed - see the LICENSE.md file for details

