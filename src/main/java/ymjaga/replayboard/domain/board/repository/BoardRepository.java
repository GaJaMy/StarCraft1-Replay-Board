package ymjaga.replayboard.domain.board.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ymjaga.replayboard.domain.board.entity.Board;
import ymjaga.replayboard.domain.common.BoardType;
import ymjaga.replayboard.domain.common.GameType;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

	@Query("select b from Board b where b.gameType = :gameType and b.boardType = :boardType")
	List<Board> getBoardListByGameTypeAndBoardType(GameType gameType, BoardType boardType);
}
