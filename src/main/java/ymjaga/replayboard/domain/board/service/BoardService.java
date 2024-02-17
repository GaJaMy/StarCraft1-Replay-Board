package ymjaga.replayboard.domain.board.service;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ymjaga.replayboard.domain.board.entity.Board;
import ymjaga.replayboard.domain.board.repository.BoardRepository;
import ymjaga.replayboard.domain.common.BoardType;
import ymjaga.replayboard.domain.common.GameType;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;

	public List<Board> getBoards(GameType gameType, BoardType boardType) {
		boardRepository.getBoardListByGameTypeAndBoardType(gameType,boardType);

		return boardRepository.getBoardListByGameTypeAndBoardType(gameType,boardType);
	}
}
