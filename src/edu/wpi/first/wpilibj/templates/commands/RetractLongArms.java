/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import Team102Lib.MessageLogger;

/**
 *
 * @author Admin
 */
public class RetractLongArms extends CommandBase
{
    public RetractLongArms()
    {
        requires(climber);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
        MessageLogger.LogMessage("RetractLongArms()");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        climber.retractLongArms();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return true;
    }

    // Called once after isFinished returns true
    protected void end()
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}
