package ymjaga.replayboard.domain.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import ymjaga.replayboard.domain.common.BaseEntity;
import ymjaga.replayboard.domain.common.BoardType;
import ymjaga.replayboard.domain.common.GameType;

@Entity
@Getter
@Table(name = "board")
@SuperBuilder
@RequiredArgsConstructor
public class Board extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = true)
	private String contents;

	@Column(nullable = true)
	private Long likes;

	@Column(nullable = false)
	private GameType gameType;

	@Column(nullable = false)
	private BoardType boardType;
}
