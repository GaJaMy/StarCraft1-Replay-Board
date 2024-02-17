package ymjaga.replayboard.domain.common;

public enum BoardType {
	NORMAL("일반 게시글"), NOTICE("공지 사항");

	private String description;

	BoardType(String description) {this.description = description;}

	public String getDescription() {
		return this.description;
	}
}
