package ymjaga.replayboard.domain.common;

import com.fasterxml.jackson.databind.ser.Serializers.Base;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class BasicUserInfo extends BaseEntity {
	private String user_id;
	private String password;
}
