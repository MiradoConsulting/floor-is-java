import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * FloorIsJava - a robot by (your name here)
 */
public class FloorIsJava extends Robot
{
	/**
	 * run: FloorIsJava's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.green, Color.green, Color.green, Color.green, Color.green);
		setAdjustGunForRobotTurn(true);

		// Robot main loop
		while(true) {
			double turnDelta = Math.random() * 30;
			if (Math.random() > 0.5) {
				turnRight(turnDelta);
			} else {
				turnLeft(turnDelta);
			}
		    double moveDelta = Math.random() * 150;
		    ahead(moveDelta);
			if (Math.random() < 0.1) {
				turnGunRight(360);
			}
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		if (e.getDistance() < 500) {
			fire(10);
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
