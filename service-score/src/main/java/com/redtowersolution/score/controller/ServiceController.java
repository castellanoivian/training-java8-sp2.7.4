package com.redtowersolution.score.controller;
import com.redtowersolution.score.service.ScoreService;
import org.springframework.web.bind.annotation.*;
import com.redtowersolution.score.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import java.util.List;
import java.util.Optional;

@RestController
public class ServiceController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello Mundo";
    }
    @Autowired
    ScoreService scoreService;

    @PostMapping("/createScore")
    public String createScore() {
        return "createScorePage";
    }
    @GetMapping("/viewScore")
    public String viewScores(ModelMap modelMap) {
        List<Score> scores = scoreService.getAllScore();
        modelMap.addAttribute("scores", scores);
        return "viewUsersPage";
    }
    @GetMapping("/scoresByIdCliente/{id_cliente}")
    public Optional<Score> byId(@PathVariable("id_cliente") int id_cliente) {
        return scoreService.findAllById(id_cliente);
    }

    @PutMapping("/updateScore")
    public String updateScore(@ModelAttribute("score") Score score,
                              ModelMap modelMap) {
        return "editUserPage";
    }

}
