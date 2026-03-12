package pocopoco_vplay.board.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TrashRestoreResponseDto {
    private boolean success;
    private String message;
}
