package org.firstinspires.ftc.teamcode.TestFiles;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name = "smartMecanumTest")
public class smartMecanumTest extends LinearOpMode {

    Robot robot = new Robot();

    @Override
    public void runOpMode(){

        robot.initialize(smartMecanumTest.this, hardwareMap, telemetry);

        waitForStart();

        while (opModeIsActive()) {

            robot.setMotors(gamepad1.left_stick_x, -gamepad1.left_stick_y);
        }
    }
}
