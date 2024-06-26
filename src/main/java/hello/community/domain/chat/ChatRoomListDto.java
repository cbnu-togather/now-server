package hello.community.domain.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class ChatRoomListDto {
    private Long id;  // id 필드 추가
    private List<String> userProfileImgUrls;
    private String groupBuyThumbnailUrl;
    private String chatRoomTitle;
    private int participantCount;
    private String lastMessage;
    private LocalDateTime lastMessageTime;
    private int unreadMessageCount;
}
