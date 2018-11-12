package org.firstinspires.ftc.teamcode.TestFiles;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Mecanum Test", group = "Stuff")
public class mecanumTestDrive extends LinearOpMode {

    mecanumRobot robot = new mecanumRobot();

    @Override
    public void runOpMode(){

        robot.initialize(mecanumTestDrive.this, hardwareMap, telemetry);

        waitForStart();

        while (opModeIsActive()){
            robot.mecanumControl();
        }
    }
}
