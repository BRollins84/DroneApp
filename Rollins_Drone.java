//Author Name: Blake Rollins
//Date: 8/27/2020
//Program Name: Rollins_Drone
//Purpose: Simulation using drone movement in x,y,z locations


import java.util.*;

public class Rollins_Drone {

	public static void main(String[] args) {
		
		Drone drone = new Drone();

		Scanner keyboard = new Scanner(System.in);
		int option;
		
		//menu that end-user will see
		do {
			System.out.println("\nWhich direction would you like to move the drone?");
			System.out.println(" 1 - Move Up \n 2 - Move Down \n 3 - Move Forward \n 4 - Move Backward \n "
					+ "5 - Turn Left \n 6 - Turn Right \n 7 - Display Position \n 8 - Exit Navigation \n");

			System.out.print("Enter your selection: "); //area for end-user to enter selection
			option = keyboard.nextInt(); //user input
			
			//Informs end-user which option they have selected and changes position of x,y,z coordinates
			switch (option) {
			case 1:
				drone.moveUp(1);
				System.out.println("You have moved up");
				break;
			case 2:
				drone.moveDown(-1);
				System.out.println("You have moved down");
				break;
			case 3:
				drone.moveForward(1);
				System.out.println("You have moved forward");
				break;
			case 4:
				drone.moveBackward(-1);
				System.out.println("You have moved backward");
				break;
			case 5:
				drone.turnLeft(-1);
				System.out.println("You have turned left");
				break;
			case 6:
				drone.turnRight(1);
				System.out.println("You have turned right");
				break;
			case 7:
				System.out.println(drone.toString());
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("Please select an option from the list.\n");
			}

		} while (option != 8);
		
		keyboard.close();
	}
}
