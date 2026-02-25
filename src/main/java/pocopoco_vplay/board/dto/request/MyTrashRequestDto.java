package pocopoco_vplay.board.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyTrashRequestDto {

    private String value;      // 카테고리
    private String sortValue;  // 정렬값

}