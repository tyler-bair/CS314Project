package com.tco.requests;
import com.tco.requests.ManageMatchRequest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestManageMatchRequest {

   @Test
    @DisplayName("maur88: testing that ManageMatch is created")
    public void testManageMatch() {
        ManageMatchRequest manageMatchRequest = new ManageMatchRequest("user1", "user2", "create", 0,"rnbqkbnr/pp1ppppp/8/2p5/4P3/5N2/PPPP1PPP/RNBQKB1R b KQkq - 1 2");
           assertEquals(manageMatchRequest.getClass(), ManageMatchRequest.class);
    }

}