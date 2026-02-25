package pocopoco_vplay.board.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MyTrashResponseDto{
    private int contentNo;
    private String contentTitle;
    private int views;
    private int likeCount;
}