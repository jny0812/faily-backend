package Project.Projectspring.Calender.VO;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CalenderVO {

    private String calendar_date;
    private String calendar_category;
    private String calendar_name;
    private String calendar_place;
    private String calendar_memo;
    private String calendar_start_time;
    private String calendar_end_time;
 private int user_id;
    private int group_id;
}
