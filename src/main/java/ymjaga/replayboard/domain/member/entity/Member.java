package ymjaga.replayboard.domain.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import ymjaga.replayboard.domain.common.BasicUserInfo;

@Entity
@Getter
@Builder
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Member extends BasicUserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Id;

	private String nickname;
}
