package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Something")
//@Disabled

public class Something extends LinearOpMode
{

    @Override
    public void runOpMode() throws InterruptedException
    {






        waitForStart();

        while (opModeIsActive())
        {
            if (gamepad1.left_stick_x > .5);







        }
    }
}