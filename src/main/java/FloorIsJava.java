import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * FloorIsJava - a robot by (your name here)
 */
public class FloorIsJava extends Robot
{
	private boolean scanning = false;
	/**
	 * run: FloorIsJava's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.green, Color.green, Color.green, Color.green, Color.green);
		setAdjustGunForRobotTurn(false);

		// Robot main loop
		while(true) {
		  	//ahead(500);
			scanning = true;
			turnRadarRight(360);
			scanning = false;
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		stop();
		
		double bearing = e.getBearing();
		if (bearing < 0) {
			turnLeft(Math.abs(bearing));
		} else {
			turnRight(bearing);
		}
		
		if (e.getDistance() > 250) {
			ahead(250);
		} else {
			fire(5);
		}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		turnRight(90);
		ahead(200);
	}	
}
