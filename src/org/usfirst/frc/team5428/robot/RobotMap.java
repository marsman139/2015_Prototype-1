package org.usfirst.frc.team5428.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static int dt_frontLeft = 0;
    public static int dt_backLeft = 1;
    public static int dt_frontRight = 2;
    public static int dt_backRight = 3;
    
    public static int elevator = 4;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
