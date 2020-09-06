
public class Drone {
	
	private int x; //horizontal plane position
	private int y; //vertical plane position
	private int z; //directional position for left and right
	private String orientation; //position for North, East, South, and West
	
	public Drone(){ //initial drone creation coordinates 
		orientation = "North";
		x = 0;
		y = 0;
		z = 0;
		
	}
//getters and setters of coordinates
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

//method to move drone up	
	public void moveUp(int movement){
		y += movement;
		return;
	}

//method to move drone down
	public void moveDown(int movement){
		y += movement;
		return;
	}

//method to move drone forward	
	public void moveForward(int movement){
		x += movement;
		return;
	}
	
//method to move drone backward		
	public void moveBackward(int movement){
		x += movement;
		return;
	}

//method to turn drone right	
	public void turnRight(int movement){
		z += movement;
		return;
	}

//method to turn drone left	
	public void turnLeft(int movement){
		z += movement;
		return;
	}

//method to identify orientation	
	public String orientation (String orientation){
		
		if (z == 0 || z % 4 == 0){
			orientation = "North";
		}
		else if (z == 1 || z % 4 == 1 || z == -3 || z % 4 == -3){
			orientation = "East";
		}
		else if (z == 2 || z % 4 == 2 || z == -2 || z % 4 == -2){
			orientation = "South";
		}
		else if (z == 3 || z % 4 == 3 || z == -1 || z % 4 == -1){
			orientation = "West";
		}
		return orientation;
	}
	
//Displays drone position	
    @Override
    public String toString() {
       return "Drone location: (x_pos = " + x + ", y_pos = " + y + ", z_pos = " + z + " , orientation = " + orientation(orientation) +")";
    }
}
