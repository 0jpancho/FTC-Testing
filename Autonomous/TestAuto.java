package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.TestFiles.encoderRobot;

@Autonomous(name = "TestAuto", group = "Auto")
public class TestAuto extends LinearOpMode {

    encoderRobot robot = new encoderRobot();

    @Override
    public void runOpMode(){

        robot.initialize(TestAuto.this, hardwareMap, telemetry);

        robot.motorLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motorRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        robot.motorLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        robot.encoderDrive(0.5, 12,12, 5);

        robot.encoderDrive(1, -12,-12, 5);
    }


}
