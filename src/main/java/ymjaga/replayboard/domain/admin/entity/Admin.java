package ymjaga.replayboard.domain.admin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import ymjaga.replayboard.domain.common.BasicUserInfo;

@Entity
@Getter
@Table(name = "admin")
@SuperBuilder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends BasicUserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
