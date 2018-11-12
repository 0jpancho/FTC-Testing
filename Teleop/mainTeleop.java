package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name = "mainTeleop")
public class mainTeleop extends LinearOpMode {

    Robot robot = new Robot();

    @Override
    public void runOpMode() {

        robot.initialize(mainTeleop.this, hardwareMap, telemetry);

        waitForStart();

        robot.setMotors(gamepad1.left_stick_x, -gamepad1.left_stick_y);
        robot.rotate();
        robot.setServos();
        robot.setLiftArm();

    }
}
