package org.firstinspires.ftc.teamcode.TestFiles;

//import com.kauailabs.navx.ftc.AHRS;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class mecanumRobot {

    public DcMotor frontLeft, frontRight, backLeft, backRight;

    public LinearOpMode l;
    public Telemetry realTelemetry;

    public void initialize(LinearOpMode Input, HardwareMap hardwareMap, Telemetry telemetry) {
        l = Input;
        realTelemetry = telemetry;

        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        backLeft = hardwareMap.dcMotor.get("backLeft");

        frontRight = hardwareMap.dcMotor.get("frontRight");
        backRight = hardwareMap.dcMotor.get("backRight");

        realTelemetry.addData("Status", "Initializing");
        realTelemetry.update();
        l.idle();
    }

    //Throttled control test
    public void mecanumControl(){

        if(l.gamepad1.dpad_up){

            //Left Side inverted
            frontLeft.setPower(-1);
            backLeft.setPower(-1);

            frontRight.setPower(1);
            backRight.setPower(1);
        }

        else if (l.gamepad1.dpad_down){

            frontLeft.setPower(1);
            backLeft.setPower(1);

            frontRight.setPower(-1);
            backRight.setPower(-1);
        }

        else if (l.gamepad1.dpad_left){

            frontLeft.setPower(1);
            backLeft.setPower(-1);

            frontRight.setPower(1);
            backRight.setPower(-1);
        }

        else if (l.gamepad1.dpad_right){

            frontLeft.setPower(-1);
            backLeft.setPower(1);

            frontRight.setPower(-1);
            backRight.setPower(1);
        }
        /*
        //Diagonal fwrd left
        else if (l.gamepad1.dpad_up && l.gamepad1.dpad_left){

            frontLeft.setPower(-1);
            backLeft.setPower(1);

            frontRight.setPower(1);
            backRight.setPower(1);

        }
        */

        /*
        //Diagonal fwrd right
        else if (l.gamepad1.dpad_up && l.gamepad1.dpad_left){

            frontLeft.setPower(-l.gamepad1.right_stick_y);
            backLeft.setPower(-l.gamepad1.right_stick_y);

            frontRight.setPower(-l.gamepad1.right_stick_y);
            backRight.setPower(l.gamepad1.right_stick_y);

        }
        /*
        //Diagonal bckwrd left
        else if (l.gamepad1.dpad_up && l.gamepad1.dpad_left){

            frontLeft.setPower(l.gamepad1.right_stick_y);
            backLeft.setPower(-l.gamepad1.right_stick_y);

            frontRight.setPower(-l.gamepad1.right_stick_y);
            backRight.setPower(-l.gamepad1.right_stick_y);
        }

        //Diagonal bckwrd right
        else if (l.gamepad1.dpad_up && l.gamepad1.dpad_left){

            frontLeft.setPower(l.gamepad1.right_stick_y);
            backLeft.setPower(l.gamepad1.right_stick_y);

            frontRight.setPower(-l.gamepad1.right_stick_y);
            backRight.setPower(l.gamepad1.right_stick_y);
        }
        */
        else if (l.gamepad1.right_stick_x < -0.25){

            frontLeft.setPower(0.5);
            backLeft.setPower(0.5);

            frontRight.setPower(0.5);
            backRight.setPower(0.5);
        }

        else if (l.gamepad1.right_stick_x > 0.25){

            frontLeft.setPower(-0.5);
            backLeft.setPower(-0.5);

            frontRight.setPower(-0.5);
            backRight.setPower(-0.5);
        }

        else {
            frontLeft.setPower(0);
            backLeft.setPower(0);

            frontRight.setPower(0);
            backRight.setPower(0);
        }

    }
}
