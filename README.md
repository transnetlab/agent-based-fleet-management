# Agent Based Fleet Management for First- and Last-Mile Connectivity
This repsoitory contains the code for an agent based fleet management model for first and last mile connectivity to transit networks built using the AnyLogic simulation platform. The java files in the folder [src](https://github.com/transnetlab/agent-based-fleet-management/tree/main/src) contain the classes used in the simulation. These files can be used as reference while building a similar model using AnyLogic's GUI. More details on the architecture can be found in the following paper.

### References
- [Bhatnagar, S., Rambha, T., & Ramadurai, G. 2022. An Agent-Based Framework for Fleet Management of First- and Last-Mile Services (_Under Review_).](https://arxiv.org/abs/2208.04563)

The folder [images](https://github.com/transnetlab/agent-based-fleet-management/tree/main/images) contains screenshots of AnyLogic interface for Main, Passenger and Vehicle agents. Main is the top-level agent where all the other agents reside. The following image shows the different AnyLogic constructs including variables, parameters, collection objects, events and functions. 

![main.png](https://github.com/transnetlab/agent-based-fleet-management/blob/main/images/Main.PNG) 

The Python Connector object to call VRP code also resides in Main agent. The left-hand side of the image shows the Project structure. Similarly, the AnyLogic constructs and state charts for Passenger and Vehicle are shown in the following images.  

![Passenger.png](https://github.com/transnetlab/agent-based-fleet-management/blob/main/images/Passenger.PNG)  
![Vehicle.png](https://github.com/transnetlab/agent-based-fleet-management/blob/main/images/Vehicle.PNG)

