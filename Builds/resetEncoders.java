/**
 * @Pre: all four drive wheels have been declared and initialized
 * @Param: none
 * @Post: none
 * @Return: none (void)
 *
 * Will reset the current data for all four drive wheels' encoders
 */
private void resetEncoders()
{
    driveRF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    driveRB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    driveLF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    driveLB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
}
