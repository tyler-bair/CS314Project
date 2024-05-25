package com.tco.requests.gameManagement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeaveMatchCommand {
   @Test
   @DisplayName("maur88: testing that LeaveMatchCommand ")
    public void testLeaveMatchCommand() {
       LeaveMatchCommand leaveMatchCommand = new LeaveMatchCommand(null, 0);
         assert leaveMatchCommand != null;

   }
   @Test
    @DisplayName("maur88: testing that LeaveMatchCommand ")
     public void testLeaveMatchCommand2() {
         LeaveMatchCommand leaveMatchCommand = new LeaveMatchCommand(null, 0);
         assertEquals(leaveMatchCommand.getClass(), LeaveMatchCommand.class);

    }
}
