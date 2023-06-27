/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.player.*;

PlayerService playerService = new PlayerService();
@DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        playerService.deletePlayer(playerId);
    }

@PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        retun playerService.updatePlayer(playerId, player);
    }

@PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

@GetMapping("/players")
public ArrayList<player> getPlayers(){
    return playerService
}
 
 @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playreId") int playerId) {
        return playerService.getPlayerById(playerId);
    }