/**
 * @Pre: all four drive wheels have been declared and initialized
 * @Param: none
 * @Post: none
 * @Return: none (void)
 *
 * Will activate all four drive wheels to run with encoders
 */
private void activateEncoders()
{
    driveRF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    driveRB.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    driveLF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    driveLB.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
}
