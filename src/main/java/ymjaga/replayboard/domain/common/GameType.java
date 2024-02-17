package ymjaga.replayboard.domain.common;

public enum GameType {
	MELEE("밀리"),
	USE_MAP("유즈맵"),
	FAST_INFINITY("1:1 빠른 무한"),
	FAST_INFINITY3("3:3 빠른 무한"),
	FAST_INFINITY4("4:4 빠른 무한");

	private final String description;

	GameType(String description) {this.description = description;}

	public String getDescription() {
		return description;
	}
}
