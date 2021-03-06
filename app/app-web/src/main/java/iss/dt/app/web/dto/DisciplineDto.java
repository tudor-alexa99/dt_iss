package iss.dt.app.web.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DisciplineDto extends BaseDto {
    private String name;
    private String teacher;
    private int credits;
}
