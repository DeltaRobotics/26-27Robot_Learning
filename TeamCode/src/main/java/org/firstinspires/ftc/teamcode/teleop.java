package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "teleop")
public class teleop extends OpMode {
    public DcMotor driveFL;
    public DcMotor driveFR;
    public DcMotor driveBL;
    public DcMotor driveBR;

    @Override
    public void init() {
        driveFL = hardwareMap.get(DcMotor.class, "driveFL");
        driveFR = hardwareMap.get(DcMotor.class, "driveFR");
        driveBL = hardwareMap.get(DcMotor.class, "driveBL");
        driveBR = hardwareMap.get(DcMotor.class, "driveBR");

        driveFL.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop() {
        if (gamepad1.right_stick_y > 0.5) {
            driveFL.setPower(1);
            driveFR.setPower(1);
            driveBL.setPower(1);
            driveBR.setPower(1);
        }
    }
}
