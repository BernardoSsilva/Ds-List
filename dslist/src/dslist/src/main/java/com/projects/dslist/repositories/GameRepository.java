

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.dslist.entities.Game;

public class GameRepository extends JpaRepository<Game, Long> {

    @Override
    public String toString() {
        return "GameRepository []";
    }

}
