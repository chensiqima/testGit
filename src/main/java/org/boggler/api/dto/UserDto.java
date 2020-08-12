package org.boggler.api.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class UserDto {
private Integer userid;
private String username;
private String userpwd;
private Integer userage;
}
